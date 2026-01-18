package utilsClasses;

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
	public String prettyPrint(String indent) {
		StringBuilder sb = new StringBuilder();
		sb.append(indent).append("Multiplication:\n");
		sb.append(left.prettyPrint(indent + "	")).append("\n");
		sb.append(op);
		sb.append(right.prettyPrint(indent + "	"));
		return sb.toString();
	}
}
