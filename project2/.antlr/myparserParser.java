// Generated from d:\B ½sÄ¶¾¹³]­p\project\project2\myparser.g4 by ANTLR 4.9.2

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
public class myparserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, FLOAT=30, INT=31, CHAR=32, 
		MAIN=33, VOID=34, IF=35, ELSE=36, DO=37, WHILE=38, FOR=39, PRINTF=40, 
		RETURN=41, SWITCH=42, CASE=43, DEFAULT=44, BREAK=45, CONTINUE=46, INCLUDE=47, 
		CONST=48, STD_LIB=49, CHARACTER=50, Identifier=51, Integer_constant=52, 
		Floating_point_constant=53, STRING=54, WS=55, COMMENT=56;
	public static final int
		RULE_headers = 0, RULE_function = 1, RULE_program = 2, RULE_declarations = 3, 
		RULE_type = 4, RULE_statements = 5, RULE_arith_expression = 6, RULE_comp = 7, 
		RULE_addExpr = 8, RULE_multExpr = 9, RULE_signExpr = 10, RULE_primaryExpr = 11, 
		RULE_statement = 12, RULE_variable = 13, RULE_assign_statement = 14, RULE_if_then_statements = 15, 
		RULE_else_statements = 16, RULE_switch_statements = 17, RULE_switch_statement = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"headers", "function", "program", "declarations", "type", "statements", 
			"arith_expression", "comp", "addExpr", "multExpr", "signExpr", "primaryExpr", 
			"statement", "variable", "assign_statement", "if_then_statements", "else_statements", 
			"switch_statements", "switch_statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "'('", "','", "')'", "'{'", "'}'", "'['", "']'", "';'", 
			"'>'", "'<'", "'=='", "'!='", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'++'", "'--'", 
			"':'", "'float'", "'int'", "'char'", "'main'", "'void'", "'if'", "'else'", 
			"'do'", "'while'", "'for'", "'printf'", "'return'", "'switch'", "'case'", 
			"'default'", "'break'", "'continue'", "'include'", "'const'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "FLOAT", "INT", "CHAR", "MAIN", "VOID", 
			"IF", "ELSE", "DO", "WHILE", "FOR", "PRINTF", "RETURN", "SWITCH", "CASE", 
			"DEFAULT", "BREAK", "CONTINUE", "INCLUDE", "CONST", "STD_LIB", "CHARACTER", 
			"Identifier", "Integer_constant", "Floating_point_constant", "STRING", 
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
	public String getGrammarFileName() { return "myparser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    boolean TRACEON = true;

	public myparserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class HeadersContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(myparserParser.INCLUDE, 0); }
		public TerminalNode STD_LIB() { return getToken(myparserParser.STD_LIB, 0); }
		public HeadersContext headers() {
			return getRuleContext(HeadersContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public HeadersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headers; }
	}

	public final HeadersContext headers() throws RecognitionException {
		HeadersContext _localctx = new HeadersContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_headers);
		try {
			int _alt;
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(T__0);
				setState(39);
				match(INCLUDE);
				setState(40);
				match(STD_LIB);
				setState(41);
				headers();
				if (TRACEON) System.out.println("headers: INCLUDE STD_LIB headers");
				}
				break;
			case FLOAT:
			case INT:
			case CHAR:
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(44);
						function();
						}
						} 
					}
					setState(49);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(50);
				program();
				if (TRACEON) System.out.println("headers: program");
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

	public static class FunctionContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(myparserParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(myparserParser.Identifier, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public If_then_statementsContext if_then_statements() {
			return getRuleContext(If_then_statementsContext.class,0);
		}
		public TerminalNode VOID() { return getToken(myparserParser.VOID, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(55);
				match(VOID);
				}
				break;
			case FLOAT:
			case INT:
			case CHAR:
				{
				setState(56);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(59);
			match(Identifier);
			setState(60);
			match(T__1);
			setState(61);
			type();
			setState(62);
			match(Identifier);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(63);
				match(T__2);
				setState(64);
				type();
				setState(65);
				match(Identifier);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(T__3);
			setState(73);
			if_then_statements();
			if (TRACEON) System.out.println("function: (VOID|type) Identifier ( type Identifier (, type Identifier)*) if_then_statements}");
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(myparserParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(myparserParser.MAIN, 0); }
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
		enterRule(_localctx, 4, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(VOID);
			setState(77);
			match(MAIN);
			setState(78);
			match(T__1);
			setState(79);
			match(T__3);
			setState(80);
			match(T__4);
			setState(81);
			declarations();
			setState(82);
			statements();
			setState(83);
			match(T__5);
			if (TRACEON) System.out.println("program: VOID MAIN () {declarations statements}");
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
		public TerminalNode Identifier() { return getToken(myparserParser.Identifier, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode CONST() { return getToken(myparserParser.CONST, 0); }
		public TerminalNode Integer_constant() { return getToken(myparserParser.Integer_constant, 0); }
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarations);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
			case CHAR:
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(86);
					match(CONST);
					}
				}

				setState(89);
				type();
				setState(90);
				match(Identifier);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(91);
					match(T__6);
					setState(92);
					match(Integer_constant);
					setState(93);
					match(T__7);
					}
				}

				setState(96);
				match(T__8);
				setState(97);
				declarations();
				 if (TRACEON) System.out.println("declarations: type Identifier ; declarations ('[' Integer_constant ']')?"); 
				}
				break;
			case T__5:
			case IF:
			case DO:
			case WHILE:
			case FOR:
			case PRINTF:
			case RETURN:
			case SWITCH:
			case BREAK:
			case CONTINUE:
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
		public TerminalNode INT() { return getToken(myparserParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(myparserParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(myparserParser.CHAR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(INT);
				 if (TRACEON) System.out.println("type: INT"); 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(FLOAT);
				if (TRACEON) System.out.println("type: FLOAT"); 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				match(CHAR);
				if (TRACEON) System.out.println("type: CHAR"); 
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
		enterRule(_localctx, 10, RULE_statements);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case DO:
			case WHILE:
			case FOR:
			case PRINTF:
			case RETURN:
			case SWITCH:
			case BREAK:
			case CONTINUE:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				statement();
				setState(112);
				statements();
				if (TRACEON) System.out.println("statements: statement statements");
				}
				break;
			case T__5:
			case CASE:
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				if (TRACEON) System.out.println("statements: ");
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
		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}
		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class,i);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expression; }
	}

	public final Arith_expressionContext arith_expression() throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arith_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			addExpr();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
				{
				setState(119);
				comp();
				setState(120);
				addExpr();
				}
			}

			if (TRACEON) System.out.println("arith_expression: addExpr comp addExpr");
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

	public static class CompContext extends ParserRuleContext {
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comp);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(T__9);
				if (TRACEON) System.out.println("comp: >");
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(T__10);
				if (TRACEON) System.out.println("comp: <");
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(T__11);
				if (TRACEON) System.out.println("comp: ==");
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(T__12);
				if (TRACEON) System.out.println("comp: !=");
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				match(T__13);
				if (TRACEON) System.out.println("comp: <=");
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				match(T__14);
				if (TRACEON) System.out.println("comp: >=");
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

	public static class AddExprContext extends ParserRuleContext {
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_addExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			multExpr();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15 || _la==T__16) {
				{
				setState(145);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__15:
					{
					setState(141);
					match(T__15);
					setState(142);
					multExpr();
					}
					break;
				case T__16:
					{
					setState(143);
					match(T__16);
					setState(144);
					multExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			if (TRACEON) System.out.println("addExpr: multExpr( '+' multExpr| '-' multExpr)*");
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
		enterRule(_localctx, 18, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			signExpr();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) {
				{
				setState(159);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__17:
					{
					setState(153);
					match(T__17);
					setState(154);
					signExpr();
					}
					break;
				case T__18:
					{
					setState(155);
					match(T__18);
					setState(156);
					signExpr();
					}
					break;
				case T__19:
					{
					setState(157);
					match(T__19);
					setState(158);
					signExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			if (TRACEON) System.out.println("multExpr: signExpr( '*' signExpr| '/' signExpr)*");
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
		enterRule(_localctx, 20, RULE_signExpr);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case CHARACTER:
			case Identifier:
			case Integer_constant:
			case Floating_point_constant:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				primaryExpr();
				if(TRACEON) System.out.println("signExpr: primaryExpr");
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(T__16);
				setState(170);
				primaryExpr();
				if(TRACEON) System.out.println("signExpr: -primaryExpr");
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
		public TerminalNode Integer_constant() { return getToken(myparserParser.Integer_constant, 0); }
		public TerminalNode Floating_point_constant() { return getToken(myparserParser.Floating_point_constant, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode CHARACTER() { return getToken(myparserParser.CHARACTER, 0); }
		public TerminalNode STRING() { return getToken(myparserParser.STRING, 0); }
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
		enterRule(_localctx, 22, RULE_primaryExpr);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(Integer_constant);
				if(TRACEON) System.out.println("primaryExpr: Integer_constant");
				}
				break;
			case Floating_point_constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(Floating_point_constant);
				if(TRACEON) System.out.println("primaryExpr: Floating_point_constant");
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				variable();
				if(TRACEON) System.out.println("primaryExpr: variable");
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(CHARACTER);
				if(TRACEON) System.out.println("primaryExpr: CHARACTER");
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				match(STRING);
				if(TRACEON)System.out.println("primaryExpr: STRING");
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 6);
				{
				setState(186);
				match(T__1);
				setState(187);
				arith_expression();
				setState(188);
				match(T__3);
				if(TRACEON) System.out.println("primaryExpr: (arith_expression)");
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
		}
		public TerminalNode IF() { return getToken(myparserParser.IF, 0); }
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public If_then_statementsContext if_then_statements() {
			return getRuleContext(If_then_statementsContext.class,0);
		}
		public Else_statementsContext else_statements() {
			return getRuleContext(Else_statementsContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(myparserParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(myparserParser.DO, 0); }
		public TerminalNode FOR() { return getToken(myparserParser.FOR, 0); }
		public TerminalNode PRINTF() { return getToken(myparserParser.PRINTF, 0); }
		public TerminalNode STRING() { return getToken(myparserParser.STRING, 0); }
		public TerminalNode RETURN() { return getToken(myparserParser.RETURN, 0); }
		public TerminalNode SWITCH() { return getToken(myparserParser.SWITCH, 0); }
		public Switch_statementsContext switch_statements() {
			return getRuleContext(Switch_statementsContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(myparserParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(myparserParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		int _la;
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				variable();
				setState(194);
				assign_statement();
				setState(195);
				match(T__8);
				if(TRACEON) System.out.println("statement: variable assign_statement;");
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(IF);
				setState(199);
				match(T__1);
				setState(200);
				arith_expression();
				setState(201);
				match(T__3);
				setState(202);
				if_then_statements();
				setState(203);
				else_statements();
				if(TRACEON) System.out.println("statement: IF '(' arith_expression ')' if_then_statements else_statements");
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(WHILE);
				setState(207);
				match(T__1);
				setState(208);
				arith_expression();
				setState(209);
				match(T__3);
				setState(210);
				if_then_statements();
				if(TRACEON) System.out.println("statement: WHILE '(' arith_expression ')' if_then_statements");
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				match(DO);
				setState(214);
				if_then_statements();
				setState(215);
				match(WHILE);
				setState(216);
				match(T__1);
				setState(217);
				arith_expression();
				setState(218);
				match(T__3);
				if(TRACEON) System.out.println("statement: DO if_then_statements WHILE ( arith_expression )");
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				match(FOR);
				setState(222);
				match(T__1);
				setState(223);
				variable();
				setState(224);
				match(T__20);
				setState(225);
				arith_expression();
				setState(226);
				match(T__8);
				setState(227);
				arith_expression();
				setState(228);
				match(T__8);
				setState(229);
				variable();
				setState(230);
				assign_statement();
				setState(231);
				match(T__3);
				setState(232);
				if_then_statements();
				if(TRACEON) System.out.println("statement: FOR(variable = arith_expression ; arith_expression ; variable = arith_expression ) if_then_statements");
				}
				break;
			case PRINTF:
				enterOuterAlt(_localctx, 6);
				{
				setState(235);
				match(PRINTF);
				setState(236);
				match(T__1);
				setState(237);
				match(STRING);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(238);
					match(T__2);
					setState(239);
					arith_expression();
					}
					}
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(245);
				match(T__3);
				setState(246);
				match(T__8);
				if(TRACEON) System.out.println("statement: PRINTF ( STRING (, arith_expression)* );");
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(248);
				match(RETURN);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__16) | (1L << CHARACTER) | (1L << Identifier) | (1L << Integer_constant) | (1L << Floating_point_constant) | (1L << STRING))) != 0)) {
					{
					setState(249);
					arith_expression();
					}
				}

				setState(252);
				match(T__8);
				if(TRACEON) System.out.println("statement: return ;");
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 8);
				{
				setState(254);
				match(SWITCH);
				setState(255);
				match(T__1);
				setState(256);
				arith_expression();
				setState(257);
				match(T__3);
				setState(258);
				match(T__4);
				setState(259);
				switch_statements();
				setState(260);
				match(T__5);
				if(TRACEON) System.out.println("statement: SWITCH(arith_expression){switch_statements}");
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 9);
				{
				setState(263);
				match(BREAK);
				setState(264);
				match(T__8);
				if(TRACEON) System.out.println("statement: break;");
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 10);
				{
				setState(266);
				match(CONTINUE);
				setState(267);
				match(T__8);
				if(TRACEON) System.out.println("statement: continue;");
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(myparserParser.Identifier, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Integer_constant() { return getToken(myparserParser.Integer_constant, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(Identifier);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(272);
				match(T__6);
				setState(275);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(273);
					variable();
					}
					break;
				case Integer_constant:
					{
					setState(274);
					match(Integer_constant);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(277);
				match(T__7);
				}
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

	public static class Assign_statementContext extends ParserRuleContext {
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assign_statement);
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(T__20);
				setState(281);
				arith_expression();
				if(TRACEON) System.out.println("assign_statement: '=' arith_expression");
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(T__21);
				setState(285);
				arith_expression();
				if(TRACEON) System.out.println("assign_statement: '+=' arith_expression");
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				match(T__22);
				setState(289);
				arith_expression();
				if(TRACEON) System.out.println("assign_statement: '-=' arith_expression");
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				match(T__23);
				setState(293);
				arith_expression();
				if(TRACEON) System.out.println("assign_statement: '*=' arith_expression");
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				match(T__24);
				setState(297);
				arith_expression();
				if(TRACEON) System.out.println("assign_statement: '/=' arith_expression");
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 6);
				{
				setState(300);
				match(T__25);
				setState(301);
				arith_expression();
				if(TRACEON) System.out.println("assign_statement: '%=' arith_expression");
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 7);
				{
				setState(304);
				match(T__26);
				if(TRACEON) System.out.println("assign_statement: ++");
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 8);
				{
				setState(306);
				match(T__27);
				if(TRACEON) System.out.println("assign_statement: --");
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
		enterRule(_localctx, 30, RULE_if_then_statements);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case DO:
			case WHILE:
			case FOR:
			case PRINTF:
			case RETURN:
			case SWITCH:
			case BREAK:
			case CONTINUE:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				statement();
				if(TRACEON) System.out.println("if_then_statements: statement");
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(T__4);
				setState(314);
				statements();
				setState(315);
				match(T__5);
				if(TRACEON) System.out.println("if_then_statements: {statements}");
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

	public static class Else_statementsContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(myparserParser.ELSE, 0); }
		public If_then_statementsContext if_then_statements() {
			return getRuleContext(If_then_statementsContext.class,0);
		}
		public Else_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statements; }
	}

	public final Else_statementsContext else_statements() throws RecognitionException {
		Else_statementsContext _localctx = new Else_statementsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_else_statements);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(ELSE);
				setState(321);
				if_then_statements();
				if(TRACEON) System.out.println("else_statements: ELSE if_then_statements");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				if (TRACEON) System.out.println("else_statements: ");
				}
				break;
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

	public static class Switch_statementsContext extends ParserRuleContext {
		public Switch_statementsContext switch_statements() {
			return getRuleContext(Switch_statementsContext.class,0);
		}
		public TerminalNode CASE() { return getToken(myparserParser.CASE, 0); }
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public TerminalNode Integer_constant() { return getToken(myparserParser.Integer_constant, 0); }
		public TerminalNode Floating_point_constant() { return getToken(myparserParser.Floating_point_constant, 0); }
		public TerminalNode DEFAULT() { return getToken(myparserParser.DEFAULT, 0); }
		public Switch_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statements; }
	}

	public final Switch_statementsContext switch_statements() throws RecognitionException {
		Switch_statementsContext _localctx = new Switch_statementsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_switch_statements);
		int _la;
		try {
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(327);
				match(CASE);
				setState(328);
				_la = _input.LA(1);
				if ( !(_la==Integer_constant || _la==Floating_point_constant) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(329);
				match(T__28);
				setState(330);
				switch_statement();
				}
				setState(332);
				switch_statements();
				if(TRACEON) System.out.println("switch_statements: (CASE (Integer_constant|Floating_point_constant):switch_statement) switch_statements");
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(DEFAULT);
				setState(336);
				match(T__28);
				setState(337);
				switch_statement();
				setState(338);
				switch_statements();
				if(TRACEON) System.out.println("switch_statements: DEFAULT : switch_statement switch_statements");
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
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

	public static class Switch_statementContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_switch_statement);
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				statements();
				if(TRACEON) System.out.println("switch_statement: statements");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				if(TRACEON) System.out.println("switch_statement: ");
				}
				break;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0161\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\60\n\2\f\2\16\2\63"+
		"\13\2\3\2\3\2\3\2\5\28\n\2\3\3\3\3\5\3<\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\5\5Z\n\5\3\5\3\5\3\5\3\5\3\5\5\5a\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5h\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6p\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\5\7w\n\7\3\b\3\b\3\b\3\b\5\b}\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u008d\n\t\3\n\3\n\3\n\3\n\3\n\7\n\u0094\n\n\f"+
		"\n\16\n\u0097\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a2"+
		"\n\13\f\13\16\13\u00a5\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u00b0\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u00c2\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00f3\n\16\f\16\16\16"+
		"\u00f6\13\16\3\16\3\16\3\16\3\16\3\16\5\16\u00fd\n\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u0110\n\16\3\17\3\17\3\17\3\17\5\17\u0116\n\17\3\17\5\17\u0119\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0137\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0141\n"+
		"\21\3\22\3\22\3\22\3\22\3\22\5\22\u0148\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0159\n\23\3\24"+
		"\3\24\3\24\3\24\5\24\u015f\n\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&\2\3\3\2\66\67\2\u0181\2\67\3\2\2\2\4;\3\2\2\2\6N\3\2"+
		"\2\2\bg\3\2\2\2\no\3\2\2\2\fv\3\2\2\2\16x\3\2\2\2\20\u008c\3\2\2\2\22"+
		"\u008e\3\2\2\2\24\u009a\3\2\2\2\26\u00af\3\2\2\2\30\u00c1\3\2\2\2\32\u010f"+
		"\3\2\2\2\34\u0111\3\2\2\2\36\u0136\3\2\2\2 \u0140\3\2\2\2\"\u0147\3\2"+
		"\2\2$\u0158\3\2\2\2&\u015e\3\2\2\2()\7\3\2\2)*\7\61\2\2*+\7\63\2\2+,\5"+
		"\2\2\2,-\b\2\1\2-8\3\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2"+
		"\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\5\6\4\2\65\66\b\2"+
		"\1\2\668\3\2\2\2\67(\3\2\2\2\67\61\3\2\2\28\3\3\2\2\29<\7$\2\2:<\5\n\6"+
		"\2;9\3\2\2\2;:\3\2\2\2<=\3\2\2\2=>\7\65\2\2>?\7\4\2\2?@\5\n\6\2@G\7\65"+
		"\2\2AB\7\5\2\2BC\5\n\6\2CD\7\65\2\2DF\3\2\2\2EA\3\2\2\2FI\3\2\2\2GE\3"+
		"\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\6\2\2KL\5 \21\2LM\b\3\1\2M\5"+
		"\3\2\2\2NO\7$\2\2OP\7#\2\2PQ\7\4\2\2QR\7\6\2\2RS\7\7\2\2ST\5\b\5\2TU\5"+
		"\f\7\2UV\7\b\2\2VW\b\4\1\2W\7\3\2\2\2XZ\7\62\2\2YX\3\2\2\2YZ\3\2\2\2Z"+
		"[\3\2\2\2[\\\5\n\6\2\\`\7\65\2\2]^\7\t\2\2^_\7\66\2\2_a\7\n\2\2`]\3\2"+
		"\2\2`a\3\2\2\2ab\3\2\2\2bc\7\13\2\2cd\5\b\5\2de\b\5\1\2eh\3\2\2\2fh\b"+
		"\5\1\2gY\3\2\2\2gf\3\2\2\2h\t\3\2\2\2ij\7!\2\2jp\b\6\1\2kl\7 \2\2lp\b"+
		"\6\1\2mn\7\"\2\2np\b\6\1\2oi\3\2\2\2ok\3\2\2\2om\3\2\2\2p\13\3\2\2\2q"+
		"r\5\32\16\2rs\5\f\7\2st\b\7\1\2tw\3\2\2\2uw\b\7\1\2vq\3\2\2\2vu\3\2\2"+
		"\2w\r\3\2\2\2x|\5\22\n\2yz\5\20\t\2z{\5\22\n\2{}\3\2\2\2|y\3\2\2\2|}\3"+
		"\2\2\2}~\3\2\2\2~\177\b\b\1\2\177\17\3\2\2\2\u0080\u0081\7\f\2\2\u0081"+
		"\u008d\b\t\1\2\u0082\u0083\7\r\2\2\u0083\u008d\b\t\1\2\u0084\u0085\7\16"+
		"\2\2\u0085\u008d\b\t\1\2\u0086\u0087\7\17\2\2\u0087\u008d\b\t\1\2\u0088"+
		"\u0089\7\20\2\2\u0089\u008d\b\t\1\2\u008a\u008b\7\21\2\2\u008b\u008d\b"+
		"\t\1\2\u008c\u0080\3\2\2\2\u008c\u0082\3\2\2\2\u008c\u0084\3\2\2\2\u008c"+
		"\u0086\3\2\2\2\u008c\u0088\3\2\2\2\u008c\u008a\3\2\2\2\u008d\21\3\2\2"+
		"\2\u008e\u0095\5\24\13\2\u008f\u0090\7\22\2\2\u0090\u0094\5\24\13\2\u0091"+
		"\u0092\7\23\2\2\u0092\u0094\5\24\13\2\u0093\u008f\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\b\n\1\2\u0099\23\3\2\2"+
		"\2\u009a\u00a3\5\26\f\2\u009b\u009c\7\24\2\2\u009c\u00a2\5\26\f\2\u009d"+
		"\u009e\7\25\2\2\u009e\u00a2\5\26\f\2\u009f\u00a0\7\26\2\2\u00a0\u00a2"+
		"\5\26\f\2\u00a1\u009b\3\2\2\2\u00a1\u009d\3\2\2\2\u00a1\u009f\3\2\2\2"+
		"\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\b\13\1\2\u00a7\25\3\2\2\2\u00a8"+
		"\u00a9\5\30\r\2\u00a9\u00aa\b\f\1\2\u00aa\u00b0\3\2\2\2\u00ab\u00ac\7"+
		"\23\2\2\u00ac\u00ad\5\30\r\2\u00ad\u00ae\b\f\1\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00a8\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0\27\3\2\2\2\u00b1\u00b2\7\66\2"+
		"\2\u00b2\u00c2\b\r\1\2\u00b3\u00b4\7\67\2\2\u00b4\u00c2\b\r\1\2\u00b5"+
		"\u00b6\5\34\17\2\u00b6\u00b7\b\r\1\2\u00b7\u00c2\3\2\2\2\u00b8\u00b9\7"+
		"\64\2\2\u00b9\u00c2\b\r\1\2\u00ba\u00bb\78\2\2\u00bb\u00c2\b\r\1\2\u00bc"+
		"\u00bd\7\4\2\2\u00bd\u00be\5\16\b\2\u00be\u00bf\7\6\2\2\u00bf\u00c0\b"+
		"\r\1\2\u00c0\u00c2\3\2\2\2\u00c1\u00b1\3\2\2\2\u00c1\u00b3\3\2\2\2\u00c1"+
		"\u00b5\3\2\2\2\u00c1\u00b8\3\2\2\2\u00c1\u00ba\3\2\2\2\u00c1\u00bc\3\2"+
		"\2\2\u00c2\31\3\2\2\2\u00c3\u00c4\5\34\17\2\u00c4\u00c5\5\36\20\2\u00c5"+
		"\u00c6\7\13\2\2\u00c6\u00c7\b\16\1\2\u00c7\u0110\3\2\2\2\u00c8\u00c9\7"+
		"%\2\2\u00c9\u00ca\7\4\2\2\u00ca\u00cb\5\16\b\2\u00cb\u00cc\7\6\2\2\u00cc"+
		"\u00cd\5 \21\2\u00cd\u00ce\5\"\22\2\u00ce\u00cf\b\16\1\2\u00cf\u0110\3"+
		"\2\2\2\u00d0\u00d1\7(\2\2\u00d1\u00d2\7\4\2\2\u00d2\u00d3\5\16\b\2\u00d3"+
		"\u00d4\7\6\2\2\u00d4\u00d5\5 \21\2\u00d5\u00d6\b\16\1\2\u00d6\u0110\3"+
		"\2\2\2\u00d7\u00d8\7\'\2\2\u00d8\u00d9\5 \21\2\u00d9\u00da\7(\2\2\u00da"+
		"\u00db\7\4\2\2\u00db\u00dc\5\16\b\2\u00dc\u00dd\7\6\2\2\u00dd\u00de\b"+
		"\16\1\2\u00de\u0110\3\2\2\2\u00df\u00e0\7)\2\2\u00e0\u00e1\7\4\2\2\u00e1"+
		"\u00e2\5\34\17\2\u00e2\u00e3\7\27\2\2\u00e3\u00e4\5\16\b\2\u00e4\u00e5"+
		"\7\13\2\2\u00e5\u00e6\5\16\b\2\u00e6\u00e7\7\13\2\2\u00e7\u00e8\5\34\17"+
		"\2\u00e8\u00e9\5\36\20\2\u00e9\u00ea\7\6\2\2\u00ea\u00eb\5 \21\2\u00eb"+
		"\u00ec\b\16\1\2\u00ec\u0110\3\2\2\2\u00ed\u00ee\7*\2\2\u00ee\u00ef\7\4"+
		"\2\2\u00ef\u00f4\78\2\2\u00f0\u00f1\7\5\2\2\u00f1\u00f3\5\16\b\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7\6\2\2\u00f8"+
		"\u00f9\7\13\2\2\u00f9\u0110\b\16\1\2\u00fa\u00fc\7+\2\2\u00fb\u00fd\5"+
		"\16\b\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00ff\7\13\2\2\u00ff\u0110\b\16\1\2\u0100\u0101\7,\2\2\u0101\u0102\7"+
		"\4\2\2\u0102\u0103\5\16\b\2\u0103\u0104\7\6\2\2\u0104\u0105\7\7\2\2\u0105"+
		"\u0106\5$\23\2\u0106\u0107\7\b\2\2\u0107\u0108\b\16\1\2\u0108\u0110\3"+
		"\2\2\2\u0109\u010a\7/\2\2\u010a\u010b\7\13\2\2\u010b\u0110\b\16\1\2\u010c"+
		"\u010d\7\60\2\2\u010d\u010e\7\13\2\2\u010e\u0110\b\16\1\2\u010f\u00c3"+
		"\3\2\2\2\u010f\u00c8\3\2\2\2\u010f\u00d0\3\2\2\2\u010f\u00d7\3\2\2\2\u010f"+
		"\u00df\3\2\2\2\u010f\u00ed\3\2\2\2\u010f\u00fa\3\2\2\2\u010f\u0100\3\2"+
		"\2\2\u010f\u0109\3\2\2\2\u010f\u010c\3\2\2\2\u0110\33\3\2\2\2\u0111\u0118"+
		"\7\65\2\2\u0112\u0115\7\t\2\2\u0113\u0116\5\34\17\2\u0114\u0116\7\66\2"+
		"\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119"+
		"\7\n\2\2\u0118\u0112\3\2\2\2\u0118\u0119\3\2\2\2\u0119\35\3\2\2\2\u011a"+
		"\u011b\7\27\2\2\u011b\u011c\5\16\b\2\u011c\u011d\b\20\1\2\u011d\u0137"+
		"\3\2\2\2\u011e\u011f\7\30\2\2\u011f\u0120\5\16\b\2\u0120\u0121\b\20\1"+
		"\2\u0121\u0137\3\2\2\2\u0122\u0123\7\31\2\2\u0123\u0124\5\16\b\2\u0124"+
		"\u0125\b\20\1\2\u0125\u0137\3\2\2\2\u0126\u0127\7\32\2\2\u0127\u0128\5"+
		"\16\b\2\u0128\u0129\b\20\1\2\u0129\u0137\3\2\2\2\u012a\u012b\7\33\2\2"+
		"\u012b\u012c\5\16\b\2\u012c\u012d\b\20\1\2\u012d\u0137\3\2\2\2\u012e\u012f"+
		"\7\34\2\2\u012f\u0130\5\16\b\2\u0130\u0131\b\20\1\2\u0131\u0137\3\2\2"+
		"\2\u0132\u0133\7\35\2\2\u0133\u0137\b\20\1\2\u0134\u0135\7\36\2\2\u0135"+
		"\u0137\b\20\1\2\u0136\u011a\3\2\2\2\u0136\u011e\3\2\2\2\u0136\u0122\3"+
		"\2\2\2\u0136\u0126\3\2\2\2\u0136\u012a\3\2\2\2\u0136\u012e\3\2\2\2\u0136"+
		"\u0132\3\2\2\2\u0136\u0134\3\2\2\2\u0137\37\3\2\2\2\u0138\u0139\5\32\16"+
		"\2\u0139\u013a\b\21\1\2\u013a\u0141\3\2\2\2\u013b\u013c\7\7\2\2\u013c"+
		"\u013d\5\f\7\2\u013d\u013e\7\b\2\2\u013e\u013f\b\21\1\2\u013f\u0141\3"+
		"\2\2\2\u0140\u0138\3\2\2\2\u0140\u013b\3\2\2\2\u0141!\3\2\2\2\u0142\u0143"+
		"\7&\2\2\u0143\u0144\5 \21\2\u0144\u0145\b\22\1\2\u0145\u0148\3\2\2\2\u0146"+
		"\u0148\b\22\1\2\u0147\u0142\3\2\2\2\u0147\u0146\3\2\2\2\u0148#\3\2\2\2"+
		"\u0149\u014a\7-\2\2\u014a\u014b\t\2\2\2\u014b\u014c\7\37\2\2\u014c\u014d"+
		"\5&\24\2\u014d\u014e\3\2\2\2\u014e\u014f\5$\23\2\u014f\u0150\b\23\1\2"+
		"\u0150\u0159\3\2\2\2\u0151\u0152\7.\2\2\u0152\u0153\7\37\2\2\u0153\u0154"+
		"\5&\24\2\u0154\u0155\5$\23\2\u0155\u0156\b\23\1\2\u0156\u0159\3\2\2\2"+
		"\u0157\u0159\3\2\2\2\u0158\u0149\3\2\2\2\u0158\u0151\3\2\2\2\u0158\u0157"+
		"\3\2\2\2\u0159%\3\2\2\2\u015a\u015b\5\f\7\2\u015b\u015c\b\24\1\2\u015c"+
		"\u015f\3\2\2\2\u015d\u015f\b\24\1\2\u015e\u015a\3\2\2\2\u015e\u015d\3"+
		"\2\2\2\u015f\'\3\2\2\2\35\61\67;GY`gov|\u008c\u0093\u0095\u00a1\u00a3"+
		"\u00af\u00c1\u00f4\u00fc\u010f\u0115\u0118\u0136\u0140\u0147\u0158\u015e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}