package utilsClasses;

public class WithCommonTableExpression extends ASTNode {

	private String with_keyword;

	public WithCommonTableExpression(String with_keyword) {
		this.with_keyword = with_keyword;
	}

	@Override
	public String prettyPrint(String indent) {
		StringBuilder sb = new StringBuilder();
		sb.append(indent).append("Common Table Expression:\n");
		sb.append(indent + "\t").append("with keyword : " + with_keyword).append("\n");
		return sb.toString();
	}
}
