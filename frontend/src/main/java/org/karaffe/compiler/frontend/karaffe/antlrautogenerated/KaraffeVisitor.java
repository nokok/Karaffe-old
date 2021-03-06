// Generated from Karaffe.g4 by ANTLR 4.7.1
package org.karaffe.compiler.frontend.karaffe.antlrautogenerated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KaraffeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KaraffeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(KaraffeParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#topLevelStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelStatement(KaraffeParser.TopLevelStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(KaraffeParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#simpleClassDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleClassDef(KaraffeParser.SimpleClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#classDefBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefBody(KaraffeParser.ClassDefBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#classDefMemberList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefMemberList(KaraffeParser.ClassDefMemberListContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#classDefMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefMember(KaraffeParser.ClassDefMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#mainMethodDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainMethodDef(KaraffeParser.MainMethodDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#statementBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(KaraffeParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(KaraffeParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(KaraffeParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(KaraffeParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding(KaraffeParser.BindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(KaraffeParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(KaraffeParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(KaraffeParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#rangeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpr(KaraffeParser.RangeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(KaraffeParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(KaraffeParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#equalityExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(KaraffeParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#conditionalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpr(KaraffeParser.ConditionalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#additiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(KaraffeParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpr(KaraffeParser.MultiplicativeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#powExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(KaraffeParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(KaraffeParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link KaraffeParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(KaraffeParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectMethodInvocation}
	 * labeled alternative in {@link KaraffeParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectMethodInvocation(KaraffeParser.ObjectMethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lit}
	 * labeled alternative in {@link KaraffeParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLit(KaraffeParser.LitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedExpr}
	 * labeled alternative in {@link KaraffeParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedExpr(KaraffeParser.NestedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newInstance}
	 * labeled alternative in {@link KaraffeParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewInstance(KaraffeParser.NewInstanceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprName}
	 * labeled alternative in {@link KaraffeParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprName(KaraffeParser.ExprNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code localMethodInvocation}
	 * labeled alternative in {@link KaraffeParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalMethodInvocation(KaraffeParser.LocalMethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaraffeParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(KaraffeParser.LiteralContext ctx);
}
