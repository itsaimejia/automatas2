// Generated from .\Alimentos.g4 by ANTLR 4.9.2
package com.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlimentosParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FRESA=1, GUAYABA=2, JAMAICA=3, LIMA=4, LIMON=5, MANDARINA=6, MELON=7, 
		NARANJA=8, PINA=9, PAPAYA=10, PLATANO=11, TORONJA=12, GRANADA=13, TAMARINDO=14, 
		MAMEY=15, SANDIA=16, MANGO=17, CIRUELA=18, CHABACANO=19, PERA=20, DURAZNO=21, 
		HIGO=22, MEMBRILLO=23, TUNA=24, UVA=25, CAPULIN=26, CEREZA=27, JICAMA=28, 
		CANA=29, CHIRIMOYA=30, CHICOZAPOTE=31, TEJOCOTE=32, ENERO=33, FEBRERO=34, 
		TEXT=35, WS=36;
	public static final int
		RULE_grupo = 0, RULE_meses = 1, RULE_enero = 2, RULE_febrero = 3, RULE_frutas = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"grupo", "meses", "enero", "febrero", "frutas"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'Enero'", "'Febrero'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FRESA", "GUAYABA", "JAMAICA", "LIMA", "LIMON", "MANDARINA", "MELON", 
			"NARANJA", "PINA", "PAPAYA", "PLATANO", "TORONJA", "GRANADA", "TAMARINDO", 
			"MAMEY", "SANDIA", "MANGO", "CIRUELA", "CHABACANO", "PERA", "DURAZNO", 
			"HIGO", "MEMBRILLO", "TUNA", "UVA", "CAPULIN", "CEREZA", "JICAMA", "CANA", 
			"CHIRIMOYA", "CHICOZAPOTE", "TEJOCOTE", "ENERO", "FEBRERO", "TEXT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Alimentos.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlimentosParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class GrupoContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(AlimentosParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(AlimentosParser.TEXT, i);
		}
		public List<MesesContext> meses() {
			return getRuleContexts(MesesContext.class);
		}
		public MesesContext meses(int i) {
			return getRuleContext(MesesContext.class,i);
		}
		public GrupoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grupo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitGrupo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrupoContext grupo() throws RecognitionException {
		GrupoContext _localctx = new GrupoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_grupo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(10);
				match(TEXT);
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				meses();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ENERO || _la==FEBRERO );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MesesContext extends ParserRuleContext {
		public MesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meses; }
	 
		public MesesContext() { }
		public void copyFrom(MesesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JanuaryContext extends MesesContext {
		public EneroContext enero() {
			return getRuleContext(EneroContext.class,0);
		}
		public JanuaryContext(MesesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitJanuary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FebruaryContext extends MesesContext {
		public FebreroContext febrero() {
			return getRuleContext(FebreroContext.class,0);
		}
		public FebruaryContext(MesesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitFebruary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MesesContext meses() throws RecognitionException {
		MesesContext _localctx = new MesesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_meses);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENERO:
				_localctx = new JanuaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				enero();
				}
				break;
			case FEBRERO:
				_localctx = new FebruaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				febrero();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EneroContext extends ParserRuleContext {
		public List<TerminalNode> ENERO() { return getTokens(AlimentosParser.ENERO); }
		public TerminalNode ENERO(int i) {
			return getToken(AlimentosParser.ENERO, i);
		}
		public List<FrutasContext> frutas() {
			return getRuleContexts(FrutasContext.class);
		}
		public FrutasContext frutas(int i) {
			return getRuleContext(FrutasContext.class,i);
		}
		public EneroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enero; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitEnero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EneroContext enero() throws RecognitionException {
		EneroContext _localctx = new EneroContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_enero);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(25);
					match(ENERO);
					setState(27); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(26);
						frutas();
						}
						}
						setState(29); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRESA) | (1L << GUAYABA) | (1L << JAMAICA) | (1L << LIMA) | (1L << LIMON) | (1L << MANDARINA) | (1L << MELON) | (1L << NARANJA) | (1L << PINA) | (1L << PAPAYA) | (1L << PLATANO) | (1L << TORONJA) | (1L << GRANADA) | (1L << TAMARINDO) | (1L << MAMEY) | (1L << SANDIA) | (1L << MANGO) | (1L << CIRUELA) | (1L << CHABACANO) | (1L << PERA) | (1L << DURAZNO) | (1L << HIGO) | (1L << MEMBRILLO) | (1L << TUNA) | (1L << UVA) | (1L << CAPULIN) | (1L << CEREZA) | (1L << JICAMA) | (1L << CANA) | (1L << CHIRIMOYA) | (1L << CHICOZAPOTE) | (1L << TEJOCOTE))) != 0) );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(33); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FebreroContext extends ParserRuleContext {
		public List<TerminalNode> FEBRERO() { return getTokens(AlimentosParser.FEBRERO); }
		public TerminalNode FEBRERO(int i) {
			return getToken(AlimentosParser.FEBRERO, i);
		}
		public List<FrutasContext> frutas() {
			return getRuleContexts(FrutasContext.class);
		}
		public FrutasContext frutas(int i) {
			return getRuleContext(FrutasContext.class,i);
		}
		public FebreroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_febrero; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitFebrero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FebreroContext febrero() throws RecognitionException {
		FebreroContext _localctx = new FebreroContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_febrero);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(35);
					match(FEBRERO);
					setState(37); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(36);
						frutas();
						}
						}
						setState(39); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRESA) | (1L << GUAYABA) | (1L << JAMAICA) | (1L << LIMA) | (1L << LIMON) | (1L << MANDARINA) | (1L << MELON) | (1L << NARANJA) | (1L << PINA) | (1L << PAPAYA) | (1L << PLATANO) | (1L << TORONJA) | (1L << GRANADA) | (1L << TAMARINDO) | (1L << MAMEY) | (1L << SANDIA) | (1L << MANGO) | (1L << CIRUELA) | (1L << CHABACANO) | (1L << PERA) | (1L << DURAZNO) | (1L << HIGO) | (1L << MEMBRILLO) | (1L << TUNA) | (1L << UVA) | (1L << CAPULIN) | (1L << CEREZA) | (1L << JICAMA) | (1L << CANA) | (1L << CHIRIMOYA) | (1L << CHICOZAPOTE) | (1L << TEJOCOTE))) != 0) );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(43); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrutasContext extends ParserRuleContext {
		public FrutasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frutas; }
	 
		public FrutasContext() { }
		public void copyFrom(FrutasContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PapayaContext extends FrutasContext {
		public TerminalNode PAPAYA() { return getToken(AlimentosParser.PAPAYA, 0); }
		public PapayaContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitPapaya(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlatanoContext extends FrutasContext {
		public TerminalNode PLATANO() { return getToken(AlimentosParser.PLATANO, 0); }
		public PlatanoContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitPlatano(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TunaContext extends FrutasContext {
		public TerminalNode TUNA() { return getToken(AlimentosParser.TUNA, 0); }
		public TunaContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitTuna(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CerezaContext extends FrutasContext {
		public TerminalNode CEREZA() { return getToken(AlimentosParser.CEREZA, 0); }
		public CerezaContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitCereza(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LimonContext extends FrutasContext {
		public TerminalNode LIMON() { return getToken(AlimentosParser.LIMON, 0); }
		public LimonContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitLimon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PeraContext extends FrutasContext {
		public TerminalNode PERA() { return getToken(AlimentosParser.PERA, 0); }
		public PeraContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitPera(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MandarinaContext extends FrutasContext {
		public TerminalNode MANDARINA() { return getToken(AlimentosParser.MANDARINA, 0); }
		public MandarinaContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitMandarina(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JamaicaContext extends FrutasContext {
		public TerminalNode JAMAICA() { return getToken(AlimentosParser.JAMAICA, 0); }
		public JamaicaContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitJamaica(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChabacanoContext extends FrutasContext {
		public TerminalNode CHABACANO() { return getToken(AlimentosParser.CHABACANO, 0); }
		public ChabacanoContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitChabacano(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PinaContext extends FrutasContext {
		public TerminalNode PINA() { return getToken(AlimentosParser.PINA, 0); }
		public PinaContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitPina(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HigoContext extends FrutasContext {
		public TerminalNode HIGO() { return getToken(AlimentosParser.HIGO, 0); }
		public HigoContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitHigo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TejocoteContext extends FrutasContext {
		public TerminalNode TEJOCOTE() { return getToken(AlimentosParser.TEJOCOTE, 0); }
		public TejocoteContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitTejocote(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToronjaContext extends FrutasContext {
		public TerminalNode TORONJA() { return getToken(AlimentosParser.TORONJA, 0); }
		public ToronjaContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitToronja(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SandiaContext extends FrutasContext {
		public TerminalNode SANDIA() { return getToken(AlimentosParser.SANDIA, 0); }
		public SandiaContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitSandia(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MelonContext extends FrutasContext {
		public TerminalNode MELON() { return getToken(AlimentosParser.MELON, 0); }
		public MelonContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitMelon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MameyContext extends FrutasContext {
		public TerminalNode MAMEY() { return getToken(AlimentosParser.MAMEY, 0); }
		public MameyContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitMamey(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MembirlloContext extends FrutasContext {
		public TerminalNode MEMBRILLO() { return getToken(AlimentosParser.MEMBRILLO, 0); }
		public MembirlloContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitMembirllo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UvaContext extends FrutasContext {
		public TerminalNode UVA() { return getToken(AlimentosParser.UVA, 0); }
		public UvaContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitUva(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GuayabaContext extends FrutasContext {
		public TerminalNode GUAYABA() { return getToken(AlimentosParser.GUAYABA, 0); }
		public GuayabaContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitGuayaba(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LimaContext extends FrutasContext {
		public TerminalNode LIMA() { return getToken(AlimentosParser.LIMA, 0); }
		public LimaContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitLima(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CiruelaContext extends FrutasContext {
		public TerminalNode CIRUELA() { return getToken(AlimentosParser.CIRUELA, 0); }
		public CiruelaContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitCiruela(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NaranjaContext extends FrutasContext {
		public TerminalNode NARANJA() { return getToken(AlimentosParser.NARANJA, 0); }
		public NaranjaContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitNaranja(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JicamaContext extends FrutasContext {
		public TerminalNode JICAMA() { return getToken(AlimentosParser.JICAMA, 0); }
		public JicamaContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitJicama(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChirimoyaContext extends FrutasContext {
		public TerminalNode CHIRIMOYA() { return getToken(AlimentosParser.CHIRIMOYA, 0); }
		public ChirimoyaContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitChirimoya(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChichozapoteContext extends FrutasContext {
		public TerminalNode CHICOZAPOTE() { return getToken(AlimentosParser.CHICOZAPOTE, 0); }
		public ChichozapoteContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitChichozapote(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MangoContext extends FrutasContext {
		public TerminalNode MANGO() { return getToken(AlimentosParser.MANGO, 0); }
		public MangoContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitMango(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DuraznoContext extends FrutasContext {
		public TerminalNode DURAZNO() { return getToken(AlimentosParser.DURAZNO, 0); }
		public DuraznoContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitDurazno(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GranadaContext extends FrutasContext {
		public TerminalNode GRANADA() { return getToken(AlimentosParser.GRANADA, 0); }
		public GranadaContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitGranada(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FresaContext extends FrutasContext {
		public TerminalNode FRESA() { return getToken(AlimentosParser.FRESA, 0); }
		public FresaContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitFresa(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TamarincoContext extends FrutasContext {
		public TerminalNode TAMARINDO() { return getToken(AlimentosParser.TAMARINDO, 0); }
		public TamarincoContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitTamarinco(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CapulinContext extends FrutasContext {
		public TerminalNode CAPULIN() { return getToken(AlimentosParser.CAPULIN, 0); }
		public CapulinContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitCapulin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CanaContext extends FrutasContext {
		public TerminalNode CANA() { return getToken(AlimentosParser.CANA, 0); }
		public CanaContext(FrutasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlimentosVisitor ) return ((AlimentosVisitor<? extends T>)visitor).visitCana(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrutasContext frutas() throws RecognitionException {
		FrutasContext _localctx = new FrutasContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_frutas);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FRESA:
				_localctx = new FresaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(FRESA);
				}
				break;
			case GUAYABA:
				_localctx = new GuayabaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(GUAYABA);
				}
				break;
			case JAMAICA:
				_localctx = new JamaicaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				match(JAMAICA);
				}
				break;
			case LIMA:
				_localctx = new LimaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				match(LIMA);
				}
				break;
			case LIMON:
				_localctx = new LimonContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				match(LIMON);
				}
				break;
			case MANDARINA:
				_localctx = new MandarinaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				match(MANDARINA);
				}
				break;
			case MELON:
				_localctx = new MelonContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(51);
				match(MELON);
				}
				break;
			case NARANJA:
				_localctx = new NaranjaContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(52);
				match(NARANJA);
				}
				break;
			case PINA:
				_localctx = new PinaContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(53);
				match(PINA);
				}
				break;
			case PAPAYA:
				_localctx = new PapayaContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(54);
				match(PAPAYA);
				}
				break;
			case PLATANO:
				_localctx = new PlatanoContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(55);
				match(PLATANO);
				}
				break;
			case TORONJA:
				_localctx = new ToronjaContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(56);
				match(TORONJA);
				}
				break;
			case GRANADA:
				_localctx = new GranadaContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(57);
				match(GRANADA);
				}
				break;
			case TAMARINDO:
				_localctx = new TamarincoContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(58);
				match(TAMARINDO);
				}
				break;
			case MAMEY:
				_localctx = new MameyContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(59);
				match(MAMEY);
				}
				break;
			case SANDIA:
				_localctx = new SandiaContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(60);
				match(SANDIA);
				}
				break;
			case MANGO:
				_localctx = new MangoContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(61);
				match(MANGO);
				}
				break;
			case CIRUELA:
				_localctx = new CiruelaContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(62);
				match(CIRUELA);
				}
				break;
			case CHABACANO:
				_localctx = new ChabacanoContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(63);
				match(CHABACANO);
				}
				break;
			case PERA:
				_localctx = new PeraContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(64);
				match(PERA);
				}
				break;
			case DURAZNO:
				_localctx = new DuraznoContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(65);
				match(DURAZNO);
				}
				break;
			case HIGO:
				_localctx = new HigoContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(66);
				match(HIGO);
				}
				break;
			case MEMBRILLO:
				_localctx = new MembirlloContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(67);
				match(MEMBRILLO);
				}
				break;
			case TUNA:
				_localctx = new TunaContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(68);
				match(TUNA);
				}
				break;
			case UVA:
				_localctx = new UvaContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(69);
				match(UVA);
				}
				break;
			case CAPULIN:
				_localctx = new CapulinContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(70);
				match(CAPULIN);
				}
				break;
			case CEREZA:
				_localctx = new CerezaContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(71);
				match(CEREZA);
				}
				break;
			case JICAMA:
				_localctx = new JicamaContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(72);
				match(JICAMA);
				}
				break;
			case CANA:
				_localctx = new CanaContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(73);
				match(CANA);
				}
				break;
			case CHIRIMOYA:
				_localctx = new ChirimoyaContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(74);
				match(CHIRIMOYA);
				}
				break;
			case CHICOZAPOTE:
				_localctx = new ChichozapoteContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(75);
				match(CHICOZAPOTE);
				}
				break;
			case TEJOCOTE:
				_localctx = new TejocoteContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(76);
				match(TEJOCOTE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&R\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\6\2\24\n"+
		"\2\r\2\16\2\25\3\3\3\3\5\3\32\n\3\3\4\3\4\6\4\36\n\4\r\4\16\4\37\6\4\""+
		"\n\4\r\4\16\4#\3\5\3\5\6\5(\n\5\r\5\16\5)\6\5,\n\5\r\5\16\5-\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6P\n\6\3\6\2\2\7\2"+
		"\4\6\b\n\2\2\2r\2\17\3\2\2\2\4\31\3\2\2\2\6!\3\2\2\2\b+\3\2\2\2\nO\3\2"+
		"\2\2\f\16\7%\2\2\r\f\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2"+
		"\20\23\3\2\2\2\21\17\3\2\2\2\22\24\5\4\3\2\23\22\3\2\2\2\24\25\3\2\2\2"+
		"\25\23\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27\32\5\6\4\2\30\32\5\b\5\2"+
		"\31\27\3\2\2\2\31\30\3\2\2\2\32\5\3\2\2\2\33\35\7#\2\2\34\36\5\n\6\2\35"+
		"\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\33\3\2"+
		"\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\7\3\2\2\2%\'\7$\2\2&(\5\n\6\2\'&"+
		"\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+%\3\2\2\2,-\3\2\2\2"+
		"-+\3\2\2\2-.\3\2\2\2.\t\3\2\2\2/P\7\3\2\2\60P\7\4\2\2\61P\7\5\2\2\62P"+
		"\7\6\2\2\63P\7\7\2\2\64P\7\b\2\2\65P\7\t\2\2\66P\7\n\2\2\67P\7\13\2\2"+
		"8P\7\f\2\29P\7\r\2\2:P\7\16\2\2;P\7\17\2\2<P\7\20\2\2=P\7\21\2\2>P\7\22"+
		"\2\2?P\7\23\2\2@P\7\24\2\2AP\7\25\2\2BP\7\26\2\2CP\7\27\2\2DP\7\30\2\2"+
		"EP\7\31\2\2FP\7\32\2\2GP\7\33\2\2HP\7\34\2\2IP\7\35\2\2JP\7\36\2\2KP\7"+
		"\37\2\2LP\7 \2\2MP\7!\2\2NP\7\"\2\2O/\3\2\2\2O\60\3\2\2\2O\61\3\2\2\2"+
		"O\62\3\2\2\2O\63\3\2\2\2O\64\3\2\2\2O\65\3\2\2\2O\66\3\2\2\2O\67\3\2\2"+
		"\2O8\3\2\2\2O9\3\2\2\2O:\3\2\2\2O;\3\2\2\2O<\3\2\2\2O=\3\2\2\2O>\3\2\2"+
		"\2O?\3\2\2\2O@\3\2\2\2OA\3\2\2\2OB\3\2\2\2OC\3\2\2\2OD\3\2\2\2OE\3\2\2"+
		"\2OF\3\2\2\2OG\3\2\2\2OH\3\2\2\2OI\3\2\2\2OJ\3\2\2\2OK\3\2\2\2OL\3\2\2"+
		"\2OM\3\2\2\2ON\3\2\2\2P\13\3\2\2\2\n\17\25\31\37#)-O";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}