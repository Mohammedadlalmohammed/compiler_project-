package utilsClasses;

public class WithCommonTableExpression extends ASTNode {

	private String with_keyword;

	public WithCommonTableExpression(String with_keyword) {
		this.with_keyword = with_keyword;
	}

    @Override
    public java.util.List<ASTNode> getChildren() {
        return java.util.Collections.emptyList();
    }

    @Override
    public String toString() {
        return "Common Table Expression (keyword: " + with_keyword + ")";
    }

    @Override
    public String prettyPrint(String indent) {
        return printTree();
    }
}
