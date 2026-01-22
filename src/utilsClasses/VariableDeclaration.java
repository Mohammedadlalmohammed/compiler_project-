package utilsClasses;

public class VariableDeclaration extends ASTNode{
	private String id;
	private String type;
	private int value;
	public VariableDeclaration(String id,String type,int value) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.type=type;
		this.value=value;
	}
    @Override
    public java.util.List<ASTNode> getChildren() {
        return java.util.Collections.emptyList();
    }

    @Override
    public String toString() {
        return "VariableDeclaration (Variable: " + id + ", Type: " + type + ", Value: " + value + ")";
    }

    @Override
    public String prettyPrint(String indent) {
        return printTree();
    }

}
