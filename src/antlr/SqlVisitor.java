// Generated from src/antlr/Sql.g4 by ANTLR 4.13.2

	package antlr; 

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlParser#sELECTstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSELECTstatement(SqlParser.SELECTstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#option_query_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_query_hint(SqlParser.Option_query_hintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#query_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_expression(SqlParser.Query_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#time_to_pass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_to_pass(SqlParser.Time_to_passContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#time_to_execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_to_execute(SqlParser.Time_to_executeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#timeout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeout(SqlParser.TimeoutContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#waitfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitfor(SqlParser.WaitforContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(SqlParser.QuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#query_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_specification(SqlParser.Query_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#topClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopClause(SqlParser.TopClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#top}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop(SqlParser.TopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#surroundedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurroundedExpression(SqlParser.SurroundedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(SqlParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#search_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition(SqlParser.Search_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#notPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotPredicate(SqlParser.NotPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(SqlParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#surroundedSearchConditionWithoutMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurroundedSearchConditionWithoutMatch(SqlParser.SurroundedSearchConditionWithoutMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#search_condition_without_match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition_without_match(SqlParser.Search_condition_without_matchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#compareOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareOperator(SqlParser.CompareOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#between}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween(SqlParser.BetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#is}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs(SqlParser.IsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinct(SqlParser.DistinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(SqlParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#likeCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeCondition(SqlParser.LikeConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#graph_search_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraph_search_pattern(SqlParser.Graph_search_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#node_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_alias(SqlParser.Node_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#edge_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_alias(SqlParser.Edge_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#order_byCLASUE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_byCLASUE(SqlParser.Order_byCLASUEContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#offset_fetch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset_fetch(SqlParser.Offset_fetchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fORClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFORClause(SqlParser.FORClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xML}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXML(SqlParser.XMLContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#commonDirectivesForXML}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonDirectivesForXML(SqlParser.CommonDirectivesForXMLContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#jSON}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJSON(SqlParser.JSONContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#contains_search_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContains_search_condition(SqlParser.Contains_search_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#simple_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_term(SqlParser.Simple_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#prefixterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixterm(SqlParser.PrefixtermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#generation_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneration_term(SqlParser.Generation_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#generic_proximity_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_proximity_term(SqlParser.Generic_proximity_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#custom_proximity_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustom_proximity_term(SqlParser.Custom_proximity_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#maximum_distance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaximum_distance(SqlParser.Maximum_distanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#match_order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_order(SqlParser.Match_orderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#weighted_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeighted_term(SqlParser.Weighted_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(SqlParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#aNDNOT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitANDNOT(SqlParser.ANDNOTContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(SqlParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#groupby}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupby(SqlParser.GroupbyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#group_by_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_expression(SqlParser.Group_by_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#grouping_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_set(SqlParser.Grouping_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#grouping_set_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_set_item(SqlParser.Grouping_set_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(SqlParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_source(SqlParser.Table_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tablesample_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablesample_clause(SqlParser.Tablesample_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#joined_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoined_table(SqlParser.Joined_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_type(SqlParser.Join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#pivoted_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivoted_table(SqlParser.Pivoted_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_clause(SqlParser.Pivot_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unpivoted_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivoted_table(SqlParser.Unpivoted_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_clause(SqlParser.Unpivot_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list(SqlParser.Column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#system_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_time(SqlParser.System_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#date_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_time(SqlParser.Date_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#start_date_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_date_time(SqlParser.Start_date_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#end_date_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_date_time(SqlParser.End_date_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#allColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllColumn(SqlParser.AllColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#objectDotAllColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDotAllColumn(SqlParser.ObjectDotAllColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(SqlParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_or_expression(SqlParser.Column_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#objectDotColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDotColumn(SqlParser.ObjectDotColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#columnAliasRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAliasRule(SqlParser.ColumnAliasRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#query_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_hint(SqlParser.Query_hintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_hint(SqlParser.Table_hintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_hint_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_hint_limited(SqlParser.Table_hint_limitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#openxml_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenxml_clause(SqlParser.Openxml_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#join_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_hint(SqlParser.Join_hintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#with_common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_common_table_expression(SqlParser.With_common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#with}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith(SqlParser.WithContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(SqlParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThreePartTableName}
	 * labeled alternative in {@link SqlParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThreePartTableName(SqlParser.ThreePartTableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TwoPartTableName}
	 * labeled alternative in {@link SqlParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoPartTableName(SqlParser.TwoPartTableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OnePartTableName}
	 * labeled alternative in {@link SqlParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnePartTableName(SqlParser.OnePartTableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#oUTPUT_CLAUSE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOUTPUT_CLAUSE(SqlParser.OUTPUT_CLAUSEContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dml_select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_select_list(SqlParser.Dml_select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_name1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name1(SqlParser.Column_name1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(SqlParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(SqlParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dml_table_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_table_source(SqlParser.Dml_table_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#merge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge(SqlParser.MergeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(SqlParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(SqlParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_block(SqlParser.Statement_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sql_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_statement(SqlParser.Sql_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_expression(SqlParser.Boolean_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#target_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_table(SqlParser.Target_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#merge_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_hint(SqlParser.Merge_hintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#merge_search_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_search_condition(SqlParser.Merge_search_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#merge_matched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_matched(SqlParser.Merge_matchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#merge_not_matched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_not_matched(SqlParser.Merge_not_matchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#clause_search_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_search_condition(SqlParser.Clause_search_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop(SqlParser.DropContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#values_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_list(SqlParser.Values_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_clause(SqlParser.Set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter(SqlParser.AlterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_set_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_set_definition(SqlParser.Column_set_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_clustered_constraint_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_clustered_constraint_option(SqlParser.Drop_clustered_constraint_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_option(SqlParser.Table_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#max}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMax(SqlParser.MaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#filetable_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFiletable_option(SqlParser.Filetable_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#single_partition_rebuild__option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_partition_rebuild__option(SqlParser.Single_partition_rebuild__optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#low_priority_lock_wait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLow_priority_lock_wait(SqlParser.Low_priority_lock_waitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(SqlParser.Column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(SqlParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(SqlParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#index_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_option(SqlParser.Index_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(SqlParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#computed_column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputed_column_definition(SqlParser.Computed_column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#single_partition_rebuild_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_partition_rebuild_option(SqlParser.Single_partition_rebuild_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rebuild_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRebuild_option(SqlParser.Rebuild_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(SqlParser.CreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(SqlParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_index(SqlParser.Column_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_index(SqlParser.Table_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#close_cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_cursor(SqlParser.Close_cursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dellocate_cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDellocate_cursor(SqlParser.Dellocate_cursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declare_cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_cursor(SqlParser.Declare_cursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fetch_cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_cursor(SqlParser.Fetch_cursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#n}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN(SqlParser.NContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#open_cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_cursor(SqlParser.Open_cursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SqlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(SqlParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#surroundedScalarSubquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurroundedScalarSubquery(SqlParser.SurroundedScalarSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(SqlParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#scalar_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_expression(SqlParser.Scalar_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#bulk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBulk(SqlParser.BulkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#openrowset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenrowset(SqlParser.OpenrowsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#bulk_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBulk_option(SqlParser.Bulk_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rows_per_batch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRows_per_batch(SqlParser.Rows_per_batchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#maximum_errors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaximum_errors(SqlParser.Maximum_errorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#quote_character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuote_character(SqlParser.Quote_characterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#file_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_format(SqlParser.File_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_ordinal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_ordinal(SqlParser.Column_ordinalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_path(SqlParser.Column_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sql_datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_datatype(SqlParser.Sql_datatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#data_file_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_file_path(SqlParser.Data_file_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#data_source_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_source_name(SqlParser.Data_source_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#data_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_file(SqlParser.Data_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#field_terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_terminator(SqlParser.Field_terminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#row_terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_terminator(SqlParser.Row_terminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#code_page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_page(SqlParser.Code_pageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#last_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLast_row(SqlParser.Last_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#first_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_row(SqlParser.First_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#quote_characters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuote_characters(SqlParser.Quote_charactersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#errorfile_data_source_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorfile_data_source_name(SqlParser.Errorfile_data_source_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_name(SqlParser.File_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#max_errors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMax_errors(SqlParser.Max_errorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#format_file_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat_file_path(SqlParser.Format_file_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#batch_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBatch_size(SqlParser.Batch_sizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#kilobytes_per_batch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKilobytes_per_batch(SqlParser.Kilobytes_per_batchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expression_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_name(SqlParser.Expression_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#string_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_expression(SqlParser.String_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#escape_character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscape_character(SqlParser.Escape_characterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(SqlParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#freetext_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreetext_string(SqlParser.Freetext_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(SqlParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#node_table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_table_alias(SqlParser.Node_table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#node_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_table_name(SqlParser.Node_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#edge_table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_table_alias(SqlParser.Edge_table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#edge_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_table_name(SqlParser.Edge_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(SqlParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#offset_row_count_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset_row_count_expression(SqlParser.Offset_row_count_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#integer_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_constant(SqlParser.Integer_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fetch_row_count_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_row_count_expression(SqlParser.Fetch_row_count_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(SqlParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#phrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhrase(SqlParser.PhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#prefix_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_term(SqlParser.Prefix_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#proximity_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProximity_term(SqlParser.Proximity_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(SqlParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#weight_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeight_value(SqlParser.Weight_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_expression(SqlParser.Column_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_or_view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_view_name(SqlParser.Table_or_view_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rowset_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowset_function(SqlParser.Rowset_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#bulk_column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBulk_column_alias(SqlParser.Bulk_column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(SqlParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(SqlParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SqlParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(SqlParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#repeat_seed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_seed(SqlParser.Repeat_seedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#left_table_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_table_source(SqlParser.Left_table_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#right_table_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_table_source(SqlParser.Right_table_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#aggregate_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_function(SqlParser.Aggregate_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#value_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_column(SqlParser.Value_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#pivot_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_column(SqlParser.Pivot_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#date_time_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_time_variable(SqlParser.Date_time_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#date_time_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_time_literal(SqlParser.Date_time_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(SqlParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#field_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_name(SqlParser.Field_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#property_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_name(SqlParser.Property_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#udt_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdt_column_name(SqlParser.Udt_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(SqlParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#method_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_name(SqlParser.Method_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#integer_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_value(SqlParser.Integer_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#numeric_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_value(SqlParser.Numeric_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#literal_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_constant(SqlParser.Literal_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(SqlParser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#hint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHint_name(SqlParser.Hint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xml_plan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_plan(SqlParser.Xml_planContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#exposed_object_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExposed_object_name(SqlParser.Exposed_object_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#point_in_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint_in_time(SqlParser.Point_in_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#index_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_value(SqlParser.Index_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#index_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_column_name(SqlParser.Index_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#idoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdoc(SqlParser.IdocContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rowpattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowpattern(SqlParser.RowpatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#flags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlags(SqlParser.FlagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#columns_count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumns_count(SqlParser.Columns_countContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#openquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenquery(SqlParser.OpenqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#openrowset2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenrowset2(SqlParser.Openrowset2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#provider_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProvider_string(SqlParser.Provider_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#datasource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatasource(SqlParser.DatasourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#user_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_id(SqlParser.User_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#password}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassword(SqlParser.PasswordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#provider_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProvider_name(SqlParser.Provider_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#catalog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatalog(SqlParser.CatalogContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SqlParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#linked_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinked_server(SqlParser.Linked_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rowset_function_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowset_function_limited(SqlParser.Rowset_function_limitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_variable(SqlParser.Table_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_name(SqlParser.Cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cursor_variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_variable_name(SqlParser.Cursor_variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_name(SqlParser.Schema_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(SqlParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#server_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServer_name(SqlParser.Server_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#output_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_table(SqlParser.Output_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_alias_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias_identifier(SqlParser.Column_alias_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#from_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_name(SqlParser.From_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#derived_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_table(SqlParser.Derived_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dml_statement_with_output_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_statement_with_output_clause(SqlParser.Dml_statement_with_output_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(SqlParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#type_schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_schema_name(SqlParser.Type_schema_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#scale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScale(SqlParser.ScaleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision(SqlParser.PrecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xml_schema_collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_schema_collection(SqlParser.Xml_schema_collectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#mask_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMask_function(SqlParser.Mask_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#datetime2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime2(SqlParser.Datetime2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#system_start_time_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_start_time_column_name(SqlParser.System_start_time_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expression(SqlParser.Constant_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constraint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_name(SqlParser.Constraint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#system_end_time_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_end_time_column_name(SqlParser.System_end_time_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#start_transaction_id_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_transaction_id_column_name(SqlParser.Start_transaction_id_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#end_sequence_number_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_sequence_number_column_name(SqlParser.End_sequence_number_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#start_sequence_number_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_sequence_number_column_name(SqlParser.Start_sequence_number_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#end_transaction_id_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_transaction_id_column_name(SqlParser.End_transaction_id_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(SqlParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#source_partition_number_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_partition_number_expression(SqlParser.Source_partition_number_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#target_partition_number_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_partition_number_expression(SqlParser.Target_partition_number_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault(SqlParser.DefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#filegroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilegroup(SqlParser.FilegroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#partition_scheme_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_scheme_name(SqlParser.Partition_scheme_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(SqlParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#history_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHistory_table_name(SqlParser.History_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#partition_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_number(SqlParser.Partition_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#max_degree_of_parallelism}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMax_degree_of_parallelism(SqlParser.Max_degree_of_parallelismContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_set_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_set_name(SqlParser.Column_set_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#directory_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectory_name(SqlParser.Directory_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(SqlParser.NullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(SqlParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#key_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_name(SqlParser.Key_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(SqlParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#seed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeed(SqlParser.SeedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#referenced_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenced_table_name(SqlParser.Referenced_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#partition_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_column_name(SqlParser.Partition_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fillfactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFillfactor(SqlParser.FillfactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_expression(SqlParser.Logical_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ref_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_column(SqlParser.Ref_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#partition_number_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_number_expression(SqlParser.Partition_number_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#computed_column_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputed_column_expression(SqlParser.Computed_column_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ref_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_table(SqlParser.Ref_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#filegroup_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilegroup_name(SqlParser.Filegroup_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(SqlParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#filestream_filegroup_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilestream_filegroup_name(SqlParser.Filestream_filegroup_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(SqlParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#node_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_table(SqlParser.Node_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#scalar_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_function(SqlParser.Scalar_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#execute_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_statement(SqlParser.Execute_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#execute_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_option(SqlParser.Execute_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#go}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGo(SqlParser.GoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#use}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(SqlParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#result_sets_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_sets_definition(SqlParser.Result_sets_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SqlParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_valued_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_valued_function_name(SqlParser.Table_valued_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_type_name(SqlParser.Table_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#linked_server_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinked_server_name(SqlParser.Linked_server_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(SqlParser.Module_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#db_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_name(SqlParser.Db_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#string_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_variable(SqlParser.String_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#module_name_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name_var(SqlParser.Module_name_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#return_status}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_status(SqlParser.Return_statusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(SqlParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(SqlParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator(SqlParser.Binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(SqlParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#scalar_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_subquery(SqlParser.Scalar_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(SqlParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sample_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample_number(SqlParser.Sample_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#user_defined_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_defined_function(SqlParser.User_defined_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#targetNameSpaceURI}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetNameSpaceURI(SqlParser.TargetNameSpaceURIContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cTE_query_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCTE_query_definition(SqlParser.CTE_query_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#elementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementName(SqlParser.ElementNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rootName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootName(SqlParser.RootNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset(SqlParser.OffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(SqlParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opendatasource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpendatasource(SqlParser.OpendatasourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#init_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_string(SqlParser.Init_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#order_by_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_expression(SqlParser.Order_by_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SqlParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#common_table_expression_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression_name(SqlParser.Common_table_expression_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(SqlParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#option_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_keyword(SqlParser.Option_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#leftparenthesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftparenthesis(SqlParser.LeftparenthesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma(SqlParser.CommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rightparenthesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightparenthesis(SqlParser.RightparenthesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(SqlParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#setOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperations(SqlParser.SetOperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(SqlParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fromTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromTable(SqlParser.FromTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#having}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving(SqlParser.HavingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(SqlParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll(SqlParser.AllContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#percent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercent(SqlParser.PercentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#withTies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithTies(SqlParser.WithTiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#surroundedQuerySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurroundedQuerySpecification(SqlParser.SurroundedQuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#into}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto(SqlParser.IntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#on}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn(SqlParser.OnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#truncate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncate(SqlParser.TruncateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cteQueryDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCteQueryDefinition(SqlParser.CteQueryDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#surroundedColumnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurroundedColumnList(SqlParser.SurroundedColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#andSearchCondetion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndSearchCondetion(SqlParser.AndSearchCondetionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch(SqlParser.MatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#containsKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainsKeyword(SqlParser.ContainsKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#leftparenthesisKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftparenthesisKeyword(SqlParser.LeftparenthesisKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#starKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarKeyword(SqlParser.StarKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#commaKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaKeyword(SqlParser.CommaKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#singlequotationKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglequotationKeyword(SqlParser.SinglequotationKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rightparenthesisKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightparenthesisKeyword(SqlParser.RightparenthesisKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#freetextKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreetextKeyword(SqlParser.FreetextKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#notKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotKeyword(SqlParser.NotKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#inKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInKeyword(SqlParser.InKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#equalKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualKeyword(SqlParser.EqualKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#notequalKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotequalKeyword(SqlParser.NotequalKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#greaterthanKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterthanKeyword(SqlParser.GreaterthanKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#greaterthanorequalKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterthanorequalKeyword(SqlParser.GreaterthanorequalKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#notgreaterthanKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotgreaterthanKeyword(SqlParser.NotgreaterthanKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#lessthanKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessthanKeyword(SqlParser.LessthanKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#lessthanorequalKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessthanorequalKeyword(SqlParser.LessthanorequalKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#notlessthanKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotlessthanKeyword(SqlParser.NotlessthanKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#allKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllKeyword(SqlParser.AllKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#someKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeKeyword(SqlParser.SomeKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#anyKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyKeyword(SqlParser.AnyKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#existsKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsKeyword(SqlParser.ExistsKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#likeKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeKeyword(SqlParser.LikeKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#escapeKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscapeKeyword(SqlParser.EscapeKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#minusKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusKeyword(SqlParser.MinusKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#orderKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderKeyword(SqlParser.OrderKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#byKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByKeyword(SqlParser.ByKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#collateKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollateKeyword(SqlParser.CollateKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ascKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAscKeyword(SqlParser.AscKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#descKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescKeyword(SqlParser.DescKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#offsetKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffsetKeyword(SqlParser.OffsetKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rowKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowKeyword(SqlParser.RowKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rowsKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowsKeyword(SqlParser.RowsKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fetchKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetchKeyword(SqlParser.FetchKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#firstKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstKeyword(SqlParser.FirstKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#nextKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextKeyword(SqlParser.NextKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#onlyKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyKeyword(SqlParser.OnlyKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#forKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForKeyword(SqlParser.ForKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#browseKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrowseKeyword(SqlParser.BrowseKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xmlKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlKeyword(SqlParser.XmlKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rawKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRawKeyword(SqlParser.RawKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#autoKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoKeyword(SqlParser.AutoKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xmldataKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmldataKeyword(SqlParser.XmldataKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xmlschemaKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlschemaKeyword(SqlParser.XmlschemaKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#elementsKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementsKeyword(SqlParser.ElementsKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xsinilKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXsinilKeyword(SqlParser.XsinilKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#absentKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsentKeyword(SqlParser.AbsentKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#explicitKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitKeyword(SqlParser.ExplicitKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#pathKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathKeyword(SqlParser.PathKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#binaryKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryKeyword(SqlParser.BinaryKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#typeKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeKeyword(SqlParser.TypeKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rootKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootKeyword(SqlParser.RootKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#jsonKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonKeyword(SqlParser.JsonKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#andKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndKeyword(SqlParser.AndKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#orKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrKeyword(SqlParser.OrKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#doublequotationKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoublequotationKeyword(SqlParser.DoublequotationKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#formsofKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormsofKeyword(SqlParser.FormsofKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#inflectionalKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInflectionalKeyword(SqlParser.InflectionalKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#thesaurusKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThesaurusKeyword(SqlParser.ThesaurusKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#nearKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNearKeyword(SqlParser.NearKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#maxKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxKeyword(SqlParser.MaxKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#trueKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueKeyword(SqlParser.TrueKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#falseKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseKeyword(SqlParser.FalseKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#isaboutKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsaboutKeyword(SqlParser.IsaboutKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#weightKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeightKeyword(SqlParser.WeightKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#andoperationKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndoperationKeyword(SqlParser.AndoperationKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#oroperationKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOroperationKeyword(SqlParser.OroperationKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#groupKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupKeyword(SqlParser.GroupKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rollupKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollupKeyword(SqlParser.RollupKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cubeKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCubeKeyword(SqlParser.CubeKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#groupingKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingKeyword(SqlParser.GroupingKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#setsKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetsKeyword(SqlParser.SetsKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#withKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithKeyword(SqlParser.WithKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#openxmlKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenxmlKeyword(SqlParser.OpenxmlKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#atsymbolKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtsymbolKeyword(SqlParser.AtsymbolKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dotKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotKeyword(SqlParser.DotKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tablesampleKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablesampleKeyword(SqlParser.TablesampleKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#systemKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemKeyword(SqlParser.SystemKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#percentKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercentKeyword(SqlParser.PercentKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#repeatableKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatableKeyword(SqlParser.RepeatableKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#onKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnKeyword(SqlParser.OnKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#crossKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossKeyword(SqlParser.CrossKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#joinKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinKeyword(SqlParser.JoinKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#outerKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuterKeyword(SqlParser.OuterKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#applyKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplyKeyword(SqlParser.ApplyKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#innerKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerKeyword(SqlParser.InnerKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#leftKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftKeyword(SqlParser.LeftKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rightKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightKeyword(SqlParser.RightKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fullKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullKeyword(SqlParser.FullKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#pivotKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivotKeyword(SqlParser.PivotKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unpivotKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotKeyword(SqlParser.UnpivotKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ofKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOfKeyword(SqlParser.OfKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#toKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToKeyword(SqlParser.ToKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#betweenKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenKeyword(SqlParser.BetweenKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#containedKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainedKeyword(SqlParser.ContainedKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#identityKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentityKeyword(SqlParser.IdentityKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rowguidKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowguidKeyword(SqlParser.RowguidKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tempKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempKeyword(SqlParser.TempKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#hashKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashKeyword(SqlParser.HashKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#concatKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatKeyword(SqlParser.ConcatKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#mergeKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeKeyword(SqlParser.MergeKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unionKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionKeyword(SqlParser.UnionKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#loopKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopKeyword(SqlParser.LoopKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expandKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpandKeyword(SqlParser.ExpandKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#viewsKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewsKeyword(SqlParser.ViewsKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fastKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFastKeyword(SqlParser.FastKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#forceKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForceKeyword(SqlParser.ForceKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#disableKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisableKeyword(SqlParser.DisableKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#externalpushdownKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalpushdownKeyword(SqlParser.ExternalpushdownKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#scaleoutexecutionKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaleoutexecutionKeyword(SqlParser.ScaleoutexecutionKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#keepKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeepKeyword(SqlParser.KeepKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#planKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlanKeyword(SqlParser.PlanKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#keepfixedKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeepfixedKeyword(SqlParser.KeepfixedKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#maxdopKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxdopKeyword(SqlParser.MaxdopKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#maxrecursionKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxrecursionKeyword(SqlParser.MaxrecursionKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optimizeKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimizeKeyword(SqlParser.OptimizeKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unknownKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownKeyword(SqlParser.UnknownKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#parameterizationKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterizationKeyword(SqlParser.ParameterizationKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#simpleKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleKeyword(SqlParser.SimpleKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#forcedKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForcedKeyword(SqlParser.ForcedKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#querytraceonKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerytraceonKeyword(SqlParser.QuerytraceonKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#recompileKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecompileKeyword(SqlParser.RecompileKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#robustKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRobustKeyword(SqlParser.RobustKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#useKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseKeyword(SqlParser.UseKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#hintKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHintKeyword(SqlParser.HintKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#nKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNKeyword(SqlParser.NKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableKeyword(SqlParser.TableKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#timestampKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestampKeyword(SqlParser.TimestampKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#noexpandKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoexpandKeyword(SqlParser.NoexpandKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#indexKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexKeyword(SqlParser.IndexKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#forceseekKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForceseekKeyword(SqlParser.ForceseekKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#forcescanKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForcescanKeyword(SqlParser.ForcescanKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#holdlockKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHoldlockKeyword(SqlParser.HoldlockKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#nolockKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNolockKeyword(SqlParser.NolockKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#nowaitKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNowaitKeyword(SqlParser.NowaitKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#paglockKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaglockKeyword(SqlParser.PaglockKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#readcommittedKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadcommittedKeyword(SqlParser.ReadcommittedKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#readcommittedlockKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadcommittedlockKeyword(SqlParser.ReadcommittedlockKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#readpastKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadpastKeyword(SqlParser.ReadpastKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#readuncommittedKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReaduncommittedKeyword(SqlParser.ReaduncommittedKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#repeatablereadKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatablereadKeyword(SqlParser.RepeatablereadKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rowlockKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowlockKeyword(SqlParser.RowlockKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#serializableKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSerializableKeyword(SqlParser.SerializableKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#snapshotKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSnapshotKeyword(SqlParser.SnapshotKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tablockKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablockKeyword(SqlParser.TablockKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tablockxKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablockxKeyword(SqlParser.TablockxKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#updlockKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdlockKeyword(SqlParser.UpdlockKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xlockKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXlockKeyword(SqlParser.XlockKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#keepidentityKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeepidentityKeyword(SqlParser.KeepidentityKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#keepdefaultsKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeepdefaultsKeyword(SqlParser.KeepdefaultsKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#remoteKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoteKeyword(SqlParser.RemoteKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#reduceKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReduceKeyword(SqlParser.ReduceKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#replicateKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplicateKeyword(SqlParser.ReplicateKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#redistributeKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedistributeKeyword(SqlParser.RedistributeKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#updateKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateKeyword(SqlParser.UpdateKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#setKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetKeyword(SqlParser.SetKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#defaultKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultKeyword(SqlParser.DefaultKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#nullKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullKeyword(SqlParser.NullKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#writeKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteKeyword(SqlParser.WriteKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#plusequalKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusequalKeyword(SqlParser.PlusequalKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#minusequalKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusequalKeyword(SqlParser.MinusequalKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#multipleequalKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleequalKeyword(SqlParser.MultipleequalKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#divisionequalKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionequalKeyword(SqlParser.DivisionequalKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#moduleequalKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleequalKeyword(SqlParser.ModuleequalKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#andequalKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndequalKeyword(SqlParser.AndequalKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xorequalKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorequalKeyword(SqlParser.XorequalKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#orequalKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrequalKeyword(SqlParser.OrequalKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#whereKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereKeyword(SqlParser.WhereKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#currentKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentKeyword(SqlParser.CurrentKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#globalKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalKeyword(SqlParser.GlobalKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optionKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionKeyword(SqlParser.OptionKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#semicolonKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolonKeyword(SqlParser.SemicolonKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#outputKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputKeyword(SqlParser.OutputKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#deletedKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeletedKeyword(SqlParser.DeletedKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insertedKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertedKeyword(SqlParser.InsertedKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dollarKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDollarKeyword(SqlParser.DollarKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#actionKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionKeyword(SqlParser.ActionKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#deleteKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteKeyword(SqlParser.DeleteKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insertKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertKeyword(SqlParser.InsertKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#valuesKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesKeyword(SqlParser.ValuesKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#selectKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectKeyword(SqlParser.SelectKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tiesKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiesKeyword(SqlParser.TiesKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#usingKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingKeyword(SqlParser.UsingKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#whenKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenKeyword(SqlParser.WhenKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#matchedKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchedKeyword(SqlParser.MatchedKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#thenKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenKeyword(SqlParser.ThenKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#targetKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetKeyword(SqlParser.TargetKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sourceKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceKeyword(SqlParser.SourceKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropKeyword(SqlParser.DropKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ifKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfKeyword(SqlParser.IfKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterKeyword(SqlParser.AlterKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#columnKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnKeyword(SqlParser.ColumnKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sparseKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSparseKeyword(SqlParser.SparseKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#addKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddKeyword(SqlParser.AddKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rowguidcolKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowguidcolKeyword(SqlParser.RowguidcolKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#persistedKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPersistedKeyword(SqlParser.PersistedKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#replicationKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplicationKeyword(SqlParser.ReplicationKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#maskedKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaskedKeyword(SqlParser.MaskedKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#functionKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionKeyword(SqlParser.FunctionKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#onlineKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlineKeyword(SqlParser.OnlineKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#offKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffKeyword(SqlParser.OffKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#checkKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckKeyword(SqlParser.CheckKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#nocheckKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNocheckKeyword(SqlParser.NocheckKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#generatedKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratedKeyword(SqlParser.GeneratedKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alwaysKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlwaysKeyword(SqlParser.AlwaysKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#startKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartKeyword(SqlParser.StartKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constraintKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintKeyword(SqlParser.ConstraintKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#endKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndKeyword(SqlParser.EndKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#periodKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriodKeyword(SqlParser.PeriodKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#enableKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnableKeyword(SqlParser.EnableKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#triggerKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerKeyword(SqlParser.TriggerKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#switchKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchKeyword(SqlParser.SwitchKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#partitionKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionKeyword(SqlParser.PartitionKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#infiniteKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfiniteKeyword(SqlParser.InfiniteKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dayKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDayKeyword(SqlParser.DayKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#daysKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDaysKeyword(SqlParser.DaysKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#weekKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeekKeyword(SqlParser.WeekKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#weeksKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeeksKeyword(SqlParser.WeeksKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#monthKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonthKeyword(SqlParser.MonthKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#monthsKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonthsKeyword(SqlParser.MonthsKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#yearKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYearKeyword(SqlParser.YearKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#yearsKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYearsKeyword(SqlParser.YearsKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rebuildKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRebuildKeyword(SqlParser.RebuildKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#moveKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveKeyword(SqlParser.MoveKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#pausedKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPausedKeyword(SqlParser.PausedKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#outboundKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutboundKeyword(SqlParser.OutboundKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#inboundKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInboundKeyword(SqlParser.InboundKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#noneKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneKeyword(SqlParser.NoneKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#pageKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPageKeyword(SqlParser.PageKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#columnstoreKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnstoreKeyword(SqlParser.ColumnstoreKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#minutesKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinutesKeyword(SqlParser.MinutesKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#selfKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfKeyword(SqlParser.SelfKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#blockersKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockersKeyword(SqlParser.BlockersKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#filestreamKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilestreamKeyword(SqlParser.FilestreamKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#encryptedKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncryptedKeyword(SqlParser.EncryptedKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#deterministicKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeterministicKeyword(SqlParser.DeterministicKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#randomizedKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandomizedKeyword(SqlParser.RandomizedKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#algorithmKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmKeyword(SqlParser.AlgorithmKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#contentKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContentKeyword(SqlParser.ContentKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#documentKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocumentKeyword(SqlParser.DocumentKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#primaryKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyword(SqlParser.PrimaryKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#keyKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyKeyword(SqlParser.KeyKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#uniqueKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueKeyword(SqlParser.UniqueKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#clusteredKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClusteredKeyword(SqlParser.ClusteredKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#nonclusteredKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonclusteredKeyword(SqlParser.NonclusteredKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fillfactorKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFillfactorKeyword(SqlParser.FillfactorKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#foreignKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyword(SqlParser.ForeignKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#referencesKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencesKeyword(SqlParser.ReferencesKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#partitionsKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionsKeyword(SqlParser.PartitionsKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#resumableKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResumableKeyword(SqlParser.ResumableKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateKeyword(SqlParser.CreateKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#includeKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeKeyword(SqlParser.IncludeKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#closeKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseKeyword(SqlParser.CloseKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#deallocateKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeallocateKeyword(SqlParser.DeallocateKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declareKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareKeyword(SqlParser.DeclareKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cursorKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorKeyword(SqlParser.CursorKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#localKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalKeyword(SqlParser.LocalKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#scrollKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScrollKeyword(SqlParser.ScrollKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#staticKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticKeyword(SqlParser.StaticKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#keysetKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeysetKeyword(SqlParser.KeysetKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dynamicKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicKeyword(SqlParser.DynamicKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optimisticKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimisticKeyword(SqlParser.OptimisticKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#priorKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriorKeyword(SqlParser.PriorKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#lastKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastKeyword(SqlParser.LastKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#absoluteKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteKeyword(SqlParser.AbsoluteKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#relativeKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeKeyword(SqlParser.RelativeKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#openKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenKeyword(SqlParser.OpenKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#bulkKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBulkKeyword(SqlParser.BulkKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#codepageKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodepageKeyword(SqlParser.CodepageKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#acpKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcpKeyword(SqlParser.AcpKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#oemKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOemKeyword(SqlParser.OemKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#datafiletypeKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatafiletypeKeyword(SqlParser.DatafiletypeKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#charKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharKeyword(SqlParser.CharKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rowterminatorKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowterminatorKeyword(SqlParser.RowterminatorKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fieldterminatorKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldterminatorKeyword(SqlParser.FieldterminatorKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#formatKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatKeyword(SqlParser.FormatKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#csvKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCsvKeyword(SqlParser.CsvKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fieldquoteKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldquoteKeyword(SqlParser.FieldquoteKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#firstrowKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstrowKeyword(SqlParser.FirstrowKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#lastrowKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastrowKeyword(SqlParser.LastrowKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#formatfileKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatfileKeyword(SqlParser.FormatfileKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#maxerrorsKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxerrorsKeyword(SqlParser.MaxerrorsKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#errorfileKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorfileKeyword(SqlParser.ErrorfileKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#keepnullsKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeepnullsKeyword(SqlParser.KeepnullsKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#batchsizeKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBatchsizeKeyword(SqlParser.BatchsizeKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#openrowsetKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenrowsetKeyword(SqlParser.OpenrowsetKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#numbersKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumbersKeyword(SqlParser.NumbersKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#stringKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringKeyword(SqlParser.StringKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#identifiersKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiersKeyword(SqlParser.IdentifiersKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#openqueryKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenqueryKeyword(SqlParser.OpenqueryKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#execKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecKeyword(SqlParser.ExecKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#executeKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteKeyword(SqlParser.ExecuteKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#plusKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusKeyword(SqlParser.PlusKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#loginKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoginKeyword(SqlParser.LoginKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#userKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserKeyword(SqlParser.UserKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#atKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtKeyword(SqlParser.AtKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#resultKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultKeyword(SqlParser.ResultKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#undefinedKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndefinedKeyword(SqlParser.UndefinedKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#objectKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectKeyword(SqlParser.ObjectKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#divisionKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionKeyword(SqlParser.DivisionKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#moduleKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleKeyword(SqlParser.ModuleKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opendatasourceKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpendatasourceKeyword(SqlParser.OpendatasourceKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#exceptKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptKeyword(SqlParser.ExceptKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#intersectKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersectKeyword(SqlParser.IntersectKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#distinctKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinctKeyword(SqlParser.DistinctKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#goKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoKeyword(SqlParser.GoKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#asKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsKeyword(SqlParser.AsKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fromKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromKeyword(SqlParser.FromKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#isKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsKeyword(SqlParser.IsKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#topKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopKeyword(SqlParser.TopKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#intoKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntoKeyword(SqlParser.IntoKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#noKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoKeyword(SqlParser.NoKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#matchKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchKeyword(SqlParser.MatchKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cascadeKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCascadeKeyword(SqlParser.CascadeKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#connectionKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnectionKeyword(SqlParser.ConnectionKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dataType1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType1(SqlParser.DataType1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#havingKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingKeyword(SqlParser.HavingKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#onkeyword1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnkeyword1(SqlParser.Onkeyword1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#truncatekeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncatekeyword(SqlParser.TruncatekeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#data_sourcekeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_sourcekeyword(SqlParser.Data_sourcekeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rows_per_batchkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRows_per_batchkeyword(SqlParser.Rows_per_batchkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#system_timekeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_timekeyword(SqlParser.System_timekeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#max_grant_percentkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMax_grant_percentkeyword(SqlParser.Max_grant_percentkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#min_grant_percentkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMin_grant_percentkeyword(SqlParser.Min_grant_percentkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#spatial_window_max_cellskeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpatial_window_max_cellskeyword(SqlParser.Spatial_window_max_cellskeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#elsekeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsekeyword(SqlParser.ElsekeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sequence_numberkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_numberkeyword(SqlParser.Sequence_numberkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#change_trackingkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_trackingkeyword(SqlParser.Change_trackingkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#track_columns_updatedkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrack_columns_updatedkeyword(SqlParser.Track_columns_updatedkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#filestream_onkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilestream_onkeyword(SqlParser.Filestream_onkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#system_versioningkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_versioningkeyword(SqlParser.System_versioningkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#history_tablekeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHistory_tablekeyword(SqlParser.History_tablekeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#data_consistency_checkkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_consistency_checkkeyword(SqlParser.Data_consistency_checkkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#history_retention_periodkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHistory_retention_periodkeyword(SqlParser.History_retention_periodkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#data_deletionkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_deletionkeyword(SqlParser.Data_deletionkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#filter_columnkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_columnkeyword(SqlParser.Filter_columnkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#retention_periodkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetention_periodkeyword(SqlParser.Retention_periodkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_setkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_setkeyword(SqlParser.Column_setkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#lock_escalationkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_escalationkeyword(SqlParser.Lock_escalationkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#filetable_directorykeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFiletable_directorykeyword(SqlParser.Filetable_directorykeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#remote_data_archivekeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemote_data_archivekeyword(SqlParser.Remote_data_archivekeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#off_without_data_recoverykeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOff_without_data_recoverykeyword(SqlParser.Off_without_data_recoverykeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#filter_predicatekeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_predicatekeyword(SqlParser.Filter_predicatekeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#migration_statekeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMigration_statekeyword(SqlParser.Migration_statekeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sort_in_tempdbkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_in_tempdbkeyword(SqlParser.Sort_in_tempdbkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#data_compressionkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_compressionkeyword(SqlParser.Data_compressionkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#wait_at_low_prioritykeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWait_at_low_prioritykeyword(SqlParser.Wait_at_low_prioritykeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#max_durationkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMax_durationkeyword(SqlParser.Max_durationkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#abort_after_waitkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbort_after_waitkeyword(SqlParser.Abort_after_waitkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_encryption_keykeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_encryption_keykeyword(SqlParser.Column_encryption_keykeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#encryption_typekeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncryption_typekeyword(SqlParser.Encryption_typekeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#pad_indexkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPad_indexkeyword(SqlParser.Pad_indexkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ignore_dup_keykeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnore_dup_keykeyword(SqlParser.Ignore_dup_keykeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#statistics_norecomputekeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatistics_norecomputekeyword(SqlParser.Statistics_norecomputekeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#allow_row_lockskeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllow_row_lockskeyword(SqlParser.Allow_row_lockskeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#allow_page_lockskeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllow_page_lockskeyword(SqlParser.Allow_page_lockskeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optimize_for_sequential_keykeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimize_for_sequential_keykeyword(SqlParser.Optimize_for_sequential_keykeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xml_compressionkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_compressionkeyword(SqlParser.Xml_compressionkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#textimage_onkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextimage_onkeyword(SqlParser.Textimage_onkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ledger_viewkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLedger_viewkeyword(SqlParser.Ledger_viewkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#append_onlykeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppend_onlykeyword(SqlParser.Append_onlykeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#transaction_id_column_namekeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_id_column_namekeyword(SqlParser.Transaction_id_column_namekeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sequence_number_column_namekeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_number_column_namekeyword(SqlParser.Sequence_number_column_namekeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#delaykeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelaykeyword(SqlParser.DelaykeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tildekeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTildekeyword(SqlParser.TildekeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#timekeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimekeyword(SqlParser.TimekeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#timeoutkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeoutkeyword(SqlParser.TimeoutkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#operation_type_column_namekeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation_type_column_namekeyword(SqlParser.Operation_type_column_namekeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#forward_onlykeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForward_onlykeyword(SqlParser.Forward_onlykeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#read_onlykeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_onlykeyword(SqlParser.Read_onlykeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#scroll_lockskeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScroll_lockskeyword(SqlParser.Scroll_lockskeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#formatfile_data_sourcekeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatfile_data_sourcekeyword(SqlParser.Formatfile_data_sourcekeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#errorfile_data_sourcekeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorfile_data_sourcekeyword(SqlParser.Errorfile_data_sourcekeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#beginkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginkeyword(SqlParser.BeginkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#transaction_idkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_idkeyword(SqlParser.Transaction_idkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#kilobytes_per_batchkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKilobytes_per_batchkeyword(SqlParser.Kilobytes_per_batchkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#whilekeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilekeyword(SqlParser.WhilekeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#breakkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakkeyword(SqlParser.BreakkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#continuekeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinuekeyword(SqlParser.ContinuekeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#waitforkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitforkeyword(SqlParser.WaitforkeywordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link SqlParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SqlParser.ProgramContext ctx);
}