package utilsClasses;

public class ExpressionName extends ASTNode {

	private String keyword;

	public ExpressionName(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String prettyPrint(String indent) {
		StringBuilder sb = new StringBuilder();
		sb.append(indent).append("ExpressionName :\n");
		sb.append(indent + "\t").append("keyword : " + keyword).append("\n");
		return sb.toString();
	}
}
