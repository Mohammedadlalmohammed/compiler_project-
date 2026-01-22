package utilsClasses;

import java.util.List;

public class Multiplication extends ASTNode {

	private ASTNode left;
	private ASTNode right;
	private String op;

	public Multiplication(ASTNode left, String op, ASTNode right) {
		// TODO Auto-generated constructor stub
		this.left = left;
		this.right = right;
		this.op = op;
	}

	// @Override
	// public String toString() {
	// // TODO Auto-generated method stub
	// return left.toString() + " * " + right.toString();
	// }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new java.util.ArrayList<>();
        if (left != null) children.add(left);
        if (right != null) children.add(right);
        return children;
    }

    @Override
    public String toString() {
        return "Multiplication (" + op + ")";
    }

    @Override
    public String prettyPrint(String indent) {
        return printTree();
    }
}
