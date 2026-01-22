package utilsClasses;

public class ExpressionName extends ASTNode {

	private String keyword;

	public ExpressionName(String keyword) {
		this.keyword = keyword;
	}

    @Override
    public java.util.List<ASTNode> getChildren() {
        return java.util.Collections.emptyList();
    }

    @Override
    public String toString() {
        return "ExpressionName (Keyword: " + keyword + ")";
    }

    @Override
    public String prettyPrint(String indent) {
        return printTree();
    }
}
