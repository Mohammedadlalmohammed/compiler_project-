package utilsClasses;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public List<Expression> expression;

	public Program() {
		this.expression=new ArrayList<>();
	}
	
	public void addExpression(Expression e) {
		this.expression.add(e);
	}
	
}
