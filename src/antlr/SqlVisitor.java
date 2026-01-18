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
	 * Visit a parse tree produced by {@link SqlParser#query_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_expression(SqlParser.Query_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#setOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperations(SqlParser.SetOperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#surroundedQuerySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurroundedQuerySpecification(SqlParser.SurroundedQuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#query_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_specification(SqlParser.Query_specificationContext ctx);
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
	 * Visit a parse tree produced by {@link SqlParser#havingKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingKeyword(SqlParser.HavingKeywordContext ctx);
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
	 * Visit a parse tree produced by {@link SqlParser#top}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop(SqlParser.TopContext ctx);
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
	 * Visit a parse tree produced by the {@code OperatorPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorPredicate(SqlParser.OperatorPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LikePredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikePredicate(SqlParser.LikePredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BetweenPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenPredicate(SqlParser.BetweenPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullPredicate(SqlParser.NullPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DistinctPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinctPredicate(SqlParser.DistinctPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContainsPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainsPredicate(SqlParser.ContainsPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FreeTextPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreeTextPredicate(SqlParser.FreeTextPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotInPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotInPredicate(SqlParser.NotInPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GroupOperatorPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupOperatorPredicate(SqlParser.GroupOperatorPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExistsPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsPredicate(SqlParser.ExistsPredicateContext ctx);
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
	 * Visit a parse tree produced by {@link SqlParser#asKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsKeyword(SqlParser.AsKeywordContext ctx);
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
	 * Visit a parse tree produced by {@link SqlParser#filetable_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFiletable_option(SqlParser.Filetable_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#stretch_configuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStretch_configuration(SqlParser.Stretch_configurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_stretch_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_stretch_options(SqlParser.Table_stretch_optionsContext ctx);
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
	 * Visit a parse tree produced by {@link SqlParser#ledger_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLedger_option(SqlParser.Ledger_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ledger_view_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLedger_view_option(SqlParser.Ledger_view_optionContext ctx);
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
	 * Visit a parse tree produced by {@link SqlParser#surroundedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurroundedExpression(SqlParser.SurroundedExpressionContext ctx);
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
	 * Visit a parse tree produced by {@link SqlParser#new_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table(SqlParser.New_tableContext ctx);
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
	 * Visit a parse tree produced by {@link SqlParser#in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(SqlParser.InContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(SqlParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#idoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdoc(SqlParser.IdocContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#nvarchar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNvarchar(SqlParser.NvarcharContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rowpattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowpattern(SqlParser.RowpatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#byte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByte(SqlParser.ByteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#flags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlags(SqlParser.FlagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCount(SqlParser.CountContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumns(SqlParser.ColumnsContext ctx);
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
	 * Visit a parse tree produced by {@link SqlParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(SqlParser.ActionContext ctx);
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
	 * Visit a parse tree produced by {@link SqlParser#max}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMax(SqlParser.MaxContext ctx);
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
	 * Visit a parse tree produced by {@link SqlParser#bigint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigint(SqlParser.BigintContext ctx);
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
	 * Visit a parse tree produced by {@link SqlParser#table_predicate_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_predicate_function(SqlParser.Table_predicate_functionContext ctx);
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
	 * Visit a parse tree produced by {@link SqlParser#filter_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_predicate(SqlParser.Filter_predicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sequence_number_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_number_column_name(SqlParser.Sequence_number_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#transaction_id_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_id_column_name(SqlParser.Transaction_id_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ledger_view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLedger_view_name(SqlParser.Ledger_view_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#operation_type_desc_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation_type_desc_column_name(SqlParser.Operation_type_desc_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#operation_type_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation_type_id(SqlParser.Operation_type_idContext ctx);
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
	 * Visit a parse tree produced by {@link SqlParser#aggregate_windowed_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_windowed_function(SqlParser.Aggregate_windowed_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRanking_windowed_function(SqlParser.Ranking_windowed_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#scalar_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_subquery(SqlParser.Scalar_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#nvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNvar(SqlParser.NvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#n}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN(SqlParser.NContext ctx);
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
	 * Visit a parse tree produced by {@link SqlParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(SqlParser.OptionContext ctx);
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
	 * Visit a parse tree produced by {@link SqlParser#schemaDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaDeclaration(SqlParser.SchemaDeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link SqlParser#fileTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileTable(SqlParser.FileTableContext ctx);
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
	 * Visit a parse tree produced by {@link SqlParser#windows_collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindows_collation_name(SqlParser.Windows_collation_nameContext ctx);
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
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link SqlParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SqlParser.ProgramContext ctx);
}