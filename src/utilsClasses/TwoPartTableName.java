package utilsClasses;

public class TwoPartTableName extends ASTNode {

	private String schema_name;
	private String table_name;

	public TwoPartTableName(String schema_name, String table_name) {
		this.schema_name = schema_name;
		this.table_name = table_name;
	}

	@Override
	public String prettyPrint(String indent) {
		StringBuilder sb = new StringBuilder();
		sb.append(indent).append("TableReference:\n");
		sb.append(indent + "\t").append("Schema Name : " + schema_name).append("\n");
		sb.append(indent + "\t").append("Table Name : " + table_name).append("\n");
		return sb.toString();
	}
}
