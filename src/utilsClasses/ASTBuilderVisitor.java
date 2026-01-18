package utilsClasses;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.Token;

import antlr.SqlBaseVisitor;
import antlr.SqlParser;
import antlr.SqlParser.Select_listContext;
import antlr.SqlParser.NumberContext;
import antlr.SqlParser.ProgramContext;
import antlr.SqlParser.VariableContext;

public class ASTBuilderVisitor extends SqlBaseVisitor<ASTNode> {

	private List<String> vars;// store all the variable declared in the program so far
	public List<String> semanticsErrors;

	public ASTBuilderVisitor() {
		this.vars = new ArrayList<String>();
		this.semanticsErrors = new ArrayList<String>();
	}

	@Override
	public ASTNode visitProgram(ProgramContext ctx) {

		// ProgNode progNode = new ProgNode();
		// for (ExprParser.DeclContext decl : ctx.decl()) {
		// progNode.addChild(visit(decl));
		// }
		// for (ExprParser.ExprContext expr : ctx.expr()) {
		// progNode.addChild(visit(expr));
		// }
		// return progNode;
		// System.out.println("hi this is run Ok in ProgNode");
		ProgNode progNode = new ProgNode();

		for (int i = 0; i < ctx.getChildCount(); i++) {
			if (i == ctx.getChildCount() - 1) {
				/*
				 * last child of the start symbol do not visit it
				 */
			} else {
				progNode.addChild(visit(ctx.getChild(i)));
			}
		}

		return progNode;
	}

	@Override
	public ASTNode visitSelect_list(Select_listContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i += 2) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Select list");
	}

	@Override
	public ASTNode visitQuery_specification(SqlParser.Query_specificationContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Select statement");
	}

	@Override
	public ASTNode visitSELECTstatement(SqlParser.SELECTstatementContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Select statement");
	}

	@Override
	public ASTNode visitQuery_expression(SqlParser.Query_expressionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}
		return new Base(children, "");
	}

	@Override
	public ASTNode visitWith_common_table_expression(SqlParser.With_common_table_expressionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "CommonTableExpression");
	}

	@Override
	public ASTNode visitCommon_table_expression(SqlParser.Common_table_expressionContext ctx) {
		System.out.println("fdskj");
		return visitChildren(ctx);
	}

	@Override
	public ASTNode visitExpression_name(SqlParser.Expression_nameContext ctx) {
		String expression_name = ctx.getChild(0).getText().toString();
		return new ExpressionName(expression_name);
	}

	@Override
	public ASTNode visitAllColumn(SqlParser.AllColumnContext ctx) {
		return new Base("STAR");
	}

	@Override
	public ASTNode visitSelect(SqlParser.SelectContext ctx) {
		return new Base("Select");
	}

	@Override
	public ASTNode visitObjectDotAllColumn(SqlParser.ObjectDotAllColumnContext ctx) {
		ASTNode[] children = new ASTNode[1];
		children[0] = visit(ctx.getChild(0));

		return new Base(children, "All Column");
	}

	@Override
	public ASTNode visitThreePartTableName(SqlParser.ThreePartTableNameContext ctx) {
		String child1 = ctx.getChild(0).getText();
		String child2 = ctx.getChild(2).getText();
		String child3 = ctx.getChild(4).getText();

		return new ThreePartTableName(child1, child2, child3);
	}

	@Override
	public ASTNode visitTwoPartTableName(SqlParser.TwoPartTableNameContext ctx) {
		String child1 = ctx.getChild(0).getText();
		String child2 = ctx.getChild(2).getText();

		return new TwoPartTableName(child1, child2);
	}

	@Override
	public ASTNode visitOnePartTableName(SqlParser.OnePartTableNameContext ctx) {
		String child1 = ctx.getChild(0).getText();

		return new OnePartTableName(child1);
	}

	@Override
	public ASTNode visitFromTable(SqlParser.FromTableContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount() / 2];
		int j = 0;
		for (int i = 1; i < ctx.getChildCount(); i += 2) {
			children[j] = visit(ctx.getChild(i));
			j++;
		}

		return new Base(children, "From Table");
	}

	@Override
	public ASTNode visitTable(SqlParser.TableContext ctx) {
		ASTNode[] child = new ASTNode[1];
		child[0] = visit(ctx.getChild(0));

		return new Base(child, "Table");
	}

	@Override
	public ASTNode visitTable_source(SqlParser.Table_sourceContext ctx) {
		ASTNode[] child = new ASTNode[1];
		child[0] = visit(ctx.getChild(0));

		return new Base(child, "Table Source");
	}

	@Override
	public ASTNode visitHaving(SqlParser.HavingContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}
		return new Base(children, "Having ");
	}

	@Override
	public ASTNode visitHavingKeyword(SqlParser.HavingKeywordContext ctx) {
		return new Base("Having");
	}

	@Override
	public ASTNode visitOperatorPredicate(SqlParser.OperatorPredicateContext ctx) {
		ASTNode[] children = new ASTNode[3];
		children[0] = visit(ctx.getChild(0));
		children[1] = visit(ctx.getChild(1));
		children[2] = visit(ctx.getChild(2));

		return new Base(children, "Predicate");
	}

	@Override
	public ASTNode visitExpression(SqlParser.ExpressionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Expression");
	}

	@Override
	public ASTNode visitConstant(SqlParser.ConstantContext ctx) {
		String constant = ctx.getChild(0).getText();
		return new Base(constant);
	}

	@Override
	public ASTNode visitBinary_operator(SqlParser.Binary_operatorContext ctx) {
		String constant = ctx.getChild(0).getText();
		return new Base(constant);
	}

	@Override
	public ASTNode visitCompareOperator(SqlParser.CompareOperatorContext ctx) {
		String constant = ctx.getChild(0).getText();
		return new Base(constant);
	}
}
