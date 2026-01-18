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
	public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Declaration:\n");
        sb.append(indent).append("	Variable: ").append(id).append("\n");
        sb.append(indent).append("	Type: ").append(type).append("\n");
        sb.append(indent).append("	value: ").append(value).append("\n");
        return sb.toString();
	}

}
