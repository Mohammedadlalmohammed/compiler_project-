package utilsClasses;

public class Addition extends ASTNode {
//	Expression left;
//	Expression right;
    private  ASTNode left;
    private  ASTNode right;
	
	public Addition(ASTNode left,ASTNode right) {
		// TODO Auto-generated constructor stub
		this.left=left;
		this.right=right;
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return left.toString() +  " + " + right.toString();
//	}

	@Override
	public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Addition:\n");
        sb.append(left.prettyPrint(indent + "	")).append("\n");
        sb.append(right.prettyPrint(indent + "	"));
        return sb.toString();
	}
}
