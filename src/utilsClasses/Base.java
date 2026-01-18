package utilsClasses;

import org.antlr.v4.parse.ANTLRParser.id_return;

public class Base extends ASTNode {
	private ASTNode[] children;
	private String parent;

	public Base(ASTNode[] children, String parent) {
		this.children = children;
		this.parent = parent;
	}

	public Base(String parent) {
		this.parent = parent;
	}

	@Override
	public String prettyPrint(String indent) {
		StringBuilder sb = new StringBuilder();
		if (children != null) {
			sb.append(indent).append(parent + ":\n");
			for (ASTNode astNode : children) {
				sb.append(astNode.prettyPrint(indent + "\t"));
			}
		} else {
			sb.append(indent).append("Keyword : " + parent + "\n");
		}
		return sb.toString();
	}
}
