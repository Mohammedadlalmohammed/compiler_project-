// Generated from src/antlr/Sql.g4 by ANTLR 4.13.2

	package antlr; 

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#sELECTstatement}.
	 * @param ctx the parse tree
	 */
	void enterSELECTstatement(SqlParser.SELECTstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sELECTstatement}.
	 * @param ctx the parse tree
	 */
	void exitSELECTstatement(SqlParser.SELECTstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#option_query_hint}.
	 * @param ctx the parse tree
	 */
	void enterOption_query_hint(SqlParser.Option_query_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#option_query_hint}.
	 * @param ctx the parse tree
	 */
	void exitOption_query_hint(SqlParser.Option_query_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#option_keyword}.
	 * @param ctx the parse tree
	 */
	void enterOption_keyword(SqlParser.Option_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#option_keyword}.
	 * @param ctx the parse tree
	 */
	void exitOption_keyword(SqlParser.Option_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#leftparenthesis}.
	 * @param ctx the parse tree
	 */
	void enterLeftparenthesis(SqlParser.LeftparenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#leftparenthesis}.
	 * @param ctx the parse tree
	 */
	void exitLeftparenthesis(SqlParser.LeftparenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(SqlParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(SqlParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#rightparenthesis}.
	 * @param ctx the parse tree
	 */
	void enterRightparenthesis(SqlParser.RightparenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#rightparenthesis}.
	 * @param ctx the parse tree
	 */
	void exitRightparenthesis(SqlParser.RightparenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(SqlParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(SqlParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#query_expression}.
	 * @param ctx the parse tree
	 */
	void enterQuery_expression(SqlParser.Query_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#query_expression}.
	 * @param ctx the parse tree
	 */
	void exitQuery_expression(SqlParser.Query_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#setOperations}.
	 * @param ctx the parse tree
	 */
	void enterSetOperations(SqlParser.SetOperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#setOperations}.
	 * @param ctx the parse tree
	 */
	void exitSetOperations(SqlParser.SetOperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#surroundedQuerySpecification}.
	 * @param ctx the parse tree
	 */
	void enterSurroundedQuerySpecification(SqlParser.SurroundedQuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#surroundedQuerySpecification}.
	 * @param ctx the parse tree
	 */
	void exitSurroundedQuerySpecification(SqlParser.SurroundedQuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#query_specification}.
	 * @param ctx the parse tree
	 */
	void enterQuery_specification(SqlParser.Query_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#query_specification}.
	 * @param ctx the parse tree
	 */
	void exitQuery_specification(SqlParser.Query_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fromTable}.
	 * @param ctx the parse tree
	 */
	void enterFromTable(SqlParser.FromTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fromTable}.
	 * @param ctx the parse tree
	 */
	void exitFromTable(SqlParser.FromTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#having}.
	 * @param ctx the parse tree
	 */
	void enterHaving(SqlParser.HavingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#having}.
	 * @param ctx the parse tree
	 */
	void exitHaving(SqlParser.HavingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#havingKeyword}.
	 * @param ctx the parse tree
	 */
	void enterHavingKeyword(SqlParser.HavingKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#havingKeyword}.
	 * @param ctx the parse tree
	 */
	void exitHavingKeyword(SqlParser.HavingKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(SqlParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(SqlParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#all}.
	 * @param ctx the parse tree
	 */
	void enterAll(SqlParser.AllContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#all}.
	 * @param ctx the parse tree
	 */
	void exitAll(SqlParser.AllContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#top}.
	 * @param ctx the parse tree
	 */
	void enterTop(SqlParser.TopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#top}.
	 * @param ctx the parse tree
	 */
	void exitTop(SqlParser.TopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#into}.
	 * @param ctx the parse tree
	 */
	void enterInto(SqlParser.IntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#into}.
	 * @param ctx the parse tree
	 */
	void exitInto(SqlParser.IntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#on}.
	 * @param ctx the parse tree
	 */
	void enterOn(SqlParser.OnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#on}.
	 * @param ctx the parse tree
	 */
	void exitOn(SqlParser.OnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(SqlParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(SqlParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition(SqlParser.Search_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition(SqlParser.Search_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#search_condition_without_match}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition_without_match(SqlParser.Search_condition_without_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#search_condition_without_match}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition_without_match(SqlParser.Search_condition_without_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#compareOperator}.
	 * @param ctx the parse tree
	 */
	void enterCompareOperator(SqlParser.CompareOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#compareOperator}.
	 * @param ctx the parse tree
	 */
	void exitCompareOperator(SqlParser.CompareOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterOperatorPredicate(SqlParser.OperatorPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitOperatorPredicate(SqlParser.OperatorPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LikePredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLikePredicate(SqlParser.LikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LikePredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLikePredicate(SqlParser.LikePredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BetweenPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBetweenPredicate(SqlParser.BetweenPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BetweenPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBetweenPredicate(SqlParser.BetweenPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterNullPredicate(SqlParser.NullPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitNullPredicate(SqlParser.NullPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DistinctPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterDistinctPredicate(SqlParser.DistinctPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DistinctPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitDistinctPredicate(SqlParser.DistinctPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainsPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterContainsPredicate(SqlParser.ContainsPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainsPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitContainsPredicate(SqlParser.ContainsPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FreeTextPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterFreeTextPredicate(SqlParser.FreeTextPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FreeTextPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitFreeTextPredicate(SqlParser.FreeTextPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotInPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterNotInPredicate(SqlParser.NotInPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotInPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitNotInPredicate(SqlParser.NotInPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GroupOperatorPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterGroupOperatorPredicate(SqlParser.GroupOperatorPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GroupOperatorPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitGroupOperatorPredicate(SqlParser.GroupOperatorPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExistsPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterExistsPredicate(SqlParser.ExistsPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExistsPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitExistsPredicate(SqlParser.ExistsPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#likeCondition}.
	 * @param ctx the parse tree
	 */
	void enterLikeCondition(SqlParser.LikeConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#likeCondition}.
	 * @param ctx the parse tree
	 */
	void exitLikeCondition(SqlParser.LikeConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#graph_search_pattern}.
	 * @param ctx the parse tree
	 */
	void enterGraph_search_pattern(SqlParser.Graph_search_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#graph_search_pattern}.
	 * @param ctx the parse tree
	 */
	void exitGraph_search_pattern(SqlParser.Graph_search_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#node_alias}.
	 * @param ctx the parse tree
	 */
	void enterNode_alias(SqlParser.Node_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#node_alias}.
	 * @param ctx the parse tree
	 */
	void exitNode_alias(SqlParser.Node_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#edge_alias}.
	 * @param ctx the parse tree
	 */
	void enterEdge_alias(SqlParser.Edge_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#edge_alias}.
	 * @param ctx the parse tree
	 */
	void exitEdge_alias(SqlParser.Edge_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#order_byCLASUE}.
	 * @param ctx the parse tree
	 */
	void enterOrder_byCLASUE(SqlParser.Order_byCLASUEContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#order_byCLASUE}.
	 * @param ctx the parse tree
	 */
	void exitOrder_byCLASUE(SqlParser.Order_byCLASUEContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#offset_fetch}.
	 * @param ctx the parse tree
	 */
	void enterOffset_fetch(SqlParser.Offset_fetchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#offset_fetch}.
	 * @param ctx the parse tree
	 */
	void exitOffset_fetch(SqlParser.Offset_fetchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fORClause}.
	 * @param ctx the parse tree
	 */
	void enterFORClause(SqlParser.FORClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fORClause}.
	 * @param ctx the parse tree
	 */
	void exitFORClause(SqlParser.FORClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#xML}.
	 * @param ctx the parse tree
	 */
	void enterXML(SqlParser.XMLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#xML}.
	 * @param ctx the parse tree
	 */
	void exitXML(SqlParser.XMLContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#commonDirectivesForXML}.
	 * @param ctx the parse tree
	 */
	void enterCommonDirectivesForXML(SqlParser.CommonDirectivesForXMLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#commonDirectivesForXML}.
	 * @param ctx the parse tree
	 */
	void exitCommonDirectivesForXML(SqlParser.CommonDirectivesForXMLContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#jSON}.
	 * @param ctx the parse tree
	 */
	void enterJSON(SqlParser.JSONContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#jSON}.
	 * @param ctx the parse tree
	 */
	void exitJSON(SqlParser.JSONContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#contains_search_condition}.
	 * @param ctx the parse tree
	 */
	void enterContains_search_condition(SqlParser.Contains_search_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#contains_search_condition}.
	 * @param ctx the parse tree
	 */
	void exitContains_search_condition(SqlParser.Contains_search_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#simple_term}.
	 * @param ctx the parse tree
	 */
	void enterSimple_term(SqlParser.Simple_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#simple_term}.
	 * @param ctx the parse tree
	 */
	void exitSimple_term(SqlParser.Simple_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#prefixterm}.
	 * @param ctx the parse tree
	 */
	void enterPrefixterm(SqlParser.PrefixtermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#prefixterm}.
	 * @param ctx the parse tree
	 */
	void exitPrefixterm(SqlParser.PrefixtermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#generation_term}.
	 * @param ctx the parse tree
	 */
	void enterGeneration_term(SqlParser.Generation_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#generation_term}.
	 * @param ctx the parse tree
	 */
	void exitGeneration_term(SqlParser.Generation_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#generic_proximity_term}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_proximity_term(SqlParser.Generic_proximity_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#generic_proximity_term}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_proximity_term(SqlParser.Generic_proximity_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#custom_proximity_term}.
	 * @param ctx the parse tree
	 */
	void enterCustom_proximity_term(SqlParser.Custom_proximity_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#custom_proximity_term}.
	 * @param ctx the parse tree
	 */
	void exitCustom_proximity_term(SqlParser.Custom_proximity_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#maximum_distance}.
	 * @param ctx the parse tree
	 */
	void enterMaximum_distance(SqlParser.Maximum_distanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#maximum_distance}.
	 * @param ctx the parse tree
	 */
	void exitMaximum_distance(SqlParser.Maximum_distanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#match_order}.
	 * @param ctx the parse tree
	 */
	void enterMatch_order(SqlParser.Match_orderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#match_order}.
	 * @param ctx the parse tree
	 */
	void exitMatch_order(SqlParser.Match_orderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#weighted_term}.
	 * @param ctx the parse tree
	 */
	void enterWeighted_term(SqlParser.Weighted_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#weighted_term}.
	 * @param ctx the parse tree
	 */
	void exitWeighted_term(SqlParser.Weighted_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(SqlParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(SqlParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#aNDNOT}.
	 * @param ctx the parse tree
	 */
	void enterANDNOT(SqlParser.ANDNOTContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#aNDNOT}.
	 * @param ctx the parse tree
	 */
	void exitANDNOT(SqlParser.ANDNOTContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(SqlParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(SqlParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#groupby}.
	 * @param ctx the parse tree
	 */
	void enterGroupby(SqlParser.GroupbyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#groupby}.
	 * @param ctx the parse tree
	 */
	void exitGroupby(SqlParser.GroupbyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#group_by_expression}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_expression(SqlParser.Group_by_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#group_by_expression}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_expression(SqlParser.Group_by_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#grouping_set}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_set(SqlParser.Grouping_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#grouping_set}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_set(SqlParser.Grouping_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#grouping_set_item}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_set_item(SqlParser.Grouping_set_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#grouping_set_item}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_set_item(SqlParser.Grouping_set_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(SqlParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(SqlParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_source}.
	 * @param ctx the parse tree
	 */
	void enterTable_source(SqlParser.Table_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_source}.
	 * @param ctx the parse tree
	 */
	void exitTable_source(SqlParser.Table_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tablesample_clause}.
	 * @param ctx the parse tree
	 */
	void enterTablesample_clause(SqlParser.Tablesample_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tablesample_clause}.
	 * @param ctx the parse tree
	 */
	void exitTablesample_clause(SqlParser.Tablesample_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#joined_table}.
	 * @param ctx the parse tree
	 */
	void enterJoined_table(SqlParser.Joined_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#joined_table}.
	 * @param ctx the parse tree
	 */
	void exitJoined_table(SqlParser.Joined_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#join_type}.
	 * @param ctx the parse tree
	 */
	void enterJoin_type(SqlParser.Join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#join_type}.
	 * @param ctx the parse tree
	 */
	void exitJoin_type(SqlParser.Join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#pivoted_table}.
	 * @param ctx the parse tree
	 */
	void enterPivoted_table(SqlParser.Pivoted_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#pivoted_table}.
	 * @param ctx the parse tree
	 */
	void exitPivoted_table(SqlParser.Pivoted_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_clause(SqlParser.Pivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_clause(SqlParser.Pivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#unpivoted_table}.
	 * @param ctx the parse tree
	 */
	void enterUnpivoted_table(SqlParser.Unpivoted_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#unpivoted_table}.
	 * @param ctx the parse tree
	 */
	void exitUnpivoted_table(SqlParser.Unpivoted_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_clause(SqlParser.Unpivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_clause(SqlParser.Unpivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list(SqlParser.Column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list(SqlParser.Column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#system_time}.
	 * @param ctx the parse tree
	 */
	void enterSystem_time(SqlParser.System_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#system_time}.
	 * @param ctx the parse tree
	 */
	void exitSystem_time(SqlParser.System_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#date_time}.
	 * @param ctx the parse tree
	 */
	void enterDate_time(SqlParser.Date_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#date_time}.
	 * @param ctx the parse tree
	 */
	void exitDate_time(SqlParser.Date_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#start_date_time}.
	 * @param ctx the parse tree
	 */
	void enterStart_date_time(SqlParser.Start_date_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#start_date_time}.
	 * @param ctx the parse tree
	 */
	void exitStart_date_time(SqlParser.Start_date_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#end_date_time}.
	 * @param ctx the parse tree
	 */
	void enterEnd_date_time(SqlParser.End_date_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#end_date_time}.
	 * @param ctx the parse tree
	 */
	void exitEnd_date_time(SqlParser.End_date_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#allColumn}.
	 * @param ctx the parse tree
	 */
	void enterAllColumn(SqlParser.AllColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#allColumn}.
	 * @param ctx the parse tree
	 */
	void exitAllColumn(SqlParser.AllColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#objectDotAllColumn}.
	 * @param ctx the parse tree
	 */
	void enterObjectDotAllColumn(SqlParser.ObjectDotAllColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#objectDotAllColumn}.
	 * @param ctx the parse tree
	 */
	void exitObjectDotAllColumn(SqlParser.ObjectDotAllColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(SqlParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(SqlParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterColumn_or_expression(SqlParser.Column_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitColumn_or_expression(SqlParser.Column_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#objectDotColumn}.
	 * @param ctx the parse tree
	 */
	void enterObjectDotColumn(SqlParser.ObjectDotColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#objectDotColumn}.
	 * @param ctx the parse tree
	 */
	void exitObjectDotColumn(SqlParser.ObjectDotColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#columnAliasRule}.
	 * @param ctx the parse tree
	 */
	void enterColumnAliasRule(SqlParser.ColumnAliasRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#columnAliasRule}.
	 * @param ctx the parse tree
	 */
	void exitColumnAliasRule(SqlParser.ColumnAliasRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#asKeyword}.
	 * @param ctx the parse tree
	 */
	void enterAsKeyword(SqlParser.AsKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#asKeyword}.
	 * @param ctx the parse tree
	 */
	void exitAsKeyword(SqlParser.AsKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#query_hint}.
	 * @param ctx the parse tree
	 */
	void enterQuery_hint(SqlParser.Query_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#query_hint}.
	 * @param ctx the parse tree
	 */
	void exitQuery_hint(SqlParser.Query_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_hint}.
	 * @param ctx the parse tree
	 */
	void enterTable_hint(SqlParser.Table_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_hint}.
	 * @param ctx the parse tree
	 */
	void exitTable_hint(SqlParser.Table_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_hint_limited}.
	 * @param ctx the parse tree
	 */
	void enterTable_hint_limited(SqlParser.Table_hint_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_hint_limited}.
	 * @param ctx the parse tree
	 */
	void exitTable_hint_limited(SqlParser.Table_hint_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#openxml_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpenxml_clause(SqlParser.Openxml_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#openxml_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpenxml_clause(SqlParser.Openxml_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#join_hint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_hint(SqlParser.Join_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#join_hint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_hint(SqlParser.Join_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#with_common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterWith_common_table_expression(SqlParser.With_common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#with_common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitWith_common_table_expression(SqlParser.With_common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#with}.
	 * @param ctx the parse tree
	 */
	void enterWith(SqlParser.WithContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#with}.
	 * @param ctx the parse tree
	 */
	void exitWith(SqlParser.WithContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(SqlParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(SqlParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThreePartTableName}
	 * labeled alternative in {@link SqlParser#object}.
	 * @param ctx the parse tree
	 */
	void enterThreePartTableName(SqlParser.ThreePartTableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThreePartTableName}
	 * labeled alternative in {@link SqlParser#object}.
	 * @param ctx the parse tree
	 */
	void exitThreePartTableName(SqlParser.ThreePartTableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TwoPartTableName}
	 * labeled alternative in {@link SqlParser#object}.
	 * @param ctx the parse tree
	 */
	void enterTwoPartTableName(SqlParser.TwoPartTableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TwoPartTableName}
	 * labeled alternative in {@link SqlParser#object}.
	 * @param ctx the parse tree
	 */
	void exitTwoPartTableName(SqlParser.TwoPartTableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OnePartTableName}
	 * labeled alternative in {@link SqlParser#object}.
	 * @param ctx the parse tree
	 */
	void enterOnePartTableName(SqlParser.OnePartTableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OnePartTableName}
	 * labeled alternative in {@link SqlParser#object}.
	 * @param ctx the parse tree
	 */
	void exitOnePartTableName(SqlParser.OnePartTableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#oUTPUT_CLAUSE}.
	 * @param ctx the parse tree
	 */
	void enterOUTPUT_CLAUSE(SqlParser.OUTPUT_CLAUSEContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#oUTPUT_CLAUSE}.
	 * @param ctx the parse tree
	 */
	void exitOUTPUT_CLAUSE(SqlParser.OUTPUT_CLAUSEContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dml_select_list}.
	 * @param ctx the parse tree
	 */
	void enterDml_select_list(SqlParser.Dml_select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dml_select_list}.
	 * @param ctx the parse tree
	 */
	void exitDml_select_list(SqlParser.Dml_select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_name1}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name1(SqlParser.Column_name1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_name1}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name1(SqlParser.Column_name1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(SqlParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(SqlParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(SqlParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(SqlParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dml_table_source}.
	 * @param ctx the parse tree
	 */
	void enterDml_table_source(SqlParser.Dml_table_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dml_table_source}.
	 * @param ctx the parse tree
	 */
	void exitDml_table_source(SqlParser.Dml_table_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#merge}.
	 * @param ctx the parse tree
	 */
	void enterMerge(SqlParser.MergeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#merge}.
	 * @param ctx the parse tree
	 */
	void exitMerge(SqlParser.MergeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#target_table}.
	 * @param ctx the parse tree
	 */
	void enterTarget_table(SqlParser.Target_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#target_table}.
	 * @param ctx the parse tree
	 */
	void exitTarget_table(SqlParser.Target_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#merge_hint}.
	 * @param ctx the parse tree
	 */
	void enterMerge_hint(SqlParser.Merge_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#merge_hint}.
	 * @param ctx the parse tree
	 */
	void exitMerge_hint(SqlParser.Merge_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#merge_search_condition}.
	 * @param ctx the parse tree
	 */
	void enterMerge_search_condition(SqlParser.Merge_search_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#merge_search_condition}.
	 * @param ctx the parse tree
	 */
	void exitMerge_search_condition(SqlParser.Merge_search_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#merge_matched}.
	 * @param ctx the parse tree
	 */
	void enterMerge_matched(SqlParser.Merge_matchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#merge_matched}.
	 * @param ctx the parse tree
	 */
	void exitMerge_matched(SqlParser.Merge_matchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#merge_not_matched}.
	 * @param ctx the parse tree
	 */
	void enterMerge_not_matched(SqlParser.Merge_not_matchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#merge_not_matched}.
	 * @param ctx the parse tree
	 */
	void exitMerge_not_matched(SqlParser.Merge_not_matchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#clause_search_condition}.
	 * @param ctx the parse tree
	 */
	void enterClause_search_condition(SqlParser.Clause_search_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#clause_search_condition}.
	 * @param ctx the parse tree
	 */
	void exitClause_search_condition(SqlParser.Clause_search_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop}.
	 * @param ctx the parse tree
	 */
	void enterDrop(SqlParser.DropContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop}.
	 * @param ctx the parse tree
	 */
	void exitDrop(SqlParser.DropContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#values_list}.
	 * @param ctx the parse tree
	 */
	void enterValues_list(SqlParser.Values_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#values_list}.
	 * @param ctx the parse tree
	 */
	void exitValues_list(SqlParser.Values_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#set_clause}.
	 * @param ctx the parse tree
	 */
	void enterSet_clause(SqlParser.Set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#set_clause}.
	 * @param ctx the parse tree
	 */
	void exitSet_clause(SqlParser.Set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter}.
	 * @param ctx the parse tree
	 */
	void enterAlter(SqlParser.AlterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter}.
	 * @param ctx the parse tree
	 */
	void exitAlter(SqlParser.AlterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_set_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_set_definition(SqlParser.Column_set_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_set_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_set_definition(SqlParser.Column_set_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_clustered_constraint_option}.
	 * @param ctx the parse tree
	 */
	void enterDrop_clustered_constraint_option(SqlParser.Drop_clustered_constraint_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_clustered_constraint_option}.
	 * @param ctx the parse tree
	 */
	void exitDrop_clustered_constraint_option(SqlParser.Drop_clustered_constraint_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_option}.
	 * @param ctx the parse tree
	 */
	void enterTable_option(SqlParser.Table_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_option}.
	 * @param ctx the parse tree
	 */
	void exitTable_option(SqlParser.Table_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#filetable_option}.
	 * @param ctx the parse tree
	 */
	void enterFiletable_option(SqlParser.Filetable_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#filetable_option}.
	 * @param ctx the parse tree
	 */
	void exitFiletable_option(SqlParser.Filetable_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#stretch_configuration}.
	 * @param ctx the parse tree
	 */
	void enterStretch_configuration(SqlParser.Stretch_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#stretch_configuration}.
	 * @param ctx the parse tree
	 */
	void exitStretch_configuration(SqlParser.Stretch_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_stretch_options}.
	 * @param ctx the parse tree
	 */
	void enterTable_stretch_options(SqlParser.Table_stretch_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_stretch_options}.
	 * @param ctx the parse tree
	 */
	void exitTable_stretch_options(SqlParser.Table_stretch_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#single_partition_rebuild__option}.
	 * @param ctx the parse tree
	 */
	void enterSingle_partition_rebuild__option(SqlParser.Single_partition_rebuild__optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#single_partition_rebuild__option}.
	 * @param ctx the parse tree
	 */
	void exitSingle_partition_rebuild__option(SqlParser.Single_partition_rebuild__optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#low_priority_lock_wait}.
	 * @param ctx the parse tree
	 */
	void enterLow_priority_lock_wait(SqlParser.Low_priority_lock_waitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#low_priority_lock_wait}.
	 * @param ctx the parse tree
	 */
	void exitLow_priority_lock_wait(SqlParser.Low_priority_lock_waitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(SqlParser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(SqlParser.Column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(SqlParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(SqlParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(SqlParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(SqlParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#index_option}.
	 * @param ctx the parse tree
	 */
	void enterIndex_option(SqlParser.Index_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#index_option}.
	 * @param ctx the parse tree
	 */
	void exitIndex_option(SqlParser.Index_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(SqlParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(SqlParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#computed_column_definition}.
	 * @param ctx the parse tree
	 */
	void enterComputed_column_definition(SqlParser.Computed_column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#computed_column_definition}.
	 * @param ctx the parse tree
	 */
	void exitComputed_column_definition(SqlParser.Computed_column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#single_partition_rebuild_option}.
	 * @param ctx the parse tree
	 */
	void enterSingle_partition_rebuild_option(SqlParser.Single_partition_rebuild_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#single_partition_rebuild_option}.
	 * @param ctx the parse tree
	 */
	void exitSingle_partition_rebuild_option(SqlParser.Single_partition_rebuild_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#rebuild_option}.
	 * @param ctx the parse tree
	 */
	void enterRebuild_option(SqlParser.Rebuild_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#rebuild_option}.
	 * @param ctx the parse tree
	 */
	void exitRebuild_option(SqlParser.Rebuild_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(SqlParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(SqlParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(SqlParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(SqlParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_index}.
	 * @param ctx the parse tree
	 */
	void enterColumn_index(SqlParser.Column_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_index}.
	 * @param ctx the parse tree
	 */
	void exitColumn_index(SqlParser.Column_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_index}.
	 * @param ctx the parse tree
	 */
	void enterTable_index(SqlParser.Table_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_index}.
	 * @param ctx the parse tree
	 */
	void exitTable_index(SqlParser.Table_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ledger_option}.
	 * @param ctx the parse tree
	 */
	void enterLedger_option(SqlParser.Ledger_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ledger_option}.
	 * @param ctx the parse tree
	 */
	void exitLedger_option(SqlParser.Ledger_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ledger_view_option}.
	 * @param ctx the parse tree
	 */
	void enterLedger_view_option(SqlParser.Ledger_view_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ledger_view_option}.
	 * @param ctx the parse tree
	 */
	void exitLedger_view_option(SqlParser.Ledger_view_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#close_cursor}.
	 * @param ctx the parse tree
	 */
	void enterClose_cursor(SqlParser.Close_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#close_cursor}.
	 * @param ctx the parse tree
	 */
	void exitClose_cursor(SqlParser.Close_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dellocate_cursor}.
	 * @param ctx the parse tree
	 */
	void enterDellocate_cursor(SqlParser.Dellocate_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dellocate_cursor}.
	 * @param ctx the parse tree
	 */
	void exitDellocate_cursor(SqlParser.Dellocate_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#declare_cursor}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_cursor(SqlParser.Declare_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#declare_cursor}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_cursor(SqlParser.Declare_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fetch_cursor}.
	 * @param ctx the parse tree
	 */
	void enterFetch_cursor(SqlParser.Fetch_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fetch_cursor}.
	 * @param ctx the parse tree
	 */
	void exitFetch_cursor(SqlParser.Fetch_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#open_cursor}.
	 * @param ctx the parse tree
	 */
	void enterOpen_cursor(SqlParser.Open_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#open_cursor}.
	 * @param ctx the parse tree
	 */
	void exitOpen_cursor(SqlParser.Open_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(SqlParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(SqlParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#surroundedExpression}.
	 * @param ctx the parse tree
	 */
	void enterSurroundedExpression(SqlParser.SurroundedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#surroundedExpression}.
	 * @param ctx the parse tree
	 */
	void exitSurroundedExpression(SqlParser.SurroundedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#surroundedScalarSubquery}.
	 * @param ctx the parse tree
	 */
	void enterSurroundedScalarSubquery(SqlParser.SurroundedScalarSubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#surroundedScalarSubquery}.
	 * @param ctx the parse tree
	 */
	void exitSurroundedScalarSubquery(SqlParser.SurroundedScalarSubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(SqlParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(SqlParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#scalar_expression}.
	 * @param ctx the parse tree
	 */
	void enterScalar_expression(SqlParser.Scalar_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#scalar_expression}.
	 * @param ctx the parse tree
	 */
	void exitScalar_expression(SqlParser.Scalar_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#bulk}.
	 * @param ctx the parse tree
	 */
	void enterBulk(SqlParser.BulkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#bulk}.
	 * @param ctx the parse tree
	 */
	void exitBulk(SqlParser.BulkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#openrowset}.
	 * @param ctx the parse tree
	 */
	void enterOpenrowset(SqlParser.OpenrowsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#openrowset}.
	 * @param ctx the parse tree
	 */
	void exitOpenrowset(SqlParser.OpenrowsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#bulk_option}.
	 * @param ctx the parse tree
	 */
	void enterBulk_option(SqlParser.Bulk_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#bulk_option}.
	 * @param ctx the parse tree
	 */
	void exitBulk_option(SqlParser.Bulk_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#rows_per_batch}.
	 * @param ctx the parse tree
	 */
	void enterRows_per_batch(SqlParser.Rows_per_batchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#rows_per_batch}.
	 * @param ctx the parse tree
	 */
	void exitRows_per_batch(SqlParser.Rows_per_batchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#maximum_errors}.
	 * @param ctx the parse tree
	 */
	void enterMaximum_errors(SqlParser.Maximum_errorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#maximum_errors}.
	 * @param ctx the parse tree
	 */
	void exitMaximum_errors(SqlParser.Maximum_errorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#quote_character}.
	 * @param ctx the parse tree
	 */
	void enterQuote_character(SqlParser.Quote_characterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#quote_character}.
	 * @param ctx the parse tree
	 */
	void exitQuote_character(SqlParser.Quote_characterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#file_format}.
	 * @param ctx the parse tree
	 */
	void enterFile_format(SqlParser.File_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#file_format}.
	 * @param ctx the parse tree
	 */
	void exitFile_format(SqlParser.File_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_ordinal}.
	 * @param ctx the parse tree
	 */
	void enterColumn_ordinal(SqlParser.Column_ordinalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_ordinal}.
	 * @param ctx the parse tree
	 */
	void exitColumn_ordinal(SqlParser.Column_ordinalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_path}.
	 * @param ctx the parse tree
	 */
	void enterColumn_path(SqlParser.Column_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_path}.
	 * @param ctx the parse tree
	 */
	void exitColumn_path(SqlParser.Column_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sql_datatype}.
	 * @param ctx the parse tree
	 */
	void enterSql_datatype(SqlParser.Sql_datatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sql_datatype}.
	 * @param ctx the parse tree
	 */
	void exitSql_datatype(SqlParser.Sql_datatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#data_file_path}.
	 * @param ctx the parse tree
	 */
	void enterData_file_path(SqlParser.Data_file_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#data_file_path}.
	 * @param ctx the parse tree
	 */
	void exitData_file_path(SqlParser.Data_file_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#data_source_name}.
	 * @param ctx the parse tree
	 */
	void enterData_source_name(SqlParser.Data_source_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#data_source_name}.
	 * @param ctx the parse tree
	 */
	void exitData_source_name(SqlParser.Data_source_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#data_file}.
	 * @param ctx the parse tree
	 */
	void enterData_file(SqlParser.Data_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#data_file}.
	 * @param ctx the parse tree
	 */
	void exitData_file(SqlParser.Data_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#field_terminator}.
	 * @param ctx the parse tree
	 */
	void enterField_terminator(SqlParser.Field_terminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#field_terminator}.
	 * @param ctx the parse tree
	 */
	void exitField_terminator(SqlParser.Field_terminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#row_terminator}.
	 * @param ctx the parse tree
	 */
	void enterRow_terminator(SqlParser.Row_terminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#row_terminator}.
	 * @param ctx the parse tree
	 */
	void exitRow_terminator(SqlParser.Row_terminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#code_page}.
	 * @param ctx the parse tree
	 */
	void enterCode_page(SqlParser.Code_pageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#code_page}.
	 * @param ctx the parse tree
	 */
	void exitCode_page(SqlParser.Code_pageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#last_row}.
	 * @param ctx the parse tree
	 */
	void enterLast_row(SqlParser.Last_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#last_row}.
	 * @param ctx the parse tree
	 */
	void exitLast_row(SqlParser.Last_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#first_row}.
	 * @param ctx the parse tree
	 */
	void enterFirst_row(SqlParser.First_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#first_row}.
	 * @param ctx the parse tree
	 */
	void exitFirst_row(SqlParser.First_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#quote_characters}.
	 * @param ctx the parse tree
	 */
	void enterQuote_characters(SqlParser.Quote_charactersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#quote_characters}.
	 * @param ctx the parse tree
	 */
	void exitQuote_characters(SqlParser.Quote_charactersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#errorfile_data_source_name}.
	 * @param ctx the parse tree
	 */
	void enterErrorfile_data_source_name(SqlParser.Errorfile_data_source_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#errorfile_data_source_name}.
	 * @param ctx the parse tree
	 */
	void exitErrorfile_data_source_name(SqlParser.Errorfile_data_source_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#file_name}.
	 * @param ctx the parse tree
	 */
	void enterFile_name(SqlParser.File_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#file_name}.
	 * @param ctx the parse tree
	 */
	void exitFile_name(SqlParser.File_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#max_errors}.
	 * @param ctx the parse tree
	 */
	void enterMax_errors(SqlParser.Max_errorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#max_errors}.
	 * @param ctx the parse tree
	 */
	void exitMax_errors(SqlParser.Max_errorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#format_file_path}.
	 * @param ctx the parse tree
	 */
	void enterFormat_file_path(SqlParser.Format_file_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#format_file_path}.
	 * @param ctx the parse tree
	 */
	void exitFormat_file_path(SqlParser.Format_file_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#batch_size}.
	 * @param ctx the parse tree
	 */
	void enterBatch_size(SqlParser.Batch_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#batch_size}.
	 * @param ctx the parse tree
	 */
	void exitBatch_size(SqlParser.Batch_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#kilobytes_per_batch}.
	 * @param ctx the parse tree
	 */
	void enterKilobytes_per_batch(SqlParser.Kilobytes_per_batchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#kilobytes_per_batch}.
	 * @param ctx the parse tree
	 */
	void exitKilobytes_per_batch(SqlParser.Kilobytes_per_batchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#new_table}.
	 * @param ctx the parse tree
	 */
	void enterNew_table(SqlParser.New_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#new_table}.
	 * @param ctx the parse tree
	 */
	void exitNew_table(SqlParser.New_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expression_name}.
	 * @param ctx the parse tree
	 */
	void enterExpression_name(SqlParser.Expression_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expression_name}.
	 * @param ctx the parse tree
	 */
	void exitExpression_name(SqlParser.Expression_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void enterString_expression(SqlParser.String_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void exitString_expression(SqlParser.String_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#escape_character}.
	 * @param ctx the parse tree
	 */
	void enterEscape_character(SqlParser.Escape_characterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#escape_character}.
	 * @param ctx the parse tree
	 */
	void exitEscape_character(SqlParser.Escape_characterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(SqlParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(SqlParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#freetext_string}.
	 * @param ctx the parse tree
	 */
	void enterFreetext_string(SqlParser.Freetext_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#freetext_string}.
	 * @param ctx the parse tree
	 */
	void exitFreetext_string(SqlParser.Freetext_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(SqlParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(SqlParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#node_table_alias}.
	 * @param ctx the parse tree
	 */
	void enterNode_table_alias(SqlParser.Node_table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#node_table_alias}.
	 * @param ctx the parse tree
	 */
	void exitNode_table_alias(SqlParser.Node_table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#node_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNode_table_name(SqlParser.Node_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#node_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNode_table_name(SqlParser.Node_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#edge_table_alias}.
	 * @param ctx the parse tree
	 */
	void enterEdge_table_alias(SqlParser.Edge_table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#edge_table_alias}.
	 * @param ctx the parse tree
	 */
	void exitEdge_table_alias(SqlParser.Edge_table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#edge_table_name}.
	 * @param ctx the parse tree
	 */
	void enterEdge_table_name(SqlParser.Edge_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#edge_table_name}.
	 * @param ctx the parse tree
	 */
	void exitEdge_table_name(SqlParser.Edge_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(SqlParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(SqlParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#offset_row_count_expression}.
	 * @param ctx the parse tree
	 */
	void enterOffset_row_count_expression(SqlParser.Offset_row_count_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#offset_row_count_expression}.
	 * @param ctx the parse tree
	 */
	void exitOffset_row_count_expression(SqlParser.Offset_row_count_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#integer_constant}.
	 * @param ctx the parse tree
	 */
	void enterInteger_constant(SqlParser.Integer_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#integer_constant}.
	 * @param ctx the parse tree
	 */
	void exitInteger_constant(SqlParser.Integer_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fetch_row_count_expression}.
	 * @param ctx the parse tree
	 */
	void enterFetch_row_count_expression(SqlParser.Fetch_row_count_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fetch_row_count_expression}.
	 * @param ctx the parse tree
	 */
	void exitFetch_row_count_expression(SqlParser.Fetch_row_count_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(SqlParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(SqlParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#phrase}.
	 * @param ctx the parse tree
	 */
	void enterPhrase(SqlParser.PhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#phrase}.
	 * @param ctx the parse tree
	 */
	void exitPhrase(SqlParser.PhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#prefix_term}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_term(SqlParser.Prefix_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#prefix_term}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_term(SqlParser.Prefix_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#proximity_term}.
	 * @param ctx the parse tree
	 */
	void enterProximity_term(SqlParser.Proximity_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#proximity_term}.
	 * @param ctx the parse tree
	 */
	void exitProximity_term(SqlParser.Proximity_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(SqlParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(SqlParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#weight_value}.
	 * @param ctx the parse tree
	 */
	void enterWeight_value(SqlParser.Weight_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#weight_value}.
	 * @param ctx the parse tree
	 */
	void exitWeight_value(SqlParser.Weight_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_expression}.
	 * @param ctx the parse tree
	 */
	void enterColumn_expression(SqlParser.Column_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_expression}.
	 * @param ctx the parse tree
	 */
	void exitColumn_expression(SqlParser.Column_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_or_view_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_view_name(SqlParser.Table_or_view_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_or_view_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_view_name(SqlParser.Table_or_view_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#rowset_function}.
	 * @param ctx the parse tree
	 */
	void enterRowset_function(SqlParser.Rowset_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#rowset_function}.
	 * @param ctx the parse tree
	 */
	void exitRowset_function(SqlParser.Rowset_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#bulk_column_alias}.
	 * @param ctx the parse tree
	 */
	void enterBulk_column_alias(SqlParser.Bulk_column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#bulk_column_alias}.
	 * @param ctx the parse tree
	 */
	void exitBulk_column_alias(SqlParser.Bulk_column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(SqlParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(SqlParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(SqlParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(SqlParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SqlParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SqlParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(SqlParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(SqlParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#repeat_seed}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_seed(SqlParser.Repeat_seedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#repeat_seed}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_seed(SqlParser.Repeat_seedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#left_table_source}.
	 * @param ctx the parse tree
	 */
	void enterLeft_table_source(SqlParser.Left_table_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#left_table_source}.
	 * @param ctx the parse tree
	 */
	void exitLeft_table_source(SqlParser.Left_table_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#right_table_source}.
	 * @param ctx the parse tree
	 */
	void enterRight_table_source(SqlParser.Right_table_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#right_table_source}.
	 * @param ctx the parse tree
	 */
	void exitRight_table_source(SqlParser.Right_table_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#aggregate_function}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_function(SqlParser.Aggregate_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#aggregate_function}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_function(SqlParser.Aggregate_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#value_column}.
	 * @param ctx the parse tree
	 */
	void enterValue_column(SqlParser.Value_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#value_column}.
	 * @param ctx the parse tree
	 */
	void exitValue_column(SqlParser.Value_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#pivot_column}.
	 * @param ctx the parse tree
	 */
	void enterPivot_column(SqlParser.Pivot_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#pivot_column}.
	 * @param ctx the parse tree
	 */
	void exitPivot_column(SqlParser.Pivot_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#date_time_variable}.
	 * @param ctx the parse tree
	 */
	void enterDate_time_variable(SqlParser.Date_time_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#date_time_variable}.
	 * @param ctx the parse tree
	 */
	void exitDate_time_variable(SqlParser.Date_time_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#date_time_literal}.
	 * @param ctx the parse tree
	 */
	void enterDate_time_literal(SqlParser.Date_time_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#date_time_literal}.
	 * @param ctx the parse tree
	 */
	void exitDate_time_literal(SqlParser.Date_time_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(SqlParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(SqlParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#field_name}.
	 * @param ctx the parse tree
	 */
	void enterField_name(SqlParser.Field_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#field_name}.
	 * @param ctx the parse tree
	 */
	void exitField_name(SqlParser.Field_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#property_name}.
	 * @param ctx the parse tree
	 */
	void enterProperty_name(SqlParser.Property_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#property_name}.
	 * @param ctx the parse tree
	 */
	void exitProperty_name(SqlParser.Property_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#udt_column_name}.
	 * @param ctx the parse tree
	 */
	void enterUdt_column_name(SqlParser.Udt_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#udt_column_name}.
	 * @param ctx the parse tree
	 */
	void exitUdt_column_name(SqlParser.Udt_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(SqlParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(SqlParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#method_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_name(SqlParser.Method_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#method_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_name(SqlParser.Method_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#integer_value}.
	 * @param ctx the parse tree
	 */
	void enterInteger_value(SqlParser.Integer_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#integer_value}.
	 * @param ctx the parse tree
	 */
	void exitInteger_value(SqlParser.Integer_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#numeric_value}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_value(SqlParser.Numeric_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#numeric_value}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_value(SqlParser.Numeric_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#literal_constant}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_constant(SqlParser.Literal_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#literal_constant}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_constant(SqlParser.Literal_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(SqlParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(SqlParser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#hint_name}.
	 * @param ctx the parse tree
	 */
	void enterHint_name(SqlParser.Hint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#hint_name}.
	 * @param ctx the parse tree
	 */
	void exitHint_name(SqlParser.Hint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#xml_plan}.
	 * @param ctx the parse tree
	 */
	void enterXml_plan(SqlParser.Xml_planContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#xml_plan}.
	 * @param ctx the parse tree
	 */
	void exitXml_plan(SqlParser.Xml_planContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#exposed_object_name}.
	 * @param ctx the parse tree
	 */
	void enterExposed_object_name(SqlParser.Exposed_object_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#exposed_object_name}.
	 * @param ctx the parse tree
	 */
	void exitExposed_object_name(SqlParser.Exposed_object_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#point_in_time}.
	 * @param ctx the parse tree
	 */
	void enterPoint_in_time(SqlParser.Point_in_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#point_in_time}.
	 * @param ctx the parse tree
	 */
	void exitPoint_in_time(SqlParser.Point_in_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#index_value}.
	 * @param ctx the parse tree
	 */
	void enterIndex_value(SqlParser.Index_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#index_value}.
	 * @param ctx the parse tree
	 */
	void exitIndex_value(SqlParser.Index_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#index_column_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_column_name(SqlParser.Index_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#index_column_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_column_name(SqlParser.Index_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#in}.
	 * @param ctx the parse tree
	 */
	void enterIn(SqlParser.InContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#in}.
	 * @param ctx the parse tree
	 */
	void exitIn(SqlParser.InContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#int}.
	 * @param ctx the parse tree
	 */
	void enterInt(SqlParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#int}.
	 * @param ctx the parse tree
	 */
	void exitInt(SqlParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#idoc}.
	 * @param ctx the parse tree
	 */
	void enterIdoc(SqlParser.IdocContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#idoc}.
	 * @param ctx the parse tree
	 */
	void exitIdoc(SqlParser.IdocContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#nvarchar}.
	 * @param ctx the parse tree
	 */
	void enterNvarchar(SqlParser.NvarcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#nvarchar}.
	 * @param ctx the parse tree
	 */
	void exitNvarchar(SqlParser.NvarcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#rowpattern}.
	 * @param ctx the parse tree
	 */
	void enterRowpattern(SqlParser.RowpatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#rowpattern}.
	 * @param ctx the parse tree
	 */
	void exitRowpattern(SqlParser.RowpatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#byte}.
	 * @param ctx the parse tree
	 */
	void enterByte(SqlParser.ByteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#byte}.
	 * @param ctx the parse tree
	 */
	void exitByte(SqlParser.ByteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#flags}.
	 * @param ctx the parse tree
	 */
	void enterFlags(SqlParser.FlagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#flags}.
	 * @param ctx the parse tree
	 */
	void exitFlags(SqlParser.FlagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#count}.
	 * @param ctx the parse tree
	 */
	void enterCount(SqlParser.CountContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#count}.
	 * @param ctx the parse tree
	 */
	void exitCount(SqlParser.CountContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#columns}.
	 * @param ctx the parse tree
	 */
	void enterColumns(SqlParser.ColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#columns}.
	 * @param ctx the parse tree
	 */
	void exitColumns(SqlParser.ColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#openquery}.
	 * @param ctx the parse tree
	 */
	void enterOpenquery(SqlParser.OpenqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#openquery}.
	 * @param ctx the parse tree
	 */
	void exitOpenquery(SqlParser.OpenqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#openrowset2}.
	 * @param ctx the parse tree
	 */
	void enterOpenrowset2(SqlParser.Openrowset2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#openrowset2}.
	 * @param ctx the parse tree
	 */
	void exitOpenrowset2(SqlParser.Openrowset2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#provider_string}.
	 * @param ctx the parse tree
	 */
	void enterProvider_string(SqlParser.Provider_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#provider_string}.
	 * @param ctx the parse tree
	 */
	void exitProvider_string(SqlParser.Provider_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#datasource}.
	 * @param ctx the parse tree
	 */
	void enterDatasource(SqlParser.DatasourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#datasource}.
	 * @param ctx the parse tree
	 */
	void exitDatasource(SqlParser.DatasourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#user_id}.
	 * @param ctx the parse tree
	 */
	void enterUser_id(SqlParser.User_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#user_id}.
	 * @param ctx the parse tree
	 */
	void exitUser_id(SqlParser.User_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#password}.
	 * @param ctx the parse tree
	 */
	void enterPassword(SqlParser.PasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#password}.
	 * @param ctx the parse tree
	 */
	void exitPassword(SqlParser.PasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#provider_name}.
	 * @param ctx the parse tree
	 */
	void enterProvider_name(SqlParser.Provider_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#provider_name}.
	 * @param ctx the parse tree
	 */
	void exitProvider_name(SqlParser.Provider_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#catalog}.
	 * @param ctx the parse tree
	 */
	void enterCatalog(SqlParser.CatalogContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#catalog}.
	 * @param ctx the parse tree
	 */
	void exitCatalog(SqlParser.CatalogContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SqlParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SqlParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#linked_server}.
	 * @param ctx the parse tree
	 */
	void enterLinked_server(SqlParser.Linked_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#linked_server}.
	 * @param ctx the parse tree
	 */
	void exitLinked_server(SqlParser.Linked_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#rowset_function_limited}.
	 * @param ctx the parse tree
	 */
	void enterRowset_function_limited(SqlParser.Rowset_function_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#rowset_function_limited}.
	 * @param ctx the parse tree
	 */
	void exitRowset_function_limited(SqlParser.Rowset_function_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_variable}.
	 * @param ctx the parse tree
	 */
	void enterTable_variable(SqlParser.Table_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_variable}.
	 * @param ctx the parse tree
	 */
	void exitTable_variable(SqlParser.Table_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_name(SqlParser.Cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_name(SqlParser.Cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cursor_variable_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_variable_name(SqlParser.Cursor_variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cursor_variable_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_variable_name(SqlParser.Cursor_variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(SqlParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(SqlParser.Schema_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(SqlParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(SqlParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#server_name}.
	 * @param ctx the parse tree
	 */
	void enterServer_name(SqlParser.Server_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#server_name}.
	 * @param ctx the parse tree
	 */
	void exitServer_name(SqlParser.Server_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#output_table}.
	 * @param ctx the parse tree
	 */
	void enterOutput_table(SqlParser.Output_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#output_table}.
	 * @param ctx the parse tree
	 */
	void exitOutput_table(SqlParser.Output_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_alias_identifier}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias_identifier(SqlParser.Column_alias_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_alias_identifier}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias_identifier(SqlParser.Column_alias_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#from_table_name}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_name(SqlParser.From_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#from_table_name}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_name(SqlParser.From_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(SqlParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(SqlParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#derived_table}.
	 * @param ctx the parse tree
	 */
	void enterDerived_table(SqlParser.Derived_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#derived_table}.
	 * @param ctx the parse tree
	 */
	void exitDerived_table(SqlParser.Derived_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dml_statement_with_output_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_statement_with_output_clause(SqlParser.Dml_statement_with_output_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dml_statement_with_output_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_statement_with_output_clause(SqlParser.Dml_statement_with_output_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(SqlParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(SqlParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#type_schema_name}.
	 * @param ctx the parse tree
	 */
	void enterType_schema_name(SqlParser.Type_schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#type_schema_name}.
	 * @param ctx the parse tree
	 */
	void exitType_schema_name(SqlParser.Type_schema_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#scale}.
	 * @param ctx the parse tree
	 */
	void enterScale(SqlParser.ScaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#scale}.
	 * @param ctx the parse tree
	 */
	void exitScale(SqlParser.ScaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#precision}.
	 * @param ctx the parse tree
	 */
	void enterPrecision(SqlParser.PrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#precision}.
	 * @param ctx the parse tree
	 */
	void exitPrecision(SqlParser.PrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void enterXml_schema_collection(SqlParser.Xml_schema_collectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void exitXml_schema_collection(SqlParser.Xml_schema_collectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#max}.
	 * @param ctx the parse tree
	 */
	void enterMax(SqlParser.MaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#max}.
	 * @param ctx the parse tree
	 */
	void exitMax(SqlParser.MaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#mask_function}.
	 * @param ctx the parse tree
	 */
	void enterMask_function(SqlParser.Mask_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#mask_function}.
	 * @param ctx the parse tree
	 */
	void exitMask_function(SqlParser.Mask_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#datetime2}.
	 * @param ctx the parse tree
	 */
	void enterDatetime2(SqlParser.Datetime2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#datetime2}.
	 * @param ctx the parse tree
	 */
	void exitDatetime2(SqlParser.Datetime2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#system_start_time_column_name}.
	 * @param ctx the parse tree
	 */
	void enterSystem_start_time_column_name(SqlParser.System_start_time_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#system_start_time_column_name}.
	 * @param ctx the parse tree
	 */
	void exitSystem_start_time_column_name(SqlParser.System_start_time_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(SqlParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(SqlParser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_name(SqlParser.Constraint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_name(SqlParser.Constraint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#system_end_time_column_name}.
	 * @param ctx the parse tree
	 */
	void enterSystem_end_time_column_name(SqlParser.System_end_time_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#system_end_time_column_name}.
	 * @param ctx the parse tree
	 */
	void exitSystem_end_time_column_name(SqlParser.System_end_time_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#bigint}.
	 * @param ctx the parse tree
	 */
	void enterBigint(SqlParser.BigintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#bigint}.
	 * @param ctx the parse tree
	 */
	void exitBigint(SqlParser.BigintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#start_transaction_id_column_name}.
	 * @param ctx the parse tree
	 */
	void enterStart_transaction_id_column_name(SqlParser.Start_transaction_id_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#start_transaction_id_column_name}.
	 * @param ctx the parse tree
	 */
	void exitStart_transaction_id_column_name(SqlParser.Start_transaction_id_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#end_sequence_number_column_name}.
	 * @param ctx the parse tree
	 */
	void enterEnd_sequence_number_column_name(SqlParser.End_sequence_number_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#end_sequence_number_column_name}.
	 * @param ctx the parse tree
	 */
	void exitEnd_sequence_number_column_name(SqlParser.End_sequence_number_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#start_sequence_number_column_name}.
	 * @param ctx the parse tree
	 */
	void enterStart_sequence_number_column_name(SqlParser.Start_sequence_number_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#start_sequence_number_column_name}.
	 * @param ctx the parse tree
	 */
	void exitStart_sequence_number_column_name(SqlParser.Start_sequence_number_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#end_transaction_id_column_name}.
	 * @param ctx the parse tree
	 */
	void enterEnd_transaction_id_column_name(SqlParser.End_transaction_id_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#end_transaction_id_column_name}.
	 * @param ctx the parse tree
	 */
	void exitEnd_transaction_id_column_name(SqlParser.End_transaction_id_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(SqlParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(SqlParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#source_partition_number_expression}.
	 * @param ctx the parse tree
	 */
	void enterSource_partition_number_expression(SqlParser.Source_partition_number_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#source_partition_number_expression}.
	 * @param ctx the parse tree
	 */
	void exitSource_partition_number_expression(SqlParser.Source_partition_number_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#target_partition_number_expression}.
	 * @param ctx the parse tree
	 */
	void enterTarget_partition_number_expression(SqlParser.Target_partition_number_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#target_partition_number_expression}.
	 * @param ctx the parse tree
	 */
	void exitTarget_partition_number_expression(SqlParser.Target_partition_number_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#default}.
	 * @param ctx the parse tree
	 */
	void enterDefault(SqlParser.DefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#default}.
	 * @param ctx the parse tree
	 */
	void exitDefault(SqlParser.DefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#filegroup}.
	 * @param ctx the parse tree
	 */
	void enterFilegroup(SqlParser.FilegroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#filegroup}.
	 * @param ctx the parse tree
	 */
	void exitFilegroup(SqlParser.FilegroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#partition_scheme_name}.
	 * @param ctx the parse tree
	 */
	void enterPartition_scheme_name(SqlParser.Partition_scheme_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#partition_scheme_name}.
	 * @param ctx the parse tree
	 */
	void exitPartition_scheme_name(SqlParser.Partition_scheme_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(SqlParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(SqlParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#history_table_name}.
	 * @param ctx the parse tree
	 */
	void enterHistory_table_name(SqlParser.History_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#history_table_name}.
	 * @param ctx the parse tree
	 */
	void exitHistory_table_name(SqlParser.History_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#partition_number}.
	 * @param ctx the parse tree
	 */
	void enterPartition_number(SqlParser.Partition_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#partition_number}.
	 * @param ctx the parse tree
	 */
	void exitPartition_number(SqlParser.Partition_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#max_degree_of_parallelism}.
	 * @param ctx the parse tree
	 */
	void enterMax_degree_of_parallelism(SqlParser.Max_degree_of_parallelismContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#max_degree_of_parallelism}.
	 * @param ctx the parse tree
	 */
	void exitMax_degree_of_parallelism(SqlParser.Max_degree_of_parallelismContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_set_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_set_name(SqlParser.Column_set_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_set_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_set_name(SqlParser.Column_set_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#directory_name}.
	 * @param ctx the parse tree
	 */
	void enterDirectory_name(SqlParser.Directory_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#directory_name}.
	 * @param ctx the parse tree
	 */
	void exitDirectory_name(SqlParser.Directory_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#null}.
	 * @param ctx the parse tree
	 */
	void enterNull(SqlParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#null}.
	 * @param ctx the parse tree
	 */
	void exitNull(SqlParser.NullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_predicate_function}.
	 * @param ctx the parse tree
	 */
	void enterTable_predicate_function(SqlParser.Table_predicate_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_predicate_function}.
	 * @param ctx the parse tree
	 */
	void exitTable_predicate_function(SqlParser.Table_predicate_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(SqlParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(SqlParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#key_name}.
	 * @param ctx the parse tree
	 */
	void enterKey_name(SqlParser.Key_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#key_name}.
	 * @param ctx the parse tree
	 */
	void exitKey_name(SqlParser.Key_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(SqlParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(SqlParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#seed}.
	 * @param ctx the parse tree
	 */
	void enterSeed(SqlParser.SeedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#seed}.
	 * @param ctx the parse tree
	 */
	void exitSeed(SqlParser.SeedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#referenced_table_name}.
	 * @param ctx the parse tree
	 */
	void enterReferenced_table_name(SqlParser.Referenced_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#referenced_table_name}.
	 * @param ctx the parse tree
	 */
	void exitReferenced_table_name(SqlParser.Referenced_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#partition_column_name}.
	 * @param ctx the parse tree
	 */
	void enterPartition_column_name(SqlParser.Partition_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#partition_column_name}.
	 * @param ctx the parse tree
	 */
	void exitPartition_column_name(SqlParser.Partition_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fillfactor}.
	 * @param ctx the parse tree
	 */
	void enterFillfactor(SqlParser.FillfactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fillfactor}.
	 * @param ctx the parse tree
	 */
	void exitFillfactor(SqlParser.FillfactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expression(SqlParser.Logical_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expression(SqlParser.Logical_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ref_column}.
	 * @param ctx the parse tree
	 */
	void enterRef_column(SqlParser.Ref_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ref_column}.
	 * @param ctx the parse tree
	 */
	void exitRef_column(SqlParser.Ref_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#partition_number_expression}.
	 * @param ctx the parse tree
	 */
	void enterPartition_number_expression(SqlParser.Partition_number_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#partition_number_expression}.
	 * @param ctx the parse tree
	 */
	void exitPartition_number_expression(SqlParser.Partition_number_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#computed_column_expression}.
	 * @param ctx the parse tree
	 */
	void enterComputed_column_expression(SqlParser.Computed_column_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#computed_column_expression}.
	 * @param ctx the parse tree
	 */
	void exitComputed_column_expression(SqlParser.Computed_column_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ref_table}.
	 * @param ctx the parse tree
	 */
	void enterRef_table(SqlParser.Ref_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ref_table}.
	 * @param ctx the parse tree
	 */
	void exitRef_table(SqlParser.Ref_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#filegroup_name}.
	 * @param ctx the parse tree
	 */
	void enterFilegroup_name(SqlParser.Filegroup_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#filegroup_name}.
	 * @param ctx the parse tree
	 */
	void exitFilegroup_name(SqlParser.Filegroup_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(SqlParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(SqlParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#filestream_filegroup_name}.
	 * @param ctx the parse tree
	 */
	void enterFilestream_filegroup_name(SqlParser.Filestream_filegroup_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#filestream_filegroup_name}.
	 * @param ctx the parse tree
	 */
	void exitFilestream_filegroup_name(SqlParser.Filestream_filegroup_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(SqlParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(SqlParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#node_table}.
	 * @param ctx the parse tree
	 */
	void enterNode_table(SqlParser.Node_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#node_table}.
	 * @param ctx the parse tree
	 */
	void exitNode_table(SqlParser.Node_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#filter_predicate}.
	 * @param ctx the parse tree
	 */
	void enterFilter_predicate(SqlParser.Filter_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#filter_predicate}.
	 * @param ctx the parse tree
	 */
	void exitFilter_predicate(SqlParser.Filter_predicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sequence_number_column_name}.
	 * @param ctx the parse tree
	 */
	void enterSequence_number_column_name(SqlParser.Sequence_number_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sequence_number_column_name}.
	 * @param ctx the parse tree
	 */
	void exitSequence_number_column_name(SqlParser.Sequence_number_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#transaction_id_column_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_id_column_name(SqlParser.Transaction_id_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#transaction_id_column_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_id_column_name(SqlParser.Transaction_id_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ledger_view_name}.
	 * @param ctx the parse tree
	 */
	void enterLedger_view_name(SqlParser.Ledger_view_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ledger_view_name}.
	 * @param ctx the parse tree
	 */
	void exitLedger_view_name(SqlParser.Ledger_view_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#operation_type_desc_column_name}.
	 * @param ctx the parse tree
	 */
	void enterOperation_type_desc_column_name(SqlParser.Operation_type_desc_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#operation_type_desc_column_name}.
	 * @param ctx the parse tree
	 */
	void exitOperation_type_desc_column_name(SqlParser.Operation_type_desc_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#operation_type_id}.
	 * @param ctx the parse tree
	 */
	void enterOperation_type_id(SqlParser.Operation_type_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#operation_type_id}.
	 * @param ctx the parse tree
	 */
	void exitOperation_type_id(SqlParser.Operation_type_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#scalar_function}.
	 * @param ctx the parse tree
	 */
	void enterScalar_function(SqlParser.Scalar_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#scalar_function}.
	 * @param ctx the parse tree
	 */
	void exitScalar_function(SqlParser.Scalar_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement(SqlParser.Execute_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement(SqlParser.Execute_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#execute_option}.
	 * @param ctx the parse tree
	 */
	void enterExecute_option(SqlParser.Execute_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#execute_option}.
	 * @param ctx the parse tree
	 */
	void exitExecute_option(SqlParser.Execute_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#result_sets_definition}.
	 * @param ctx the parse tree
	 */
	void enterResult_sets_definition(SqlParser.Result_sets_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#result_sets_definition}.
	 * @param ctx the parse tree
	 */
	void exitResult_sets_definition(SqlParser.Result_sets_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SqlParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SqlParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_valued_function_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_valued_function_name(SqlParser.Table_valued_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_valued_function_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_valued_function_name(SqlParser.Table_valued_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_type_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_type_name(SqlParser.Table_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_type_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_type_name(SqlParser.Table_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#linked_server_name}.
	 * @param ctx the parse tree
	 */
	void enterLinked_server_name(SqlParser.Linked_server_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#linked_server_name}.
	 * @param ctx the parse tree
	 */
	void exitLinked_server_name(SqlParser.Linked_server_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(SqlParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(SqlParser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#db_name}.
	 * @param ctx the parse tree
	 */
	void enterDb_name(SqlParser.Db_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#db_name}.
	 * @param ctx the parse tree
	 */
	void exitDb_name(SqlParser.Db_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#string_variable}.
	 * @param ctx the parse tree
	 */
	void enterString_variable(SqlParser.String_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#string_variable}.
	 * @param ctx the parse tree
	 */
	void exitString_variable(SqlParser.String_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#module_name_var}.
	 * @param ctx the parse tree
	 */
	void enterModule_name_var(SqlParser.Module_name_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#module_name_var}.
	 * @param ctx the parse tree
	 */
	void exitModule_name_var(SqlParser.Module_name_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#return_status}.
	 * @param ctx the parse tree
	 */
	void enterReturn_status(SqlParser.Return_statusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#return_status}.
	 * @param ctx the parse tree
	 */
	void exitReturn_status(SqlParser.Return_statusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SqlParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SqlParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(SqlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(SqlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator(SqlParser.Binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator(SqlParser.Binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(SqlParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(SqlParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#aggregate_windowed_function}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_windowed_function(SqlParser.Aggregate_windowed_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#aggregate_windowed_function}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_windowed_function(SqlParser.Aggregate_windowed_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 */
	void enterRanking_windowed_function(SqlParser.Ranking_windowed_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 */
	void exitRanking_windowed_function(SqlParser.Ranking_windowed_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#scalar_subquery}.
	 * @param ctx the parse tree
	 */
	void enterScalar_subquery(SqlParser.Scalar_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#scalar_subquery}.
	 * @param ctx the parse tree
	 */
	void exitScalar_subquery(SqlParser.Scalar_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#nvar}.
	 * @param ctx the parse tree
	 */
	void enterNvar(SqlParser.NvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#nvar}.
	 * @param ctx the parse tree
	 */
	void exitNvar(SqlParser.NvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#n}.
	 * @param ctx the parse tree
	 */
	void enterN(SqlParser.NContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#n}.
	 * @param ctx the parse tree
	 */
	void exitN(SqlParser.NContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(SqlParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(SqlParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sample_number}.
	 * @param ctx the parse tree
	 */
	void enterSample_number(SqlParser.Sample_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sample_number}.
	 * @param ctx the parse tree
	 */
	void exitSample_number(SqlParser.Sample_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#user_defined_function}.
	 * @param ctx the parse tree
	 */
	void enterUser_defined_function(SqlParser.User_defined_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#user_defined_function}.
	 * @param ctx the parse tree
	 */
	void exitUser_defined_function(SqlParser.User_defined_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(SqlParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(SqlParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#targetNameSpaceURI}.
	 * @param ctx the parse tree
	 */
	void enterTargetNameSpaceURI(SqlParser.TargetNameSpaceURIContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#targetNameSpaceURI}.
	 * @param ctx the parse tree
	 */
	void exitTargetNameSpaceURI(SqlParser.TargetNameSpaceURIContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cTE_query_definition}.
	 * @param ctx the parse tree
	 */
	void enterCTE_query_definition(SqlParser.CTE_query_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cTE_query_definition}.
	 * @param ctx the parse tree
	 */
	void exitCTE_query_definition(SqlParser.CTE_query_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#elementName}.
	 * @param ctx the parse tree
	 */
	void enterElementName(SqlParser.ElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#elementName}.
	 * @param ctx the parse tree
	 */
	void exitElementName(SqlParser.ElementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#rootName}.
	 * @param ctx the parse tree
	 */
	void enterRootName(SqlParser.RootNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#rootName}.
	 * @param ctx the parse tree
	 */
	void exitRootName(SqlParser.RootNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#schemaDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSchemaDeclaration(SqlParser.SchemaDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#schemaDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSchemaDeclaration(SqlParser.SchemaDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#offset}.
	 * @param ctx the parse tree
	 */
	void enterOffset(SqlParser.OffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#offset}.
	 * @param ctx the parse tree
	 */
	void exitOffset(SqlParser.OffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(SqlParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(SqlParser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fileTable}.
	 * @param ctx the parse tree
	 */
	void enterFileTable(SqlParser.FileTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fileTable}.
	 * @param ctx the parse tree
	 */
	void exitFileTable(SqlParser.FileTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opendatasource}.
	 * @param ctx the parse tree
	 */
	void enterOpendatasource(SqlParser.OpendatasourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opendatasource}.
	 * @param ctx the parse tree
	 */
	void exitOpendatasource(SqlParser.OpendatasourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#init_string}.
	 * @param ctx the parse tree
	 */
	void enterInit_string(SqlParser.Init_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#init_string}.
	 * @param ctx the parse tree
	 */
	void exitInit_string(SqlParser.Init_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#windows_collation_name}.
	 * @param ctx the parse tree
	 */
	void enterWindows_collation_name(SqlParser.Windows_collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#windows_collation_name}.
	 * @param ctx the parse tree
	 */
	void exitWindows_collation_name(SqlParser.Windows_collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#order_by_expression}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_expression(SqlParser.Order_by_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#order_by_expression}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_expression(SqlParser.Order_by_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SqlParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#common_table_expression_name}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression_name(SqlParser.Common_table_expression_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#common_table_expression_name}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression_name(SqlParser.Common_table_expression_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link SqlParser#test}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SqlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link SqlParser#test}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SqlParser.ProgramContext ctx);
}