package utilsClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ASTViewer extends JFrame {

    public ASTViewer(ASTNode root) {
        super("AST Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLocationRelativeTo(null); // Center on screen

        if (root != null) {
            ASTPanel panel = new ASTPanel(root);
            JScrollPane scrollPane = new JScrollPane(panel);
            scrollPane.getVerticalScrollBar().setUnitIncrement(16);
            scrollPane.getHorizontalScrollBar().setUnitIncrement(16);
            add(scrollPane, BorderLayout.CENTER);
        } else {
             add(new JLabel("No AST generated"), BorderLayout.CENTER);
        }
    }

    private static class ASTPanel extends JPanel {
        private final ASTNode root;
        private final Map<ASTNode, Point2D> nodePositions = new HashMap<>();
        private final Map<ASTNode, Dimension> nodeDimensions = new HashMap<>();
        private final int ROW_HEIGHT = 120;
        private final int HORIZONTAL_GAP = 50;
        private int totalWidth = 0;
        private int totalHeight = 0;
        private double scale = 1.0;
        private static final double MIN_SCALE = 0.1;
        private static final double MAX_SCALE = 5.0;

        public ASTPanel(ASTNode root) {
            this.root = root;
            setBackground(Color.WHITE);
            calculatePositions();
            updatePreferredSize();

            MouseAdapter ma = new MouseAdapter() {
                private Point origin;

                @Override
                public void mousePressed(MouseEvent e) {
                    origin = new Point(e.getPoint());
                }

                @Override
                public void mouseDragged(MouseEvent e) {
                    if (origin != null) {
                        JViewport viewport = (JViewport) SwingUtilities.getAncestorOfClass(JViewport.class, ASTPanel.this);
                        if (viewport != null) {
                            Point viewPos = viewport.getViewPosition();
                            int dx = origin.x - e.getX();
                            int dy = origin.y - e.getY();

                            Point newViewPos = new Point(viewPos.x + dx, viewPos.y + dy);
                            
                            // Adjust for limits
                            Dimension viewSize = viewport.getExtentSize();
                            Dimension compSize = ASTPanel.this.getPreferredSize();
                            
                            newViewPos.x = Math.max(0, Math.min(newViewPos.x, compSize.width - viewSize.width));
                            newViewPos.y = Math.max(0, Math.min(newViewPos.y, compSize.height - viewSize.height));
                            
                            viewport.setViewPosition(newViewPos);
                        }
                    }
                }

                @Override
                public void mouseWheelMoved(java.awt.event.MouseWheelEvent e) {
                    if (e.isControlDown()) {
                        double delta = 0.05 * e.getWheelRotation();
                        double oldScale = scale;
                        scale = Math.max(MIN_SCALE, Math.min(MAX_SCALE, scale - delta));
                        
                        if (oldScale != scale) {
                            updatePreferredSize();
                            revalidate();
                            repaint();
                        }
                    } else {
                        // Pass to parent (scroll pane) if Ctrl is not pressed
                        getParent().dispatchEvent(e);
                    }
                }
            };
            addMouseListener(ma);
            addMouseMotionListener(ma);
            addMouseWheelListener(ma);
            setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }

        private void updatePreferredSize() {
            setPreferredSize(new Dimension(
                (int) ((totalWidth + 100) * scale),
                (int) ((totalHeight + 100) * scale)
            ));
        }

        private void calculatePositions() {
            Graphics g = new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_INT_ARGB).getGraphics();
            FontMetrics fm = g.getFontMetrics();
            calculateSubtreePositions(root, 50, 50, fm);
        }

        private int calculateSubtreePositions(ASTNode node, int x, int y, FontMetrics fm) {
            String text = node.toString();
            int width = Math.max(100, fm.stringWidth(text) + 40);
            int height = 40;
            nodeDimensions.put(node, new Dimension(width, height));

            List<ASTNode> children = node.getChildren();
            if (children == null || children.isEmpty()) {
                nodePositions.put(node, new Point2D.Double(x, y));
                totalWidth = Math.max(totalWidth, x + width);
                totalHeight = Math.max(totalHeight, y + height);
                return x + width + HORIZONTAL_GAP;
            }

            int currentX = x;
            int startX = x;
            for (ASTNode child : children) {
                currentX = calculateSubtreePositions(child, currentX, y + ROW_HEIGHT, fm);
            }
            
            // Align parent in the middle of children
            int childrenWidth = (currentX - HORIZONTAL_GAP) - startX;
            int midX = startX + (childrenWidth - width) / 2;
            
            nodePositions.put(node, new Point2D.Double(midX, y));
            return currentX;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            // Apply scale
            g2.scale(scale, scale);
            
            drawSubtree(g2, root);
        }

        private void drawSubtree(Graphics2D g2, ASTNode node) {
            Point2D pos = nodePositions.get(node);
            Dimension size = nodeDimensions.get(node);
            if (pos == null) return;

            int x = (int) pos.getX();
            int y = (int) pos.getY();
            int w = (int) size.getWidth();
            int h = (int) size.getHeight();

            // Draw Box
            g2.setColor(Color.WHITE);
            g2.fillRect(x, y, w, h);
            g2.setColor(Color.BLACK);
            g2.setStroke(new BasicStroke(1.5f));
            g2.drawRect(x, y, w, h);

            // Draw Label
            String text = node.toString();
            FontMetrics fm = g2.getFontMetrics();
            int textX = x + (w - fm.stringWidth(text)) / 2;
            int textY = y + (h + fm.getAscent()) / 2 - 2;
            g2.drawString(text, textX, textY);

            // Draw Edges
            List<ASTNode> children = node.getChildren();
            List<String> labels = node.getChildLabels();
            if (children != null) {
                for (int i = 0; i < children.size(); i++) {
                    ASTNode child = children.get(i);
                    Point2D childPos = nodePositions.get(child);
                    Dimension childSize = nodeDimensions.get(child);
                    if (childPos != null) {
                        int cx = (int) childPos.getX() + (int)childSize.getWidth() / 2;
                        int cy = (int) childPos.getY();
                        int px = x + w / 2;
                        int py = y + h;

                        g2.setColor(Color.BLACK);
                        g2.drawLine(px, py, cx, cy);
                        drawArrowHead(g2, px, py, cx, cy);

                        if (labels != null && i < labels.size()) {
                            String label = labels.get(i);
                            int lx = (px + cx) / 2;
                            int ly = (py + cy) / 2;
                            g2.drawString(label, lx + 5, ly);
                        }
                    }
                    drawSubtree(g2, child);
                }
            }
        }

        private void drawArrowHead(Graphics2D g2, int x1, int y1, int x2, int y2) {
            double phi = Math.toRadians(20);
            int barb = 10;
            double dy = y2 - y1;
            double dx = x2 - x1;
            double theta = Math.atan2(dy, dx);
            double x, y, rho = theta + phi;
            for(int j = 0; j < 2; j++) {
                x = x2 - barb * Math.cos(rho);
                y = y2 - barb * Math.sin(rho);
                g2.draw(new java.awt.geom.Line2D.Double(x2, y2, x, y));
                rho = theta - phi;
            }
        }
    }
}
