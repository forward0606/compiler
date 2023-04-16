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
		T__17=18, T__18=19, T__19=20, FLOAT=21, INT=22, CHAR=23, MAIN=24, VOID=25, 
		IF=26, ELSE=27, DO=28, WHILE=29, FOR=30, PRINTF=31, RETURN=32, SWITCH=33, 
		CASE=34, DEFAULT=35, BREAK=36, CONTINUE=37, INCLUDE=38, CONST=39, STD_LIB=40, 
		CHARACTER=41, Identifier=42, Integer_constant=43, Floating_point_constant=44, 
		STRING=45, WS=46, COMMENT=47;
	public static final int
		RULE_headers = 0, RULE_function = 1, RULE_program = 2, RULE_declarations = 3, 
		RULE_type = 4, RULE_statements = 5, RULE_arith_expression = 6, RULE_comp = 7, 
		RULE_addExpr = 8, RULE_multExpr = 9, RULE_signExpr = 10, RULE_primaryExpr = 11, 
		RULE_statement = 12, RULE_if_then_statements = 13, RULE_else_statements = 14, 
		RULE_switch_statements = 15, RULE_switch_statement = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"headers", "function", "program", "declarations", "type", "statements", 
			"arith_expression", "comp", "addExpr", "multExpr", "signExpr", "primaryExpr", 
			"statement", "if_then_statements", "else_statements", "switch_statements", 
			"switch_statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "'('", "','", "')'", "'{'", "'}'", "';'", "'>'", "'<'", 
			"'=='", "'!='", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", 
			"':'", "'float'", "'int'", "'char'", "'main'", "'void'", "'if'", "'else'", 
			"'do'", "'while'", "'for'", "'printf'", "'return'", "'switch'", "'case'", 
			"'default'", "'break'", "'continue'", "'include'", "'const'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "FLOAT", "INT", 
			"CHAR", "MAIN", "VOID", "IF", "ELSE", "DO", "WHILE", "FOR", "PRINTF", 
			"RETURN", "SWITCH", "CASE", "DEFAULT", "BREAK", "CONTINUE", "INCLUDE", 
			"CONST", "STD_LIB", "CHARACTER", "Identifier", "Integer_constant", "Floating_point_constant", 
			"STRING", "WS", "COMMENT"
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
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(T__0);
				setState(35);
				match(INCLUDE);
				setState(36);
				match(STD_LIB);
				setState(37);
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
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(40);
						function();
						}
						} 
					}
					setState(45);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(46);
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
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(51);
				match(VOID);
				}
				break;
			case FLOAT:
			case INT:
			case CHAR:
				{
				setState(52);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(55);
			match(Identifier);
			setState(56);
			match(T__1);
			setState(57);
			type();
			setState(58);
			match(Identifier);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(59);
				match(T__2);
				setState(60);
				type();
				setState(61);
				match(Identifier);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(T__3);
			setState(69);
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
			setState(72);
			match(VOID);
			setState(73);
			match(MAIN);
			setState(74);
			match(T__1);
			setState(75);
			match(T__3);
			setState(76);
			match(T__4);
			setState(77);
			declarations();
			setState(78);
			statements();
			setState(79);
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
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
			case CHAR:
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(82);
					match(CONST);
					}
				}

				setState(85);
				type();
				setState(86);
				match(Identifier);
				setState(87);
				match(T__6);
				setState(88);
				declarations();
				 if (TRACEON) System.out.println("declarations: type Identifier ; declarations"); 
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
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(INT);
				 if (TRACEON) System.out.println("type: INT"); 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(FLOAT);
				if (TRACEON) System.out.println("type: FLOAT"); 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
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
			setState(107);
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
				setState(102);
				statement();
				setState(103);
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
			setState(109);
			addExpr();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
				{
				setState(110);
				comp();
				setState(111);
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
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(T__7);
				if (TRACEON) System.out.println("comp: >");
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(T__8);
				if (TRACEON) System.out.println("comp: <");
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(T__9);
				if (TRACEON) System.out.println("comp: ==");
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(T__10);
				if (TRACEON) System.out.println("comp: !=");
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				match(T__11);
				if (TRACEON) System.out.println("comp: <=");
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(127);
				match(T__12);
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
			setState(131);
			multExpr();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==T__14) {
				{
				setState(136);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__13:
					{
					setState(132);
					match(T__13);
					setState(133);
					multExpr();
					}
					break;
				case T__14:
					{
					setState(134);
					match(T__14);
					setState(135);
					multExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(140);
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
			setState(143);
			signExpr();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				setState(150);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__15:
					{
					setState(144);
					match(T__15);
					setState(145);
					signExpr();
					}
					break;
				case T__16:
					{
					setState(146);
					match(T__16);
					setState(147);
					signExpr();
					}
					break;
				case T__17:
					{
					setState(148);
					match(T__17);
					setState(149);
					signExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(154);
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
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case CHARACTER:
			case Identifier:
			case Integer_constant:
			case Floating_point_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				primaryExpr();
				if(TRACEON) System.out.println("signExpr: primaryExpr");
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(T__14);
				setState(161);
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
		public TerminalNode Identifier() { return getToken(myparserParser.Identifier, 0); }
		public TerminalNode CHARACTER() { return getToken(myparserParser.CHARACTER, 0); }
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
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(Integer_constant);
				if(TRACEON) System.out.println("primaryExpr: Integer_constant");
				}
				break;
			case Floating_point_constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(Floating_point_constant);
				if(TRACEON) System.out.println("primaryExpr: Floating_point_constant");
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(Identifier);
				if(TRACEON) System.out.println("primaryExpr: Identifier");
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(CHARACTER);
				if(TRACEON) System.out.println("primaryExpr: CHARACTER");
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				match(T__1);
				setState(175);
				arith_expression();
				setState(176);
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
		public List<TerminalNode> Identifier() { return getTokens(myparserParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(myparserParser.Identifier, i);
		}
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public TerminalNode IF() { return getToken(myparserParser.IF, 0); }
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
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(Identifier);
				setState(182);
				match(T__18);
				setState(183);
				arith_expression();
				setState(184);
				match(T__6);
				if(TRACEON) System.out.println("statement: Identifier = arith_expression ;");
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(IF);
				setState(188);
				match(T__1);
				setState(189);
				arith_expression();
				setState(190);
				match(T__3);
				setState(191);
				if_then_statements();
				setState(192);
				else_statements();
				if(TRACEON) System.out.println("statement: IF '(' arith_expression ')' if_then_statements else_statements");
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(WHILE);
				setState(196);
				match(T__1);
				setState(197);
				arith_expression();
				setState(198);
				match(T__3);
				setState(199);
				if_then_statements();
				if(TRACEON) System.out.println("statement: WHILE '(' arith_expression ')' if_then_statements");
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				match(DO);
				setState(203);
				if_then_statements();
				setState(204);
				match(WHILE);
				setState(205);
				match(T__1);
				setState(206);
				arith_expression();
				setState(207);
				match(T__3);
				if(TRACEON) System.out.println("statement: DO if_then_statements WHILE ( arith_expression )");
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(210);
				match(FOR);
				setState(211);
				match(T__1);
				setState(212);
				match(Identifier);
				setState(213);
				match(T__18);
				setState(214);
				arith_expression();
				setState(215);
				match(T__6);
				setState(216);
				arith_expression();
				setState(217);
				match(T__6);
				setState(218);
				match(Identifier);
				setState(219);
				match(T__18);
				setState(220);
				arith_expression();
				setState(221);
				match(T__3);
				setState(222);
				if_then_statements();
				if(TRACEON) System.out.println("statement: FOR(Identifier = arith_expression ; arith_expression ; Identifier = arith_expression ) if_then_statements");
				}
				break;
			case PRINTF:
				enterOuterAlt(_localctx, 6);
				{
				setState(225);
				match(PRINTF);
				setState(226);
				match(T__1);
				setState(227);
				match(STRING);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(228);
					match(T__2);
					setState(229);
					arith_expression();
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(235);
				match(T__3);
				setState(236);
				match(T__6);
				if(TRACEON) System.out.println("statement: PRINTF ( STRING (, arith_expression)* );");
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(238);
				match(RETURN);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << CHARACTER) | (1L << Identifier) | (1L << Integer_constant) | (1L << Floating_point_constant))) != 0)) {
					{
					setState(239);
					arith_expression();
					}
				}

				setState(242);
				match(T__6);
				if(TRACEON) System.out.println("statement: return ;");
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 8);
				{
				setState(244);
				match(SWITCH);
				setState(245);
				match(T__1);
				setState(246);
				arith_expression();
				setState(247);
				match(T__3);
				setState(248);
				match(T__4);
				setState(249);
				switch_statements();
				setState(250);
				match(T__5);
				if(TRACEON) System.out.println("statement: SWITCH(arith_expression){switch_statements}");
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 9);
				{
				setState(253);
				match(BREAK);
				setState(254);
				match(T__6);
				if(TRACEON) System.out.println("statement: break;");
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 10);
				{
				setState(256);
				match(CONTINUE);
				setState(257);
				match(T__6);
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
		enterRule(_localctx, 26, RULE_if_then_statements);
		try {
			setState(269);
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
				setState(261);
				statement();
				if(TRACEON) System.out.println("if_then_statements: statement");
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(T__4);
				setState(265);
				statements();
				setState(266);
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
		enterRule(_localctx, 28, RULE_else_statements);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(ELSE);
				setState(272);
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
		enterRule(_localctx, 30, RULE_switch_statements);
		int _la;
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(278);
				match(CASE);
				setState(279);
				_la = _input.LA(1);
				if ( !(_la==Integer_constant || _la==Floating_point_constant) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(280);
				match(T__19);
				setState(281);
				switch_statement();
				}
				setState(283);
				switch_statements();
				if(TRACEON) System.out.println("switch_statements: (CASE (Integer_constant|Floating_point_constant):switch_statement) switch_statements");
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(DEFAULT);
				setState(287);
				match(T__19);
				setState(288);
				switch_statement();
				setState(289);
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
		enterRule(_localctx, 32, RULE_switch_statement);
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0130\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\2\5\2\64"+
		"\n\2\3\3\3\3\5\38\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3B\n\3\f\3\16"+
		"\3E\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\5"+
		"\5V\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5_\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6g\n\6\3\7\3\7\3\7\3\7\3\7\5\7n\n\7\3\b\3\b\3\b\3\b\5\bt\n\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0084\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\7\n\u008b\n\n\f\n\16\n\u008e\13\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u0099\n\13\f\13\16\13\u009c\13\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a7\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b6\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\7\16\u00e9\n\16\f\16\16\16\u00ec\13\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00f3\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0106\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0110\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u0117\n"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u0128\n\21\3\22\3\22\3\22\3\22\5\22\u012e\n\22\3\22\2\2"+
		"\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\3\2-.\2\u0147\2\63\3"+
		"\2\2\2\4\67\3\2\2\2\6J\3\2\2\2\b^\3\2\2\2\nf\3\2\2\2\fm\3\2\2\2\16o\3"+
		"\2\2\2\20\u0083\3\2\2\2\22\u0085\3\2\2\2\24\u0091\3\2\2\2\26\u00a6\3\2"+
		"\2\2\30\u00b5\3\2\2\2\32\u0105\3\2\2\2\34\u010f\3\2\2\2\36\u0116\3\2\2"+
		"\2 \u0127\3\2\2\2\"\u012d\3\2\2\2$%\7\3\2\2%&\7(\2\2&\'\7*\2\2\'(\5\2"+
		"\2\2()\b\2\1\2)\64\3\2\2\2*,\5\4\3\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3"+
		"\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\5\6\4\2\61\62\b\2\1\2\62\64\3\2\2\2"+
		"\63$\3\2\2\2\63-\3\2\2\2\64\3\3\2\2\2\658\7\33\2\2\668\5\n\6\2\67\65\3"+
		"\2\2\2\67\66\3\2\2\289\3\2\2\29:\7,\2\2:;\7\4\2\2;<\5\n\6\2<C\7,\2\2="+
		">\7\5\2\2>?\5\n\6\2?@\7,\2\2@B\3\2\2\2A=\3\2\2\2BE\3\2\2\2CA\3\2\2\2C"+
		"D\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\6\2\2GH\5\34\17\2HI\b\3\1\2I\5\3\2\2"+
		"\2JK\7\33\2\2KL\7\32\2\2LM\7\4\2\2MN\7\6\2\2NO\7\7\2\2OP\5\b\5\2PQ\5\f"+
		"\7\2QR\7\b\2\2RS\b\4\1\2S\7\3\2\2\2TV\7)\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2"+
		"\2\2WX\5\n\6\2XY\7,\2\2YZ\7\t\2\2Z[\5\b\5\2[\\\b\5\1\2\\_\3\2\2\2]_\b"+
		"\5\1\2^U\3\2\2\2^]\3\2\2\2_\t\3\2\2\2`a\7\30\2\2ag\b\6\1\2bc\7\27\2\2"+
		"cg\b\6\1\2de\7\31\2\2eg\b\6\1\2f`\3\2\2\2fb\3\2\2\2fd\3\2\2\2g\13\3\2"+
		"\2\2hi\5\32\16\2ij\5\f\7\2jk\b\7\1\2kn\3\2\2\2ln\b\7\1\2mh\3\2\2\2ml\3"+
		"\2\2\2n\r\3\2\2\2os\5\22\n\2pq\5\20\t\2qr\5\22\n\2rt\3\2\2\2sp\3\2\2\2"+
		"st\3\2\2\2tu\3\2\2\2uv\b\b\1\2v\17\3\2\2\2wx\7\n\2\2x\u0084\b\t\1\2yz"+
		"\7\13\2\2z\u0084\b\t\1\2{|\7\f\2\2|\u0084\b\t\1\2}~\7\r\2\2~\u0084\b\t"+
		"\1\2\177\u0080\7\16\2\2\u0080\u0084\b\t\1\2\u0081\u0082\7\17\2\2\u0082"+
		"\u0084\b\t\1\2\u0083w\3\2\2\2\u0083y\3\2\2\2\u0083{\3\2\2\2\u0083}\3\2"+
		"\2\2\u0083\177\3\2\2\2\u0083\u0081\3\2\2\2\u0084\21\3\2\2\2\u0085\u008c"+
		"\5\24\13\2\u0086\u0087\7\20\2\2\u0087\u008b\5\24\13\2\u0088\u0089\7\21"+
		"\2\2\u0089\u008b\5\24\13\2\u008a\u0086\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008f\u0090\b\n\1\2\u0090\23\3\2\2\2\u0091\u009a"+
		"\5\26\f\2\u0092\u0093\7\22\2\2\u0093\u0099\5\26\f\2\u0094\u0095\7\23\2"+
		"\2\u0095\u0099\5\26\f\2\u0096\u0097\7\24\2\2\u0097\u0099\5\26\f\2\u0098"+
		"\u0092\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009c\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009e\b\13\1\2\u009e\25\3\2\2\2\u009f\u00a0\5\30"+
		"\r\2\u00a0\u00a1\b\f\1\2\u00a1\u00a7\3\2\2\2\u00a2\u00a3\7\21\2\2\u00a3"+
		"\u00a4\5\30\r\2\u00a4\u00a5\b\f\1\2\u00a5\u00a7\3\2\2\2\u00a6\u009f\3"+
		"\2\2\2\u00a6\u00a2\3\2\2\2\u00a7\27\3\2\2\2\u00a8\u00a9\7-\2\2\u00a9\u00b6"+
		"\b\r\1\2\u00aa\u00ab\7.\2\2\u00ab\u00b6\b\r\1\2\u00ac\u00ad\7,\2\2\u00ad"+
		"\u00b6\b\r\1\2\u00ae\u00af\7+\2\2\u00af\u00b6\b\r\1\2\u00b0\u00b1\7\4"+
		"\2\2\u00b1\u00b2\5\16\b\2\u00b2\u00b3\7\6\2\2\u00b3\u00b4\b\r\1\2\u00b4"+
		"\u00b6\3\2\2\2\u00b5\u00a8\3\2\2\2\u00b5\u00aa\3\2\2\2\u00b5\u00ac\3\2"+
		"\2\2\u00b5\u00ae\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b6\31\3\2\2\2\u00b7\u00b8"+
		"\7,\2\2\u00b8\u00b9\7\25\2\2\u00b9\u00ba\5\16\b\2\u00ba\u00bb\7\t\2\2"+
		"\u00bb\u00bc\b\16\1\2\u00bc\u0106\3\2\2\2\u00bd\u00be\7\34\2\2\u00be\u00bf"+
		"\7\4\2\2\u00bf\u00c0\5\16\b\2\u00c0\u00c1\7\6\2\2\u00c1\u00c2\5\34\17"+
		"\2\u00c2\u00c3\5\36\20\2\u00c3\u00c4\b\16\1\2\u00c4\u0106\3\2\2\2\u00c5"+
		"\u00c6\7\37\2\2\u00c6\u00c7\7\4\2\2\u00c7\u00c8\5\16\b\2\u00c8\u00c9\7"+
		"\6\2\2\u00c9\u00ca\5\34\17\2\u00ca\u00cb\b\16\1\2\u00cb\u0106\3\2\2\2"+
		"\u00cc\u00cd\7\36\2\2\u00cd\u00ce\5\34\17\2\u00ce\u00cf\7\37\2\2\u00cf"+
		"\u00d0\7\4\2\2\u00d0\u00d1\5\16\b\2\u00d1\u00d2\7\6\2\2\u00d2\u00d3\b"+
		"\16\1\2\u00d3\u0106\3\2\2\2\u00d4\u00d5\7 \2\2\u00d5\u00d6\7\4\2\2\u00d6"+
		"\u00d7\7,\2\2\u00d7\u00d8\7\25\2\2\u00d8\u00d9\5\16\b\2\u00d9\u00da\7"+
		"\t\2\2\u00da\u00db\5\16\b\2\u00db\u00dc\7\t\2\2\u00dc\u00dd\7,\2\2\u00dd"+
		"\u00de\7\25\2\2\u00de\u00df\5\16\b\2\u00df\u00e0\7\6\2\2\u00e0\u00e1\5"+
		"\34\17\2\u00e1\u00e2\b\16\1\2\u00e2\u0106\3\2\2\2\u00e3\u00e4\7!\2\2\u00e4"+
		"\u00e5\7\4\2\2\u00e5\u00ea\7/\2\2\u00e6\u00e7\7\5\2\2\u00e7\u00e9\5\16"+
		"\b\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7\6"+
		"\2\2\u00ee\u00ef\7\t\2\2\u00ef\u0106\b\16\1\2\u00f0\u00f2\7\"\2\2\u00f1"+
		"\u00f3\5\16\b\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3"+
		"\2\2\2\u00f4\u00f5\7\t\2\2\u00f5\u0106\b\16\1\2\u00f6\u00f7\7#\2\2\u00f7"+
		"\u00f8\7\4\2\2\u00f8\u00f9\5\16\b\2\u00f9\u00fa\7\6\2\2\u00fa\u00fb\7"+
		"\7\2\2\u00fb\u00fc\5 \21\2\u00fc\u00fd\7\b\2\2\u00fd\u00fe\b\16\1\2\u00fe"+
		"\u0106\3\2\2\2\u00ff\u0100\7&\2\2\u0100\u0101\7\t\2\2\u0101\u0106\b\16"+
		"\1\2\u0102\u0103\7\'\2\2\u0103\u0104\7\t\2\2\u0104\u0106\b\16\1\2\u0105"+
		"\u00b7\3\2\2\2\u0105\u00bd\3\2\2\2\u0105\u00c5\3\2\2\2\u0105\u00cc\3\2"+
		"\2\2\u0105\u00d4\3\2\2\2\u0105\u00e3\3\2\2\2\u0105\u00f0\3\2\2\2\u0105"+
		"\u00f6\3\2\2\2\u0105\u00ff\3\2\2\2\u0105\u0102\3\2\2\2\u0106\33\3\2\2"+
		"\2\u0107\u0108\5\32\16\2\u0108\u0109\b\17\1\2\u0109\u0110\3\2\2\2\u010a"+
		"\u010b\7\7\2\2\u010b\u010c\5\f\7\2\u010c\u010d\7\b\2\2\u010d\u010e\b\17"+
		"\1\2\u010e\u0110\3\2\2\2\u010f\u0107\3\2\2\2\u010f\u010a\3\2\2\2\u0110"+
		"\35\3\2\2\2\u0111\u0112\7\35\2\2\u0112\u0113\5\34\17\2\u0113\u0114\b\20"+
		"\1\2\u0114\u0117\3\2\2\2\u0115\u0117\b\20\1\2\u0116\u0111\3\2\2\2\u0116"+
		"\u0115\3\2\2\2\u0117\37\3\2\2\2\u0118\u0119\7$\2\2\u0119\u011a\t\2\2\2"+
		"\u011a\u011b\7\26\2\2\u011b\u011c\5\"\22\2\u011c\u011d\3\2\2\2\u011d\u011e"+
		"\5 \21\2\u011e\u011f\b\21\1\2\u011f\u0128\3\2\2\2\u0120\u0121\7%\2\2\u0121"+
		"\u0122\7\26\2\2\u0122\u0123\5\"\22\2\u0123\u0124\5 \21\2\u0124\u0125\b"+
		"\21\1\2\u0125\u0128\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0118\3\2\2\2\u0127"+
		"\u0120\3\2\2\2\u0127\u0126\3\2\2\2\u0128!\3\2\2\2\u0129\u012a\5\f\7\2"+
		"\u012a\u012b\b\22\1\2\u012b\u012e\3\2\2\2\u012c\u012e\b\22\1\2\u012d\u0129"+
		"\3\2\2\2\u012d\u012c\3\2\2\2\u012e#\3\2\2\2\31-\63\67CU^fms\u0083\u008a"+
		"\u008c\u0098\u009a\u00a6\u00b5\u00ea\u00f2\u0105\u010f\u0116\u0127\u012d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}