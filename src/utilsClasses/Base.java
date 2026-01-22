package utilsClasses;



public class Base extends ASTNode {
	private ASTNode[] children;
	private String[] labels;
	private String parent;

	public Base(ASTNode[] children, String parent) {
		this.children = filterNulls(children);
		this.parent = parent;
	}

	public Base(ASTNode[] children, String[] labels, String parent) {
        if (children == null) {
            this.children = null;
            this.labels = labels;
        } else {
            java.util.List<ASTNode> filteredChildren = new java.util.ArrayList<>();
            java.util.List<String> filteredLabels = new java.util.ArrayList<>();
            for (int i = 0; i < children.length; i++) {
                if (children[i] != null) {
                    filteredChildren.add(children[i]);
                    if (labels != null && i < labels.length) {
                        filteredLabels.add(labels[i]);
                    }
                }
            }
            this.children = filteredChildren.toArray(new ASTNode[0]);
            this.labels = filteredLabels.isEmpty() && labels == null ? null : filteredLabels.toArray(new String[0]);
        }
		this.parent = parent;
	}

    private ASTNode[] filterNulls(ASTNode[] nodes) {
        if (nodes == null) return null;
        java.util.List<ASTNode> filtered = new java.util.ArrayList<>();
        for (ASTNode node : nodes) {
            if (node != null) filtered.add(node);
        }
        return filtered.toArray(new ASTNode[0]);
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
