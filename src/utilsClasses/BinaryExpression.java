package utilsClasses;

public class BinaryExpression extends ASTNode {

    private ASTNode left;
    private ASTNode right;

    public BinaryExpression(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("BinaryExpression:\n");
        sb.append(left.prettyPrint(indent + "	")).append("\n");
        sb.append(right.prettyPrint(indent + "	"));
        return sb.toString();
    }
}
