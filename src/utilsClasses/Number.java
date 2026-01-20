package utilsClasses;

import java.util.List;

public class Number extends ASTNode {
	private int num;
	public Number(int num) {
		// TODO Auto-generated constructor stub
		this.num=num;
	}
//	@SuppressWarnings("removal")
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return new Integer(num).toString();
//	}
    @Override
    public List<ASTNode> getChildren() {
        return java.util.Collections.emptyList();
    }

    @Override
    public String toString() {
        return "Number: " + num;
    }

    @Override
    public String prettyPrint(String indent) {
        return printTree();
    }
}
