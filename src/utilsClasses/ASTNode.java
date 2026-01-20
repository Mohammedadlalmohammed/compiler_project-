package utilsClasses;

import java.util.Collections;
import java.util.List;

public abstract class ASTNode {

    public abstract String prettyPrint(String indent);

    public abstract List<ASTNode> getChildren();
    
    public List<String> getChildLabels() {
        return null;
    }

    @Override
    public abstract String toString();

    public String printTree() {
        StringBuilder buffer = new StringBuilder();
        printTree(buffer, "", "");
        return buffer.toString();
    }

    private void printTree(StringBuilder buffer, String prefix, String childrenPrefix) {
        buffer.append(prefix);
        buffer.append(toString());
        buffer.append('\n');
        List<ASTNode> children = getChildren();
        List<String> labels = getChildLabels();
        if (children == null) {
            children = java.util.Collections.emptyList();
        }
        int i = 0;
        for (java.util.Iterator<ASTNode> it = children.iterator(); it.hasNext(); ) {
            ASTNode next = it.next();
            String label = (labels != null && i < labels.size() && !labels.get(i).isEmpty()) ? "[" + labels.get(i) + "] " : "";
            if (it.hasNext()) {
                next.printTree(buffer, childrenPrefix + "├── " + label, childrenPrefix + "│   ");
            } else {
                next.printTree(buffer, childrenPrefix + "└── " + label, childrenPrefix + "    ");
            }
            i++;
        }
    }
}
