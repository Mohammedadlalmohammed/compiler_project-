package utilsClasses;

public class Select_list extends ASTNode {

	private String column;

	public Select_list(String column) {
		this.column = column;
	}

    @Override
    public java.util.List<ASTNode> getChildren() {
        return java.util.Collections.emptyList();
    }

    @Override
    public String toString() {
        return "Select_list (Column: " + column + ")";
    }

    @Override
    public String prettyPrint(String indent) {
        return printTree();
    }
}
