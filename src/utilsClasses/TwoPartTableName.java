package utilsClasses;

public class TwoPartTableName extends ASTNode {

	private String schema_name;
	private String table_name;

	public TwoPartTableName(String schema_name, String table_name) {
		this.schema_name = schema_name;
		this.table_name = table_name;
	}

    @Override
    public java.util.List<ASTNode> getChildren() {
        return java.util.Collections.emptyList();
    }

    @Override
    public String toString() {
        return "TableReference (Schema: " + schema_name + ", Table: " + table_name + ")";
    }

    @Override
    public String prettyPrint(String indent) {
        return printTree();
    }
}
