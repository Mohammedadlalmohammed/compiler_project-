package utilsClasses;



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
    public java.util.List<ASTNode> getChildren() {
        return java.util.Collections.emptyList();
    }

    @Override
    public String toString() {
        return "TableReference (Database: " + database_name + ", Schema: " + schema_name + ", Table: " + table_name + ")";
    }

    @Override
    public String prettyPrint(String indent) {
        return printTree();
    }
}
