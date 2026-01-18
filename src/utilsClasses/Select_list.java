package utilsClasses;

public class Select_list extends ASTNode {

	private String column;

	public Select_list(String column) {
		this.column = column;
	}

	@Override
	public String prettyPrint(String indent) {
		StringBuilder sb = new StringBuilder();
		sb.append(indent).append("Column list:\n\t");
		sb.append(indent).append("Column Name: " + column).append("\n");
		return sb.toString();
	}
}
