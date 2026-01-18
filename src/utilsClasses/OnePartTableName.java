package utilsClasses;

public class OnePartTableName extends ASTNode {

	private String table_name;

	public OnePartTableName(String table_name) {
		this.table_name = table_name;
	}

	@Override
	public String prettyPrint(String indent) {
		StringBuilder sb = new StringBuilder();
		sb.append(indent).append("TableReference:\n\t");
		sb.append(indent).append("Table Name: " + table_name).append("\n");
		return sb.toString();
	}
}
