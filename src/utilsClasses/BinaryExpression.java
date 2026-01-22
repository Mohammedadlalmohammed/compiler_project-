package utilsClasses;

import java.util.List;

public class BinaryExpression extends ASTNode {

    private ASTNode left;
    private ASTNode right;

    public BinaryExpression(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public List<ASTNode> getChildren() {
        java.util.List<ASTNode> children = new java.util.ArrayList<>();
        if (left != null) children.add(left);
        if (right != null) children.add(right);
        return children;
    }

    @Override
    public String toString() {
        return "BinaryExpression";
    }

    @Override
    public String prettyPrint(String indent) {
        return printTree();
    }
}
