// Generated from d:\B ½sÄ¶¾¹³]­p\project\project2\myC.g4 by ANTLR 4.9.2

    // import packages here.

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DO=1, STRUCT=2, DEFINE=3, INCLUDE=4, RETURN=5, CONST=6, INT_TYPE=7, CHAR_TYPE=8, 
		DOUBLE_TYPE=9, VOID_TYPE=10, FLOAT_TYPE=11, LONG_TYPE=12, IF_CON=13, ELSE_CON=14, 
		FOR_LOOP=15, WHILE_LOOP=16, BIT_AND_OP=17, BIT_OR_OP=18, BIT_XOR_OP=19, 
		BIT_NOT_OP=20, AND_OP=21, OR_OP=22, NOT_OP=23, MOD_OP=24, DIV_OP=25, MUL_OP=26, 
		ADD_OP=27, SUB_OP=28, ASSIGN_OP=29, EQ_OP=30, LE_OP=31, GE_OP=32, NE_OP=33, 
		SHARP_OP=34, LT_OP=35, BT_OP=36, PP_OP=37, MM_OP=38, RSHIFT_OP=39, LSHIFT_OP=40, 
		QUESTION_OP=41, COLON=42, COMMA=43, SIMICOLON=44, DOT=45, SP_LEFT=46, 
		SP_RIGHT=47, MP_LEFT=48, MP_RIGHT=49, BP_LEFT=50, BP_RIGHT=51, PRINTF_FUNCT=52, 
		MAIN_FUNCT=53, STD_LIB=54, STRING=55, CHAR=56, DEC_NUM=57, ID=58, FLOAT_NUM=59, 
		COMMENT1=60, COMMENT2=61, NEW_LINE=62, WS=63;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DO", "STRUCT", "DEFINE", "INCLUDE", "RETURN", "CONST", "INT_TYPE", "CHAR_TYPE", 
			"DOUBLE_TYPE", "VOID_TYPE", "FLOAT_TYPE", "LONG_TYPE", "IF_CON", "ELSE_CON", 
			"FOR_LOOP", "WHILE_LOOP", "BIT_AND_OP", "BIT_OR_OP", "BIT_XOR_OP", "BIT_NOT_OP", 
			"AND_OP", "OR_OP", "NOT_OP", "MOD_OP", "DIV_OP", "MUL_OP", "ADD_OP", 
			"SUB_OP", "ASSIGN_OP", "EQ_OP", "LE_OP", "GE_OP", "NE_OP", "SHARP_OP", 
			"LT_OP", "BT_OP", "PP_OP", "MM_OP", "RSHIFT_OP", "LSHIFT_OP", "QUESTION_OP", 
			"COLON", "COMMA", "SIMICOLON", "DOT", "SP_LEFT", "SP_RIGHT", "MP_LEFT", 
			"MP_RIGHT", "BP_LEFT", "BP_RIGHT", "PRINTF_FUNCT", "MAIN_FUNCT", "STD_LIB", 
			"STRING", "CHAR", "DEC_NUM", "ID", "FLOAT_NUM", "FLOAT_NUM1", "FLOAT_NUM2", 
			"FLOAT_NUM3", "COMMENT1", "COMMENT2", "NEW_LINE", "LETTER", "DIGIT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'do'", "'struct'", "'define'", "'include'", "'return'", "'const'", 
			"'int'", "'char'", "'double'", "'void'", "'float'", "'long'", "'if'", 
			"'else'", "'for'", "'while'", "'&'", "'|'", "'^'", "'~'", "'&&'", "'||'", 
			"'!'", "'%'", "'/'", "'*'", "'+'", "'-'", "'='", "'=='", "'<='", "'>='", 
			"'!='", "'#'", "'<'", "'>'", "'++'", "'--'", "'<<'", "'>>'", "'?'", "':'", 
			"','", "';'", "'.'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'printf'", 
			"'main'", null, null, null, null, null, null, null, null, "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DO", "STRUCT", "DEFINE", "INCLUDE", "RETURN", "CONST", "INT_TYPE", 
			"CHAR_TYPE", "DOUBLE_TYPE", "VOID_TYPE", "FLOAT_TYPE", "LONG_TYPE", "IF_CON", 
			"ELSE_CON", "FOR_LOOP", "WHILE_LOOP", "BIT_AND_OP", "BIT_OR_OP", "BIT_XOR_OP", 
			"BIT_NOT_OP", "AND_OP", "OR_OP", "NOT_OP", "MOD_OP", "DIV_OP", "MUL_OP", 
			"ADD_OP", "SUB_OP", "ASSIGN_OP", "EQ_OP", "LE_OP", "GE_OP", "NE_OP", 
			"SHARP_OP", "LT_OP", "BT_OP", "PP_OP", "MM_OP", "RSHIFT_OP", "LSHIFT_OP", 
			"QUESTION_OP", "COLON", "COMMA", "SIMICOLON", "DOT", "SP_LEFT", "SP_RIGHT", 
			"MP_LEFT", "MP_RIGHT", "BP_LEFT", "BP_RIGHT", "PRINTF_FUNCT", "MAIN_FUNCT", 
			"STD_LIB", "STRING", "CHAR", "DEC_NUM", "ID", "FLOAT_NUM", "COMMENT1", 
			"COMMENT2", "NEW_LINE", "WS"
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


	    boolean TRACEON = true;


	public myCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "myC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2A\u01a7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3"+
		"/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\7\67\u0142\n\67"+
		"\f\67\16\67\u0145\13\67\3\67\3\67\3\67\3\67\38\38\78\u014d\n8\f8\168\u0150"+
		"\138\38\38\39\39\39\39\3:\3:\3:\7:\u015b\n:\f:\16:\u015e\13:\5:\u0160"+
		"\n:\3;\3;\3;\7;\u0165\n;\f;\16;\u0168\13;\3<\3<\3<\5<\u016d\n<\3=\6=\u0170"+
		"\n=\r=\16=\u0171\3=\3=\7=\u0176\n=\f=\16=\u0179\13=\3>\3>\6>\u017d\n>"+
		"\r>\16>\u017e\3?\6?\u0182\n?\r?\16?\u0183\3@\3@\3@\3@\7@\u018a\n@\f@\16"+
		"@\u018d\13@\3@\3@\3A\3A\3A\3A\7A\u0195\nA\fA\16A\u0198\13A\3A\3A\3A\3"+
		"B\3B\3C\3C\3D\3D\3E\6E\u01a4\nE\rE\16E\u01a5\6\u0143\u014e\u018b\u0196"+
		"\2F\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y\2{\2}\2\177>\u0081?\u0083@\u0085\2\u0087\2\u0089A\3\2\4"+
		"\5\2C\\aac|\5\2\13\13\17\17\"\"\2\u01b0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2"+
		"\2\2\2\u0089\3\2\2\2\3\u008b\3\2\2\2\5\u008e\3\2\2\2\7\u0095\3\2\2\2\t"+
		"\u009c\3\2\2\2\13\u00a4\3\2\2\2\r\u00ab\3\2\2\2\17\u00b1\3\2\2\2\21\u00b5"+
		"\3\2\2\2\23\u00ba\3\2\2\2\25\u00c1\3\2\2\2\27\u00c6\3\2\2\2\31\u00cc\3"+
		"\2\2\2\33\u00d1\3\2\2\2\35\u00d4\3\2\2\2\37\u00d9\3\2\2\2!\u00dd\3\2\2"+
		"\2#\u00e3\3\2\2\2%\u00e5\3\2\2\2\'\u00e7\3\2\2\2)\u00e9\3\2\2\2+\u00eb"+
		"\3\2\2\2-\u00ee\3\2\2\2/\u00f1\3\2\2\2\61\u00f3\3\2\2\2\63\u00f5\3\2\2"+
		"\2\65\u00f7\3\2\2\2\67\u00f9\3\2\2\29\u00fb\3\2\2\2;\u00fd\3\2\2\2=\u00ff"+
		"\3\2\2\2?\u0102\3\2\2\2A\u0105\3\2\2\2C\u0108\3\2\2\2E\u010b\3\2\2\2G"+
		"\u010d\3\2\2\2I\u010f\3\2\2\2K\u0111\3\2\2\2M\u0114\3\2\2\2O\u0117\3\2"+
		"\2\2Q\u011a\3\2\2\2S\u011d\3\2\2\2U\u011f\3\2\2\2W\u0121\3\2\2\2Y\u0123"+
		"\3\2\2\2[\u0125\3\2\2\2]\u0127\3\2\2\2_\u0129\3\2\2\2a\u012b\3\2\2\2c"+
		"\u012d\3\2\2\2e\u012f\3\2\2\2g\u0131\3\2\2\2i\u0133\3\2\2\2k\u013a\3\2"+
		"\2\2m\u013f\3\2\2\2o\u014a\3\2\2\2q\u0153\3\2\2\2s\u015f\3\2\2\2u\u0161"+
		"\3\2\2\2w\u016c\3\2\2\2y\u016f\3\2\2\2{\u017a\3\2\2\2}\u0181\3\2\2\2\177"+
		"\u0185\3\2\2\2\u0081\u0190\3\2\2\2\u0083\u019c\3\2\2\2\u0085\u019e\3\2"+
		"\2\2\u0087\u01a0\3\2\2\2\u0089\u01a3\3\2\2\2\u008b\u008c\7f\2\2\u008c"+
		"\u008d\7q\2\2\u008d\4\3\2\2\2\u008e\u008f\7u\2\2\u008f\u0090\7v\2\2\u0090"+
		"\u0091\7t\2\2\u0091\u0092\7w\2\2\u0092\u0093\7e\2\2\u0093\u0094\7v\2\2"+
		"\u0094\6\3\2\2\2\u0095\u0096\7f\2\2\u0096\u0097\7g\2\2\u0097\u0098\7h"+
		"\2\2\u0098\u0099\7k\2\2\u0099\u009a\7p\2\2\u009a\u009b\7g\2\2\u009b\b"+
		"\3\2\2\2\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\u009f\7e\2\2\u009f"+
		"\u00a0\7n\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\7f\2\2\u00a2\u00a3\7g\2\2"+
		"\u00a3\n\3\2\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7v"+
		"\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7p\2\2\u00aa\f"+
		"\3\2\2\2\u00ab\u00ac\7e\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\u00af\7u\2\2\u00af\u00b0\7v\2\2\u00b0\16\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2"+
		"\u00b3\7p\2\2\u00b3\u00b4\7v\2\2\u00b4\20\3\2\2\2\u00b5\u00b6\7e\2\2\u00b6"+
		"\u00b7\7j\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7t\2\2\u00b9\22\3\2\2\2\u00ba"+
		"\u00bb\7f\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be\7d\2\2"+
		"\u00be\u00bf\7n\2\2\u00bf\u00c0\7g\2\2\u00c0\24\3\2\2\2\u00c1\u00c2\7"+
		"x\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7f\2\2\u00c5\26"+
		"\3\2\2\2\u00c6\u00c7\7h\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7q\2\2\u00c9"+
		"\u00ca\7c\2\2\u00ca\u00cb\7v\2\2\u00cb\30\3\2\2\2\u00cc\u00cd\7n\2\2\u00cd"+
		"\u00ce\7q\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7i\2\2\u00d0\32\3\2\2\2\u00d1"+
		"\u00d2\7k\2\2\u00d2\u00d3\7h\2\2\u00d3\34\3\2\2\2\u00d4\u00d5\7g\2\2\u00d5"+
		"\u00d6\7n\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7g\2\2\u00d8\36\3\2\2\2\u00d9"+
		"\u00da\7h\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7t\2\2\u00dc \3\2\2\2\u00dd"+
		"\u00de\7y\2\2\u00de\u00df\7j\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7n\2\2"+
		"\u00e1\u00e2\7g\2\2\u00e2\"\3\2\2\2\u00e3\u00e4\7(\2\2\u00e4$\3\2\2\2"+
		"\u00e5\u00e6\7~\2\2\u00e6&\3\2\2\2\u00e7\u00e8\7`\2\2\u00e8(\3\2\2\2\u00e9"+
		"\u00ea\7\u0080\2\2\u00ea*\3\2\2\2\u00eb\u00ec\7(\2\2\u00ec\u00ed\7(\2"+
		"\2\u00ed,\3\2\2\2\u00ee\u00ef\7~\2\2\u00ef\u00f0\7~\2\2\u00f0.\3\2\2\2"+
		"\u00f1\u00f2\7#\2\2\u00f2\60\3\2\2\2\u00f3\u00f4\7\'\2\2\u00f4\62\3\2"+
		"\2\2\u00f5\u00f6\7\61\2\2\u00f6\64\3\2\2\2\u00f7\u00f8\7,\2\2\u00f8\66"+
		"\3\2\2\2\u00f9\u00fa\7-\2\2\u00fa8\3\2\2\2\u00fb\u00fc\7/\2\2\u00fc:\3"+
		"\2\2\2\u00fd\u00fe\7?\2\2\u00fe<\3\2\2\2\u00ff\u0100\7?\2\2\u0100\u0101"+
		"\7?\2\2\u0101>\3\2\2\2\u0102\u0103\7>\2\2\u0103\u0104\7?\2\2\u0104@\3"+
		"\2\2\2\u0105\u0106\7@\2\2\u0106\u0107\7?\2\2\u0107B\3\2\2\2\u0108\u0109"+
		"\7#\2\2\u0109\u010a\7?\2\2\u010aD\3\2\2\2\u010b\u010c\7%\2\2\u010cF\3"+
		"\2\2\2\u010d\u010e\7>\2\2\u010eH\3\2\2\2\u010f\u0110\7@\2\2\u0110J\3\2"+
		"\2\2\u0111\u0112\7-\2\2\u0112\u0113\7-\2\2\u0113L\3\2\2\2\u0114\u0115"+
		"\7/\2\2\u0115\u0116\7/\2\2\u0116N\3\2\2\2\u0117\u0118\7>\2\2\u0118\u0119"+
		"\7>\2\2\u0119P\3\2\2\2\u011a\u011b\7@\2\2\u011b\u011c\7@\2\2\u011cR\3"+
		"\2\2\2\u011d\u011e\7A\2\2\u011eT\3\2\2\2\u011f\u0120\7<\2\2\u0120V\3\2"+
		"\2\2\u0121\u0122\7.\2\2\u0122X\3\2\2\2\u0123\u0124\7=\2\2\u0124Z\3\2\2"+
		"\2\u0125\u0126\7\60\2\2\u0126\\\3\2\2\2\u0127\u0128\7*\2\2\u0128^\3\2"+
		"\2\2\u0129\u012a\7+\2\2\u012a`\3\2\2\2\u012b\u012c\7]\2\2\u012cb\3\2\2"+
		"\2\u012d\u012e\7_\2\2\u012ed\3\2\2\2\u012f\u0130\7}\2\2\u0130f\3\2\2\2"+
		"\u0131\u0132\7\177\2\2\u0132h\3\2\2\2\u0133\u0134\7r\2\2\u0134\u0135\7"+
		"t\2\2\u0135\u0136\7k\2\2\u0136\u0137\7p\2\2\u0137\u0138\7v\2\2\u0138\u0139"+
		"\7h\2\2\u0139j\3\2\2\2\u013a\u013b\7o\2\2\u013b\u013c\7c\2\2\u013c\u013d"+
		"\7k\2\2\u013d\u013e\7p\2\2\u013el\3\2\2\2\u013f\u0143\7>\2\2\u0140\u0142"+
		"\13\2\2\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0144\3\2\2\2"+
		"\u0143\u0141\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147"+
		"\7\60\2\2\u0147\u0148\7j\2\2\u0148\u0149\7@\2\2\u0149n\3\2\2\2\u014a\u014e"+
		"\7$\2\2\u014b\u014d\13\2\2\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2"+
		"\2\2\u0151\u0152\7$\2\2\u0152p\3\2\2\2\u0153\u0154\7)\2\2\u0154\u0155"+
		"\13\2\2\2\u0155\u0156\7)\2\2\u0156r\3\2\2\2\u0157\u0160\7\62\2\2\u0158"+
		"\u015c\4\63;\2\u0159\u015b\5\u0087D\2\u015a\u0159\3\2\2\2\u015b\u015e"+
		"\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0160\3\2\2\2\u015e"+
		"\u015c\3\2\2\2\u015f\u0157\3\2\2\2\u015f\u0158\3\2\2\2\u0160t\3\2\2\2"+
		"\u0161\u0166\5\u0085C\2\u0162\u0165\5\u0085C\2\u0163\u0165\5\u0087D\2"+
		"\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167v\3\2\2\2\u0168\u0166\3\2\2\2\u0169"+
		"\u016d\5y=\2\u016a\u016d\5{>\2\u016b\u016d\5}?\2\u016c\u0169\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016dx\3\2\2\2\u016e\u0170\5\u0087"+
		"D\2\u016f\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0177\7\60\2\2\u0174\u0176\5"+
		"\u0087D\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2"+
		"\u0177\u0178\3\2\2\2\u0178z\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017c\7"+
		"\60\2\2\u017b\u017d\5\u0087D\2\u017c\u017b\3\2\2\2\u017d\u017e\3\2\2\2"+
		"\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f|\3\2\2\2\u0180\u0182\5"+
		"\u0087D\2\u0181\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0181\3\2\2\2"+
		"\u0183\u0184\3\2\2\2\u0184~\3\2\2\2\u0185\u0186\7\61\2\2\u0186\u0187\7"+
		"\61\2\2\u0187\u018b\3\2\2\2\u0188\u018a\13\2\2\2\u0189\u0188\3\2\2\2\u018a"+
		"\u018d\3\2\2\2\u018b\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018e\3\2"+
		"\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7\f\2\2\u018f\u0080\3\2\2\2\u0190"+
		"\u0191\7\61\2\2\u0191\u0192\7,\2\2\u0192\u0196\3\2\2\2\u0193\u0195\13"+
		"\2\2\2\u0194\u0193\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0197\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019a\7,"+
		"\2\2\u019a\u019b\7\61\2\2\u019b\u0082\3\2\2\2\u019c\u019d\7\f\2\2\u019d"+
		"\u0084\3\2\2\2\u019e\u019f\t\2\2\2\u019f\u0086\3\2\2\2\u01a0\u01a1\4\62"+
		";\2\u01a1\u0088\3\2\2\2\u01a2\u01a4\t\3\2\2\u01a3\u01a2\3\2\2\2\u01a4"+
		"\u01a5\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u008a\3\2"+
		"\2\2\21\2\u0143\u014e\u015c\u015f\u0164\u0166\u016c\u0171\u0177\u017e"+
		"\u0183\u018b\u0196\u01a5\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}