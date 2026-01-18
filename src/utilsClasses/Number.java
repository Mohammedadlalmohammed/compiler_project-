package utilsClasses;

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
	public String prettyPrint(String indent) {
		// TODO Auto-generated method stub
		return indent + "Number: " + num;
	}
}
