// Generated from .\Alimentos.g4 by ANTLR 4.9.2
package com.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlimentosParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlimentosVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AlimentosParser#grupo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrupo(AlimentosParser.GrupoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code january}
	 * labeled alternative in {@link AlimentosParser#meses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJanuary(AlimentosParser.JanuaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code february}
	 * labeled alternative in {@link AlimentosParser#meses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFebruary(AlimentosParser.FebruaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlimentosParser#enero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnero(AlimentosParser.EneroContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlimentosParser#febrero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFebrero(AlimentosParser.FebreroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fresa}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFresa(AlimentosParser.FresaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code guayaba}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuayaba(AlimentosParser.GuayabaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jamaica}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJamaica(AlimentosParser.JamaicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lima}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLima(AlimentosParser.LimaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code limon}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimon(AlimentosParser.LimonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mandarina}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMandarina(AlimentosParser.MandarinaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code melon}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMelon(AlimentosParser.MelonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code naranja}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaranja(AlimentosParser.NaranjaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pina}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPina(AlimentosParser.PinaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code papaya}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPapaya(AlimentosParser.PapayaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code platano}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlatano(AlimentosParser.PlatanoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toronja}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToronja(AlimentosParser.ToronjaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code granada}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGranada(AlimentosParser.GranadaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tamarinco}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTamarinco(AlimentosParser.TamarincoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mamey}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMamey(AlimentosParser.MameyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sandia}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSandia(AlimentosParser.SandiaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mango}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMango(AlimentosParser.MangoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ciruela}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiruela(AlimentosParser.CiruelaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chabacano}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChabacano(AlimentosParser.ChabacanoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pera}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPera(AlimentosParser.PeraContext ctx);
	/**
	 * Visit a parse tree produced by the {@code durazno}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDurazno(AlimentosParser.DuraznoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code higo}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHigo(AlimentosParser.HigoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code membirllo}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembirllo(AlimentosParser.MembirlloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tuna}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuna(AlimentosParser.TunaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uva}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUva(AlimentosParser.UvaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code capulin}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapulin(AlimentosParser.CapulinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cereza}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCereza(AlimentosParser.CerezaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jicama}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJicama(AlimentosParser.JicamaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cana}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCana(AlimentosParser.CanaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chirimoya}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChirimoya(AlimentosParser.ChirimoyaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chichozapote}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChichozapote(AlimentosParser.ChichozapoteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tejocote}
	 * labeled alternative in {@link AlimentosParser#frutas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTejocote(AlimentosParser.TejocoteContext ctx);
}