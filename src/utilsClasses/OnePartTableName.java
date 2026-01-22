package utilsClasses;

public class OnePartTableName extends ASTNode {

	private String table_name;

	public OnePartTableName(String table_name) {
		this.table_name = table_name;
	}

    @Override
    public java.util.List<ASTNode> getChildren() {
        return java.util.Collections.emptyList();
    }

    @Override
    public String toString() {
        return "TableReference (Table Name: " + table_name + ")";
    }

    @Override
    public String prettyPrint(String indent) {
        return printTree();
    }
}
