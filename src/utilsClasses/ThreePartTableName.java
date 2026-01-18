package utilsClasses;

import org.antlr.v4.parse.ANTLRParser.id_return;

public class ThreePartTableName extends ASTNode {

	private String database_name;
	private String schema_name;
	private String table_name;

	public ThreePartTableName(String database_name, String schema_name, String table_name) {
		this.database_name = database_name;
		this.schema_name = schema_name;
		this.table_name = table_name;
	}

	@Override
	public String prettyPrint(String indent) {
		StringBuilder sb = new StringBuilder();
		sb.append(indent).append("TableReference:\n");
		sb.append(indent + "\t").append("Database Name : " + database_name).append("\n");
		sb.append(indent + "\t").append("Schema Name : " + schema_name).append("\n");
		sb.append(indent + "\t").append("Table Name : " + table_name).append("\n");
		return sb.toString();
	}
}
