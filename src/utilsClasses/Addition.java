package utilsClasses;

import java.util.List;

public class Addition extends ASTNode {
//	Expression left;
//	Expression right;
    private  ASTNode left;
    private  ASTNode right;
	
	public Addition(ASTNode left,ASTNode right) {
		// TODO Auto-generated constructor stub
		this.left=left;
		this.right=right;
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return left.toString() +  " + " + right.toString();
//	}

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new java.util.ArrayList<>();
        if (left != null) children.add(left);
        if (right != null) children.add(right);
        return children;
    }

    @Override
    public String toString() {
        return "Addition";
    }

    @Override
    public String prettyPrint(String indent) {
        return printTree();
    }
}
