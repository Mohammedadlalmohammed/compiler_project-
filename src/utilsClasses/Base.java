package utilsClasses;



public class Base extends ASTNode {
	private ASTNode[] children;
	private String[] labels;
	private String parent;

	public Base(ASTNode[] children, String parent) {
		this.children = children;
		this.parent = parent;
	}

	public Base(ASTNode[] children, String[] labels, String parent) {
		this.children = children;
		this.labels = labels;
		this.parent = parent;
	}

	public Base(String parent) {
		this.parent = parent;
	}

    @Override
    public java.util.List<String> getChildLabels() {
        if (labels == null) {
            return null;
        }
        return java.util.Arrays.asList(labels);
    }

    @Override
    public java.util.List<ASTNode> getChildren() {
        if (children == null) {
            return java.util.Collections.emptyList();
        }
        return java.util.Arrays.asList(children);
    }

    @Override
    public String toString() {
        if (children == null) {
            return parent;
        }
        return parent;
    }

    @Override
    public String prettyPrint(String indent) {
        return printTree();
    }
}
