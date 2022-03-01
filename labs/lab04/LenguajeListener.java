// Generated from .\Lenguaje.g4 by ANTLR 4.9.2

    import java.util.HashMap;    

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LenguajeParser}.
 */
public interface LenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LenguajeParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LenguajeParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(LenguajeParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(LenguajeParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(LenguajeParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(LenguajeParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(LenguajeParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(LenguajeParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LenguajeParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LenguajeParser.ExprContext ctx);
}