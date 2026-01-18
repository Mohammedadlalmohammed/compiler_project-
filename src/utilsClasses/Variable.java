package utilsClasses;

public class Variable extends ASTNode {
	private String id;
	public Variable(String id) {
		// TODO Auto-generated constructor stub
		this.id=id;
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return indent + "Variable: " + name;
//	}

	@Override
	public String prettyPrint(String indent) {
		// TODO Auto-generated method stub
		return indent + "Variable: " + id;
	}
}
