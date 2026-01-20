package utilsClasses;

import java.util.ArrayList;
import java.util.List;

public class ProgNode extends ASTNode{
	
	private List<ASTNode> children =new ArrayList<>();
	
	
	
	public void addChild(ASTNode node) {
		children.add(node);
	}

    @Override
    public List<ASTNode> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "Program";
    }

    @Override
    public String prettyPrint(String indent) {
        return printTree();
    }
	

}
