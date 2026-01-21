package utilsClasses;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.Token;

import antlr.SqlBaseVisitor;
import antlr.SqlParser;
import antlr.SqlParser.*;

public class ASTBuilderVisitor extends SqlBaseVisitor<ASTNode> {

	private List<String> vars;// store all the variable declared in the program so far
	public List<String> semanticsErrors;

	public ASTBuilderVisitor() {
		this.vars = new ArrayList<String>();
		this.semanticsErrors = new ArrayList<String>();
	}

    @Override
    public ASTNode visitTerminal(TerminalNode node) {
        String text = node.getText();
        if (text.equals(":") || text.equals("(") || text.equals(")") || 
            text.equals("[") || text.equals("]") || text.equals("<") || 
            text.equals(">") || text.equals(",") || text.equals(".") || 
            text.equals(";")) {
            return null;
        }
        return new Base(text);
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
	public ASTNode visitQuery_specification(SqlParser.Query_specificationContext ctx) {
		List<ASTNode> childrenNodes = new java.util.ArrayList<>();
		List<String> labels = new java.util.ArrayList<>();
		for (int i = 0; i < ctx.getChildCount(); i++) {
			ASTNode child = visit(ctx.getChild(i));
			if (child != null) {
				childrenNodes.add(child);
				String label = "";
				if (ctx.getChild(i) instanceof SqlParser.Select_listContext) label = "column";
				else if (ctx.getChild(i) instanceof SqlParser.FromTableContext) label = "from";
				else if (ctx.getChild(i) instanceof SqlParser.WhereClauseContext) label = "where";
				labels.add(label);
			}
		}

		return new Base(childrenNodes.toArray(new ASTNode[0]), labels.toArray(new String[0]), "SelectStmt");
	}

	@Override
	public ASTNode visitSELECTstatement(SqlParser.SELECTstatementContext ctx) {
		List<ASTNode> nodes = new java.util.ArrayList<>();
		for (int i = 0; i < ctx.getChildCount(); i++) {
			ASTNode child = visit(ctx.getChild(i));
			if (child != null) nodes.add(child);
		}

		return new Base(nodes.toArray(new ASTNode[0]), "SelectStmt");
	}

	@Override
	public ASTNode visitQuery_expression(SqlParser.Query_expressionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}
		return new Base(children, "Set Operations");
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
	public ASTNode visitOption_query_hint(SqlParser.Option_query_hintContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Option_query_hint");
	}

	@Override
	public ASTNode visitQuerySpecification(SqlParser.QuerySpecificationContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "QuerySpecification");
	}

	@Override
	public ASTNode visitTopClause(SqlParser.TopClauseContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "TopClause");
	}

	@Override
	public ASTNode visitTop(SqlParser.TopContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Top");
	}

	@Override
	public ASTNode visitSurroundedExpression(SqlParser.SurroundedExpressionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "SurroundedExpression");
	}

	@Override
	public ASTNode visitSearch_condition(SqlParser.Search_conditionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Search_condition");
	}

	@Override
	public ASTNode visitNotPredicate(SqlParser.NotPredicateContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "NotPredicate");
	}

	@Override
	public ASTNode visitNot(SqlParser.NotContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Not");
	}

	@Override
	public ASTNode visitSurroundedSearchConditionWithoutMatch(
			SqlParser.SurroundedSearchConditionWithoutMatchContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "{");
	}

	@Override
	public ASTNode visitSearch_condition_without_match(SqlParser.Search_condition_without_matchContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Search_condition_without_match");
	}

	@Override
	public ASTNode visitCompareOperator(SqlParser.CompareOperatorContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "CompareOperator");
	}

	@Override
	public ASTNode visitBetween(SqlParser.BetweenContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Between");
	}

	@Override
	public ASTNode visitIs(SqlParser.IsContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Is");
	}

	@Override
	public ASTNode visitDistinct(SqlParser.DistinctContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Distinct");
	}

	@Override
	public ASTNode visitPredicate(SqlParser.PredicateContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Predicate");
	}

	@Override
	public ASTNode visitLikeCondition(SqlParser.LikeConditionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "LikeCondition");
	}

	@Override
	public ASTNode visitGraph_search_pattern(SqlParser.Graph_search_patternContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Graph_search_pattern");
	}

	@Override
	public ASTNode visitNode_alias(SqlParser.Node_aliasContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Node_alias");
	}

	@Override
	public ASTNode visitEdge_alias(SqlParser.Edge_aliasContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Edge_alias");
	}

	@Override
	public ASTNode visitOrder_byCLASUE(SqlParser.Order_byCLASUEContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Order_byCLASUE");
	}

	@Override
	public ASTNode visitOffset_fetch(SqlParser.Offset_fetchContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Offset_fetch");
	}

	@Override
	public ASTNode visitFORClause(SqlParser.FORClauseContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "FORClause");
	}

	@Override
	public ASTNode visitXML(SqlParser.XMLContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "XML");
	}

	@Override
	public ASTNode visitCommonDirectivesForXML(SqlParser.CommonDirectivesForXMLContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "CommonDirectivesForXML");
	}

	@Override
	public ASTNode visitJSON(SqlParser.JSONContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "JSON");
	}

	@Override
	public ASTNode visitContains_search_condition(SqlParser.Contains_search_conditionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Contains_search_condition");
	}

	@Override
	public ASTNode visitSimple_term(SqlParser.Simple_termContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Simple_term");
	}

	@Override
	public ASTNode visitPrefixterm(SqlParser.PrefixtermContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Prefixterm");
	}

	@Override
	public ASTNode visitGeneration_term(SqlParser.Generation_termContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Generation_term");
	}

	@Override
	public ASTNode visitGeneric_proximity_term(SqlParser.Generic_proximity_termContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Generic_proximity_term");
	}

	@Override
	public ASTNode visitCustom_proximity_term(SqlParser.Custom_proximity_termContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Custom_proximity_term");
	}

	@Override
	public ASTNode visitMaximum_distance(SqlParser.Maximum_distanceContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Maximum_distance");
	}

	@Override
	public ASTNode visitMatch_order(SqlParser.Match_orderContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Match_order");
	}

	@Override
	public ASTNode visitWeighted_term(SqlParser.Weighted_termContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Weighted_term");
	}

	@Override
	public ASTNode visitAnd(SqlParser.AndContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "And");
	}

	@Override
	public ASTNode visitANDNOT(SqlParser.ANDNOTContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "ANDNOT");
	}

	@Override
	public ASTNode visitOr(SqlParser.OrContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Or");
	}

	@Override
	public ASTNode visitGroupby(SqlParser.GroupbyContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Groupby");
	}

	@Override
	public ASTNode visitGroup_by_expression(SqlParser.Group_by_expressionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Group_by_expression");
	}

	@Override
	public ASTNode visitGrouping_set(SqlParser.Grouping_setContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Grouping_set");
	}

	@Override
	public ASTNode visitGrouping_set_item(SqlParser.Grouping_set_itemContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Grouping_set_item");
	}

	@Override
	public ASTNode visitTable(SqlParser.TableContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Table");
	}

	@Override
	public ASTNode visitTable_source(SqlParser.Table_sourceContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Table_source");
	}

	@Override
	public ASTNode visitTablesample_clause(SqlParser.Tablesample_clauseContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Tablesample_clause");
	}

	@Override
	public ASTNode visitJoined_table(SqlParser.Joined_tableContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Joined_table");
	}

	@Override
	public ASTNode visitJoin_type(SqlParser.Join_typeContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Join_type");
	}

	@Override
	public ASTNode visitPivoted_table(SqlParser.Pivoted_tableContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Pivoted_table");
	}

	@Override
	public ASTNode visitPivot_clause(SqlParser.Pivot_clauseContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Pivot_clause");
	}

	@Override
	public ASTNode visitUnpivoted_table(SqlParser.Unpivoted_tableContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Unpivoted_table");
	}

	@Override
	public ASTNode visitUnpivot_clause(SqlParser.Unpivot_clauseContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Unpivot_clause");
	}

	@Override
	public ASTNode visitColumn_list(SqlParser.Column_listContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Column_list");
	}

	@Override
	public ASTNode visitSystem_time(SqlParser.System_timeContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "System_time");
	}

	@Override
	public ASTNode visitDate_time(SqlParser.Date_timeContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Date_time");
	}

	@Override
	public ASTNode visitStart_date_time(SqlParser.Start_date_timeContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Start_date_time");
	}

	@Override
	public ASTNode visitEnd_date_time(SqlParser.End_date_timeContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "End_date_time");
	}

	@Override
	public ASTNode visitAllColumn(SqlParser.AllColumnContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "AllColumn");
	}

	@Override
	public ASTNode visitObjectDotAllColumn(SqlParser.ObjectDotAllColumnContext ctx) {
		String qualifier = ctx.getChild(0).getText();
		return new Base("AllColumns (Qualifier: \"" + qualifier + "\")");
	}

	@Override
	public ASTNode visitSelect_list(SqlParser.Select_listContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Select_list");
	}

	@Override
	public ASTNode visitColumn_or_expression(SqlParser.Column_or_expressionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Column_or_expression");
	}

	@Override
	public ASTNode visitObjectDotColumn(SqlParser.ObjectDotColumnContext ctx) {
		return new Base("Identifier " + ctx.getText());
	}

	@Override
	public ASTNode visitColumnAliasRule(SqlParser.ColumnAliasRuleContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "ColumnAliasRule");
	}

	@Override
	public ASTNode visitQuery_hint(SqlParser.Query_hintContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Query_hint");
	}

	@Override
	public ASTNode visitTable_hint(SqlParser.Table_hintContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Table_hint");
	}

	@Override
	public ASTNode visitTable_hint_limited(SqlParser.Table_hint_limitedContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Table_hint_limited");
	}

	@Override
	public ASTNode visitOpenxml_clause(SqlParser.Openxml_clauseContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Openxml_clause");
	}

	@Override
	public ASTNode visitJoin_hint(SqlParser.Join_hintContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Join_hint");
	}

	@Override
	public ASTNode visitWith_common_table_expression(SqlParser.With_common_table_expressionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "With_common_table_expression");
	}

	@Override
	public ASTNode visitWith(SqlParser.WithContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "With");
	}

	@Override
	public ASTNode visitUpdate(SqlParser.UpdateContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Update");
	}

	@Override
	public ASTNode visitOUTPUT_CLAUSE(SqlParser.OUTPUT_CLAUSEContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "OUTPUT_CLAUSE");
	}

	@Override
	public ASTNode visitDml_select_list(SqlParser.Dml_select_listContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Dml_select_list");
	}

	@Override
	public ASTNode visitDelete(SqlParser.DeleteContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Delete");
	}

	@Override
	public ASTNode visitInsert(SqlParser.InsertContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Insert");
	}

	@Override
	public ASTNode visitDml_table_source(SqlParser.Dml_table_sourceContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Dml_table_source");
	}

	@Override
	public ASTNode visitMerge(SqlParser.MergeContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Merge");
	}

	@Override
	public ASTNode visitTarget_table(SqlParser.Target_tableContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Target_table");
	}

	@Override
	public ASTNode visitMerge_hint(SqlParser.Merge_hintContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Merge_hint");
	}

	@Override
	public ASTNode visitMerge_search_condition(SqlParser.Merge_search_conditionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Merge_search_condition");
	}

	@Override
	public ASTNode visitMerge_matched(SqlParser.Merge_matchedContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Merge_matched");
	}

	@Override
	public ASTNode visitMerge_not_matched(SqlParser.Merge_not_matchedContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Merge_not_matched");
	}

	@Override
	public ASTNode visitClause_search_condition(SqlParser.Clause_search_conditionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Clause_search_condition");
	}

	@Override
	public ASTNode visitDrop(SqlParser.DropContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Drop");
	}

	@Override
	public ASTNode visitValues_list(SqlParser.Values_listContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Values_list");
	}

	@Override
	public ASTNode visitSet_clause(SqlParser.Set_clauseContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Set_clause");
	}

	@Override
	public ASTNode visitAlter(SqlParser.AlterContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Alter");
	}

	@Override
	public ASTNode visitColumn_set_definition(SqlParser.Column_set_definitionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Column_set_definition");
	}

	@Override
	public ASTNode visitDrop_clustered_constraint_option(SqlParser.Drop_clustered_constraint_optionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Drop_clustered_constraint_option");
	}

	@Override
	public ASTNode visitTable_option(SqlParser.Table_optionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Table_option");
	}

	@Override
	public ASTNode visitFiletable_option(SqlParser.Filetable_optionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Filetable_option");
	}

	@Override
	public ASTNode visitStretch_configuration(SqlParser.Stretch_configurationContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Stretch_configuration");
	}

	@Override
	public ASTNode visitTable_stretch_options(SqlParser.Table_stretch_optionsContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Table_stretch_options");
	}

	@Override
	public ASTNode visitSingle_partition_rebuild__option(SqlParser.Single_partition_rebuild__optionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Single_partition_rebuild__option");
	}

	@Override
	public ASTNode visitLow_priority_lock_wait(SqlParser.Low_priority_lock_waitContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Low_priority_lock_wait");
	}

	@Override
	public ASTNode visitColumn_definition(SqlParser.Column_definitionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Column_definition");
	}

	@Override
	public ASTNode visitDatatype(SqlParser.DatatypeContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Datatype");
	}

	@Override
	public ASTNode visitColumn_constraint(SqlParser.Column_constraintContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Column_constraint");
	}

	@Override
	public ASTNode visitIndex_option(SqlParser.Index_optionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Index_option");
	}

	@Override
	public ASTNode visitRange(SqlParser.RangeContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Range");
	}

	@Override
	public ASTNode visitComputed_column_definition(SqlParser.Computed_column_definitionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Computed_column_definition");
	}

	@Override
	public ASTNode visitSingle_partition_rebuild_option(SqlParser.Single_partition_rebuild_optionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Single_partition_rebuild_option");
	}

	@Override
	public ASTNode visitRebuild_option(SqlParser.Rebuild_optionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Rebuild_option");
	}

	@Override
	public ASTNode visitCreate(SqlParser.CreateContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Create");
	}

	@Override
	public ASTNode visitData_type(SqlParser.Data_typeContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Data_type");
	}

	@Override
	public ASTNode visitColumn_index(SqlParser.Column_indexContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Column_index");
	}

	@Override
	public ASTNode visitTable_index(SqlParser.Table_indexContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Table_index");
	}

	@Override
	public ASTNode visitLedger_option(SqlParser.Ledger_optionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Ledger_option");
	}

	@Override
	public ASTNode visitLedger_view_option(SqlParser.Ledger_view_optionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Ledger_view_option");
	}

	@Override
	public ASTNode visitClose_cursor(SqlParser.Close_cursorContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Close_cursor");
	}

	@Override
	public ASTNode visitDellocate_cursor(SqlParser.Dellocate_cursorContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Dellocate_cursor");
	}

	@Override
	public ASTNode visitDeclare_cursor(SqlParser.Declare_cursorContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Declare_cursor");
	}

	@Override
	public ASTNode visitFetch_cursor(SqlParser.Fetch_cursorContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Fetch_cursor");
	}

	@Override
	public ASTNode visitOpen_cursor(SqlParser.Open_cursorContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Open_cursor");
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
	public ASTNode visitUnaryOperator(SqlParser.UnaryOperatorContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "UnaryOperator");
	}

	@Override
	public ASTNode visitSurroundedScalarSubquery(SqlParser.SurroundedScalarSubqueryContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "SurroundedScalarSubquery");
	}

	@Override
	public ASTNode visitVariableName(SqlParser.VariableNameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "VariableName");
	}

	@Override
	public ASTNode visitScalar_expression(SqlParser.Scalar_expressionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Scalar_expression");
	}

	@Override
	public ASTNode visitBulk(SqlParser.BulkContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Bulk");
	}

	@Override
	public ASTNode visitOpenrowset(SqlParser.OpenrowsetContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Openrowset");
	}

	@Override
	public ASTNode visitBulk_option(SqlParser.Bulk_optionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Bulk_option");
	}

	@Override
	public ASTNode visitRows_per_batch(SqlParser.Rows_per_batchContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Rows_per_batch");
	}

	@Override
	public ASTNode visitMaximum_errors(SqlParser.Maximum_errorsContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Maximum_errors");
	}

	@Override
	public ASTNode visitQuote_character(SqlParser.Quote_characterContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Quote_character");
	}

	@Override
	public ASTNode visitFile_format(SqlParser.File_formatContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "File_format");
	}

	@Override
	public ASTNode visitColumn_ordinal(SqlParser.Column_ordinalContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Column_ordinal");
	}

	@Override
	public ASTNode visitColumn_path(SqlParser.Column_pathContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Column_path");
	}

	@Override
	public ASTNode visitSql_datatype(SqlParser.Sql_datatypeContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Sql_datatype");
	}

	@Override
	public ASTNode visitData_file_path(SqlParser.Data_file_pathContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Data_file_path");
	}

	@Override
	public ASTNode visitData_source_name(SqlParser.Data_source_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Data_source_name");
	}

	@Override
	public ASTNode visitData_file(SqlParser.Data_fileContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Data_file");
	}

	@Override
	public ASTNode visitField_terminator(SqlParser.Field_terminatorContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Field_terminator");
	}

	@Override
	public ASTNode visitRow_terminator(SqlParser.Row_terminatorContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Row_terminator");
	}

	@Override
	public ASTNode visitCode_page(SqlParser.Code_pageContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Code_page");
	}

	@Override
	public ASTNode visitLast_row(SqlParser.Last_rowContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Last_row");
	}

	@Override
	public ASTNode visitFirst_row(SqlParser.First_rowContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "First_row");
	}

	@Override
	public ASTNode visitQuote_characters(SqlParser.Quote_charactersContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Quote_characters");
	}

	@Override
	public ASTNode visitErrorfile_data_source_name(SqlParser.Errorfile_data_source_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Errorfile_data_source_name");
	}

	@Override
	public ASTNode visitFile_name(SqlParser.File_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "File_name");
	}

	@Override
	public ASTNode visitMax_errors(SqlParser.Max_errorsContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Max_errors");
	}

	@Override
	public ASTNode visitFormat_file_path(SqlParser.Format_file_pathContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Format_file_path");
	}

	@Override
	public ASTNode visitBatch_size(SqlParser.Batch_sizeContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Batch_size");
	}

	@Override
	public ASTNode visitKilobytes_per_batch(SqlParser.Kilobytes_per_batchContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Kilobytes_per_batch");
	}

	@Override
	public ASTNode visitNew_table(SqlParser.New_tableContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "New_table");
	}

	@Override
	public ASTNode visitExpression_name(SqlParser.Expression_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Expression_name");
	}

	@Override
	public ASTNode visitString_expression(SqlParser.String_expressionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "String_expression");
	}

	@Override
	public ASTNode visitEscape_character(SqlParser.Escape_characterContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Escape_character");
	}

	@Override
	public ASTNode visitColumn(SqlParser.ColumnContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Column");
	}

	@Override
	public ASTNode visitFreetext_string(SqlParser.Freetext_stringContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Freetext_string");
	}

	@Override
	public ASTNode visitSubquery(SqlParser.SubqueryContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Subquery");
	}

	@Override
	public ASTNode visitNode_table_alias(SqlParser.Node_table_aliasContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Node_table_alias");
	}

	@Override
	public ASTNode visitNode_table_name(SqlParser.Node_table_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Node_table_name");
	}

	@Override
	public ASTNode visitEdge_table_alias(SqlParser.Edge_table_aliasContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Edge_table_alias");
	}

	@Override
	public ASTNode visitEdge_table_name(SqlParser.Edge_table_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Edge_table_name");
	}

	@Override
	public ASTNode visitCollation_name(SqlParser.Collation_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Collation_name");
	}

	@Override
	public ASTNode visitOffset_row_count_expression(SqlParser.Offset_row_count_expressionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Offset_row_count_expression");
	}

	@Override
	public ASTNode visitInteger_constant(SqlParser.Integer_constantContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Integer_constant");
	}

	@Override
	public ASTNode visitFetch_row_count_expression(SqlParser.Fetch_row_count_expressionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Fetch_row_count_expression");
	}

	@Override
	public ASTNode visitWord(SqlParser.WordContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Word");
	}

	@Override
	public ASTNode visitPhrase(SqlParser.PhraseContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Phrase");
	}

	@Override
	public ASTNode visitPrefix_term(SqlParser.Prefix_termContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Prefix_term");
	}

	@Override
	public ASTNode visitProximity_term(SqlParser.Proximity_termContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Proximity_term");
	}

	@Override
	public ASTNode visitInteger(SqlParser.IntegerContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Integer");
	}

	@Override
	public ASTNode visitWeight_value(SqlParser.Weight_valueContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Weight_value");
	}

	@Override
	public ASTNode visitColumn_expression(SqlParser.Column_expressionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Column_expression");
	}

	@Override
	public ASTNode visitTable_or_view_name(SqlParser.Table_or_view_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Table_or_view_name");
	}

	@Override
	public ASTNode visitRowset_function(SqlParser.Rowset_functionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Rowset_function");
	}

	@Override
	public ASTNode visitBulk_column_alias(SqlParser.Bulk_column_aliasContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Bulk_column_alias");
	}

	@Override
	public ASTNode visitTable_alias(SqlParser.Table_aliasContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Table_alias");
	}

	@Override
	public ASTNode visitColumn_alias(SqlParser.Column_aliasContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Column_alias");
	}

	@Override
	public ASTNode visitVariable(SqlParser.VariableContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Variable");
	}

	@Override
	public ASTNode visitFunction_call(SqlParser.Function_callContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Function_call");
	}

	@Override
	public ASTNode visitRepeat_seed(SqlParser.Repeat_seedContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Repeat_seed");
	}

	@Override
	public ASTNode visitLeft_table_source(SqlParser.Left_table_sourceContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Left_table_source");
	}

	@Override
	public ASTNode visitRight_table_source(SqlParser.Right_table_sourceContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Right_table_source");
	}

	@Override
	public ASTNode visitAggregate_function(SqlParser.Aggregate_functionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Aggregate_function");
	}

	@Override
	public ASTNode visitValue_column(SqlParser.Value_columnContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Value_column");
	}

	@Override
	public ASTNode visitPivot_column(SqlParser.Pivot_columnContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Pivot_column");
	}

	@Override
	public ASTNode visitDate_time_variable(SqlParser.Date_time_variableContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Date_time_variable");
	}

	@Override
	public ASTNode visitDate_time_literal(SqlParser.Date_time_literalContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Date_time_literal");
	}

	@Override
	public ASTNode visitView_name(SqlParser.View_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "View_name");
	}

	@Override
	public ASTNode visitTable_name(SqlParser.Table_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Table_name");
	}

	@Override
	public ASTNode visitField_name(SqlParser.Field_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Field_name");
	}

	@Override
	public ASTNode visitProperty_name(SqlParser.Property_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Property_name");
	}

	@Override
	public ASTNode visitUdt_column_name(SqlParser.Udt_column_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Udt_column_name");
	}

	@Override
	public ASTNode visitArgument(SqlParser.ArgumentContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Argument");
	}

	@Override
	public ASTNode visitMethod_name(SqlParser.Method_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Method_name");
	}

	@Override
	public ASTNode visitInteger_value(SqlParser.Integer_valueContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Integer_value");
	}

	@Override
	public ASTNode visitNumeric_value(SqlParser.Numeric_valueContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Numeric_value");
	}

	@Override
	public ASTNode visitLiteral_constant(SqlParser.Literal_constantContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Literal_constant");
	}

	@Override
	public ASTNode visitVariable_name(SqlParser.Variable_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Variable_name");
	}

	@Override
	public ASTNode visitHint_name(SqlParser.Hint_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Hint_name");
	}

	@Override
	public ASTNode visitXml_plan(SqlParser.Xml_planContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Xml_plan");
	}

	@Override
	public ASTNode visitExposed_object_name(SqlParser.Exposed_object_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Exposed_object_name");
	}

	@Override
	public ASTNode visitPoint_in_time(SqlParser.Point_in_timeContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Point_in_time");
	}

	@Override
	public ASTNode visitIndex_value(SqlParser.Index_valueContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Index_value");
	}

	@Override
	public ASTNode visitIndex_column_name(SqlParser.Index_column_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Index_column_name");
	}

	@Override
	public ASTNode visitIn(SqlParser.InContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "In");
	}

	@Override
	public ASTNode visitInt(SqlParser.IntContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Int");
	}

	@Override
	public ASTNode visitIdoc(SqlParser.IdocContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Idoc");
	}

	@Override
	public ASTNode visitNvarchar(SqlParser.NvarcharContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Nvarchar");
	}

	@Override
	public ASTNode visitRowpattern(SqlParser.RowpatternContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Rowpattern");
	}

	@Override
	public ASTNode visitByte(SqlParser.ByteContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Byte");
	}

	@Override
	public ASTNode visitFlags(SqlParser.FlagsContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Flags");
	}

	@Override
	public ASTNode visitCount(SqlParser.CountContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Count");
	}

	@Override
	public ASTNode visitColumns(SqlParser.ColumnsContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Columns");
	}

	@Override
	public ASTNode visitOpenquery(SqlParser.OpenqueryContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Openquery");
	}

	@Override
	public ASTNode visitProvider_string(SqlParser.Provider_stringContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Provider_string");
	}

	@Override
	public ASTNode visitDatasource(SqlParser.DatasourceContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Datasource");
	}

	@Override
	public ASTNode visitUser_id(SqlParser.User_idContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "User_id");
	}

	@Override
	public ASTNode visitPassword(SqlParser.PasswordContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Password");
	}

	@Override
	public ASTNode visitProvider_name(SqlParser.Provider_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Provider_name");
	}

	@Override
	public ASTNode visitCatalog(SqlParser.CatalogContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Catalog");
	}

	@Override
	public ASTNode visitQuery(SqlParser.QueryContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Query");
	}

	@Override
	public ASTNode visitLinked_server(SqlParser.Linked_serverContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Linked_server");
	}

	@Override
	public ASTNode visitRowset_function_limited(SqlParser.Rowset_function_limitedContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Rowset_function_limited");
	}

	@Override
	public ASTNode visitTable_variable(SqlParser.Table_variableContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Table_variable");
	}

	@Override
	public ASTNode visitCursor_name(SqlParser.Cursor_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Cursor_name");
	}

	@Override
	public ASTNode visitCursor_variable_name(SqlParser.Cursor_variable_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Cursor_variable_name");
	}

	@Override
	public ASTNode visitSchema_name(SqlParser.Schema_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Schema_name");
	}

	@Override
	public ASTNode visitDatabase_name(SqlParser.Database_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Database_name");
	}

	@Override
	public ASTNode visitServer_name(SqlParser.Server_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Server_name");
	}

	@Override
	public ASTNode visitOutput_table(SqlParser.Output_tableContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Output_table");
	}

	@Override
	public ASTNode visitColumn_alias_identifier(SqlParser.Column_alias_identifierContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Column_alias_identifier");
	}

	@Override
	public ASTNode visitFrom_table_name(SqlParser.From_table_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "From_table_name");
	}

	@Override
	public ASTNode visitAction(SqlParser.ActionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Action");
	}

	@Override
	public ASTNode visitDerived_table(SqlParser.Derived_tableContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Derived_table");
	}

	@Override
	public ASTNode visitDml_statement_with_output_clause(SqlParser.Dml_statement_with_output_clauseContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Dml_statement_with_output_clause");
	}

	@Override
	public ASTNode visitType_name(SqlParser.Type_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Type_name");
	}

	@Override
	public ASTNode visitType_schema_name(SqlParser.Type_schema_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Type_schema_name");
	}

	@Override
	public ASTNode visitScale(SqlParser.ScaleContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Scale");
	}

	@Override
	public ASTNode visitPrecision(SqlParser.PrecisionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Precision");
	}

	@Override
	public ASTNode visitXml_schema_collection(SqlParser.Xml_schema_collectionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Xml_schema_collection");
	}

	@Override
	public ASTNode visitMax(SqlParser.MaxContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Max");
	}

	@Override
	public ASTNode visitMask_function(SqlParser.Mask_functionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Mask_function");
	}

	@Override
	public ASTNode visitSystem_start_time_column_name(SqlParser.System_start_time_column_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "System_start_time_column_name");
	}

	@Override
	public ASTNode visitConstant_expression(SqlParser.Constant_expressionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Constant_expression");
	}

	@Override
	public ASTNode visitConstraint_name(SqlParser.Constraint_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Constraint_name");
	}

	@Override
	public ASTNode visitSystem_end_time_column_name(SqlParser.System_end_time_column_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "System_end_time_column_name");
	}

	@Override
	public ASTNode visitBigint(SqlParser.BigintContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Bigint");
	}

	@Override
	public ASTNode visitStart_transaction_id_column_name(SqlParser.Start_transaction_id_column_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Start_transaction_id_column_name");
	}

	@Override
	public ASTNode visitEnd_sequence_number_column_name(SqlParser.End_sequence_number_column_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "End_sequence_number_column_name");
	}

	@Override
	public ASTNode visitStart_sequence_number_column_name(SqlParser.Start_sequence_number_column_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Start_sequence_number_column_name");
	}

	@Override
	public ASTNode visitEnd_transaction_id_column_name(SqlParser.End_transaction_id_column_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "End_transaction_id_column_name");
	}

	@Override
	public ASTNode visitTrigger_name(SqlParser.Trigger_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Trigger_name");
	}

	@Override
	public ASTNode visitSource_partition_number_expression(SqlParser.Source_partition_number_expressionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Source_partition_number_expression");
	}

	@Override
	public ASTNode visitTarget_partition_number_expression(SqlParser.Target_partition_number_expressionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Target_partition_number_expression");
	}

	@Override
	public ASTNode visitDefault(SqlParser.DefaultContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Default");
	}

	@Override
	public ASTNode visitFilegroup(SqlParser.FilegroupContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Filegroup");
	}

	@Override
	public ASTNode visitPartition_scheme_name(SqlParser.Partition_scheme_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Partition_scheme_name");
	}

	@Override
	public ASTNode visitNumber(SqlParser.NumberContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Number");
	}

	@Override
	public ASTNode visitHistory_table_name(SqlParser.History_table_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "History_table_name");
	}

	@Override
	public ASTNode visitPartition_number(SqlParser.Partition_numberContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Partition_number");
	}

	@Override
	public ASTNode visitMax_degree_of_parallelism(SqlParser.Max_degree_of_parallelismContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Max_degree_of_parallelism");
	}

	@Override
	public ASTNode visitColumn_set_name(SqlParser.Column_set_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Column_set_name");
	}

	@Override
	public ASTNode visitDirectory_name(SqlParser.Directory_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Directory_name");
	}

	@Override
	public ASTNode visitNull(SqlParser.NullContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Null");
	}

	@Override
	public ASTNode visitTable_predicate_function(SqlParser.Table_predicate_functionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Table_predicate_function");
	}

	@Override
	public ASTNode visitTime(SqlParser.TimeContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Time");
	}

	@Override
	public ASTNode visitKey_name(SqlParser.Key_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Key_name");
	}

	@Override
	public ASTNode visitIncrement(SqlParser.IncrementContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Increment");
	}

	@Override
	public ASTNode visitSeed(SqlParser.SeedContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Seed");
	}

	@Override
	public ASTNode visitReferenced_table_name(SqlParser.Referenced_table_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Referenced_table_name");
	}

	@Override
	public ASTNode visitPartition_column_name(SqlParser.Partition_column_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Partition_column_name");
	}

	@Override
	public ASTNode visitFillfactor(SqlParser.FillfactorContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Fillfactor");
	}

	@Override
	public ASTNode visitLogical_expression(SqlParser.Logical_expressionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Logical_expression");
	}

	@Override
	public ASTNode visitRef_column(SqlParser.Ref_columnContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Ref_column");
	}

	@Override
	public ASTNode visitPartition_number_expression(SqlParser.Partition_number_expressionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Partition_number_expression");
	}

	@Override
	public ASTNode visitComputed_column_expression(SqlParser.Computed_column_expressionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Computed_column_expression");
	}

	@Override
	public ASTNode visitRef_table(SqlParser.Ref_tableContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Ref_table");
	}

	@Override
	public ASTNode visitFilegroup_name(SqlParser.Filegroup_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Filegroup_name");
	}

	@Override
	public ASTNode visitIndex_name(SqlParser.Index_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Index_name");
	}

	@Override
	public ASTNode visitFilestream_filegroup_name(SqlParser.Filestream_filegroup_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Filestream_filegroup_name");
	}

	@Override
	public ASTNode visitTable_constraint(SqlParser.Table_constraintContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Table_constraint");
	}

	@Override
	public ASTNode visitNode_table(SqlParser.Node_tableContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Node_table");
	}

	@Override
	public ASTNode visitFilter_predicate(SqlParser.Filter_predicateContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Filter_predicate");
	}

	@Override
	public ASTNode visitSequence_number_column_name(SqlParser.Sequence_number_column_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Sequence_number_column_name");
	}

	@Override
	public ASTNode visitTransaction_id_column_name(SqlParser.Transaction_id_column_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Transaction_id_column_name");
	}

	@Override
	public ASTNode visitLedger_view_name(SqlParser.Ledger_view_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Ledger_view_name");
	}

	@Override
	public ASTNode visitOperation_type_desc_column_name(SqlParser.Operation_type_desc_column_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Operation_type_desc_column_name");
	}

	@Override
	public ASTNode visitOperation_type_id(SqlParser.Operation_type_idContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Operation_type_id");
	}

	@Override
	public ASTNode visitScalar_function(SqlParser.Scalar_functionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Scalar_function");
	}

	@Override
	public ASTNode visitExecute_statement(SqlParser.Execute_statementContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Execute_statement");
	}

	@Override
	public ASTNode visitExecute_option(SqlParser.Execute_optionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Execute_option");
	}

	@Override
	public ASTNode visitResult_sets_definition(SqlParser.Result_sets_definitionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Result_sets_definition");
	}

	@Override
	public ASTNode visitValue(SqlParser.ValueContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Value");
	}

	@Override
	public ASTNode visitTable_valued_function_name(SqlParser.Table_valued_function_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Table_valued_function_name");
	}

	@Override
	public ASTNode visitTable_type_name(SqlParser.Table_type_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Table_type_name");
	}

	@Override
	public ASTNode visitLinked_server_name(SqlParser.Linked_server_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Linked_server_name");
	}

	@Override
	public ASTNode visitModule_name(SqlParser.Module_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Module_name");
	}

	@Override
	public ASTNode visitDb_name(SqlParser.Db_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Db_name");
	}

	@Override
	public ASTNode visitString_variable(SqlParser.String_variableContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "String_variable");
	}

	@Override
	public ASTNode visitModule_name_var(SqlParser.Module_name_varContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Module_name_var");
	}

	@Override
	public ASTNode visitReturn_status(SqlParser.Return_statusContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Return_status");
	}

	@Override
	public ASTNode visitParameter(SqlParser.ParameterContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Parameter");
	}

	@Override
	public ASTNode visitConstant(SqlParser.ConstantContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Constant");
	}

	@Override
	public ASTNode visitBinary_operator(SqlParser.Binary_operatorContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Binary_operator");
	}

	@Override
	public ASTNode visitUnary_operator(SqlParser.Unary_operatorContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Unary_operator");
	}

	@Override
	public ASTNode visitAggregate_windowed_function(SqlParser.Aggregate_windowed_functionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Aggregate_windowed_function");
	}

	@Override
	public ASTNode visitRanking_windowed_function(SqlParser.Ranking_windowed_functionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Ranking_windowed_function");
	}

	@Override
	public ASTNode visitScalar_subquery(SqlParser.Scalar_subqueryContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Scalar_subquery");
	}

	@Override
	public ASTNode visitNvar(SqlParser.NvarContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Nvar");
	}

	@Override
	public ASTNode visitN(SqlParser.NContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "N");
	}

	@Override
	public ASTNode visitSelect_statement(SqlParser.Select_statementContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Select_statement");
	}

	@Override
	public ASTNode visitSample_number(SqlParser.Sample_numberContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Sample_number");
	}

	@Override
	public ASTNode visitUser_defined_function(SqlParser.User_defined_functionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "User_defined_function");
	}

	@Override
	public ASTNode visitOption(SqlParser.OptionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Option");
	}

	@Override
	public ASTNode visitTargetNameSpaceURI(SqlParser.TargetNameSpaceURIContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "TargetNameSpaceURI");
	}

	@Override
	public ASTNode visitCTE_query_definition(SqlParser.CTE_query_definitionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "CTE_query_definition");
	}

	@Override
	public ASTNode visitElementName(SqlParser.ElementNameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "ElementName");
	}

	@Override
	public ASTNode visitRootName(SqlParser.RootNameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "RootName");
	}

	@Override
	public ASTNode visitSchemaDeclaration(SqlParser.SchemaDeclarationContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "SchemaDeclaration");
	}

	@Override
	public ASTNode visitOffset(SqlParser.OffsetContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Offset");
	}

	@Override
	public ASTNode visitLength(SqlParser.LengthContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Length");
	}

	@Override
	public ASTNode visitFileTable(SqlParser.FileTableContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "FileTable");
	}

	@Override
	public ASTNode visitOpendatasource(SqlParser.OpendatasourceContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Opendatasource");
	}

	@Override
	public ASTNode visitInit_string(SqlParser.Init_stringContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Init_string");
	}

	@Override
	public ASTNode visitWindows_collation_name(SqlParser.Windows_collation_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Windows_collation_name");
	}

	@Override
	public ASTNode visitOrder_by_expression(SqlParser.Order_by_expressionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Order_by_expression");
	}

	@Override
	public ASTNode visitColumn_name(SqlParser.Column_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Column_name");
	}

	@Override
	public ASTNode visitCommon_table_expression_name(SqlParser.Common_table_expression_nameContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Common_table_expression_name");
	}

	@Override
	public ASTNode visitWhere(SqlParser.WhereContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Where");
	}

	@Override
	public ASTNode visitOption_keyword(SqlParser.Option_keywordContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Option_keyword");
	}

	@Override
	public ASTNode visitLeftparenthesis(SqlParser.LeftparenthesisContext ctx) {
		return null;
	}

	@Override
	public ASTNode visitComma(SqlParser.CommaContext ctx) {
		return null;
	}

	@Override
	public ASTNode visitRightparenthesis(SqlParser.RightparenthesisContext ctx) {
		return null;
	}

	@Override
	public ASTNode visitEnd(SqlParser.EndContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "End");
	}

	@Override
	public ASTNode visitSetOperations(SqlParser.SetOperationsContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "SetOperations");
	}

	@Override
	public ASTNode visitWhereClause(SqlParser.WhereClauseContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "WhereClause");
	}

	@Override
	public ASTNode visitFromTable(SqlParser.FromTableContext ctx) {
		List<ASTNode> nodes = new java.util.ArrayList<>();
		List<String> labels = new java.util.ArrayList<>();
		for (int i = 0; i < ctx.getChildCount(); i++) {
			ASTNode child = visit(ctx.getChild(i));
			if (child != null) {
				nodes.add(child);
				String label = "";
				if (ctx.getChild(i) instanceof SqlParser.TableContext) label = "table";
				labels.add(label);
			}
		}

		return new Base(nodes.toArray(new ASTNode[0]), labels.toArray(new String[0]), "FromClause");
	}

	@Override
	public ASTNode visitHaving(SqlParser.HavingContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Having");
	}

	@Override
	public ASTNode visitSelect(SqlParser.SelectContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Select");
	}

	@Override
	public ASTNode visitAll(SqlParser.AllContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "All");
	}

	@Override
	public ASTNode visitPercent(SqlParser.PercentContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Percent");
	}

	@Override
	public ASTNode visitWithTies(SqlParser.WithTiesContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "WithTies");
	}

	@Override
	public ASTNode visitSurroundedQuerySpecification(SqlParser.SurroundedQuerySpecificationContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "SurroundedQuerySpecification");
	}

	@Override
	public ASTNode visitInto(SqlParser.IntoContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Into");
	}

	@Override
	public ASTNode visitOn(SqlParser.OnContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "On");
	}

	@Override
	public ASTNode visitCteQueryDefinition(SqlParser.CteQueryDefinitionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "CteQueryDefinition");
	}

	@Override
	public ASTNode visitSurroundedColumnList(SqlParser.SurroundedColumnListContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "SurroundedColumnList");
	}

	@Override
	public ASTNode visitAndSearchCondetion(SqlParser.AndSearchCondetionContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "AndSearchCondetion");
	}

	@Override
	public ASTNode visitMatch(SqlParser.MatchContext ctx) {
		ASTNode[] children = new ASTNode[ctx.getChildCount()];
		for (int i = 0; i < ctx.getChildCount(); i++) {
			children[i] = visit(ctx.getChild(i));
		}

		return new Base(children, "Match");
	}

	@Override
	public ASTNode visitContainsKeyword(SqlParser.ContainsKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitLeftparenthesisKeyword(SqlParser.LeftparenthesisKeywordContext ctx) {
		return null;
	}
@Override
	public ASTNode visitStarKeyword(SqlParser.StarKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitCommaKeyword(SqlParser.CommaKeywordContext ctx) {
		return null;
	}
@Override
	public ASTNode visitSinglequotationKeyword(SqlParser.SinglequotationKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitRightparenthesisKeyword(SqlParser.RightparenthesisKeywordContext ctx) {
		return null;
	}
@Override
	public ASTNode visitFreetextKeyword(SqlParser.FreetextKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitNotKeyword(SqlParser.NotKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitInKeyword(SqlParser.InKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitEqualKeyword(SqlParser.EqualKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitNotequalKeyword(SqlParser.NotequalKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitGreaterthanKeyword(SqlParser.GreaterthanKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitGreaterthanorequalKeyword(SqlParser.GreaterthanorequalKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitNotgreaterthanKeyword(SqlParser.NotgreaterthanKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitLessthanKeyword(SqlParser.LessthanKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitLessthanorequalKeyword(SqlParser.LessthanorequalKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitNotlessthanKeyword(SqlParser.NotlessthanKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitAllKeyword(SqlParser.AllKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitSomeKeyword(SqlParser.SomeKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitAnyKeyword(SqlParser.AnyKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitExistsKeyword(SqlParser.ExistsKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitLikeKeyword(SqlParser.LikeKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitEscapeKeyword(SqlParser.EscapeKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitMinusKeyword(SqlParser.MinusKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitOrderKeyword(SqlParser.OrderKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitByKeyword(SqlParser.ByKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitCollateKeyword(SqlParser.CollateKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitAscKeyword(SqlParser.AscKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitDescKeyword(SqlParser.DescKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitOffsetKeyword(SqlParser.OffsetKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitRowKeyword(SqlParser.RowKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitRowsKeyword(SqlParser.RowsKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitFetchKeyword(SqlParser.FetchKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitFirstKeyword(SqlParser.FirstKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitNextKeyword(SqlParser.NextKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitOnlyKeyword(SqlParser.OnlyKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitForKeyword(SqlParser.ForKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitBrowseKeyword(SqlParser.BrowseKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitXmlKeyword(SqlParser.XmlKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitRawKeyword(SqlParser.RawKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitAutoKeyword(SqlParser.AutoKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitXmldataKeyword(SqlParser.XmldataKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitXmlschemaKeyword(SqlParser.XmlschemaKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitElementsKeyword(SqlParser.ElementsKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitXsinilKeyword(SqlParser.XsinilKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitAbsentKeyword(SqlParser.AbsentKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitExplicitKeyword(SqlParser.ExplicitKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitPathKeyword(SqlParser.PathKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitBinaryKeyword(SqlParser.BinaryKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitTypeKeyword(SqlParser.TypeKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitRootKeyword(SqlParser.RootKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitJsonKeyword(SqlParser.JsonKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitAndKeyword(SqlParser.AndKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitOrKeyword(SqlParser.OrKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitDoublequotationKeyword(SqlParser.DoublequotationKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitFormsofKeyword(SqlParser.FormsofKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitInflectionalKeyword(SqlParser.InflectionalKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitThesaurusKeyword(SqlParser.ThesaurusKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitNearKeyword(SqlParser.NearKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitMaxKeyword(SqlParser.MaxKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitTrueKeyword(SqlParser.TrueKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitFalseKeyword(SqlParser.FalseKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitIsaboutKeyword(SqlParser.IsaboutKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitWeightKeyword(SqlParser.WeightKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitAndoperationKeyword(SqlParser.AndoperationKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitOroperationKeyword(SqlParser.OroperationKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitGroupKeyword(SqlParser.GroupKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitRollupKeyword(SqlParser.RollupKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitCubeKeyword(SqlParser.CubeKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitGroupingKeyword(SqlParser.GroupingKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitSetsKeyword(SqlParser.SetsKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitWithKeyword(SqlParser.WithKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitOpenxmlKeyword(SqlParser.OpenxmlKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitAtsymbolKeyword(SqlParser.AtsymbolKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitDotKeyword(SqlParser.DotKeywordContext ctx) {
		return null;
	}
@Override
	public ASTNode visitTablesampleKeyword(SqlParser.TablesampleKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitSystemKeyword(SqlParser.SystemKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitPercentKeyword(SqlParser.PercentKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitRepeatableKeyword(SqlParser.RepeatableKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitOnKeyword(SqlParser.OnKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitCrossKeyword(SqlParser.CrossKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitJoinKeyword(SqlParser.JoinKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitOuterKeyword(SqlParser.OuterKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitApplyKeyword(SqlParser.ApplyKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitInnerKeyword(SqlParser.InnerKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitLeftKeyword(SqlParser.LeftKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitRightKeyword(SqlParser.RightKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitFullKeyword(SqlParser.FullKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitPivotKeyword(SqlParser.PivotKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitUnpivotKeyword(SqlParser.UnpivotKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitOfKeyword(SqlParser.OfKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitToKeyword(SqlParser.ToKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitBetweenKeyword(SqlParser.BetweenKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitContainedKeyword(SqlParser.ContainedKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitIdentityKeyword(SqlParser.IdentityKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitRowguidKeyword(SqlParser.RowguidKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitTempKeyword(SqlParser.TempKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitHashKeyword(SqlParser.HashKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitConcatKeyword(SqlParser.ConcatKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitMergeKeyword(SqlParser.MergeKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitUnionKeyword(SqlParser.UnionKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitLoopKeyword(SqlParser.LoopKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitExpandKeyword(SqlParser.ExpandKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitViewsKeyword(SqlParser.ViewsKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitFastKeyword(SqlParser.FastKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitForceKeyword(SqlParser.ForceKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitDisableKeyword(SqlParser.DisableKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitExternalpushdownKeyword(SqlParser.ExternalpushdownKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitScaleoutexecutionKeyword(SqlParser.ScaleoutexecutionKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitKeepKeyword(SqlParser.KeepKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitPlanKeyword(SqlParser.PlanKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitKeepfixedKeyword(SqlParser.KeepfixedKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitMaxdopKeyword(SqlParser.MaxdopKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitMaxrecursionKeyword(SqlParser.MaxrecursionKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitOptimizeKeyword(SqlParser.OptimizeKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitUnknownKeyword(SqlParser.UnknownKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitParameterizationKeyword(SqlParser.ParameterizationKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitSimpleKeyword(SqlParser.SimpleKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitForcedKeyword(SqlParser.ForcedKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitQuerytraceonKeyword(SqlParser.QuerytraceonKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitRecompileKeyword(SqlParser.RecompileKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitRobustKeyword(SqlParser.RobustKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitUseKeyword(SqlParser.UseKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitHintKeyword(SqlParser.HintKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitNKeyword(SqlParser.NKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitTableKeyword(SqlParser.TableKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitTimestampKeyword(SqlParser.TimestampKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitNoexpandKeyword(SqlParser.NoexpandKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitIndexKeyword(SqlParser.IndexKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitForceseekKeyword(SqlParser.ForceseekKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitForcescanKeyword(SqlParser.ForcescanKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitHoldlockKeyword(SqlParser.HoldlockKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitNolockKeyword(SqlParser.NolockKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitNowaitKeyword(SqlParser.NowaitKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitPaglockKeyword(SqlParser.PaglockKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitReadcommittedKeyword(SqlParser.ReadcommittedKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitReadcommittedlockKeyword(SqlParser.ReadcommittedlockKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitReadpastKeyword(SqlParser.ReadpastKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitReaduncommittedKeyword(SqlParser.ReaduncommittedKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitRepeatablereadKeyword(SqlParser.RepeatablereadKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitRowlockKeyword(SqlParser.RowlockKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitSerializableKeyword(SqlParser.SerializableKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitSnapshotKeyword(SqlParser.SnapshotKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitTablockKeyword(SqlParser.TablockKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitTablockxKeyword(SqlParser.TablockxKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitUpdlockKeyword(SqlParser.UpdlockKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitXlockKeyword(SqlParser.XlockKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitKeepidentityKeyword(SqlParser.KeepidentityKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitKeepdefaultsKeyword(SqlParser.KeepdefaultsKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitRemoteKeyword(SqlParser.RemoteKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitReduceKeyword(SqlParser.ReduceKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitReplicateKeyword(SqlParser.ReplicateKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitRedistributeKeyword(SqlParser.RedistributeKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitUpdateKeyword(SqlParser.UpdateKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitSetKeyword(SqlParser.SetKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitDefaultKeyword(SqlParser.DefaultKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitNullKeyword(SqlParser.NullKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitWriteKeyword(SqlParser.WriteKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitPlusequalKeyword(SqlParser.PlusequalKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitMinusequalKeyword(SqlParser.MinusequalKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitMultipleequalKeyword(SqlParser.MultipleequalKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitDivisionequalKeyword(SqlParser.DivisionequalKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitModuleequalKeyword(SqlParser.ModuleequalKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitAndequalKeyword(SqlParser.AndequalKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitXorequalKeyword(SqlParser.XorequalKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitOrequalKeyword(SqlParser.OrequalKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitWhereKeyword(SqlParser.WhereKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitCurrentKeyword(SqlParser.CurrentKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitGlobalKeyword(SqlParser.GlobalKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitOptionKeyword(SqlParser.OptionKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitSemicolonKeyword(SqlParser.SemicolonKeywordContext ctx) {
		return null;
	}
@Override
	public ASTNode visitOutputKeyword(SqlParser.OutputKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitDeletedKeyword(SqlParser.DeletedKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitInsertedKeyword(SqlParser.InsertedKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitDollarKeyword(SqlParser.DollarKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitActionKeyword(SqlParser.ActionKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitDeleteKeyword(SqlParser.DeleteKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitInsertKeyword(SqlParser.InsertKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitValuesKeyword(SqlParser.ValuesKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitSelectKeyword(SqlParser.SelectKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitTiesKeyword(SqlParser.TiesKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitUsingKeyword(SqlParser.UsingKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitWhenKeyword(SqlParser.WhenKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitMatchedKeyword(SqlParser.MatchedKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitThenKeyword(SqlParser.ThenKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitTargetKeyword(SqlParser.TargetKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitSourceKeyword(SqlParser.SourceKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitDropKeyword(SqlParser.DropKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitIfKeyword(SqlParser.IfKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitAlterKeyword(SqlParser.AlterKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitColumnKeyword(SqlParser.ColumnKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitSparseKeyword(SqlParser.SparseKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitAddKeyword(SqlParser.AddKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitRowguidcolKeyword(SqlParser.RowguidcolKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitPersistedKeyword(SqlParser.PersistedKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitReplicationKeyword(SqlParser.ReplicationKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitMaskedKeyword(SqlParser.MaskedKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitFunctionKeyword(SqlParser.FunctionKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitOnlineKeyword(SqlParser.OnlineKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitOffKeyword(SqlParser.OffKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitCheckKeyword(SqlParser.CheckKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitNocheckKeyword(SqlParser.NocheckKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitGeneratedKeyword(SqlParser.GeneratedKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitAlwaysKeyword(SqlParser.AlwaysKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitStartKeyword(SqlParser.StartKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitConstraintKeyword(SqlParser.ConstraintKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitEndKeyword(SqlParser.EndKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitPeriodKeyword(SqlParser.PeriodKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitEnableKeyword(SqlParser.EnableKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitTriggerKeyword(SqlParser.TriggerKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitSwitchKeyword(SqlParser.SwitchKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitPartitionKeyword(SqlParser.PartitionKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitInfiniteKeyword(SqlParser.InfiniteKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitDayKeyword(SqlParser.DayKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitDaysKeyword(SqlParser.DaysKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitWeekKeyword(SqlParser.WeekKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitWeeksKeyword(SqlParser.WeeksKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitMonthKeyword(SqlParser.MonthKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitMonthsKeyword(SqlParser.MonthsKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitYearKeyword(SqlParser.YearKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitYearsKeyword(SqlParser.YearsKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitRebuildKeyword(SqlParser.RebuildKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitMoveKeyword(SqlParser.MoveKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitPausedKeyword(SqlParser.PausedKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitOutboundKeyword(SqlParser.OutboundKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitInboundKeyword(SqlParser.InboundKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitNoneKeyword(SqlParser.NoneKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitPageKeyword(SqlParser.PageKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitColumnstoreKeyword(SqlParser.ColumnstoreKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitMinutesKeyword(SqlParser.MinutesKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitSelfKeyword(SqlParser.SelfKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitBlockersKeyword(SqlParser.BlockersKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitFilestreamKeyword(SqlParser.FilestreamKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitEncryptedKeyword(SqlParser.EncryptedKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitDeterministicKeyword(SqlParser.DeterministicKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitRandomizedKeyword(SqlParser.RandomizedKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitAlgorithmKeyword(SqlParser.AlgorithmKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitContentKeyword(SqlParser.ContentKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitDocumentKeyword(SqlParser.DocumentKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitPrimaryKeyword(SqlParser.PrimaryKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitKeyKeyword(SqlParser.KeyKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitUniqueKeyword(SqlParser.UniqueKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitClusteredKeyword(SqlParser.ClusteredKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitNonclusteredKeyword(SqlParser.NonclusteredKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitFillfactorKeyword(SqlParser.FillfactorKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitForeignKeyword(SqlParser.ForeignKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitReferencesKeyword(SqlParser.ReferencesKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitPartitionsKeyword(SqlParser.PartitionsKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitResumableKeyword(SqlParser.ResumableKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitCreateKeyword(SqlParser.CreateKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitIncludeKeyword(SqlParser.IncludeKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitCloseKeyword(SqlParser.CloseKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitDeallocateKeyword(SqlParser.DeallocateKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitDeclareKeyword(SqlParser.DeclareKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitCursorKeyword(SqlParser.CursorKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitLocalKeyword(SqlParser.LocalKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitScrollKeyword(SqlParser.ScrollKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitStaticKeyword(SqlParser.StaticKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitKeysetKeyword(SqlParser.KeysetKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitDynamicKeyword(SqlParser.DynamicKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitOptimisticKeyword(SqlParser.OptimisticKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitPriorKeyword(SqlParser.PriorKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitLastKeyword(SqlParser.LastKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitAbsoluteKeyword(SqlParser.AbsoluteKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitRelativeKeyword(SqlParser.RelativeKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitOpenKeyword(SqlParser.OpenKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitBulkKeyword(SqlParser.BulkKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitCodepageKeyword(SqlParser.CodepageKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitAcpKeyword(SqlParser.AcpKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitOemKeyword(SqlParser.OemKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitDatafiletypeKeyword(SqlParser.DatafiletypeKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitCharKeyword(SqlParser.CharKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitRowterminatorKeyword(SqlParser.RowterminatorKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitFieldterminatorKeyword(SqlParser.FieldterminatorKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitFormatKeyword(SqlParser.FormatKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitCsvKeyword(SqlParser.CsvKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitFieldquoteKeyword(SqlParser.FieldquoteKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitFirstrowKeyword(SqlParser.FirstrowKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitLastrowKeyword(SqlParser.LastrowKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitFormatfileKeyword(SqlParser.FormatfileKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitMaxerrorsKeyword(SqlParser.MaxerrorsKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitErrorfileKeyword(SqlParser.ErrorfileKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitKeepnullsKeyword(SqlParser.KeepnullsKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitBatchsizeKeyword(SqlParser.BatchsizeKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitOpenrowsetKeyword(SqlParser.OpenrowsetKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitNumbersKeyword(SqlParser.NumbersKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitStringKeyword(SqlParser.StringKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitIdentifiersKeyword(SqlParser.IdentifiersKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitOpenqueryKeyword(SqlParser.OpenqueryKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitExecKeyword(SqlParser.ExecKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitExecuteKeyword(SqlParser.ExecuteKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitPlusKeyword(SqlParser.PlusKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitLoginKeyword(SqlParser.LoginKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitUserKeyword(SqlParser.UserKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitAtKeyword(SqlParser.AtKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitResultKeyword(SqlParser.ResultKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitUndefinedKeyword(SqlParser.UndefinedKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitObjectKeyword(SqlParser.ObjectKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitDivisionKeyword(SqlParser.DivisionKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitModuleKeyword(SqlParser.ModuleKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitOpendatasourceKeyword(SqlParser.OpendatasourceKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitExceptKeyword(SqlParser.ExceptKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitIntersectKeyword(SqlParser.IntersectKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitDistinctKeyword(SqlParser.DistinctKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitGoKeyword(SqlParser.GoKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitAsKeyword(SqlParser.AsKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitFromKeyword(SqlParser.FromKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitIsKeyword(SqlParser.IsKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitTopKeyword(SqlParser.TopKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitIntoKeyword(SqlParser.IntoKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitNoKeyword(SqlParser.NoKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitMatchKeyword(SqlParser.MatchKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitCascadeKeyword(SqlParser.CascadeKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitConnectionKeyword(SqlParser.ConnectionKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitDataType1(SqlParser.DataType1Context ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitHavingKeyword(SqlParser.HavingKeywordContext ctx) {
		return new Base(ctx.getChild(0).getText());
	}
@Override
	public ASTNode visitOnkeyword1(SqlParser.Onkeyword1Context ctx) {
		return new Base(ctx.getChild(0).getText());
	}
}
