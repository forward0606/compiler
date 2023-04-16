// Generated from d:\B ½sÄ¶¾¹³]­p\project\project2\myC_new.g4 by ANTLR 4.9.2

    // import packages here.

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myC_newParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, FLOAT=11, INT=12, MAIN=13, VOID=14, IF=15, Identifier=16, Integer_constant=17, 
		Floating_point_constant=18, WS=19, COMMENT=20;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_type = 2, RULE_statements = 3, 
		RULE_arith_expression = 4, RULE_multExpr = 5, RULE_signExpr = 6, RULE_primaryExpr = 7, 
		RULE_statement = 8, RULE_if_then_statements = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declarations", "type", "statements", "arith_expression", 
			"multExpr", "signExpr", "primaryExpr", "statement", "if_then_statements"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "'+'", "'-'", "'*'", "'/'", 
			"'='", "'float'", "'int'", "'main'", "'void'", "'if'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "FLOAT", 
			"INT", "MAIN", "VOID", "IF", "Identifier", "Integer_constant", "Floating_point_constant", 
			"WS", "COMMENT"
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
	public String getGrammarFileName() { return "myC_new.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    boolean TRACEON = true;

	public myC_newParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(myC_newParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(myC_newParser.MAIN, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(VOID);
			setState(21);
			match(MAIN);
			setState(22);
			match(T__0);
			setState(23);
			match(T__1);
			setState(24);
			match(T__2);
			setState(25);
			declarations();
			setState(26);
			statements();
			setState(27);
			match(T__3);
			if (TRACEON) System.out.println("VOID MAIN () {declarations statements}");
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

	public static class DeclarationsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(myC_newParser.Identifier, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				type();
				setState(31);
				match(Identifier);
				setState(32);
				match(T__4);
				setState(33);
				declarations();
				 if (TRACEON) System.out.println("declarations: type Identifier : declarations"); 
				}
				break;
			case T__3:
			case IF:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				 if (TRACEON) System.out.println("declarations: ");
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(myC_newParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(myC_newParser.FLOAT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(INT);
				 if (TRACEON) System.out.println("type: INT"); 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(FLOAT);
				if (TRACEON) System.out.println("type: FLOAT"); 
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statements);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				statement();
				setState(46);
				statements();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Arith_expressionContext extends ParserRuleContext {
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expression; }
	}

	public final Arith_expressionContext arith_expression() throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arith_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			multExpr();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__6) {
				{
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(52);
					match(T__5);
					setState(53);
					multExpr();
					}
					break;
				case T__6:
					{
					setState(54);
					match(T__6);
					setState(55);
					multExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class MultExprContext extends ParserRuleContext {
		public List<SignExprContext> signExpr() {
			return getRuleContexts(SignExprContext.class);
		}
		public SignExprContext signExpr(int i) {
			return getRuleContext(SignExprContext.class,i);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			signExpr();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==T__8) {
				{
				setState(66);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(62);
					match(T__7);
					setState(63);
					signExpr();
					}
					break;
				case T__8:
					{
					setState(64);
					match(T__8);
					setState(65);
					signExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class SignExprContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public SignExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signExpr; }
	}

	public final SignExprContext signExpr() throws RecognitionException {
		SignExprContext _localctx = new SignExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_signExpr);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case Identifier:
			case Integer_constant:
			case Floating_point_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				primaryExpr();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(T__6);
				setState(73);
				primaryExpr();
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

	public static class PrimaryExprContext extends ParserRuleContext {
		public TerminalNode Integer_constant() { return getToken(myC_newParser.Integer_constant, 0); }
		public TerminalNode Floating_point_constant() { return getToken(myC_newParser.Floating_point_constant, 0); }
		public TerminalNode Identifier() { return getToken(myC_newParser.Identifier, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primaryExpr);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(Integer_constant);
				}
				break;
			case Floating_point_constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(Floating_point_constant);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				match(Identifier);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				match(T__0);
				setState(80);
				arith_expression();
				setState(81);
				match(T__1);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(myC_newParser.Identifier, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode IF() { return getToken(myC_newParser.IF, 0); }
		public If_then_statementsContext if_then_statements() {
			return getRuleContext(If_then_statementsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(Identifier);
				setState(86);
				match(T__9);
				setState(87);
				arith_expression();
				setState(88);
				match(T__4);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(IF);
				setState(91);
				match(T__0);
				setState(92);
				arith_expression();
				setState(93);
				match(T__1);
				setState(94);
				if_then_statements();
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

	public static class If_then_statementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public If_then_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_then_statements; }
	}

	public final If_then_statementsContext if_then_statements() throws RecognitionException {
		If_then_statementsContext _localctx = new If_then_statementsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_then_statements);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				statement();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(T__2);
				setState(100);
				statements();
				setState(101);
				match(T__3);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26l\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"(\n\3\3\4\3\4\3\4\3\4\5\4.\n\4\3\5\3\5\3\5\3\5\5\5\64\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\7\6;\n\6\f\6\16\6>\13\6\3\7\3\7\3\7\3\7\3\7\7\7E\n\7\f\7\16\7"+
		"H\13\7\3\b\3\b\3\b\5\bM\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tV\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nc\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\5\13j\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2\2n\2\26\3\2\2\2"+
		"\4\'\3\2\2\2\6-\3\2\2\2\b\63\3\2\2\2\n\65\3\2\2\2\f?\3\2\2\2\16L\3\2\2"+
		"\2\20U\3\2\2\2\22b\3\2\2\2\24i\3\2\2\2\26\27\7\20\2\2\27\30\7\17\2\2\30"+
		"\31\7\3\2\2\31\32\7\4\2\2\32\33\7\5\2\2\33\34\5\4\3\2\34\35\5\b\5\2\35"+
		"\36\7\6\2\2\36\37\b\2\1\2\37\3\3\2\2\2 !\5\6\4\2!\"\7\22\2\2\"#\7\7\2"+
		"\2#$\5\4\3\2$%\b\3\1\2%(\3\2\2\2&(\b\3\1\2\' \3\2\2\2\'&\3\2\2\2(\5\3"+
		"\2\2\2)*\7\16\2\2*.\b\4\1\2+,\7\r\2\2,.\b\4\1\2-)\3\2\2\2-+\3\2\2\2.\7"+
		"\3\2\2\2/\60\5\22\n\2\60\61\5\b\5\2\61\64\3\2\2\2\62\64\3\2\2\2\63/\3"+
		"\2\2\2\63\62\3\2\2\2\64\t\3\2\2\2\65<\5\f\7\2\66\67\7\b\2\2\67;\5\f\7"+
		"\289\7\t\2\29;\5\f\7\2:\66\3\2\2\2:8\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2"+
		"\2\2=\13\3\2\2\2><\3\2\2\2?F\5\16\b\2@A\7\n\2\2AE\5\16\b\2BC\7\13\2\2"+
		"CE\5\16\b\2D@\3\2\2\2DB\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\r\3\2\2"+
		"\2HF\3\2\2\2IM\5\20\t\2JK\7\t\2\2KM\5\20\t\2LI\3\2\2\2LJ\3\2\2\2M\17\3"+
		"\2\2\2NV\7\23\2\2OV\7\24\2\2PV\7\22\2\2QR\7\3\2\2RS\5\n\6\2ST\7\4\2\2"+
		"TV\3\2\2\2UN\3\2\2\2UO\3\2\2\2UP\3\2\2\2UQ\3\2\2\2V\21\3\2\2\2WX\7\22"+
		"\2\2XY\7\f\2\2YZ\5\n\6\2Z[\7\7\2\2[c\3\2\2\2\\]\7\21\2\2]^\7\3\2\2^_\5"+
		"\n\6\2_`\7\4\2\2`a\5\24\13\2ac\3\2\2\2bW\3\2\2\2b\\\3\2\2\2c\23\3\2\2"+
		"\2dj\5\22\n\2ef\7\5\2\2fg\5\b\5\2gh\7\6\2\2hj\3\2\2\2id\3\2\2\2ie\3\2"+
		"\2\2j\25\3\2\2\2\r\'-\63:<DFLUbi";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}