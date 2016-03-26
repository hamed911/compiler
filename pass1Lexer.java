// Generated from pass1.g4 by ANTLR 4.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pass1Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, LINECOMMENT=2, COMMENT=3, INTEGER=4, INHERITS=5, CLASS=6, 
		LET=7, MULTI=8, DIVID=9, ADD=10, SUB=11, ASSIGN=12, TRUE=13, FALSE=14, 
		DOUBLE_COT=15, OPENP=16, CLOSEP=17, NOT_FLAG=18, EQUAL=19, LESS_EQUAL=20, 
		LESS=21, NOT=22, ISVOID=23, NEW=24, START_CASE=25, END_CASE=26, OF=27, 
		BIGER_EQUAL=28, IN=29, WHILE=30, START_LOOP=31, END_LOOP=32, START_IF=33, 
		END_IF=34, ELSE=35, THEN=36, OPENA=37, CLOSEA=38, SEM=39, COM=40, DOTS=41, 
		DOT=42, AT=43, STRING=44, ID=45, TYPE=46;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"WHITESPACE", "LINECOMMENT", "COMMENT", "INTEGER", "INHERITS", "CLASS", 
		"LET", "'*'", "'/'", "'+'", "'-'", "'<-'", "TRUE", "FALSE", "'\"'", "'('", 
		"')'", "NOT_FLAG", "'='", "'<='", "'<'", "'~'", "ISVOID", "NEW", "START_CASE", 
		"END_CASE", "OF", "'=>'", "IN", "WHILE", "START_LOOP", "END_LOOP", "START_IF", 
		"END_IF", "ELSE", "THEN", "'{'", "'}'", "';'", "','", "':'", "'.'", "'@'", 
		"STRING", "ID", "TYPE"
	};
	public static final String[] ruleNames = {
		"WHITESPACE", "LINECOMMENT", "COMMENT", "INTEGER", "INHERITS", "CLASS", 
		"LET", "MULTI", "DIVID", "ADD", "SUB", "ASSIGN", "TRUE", "FALSE", "DOUBLE_COT", 
		"OPENP", "CLOSEP", "NOT_FLAG", "EQUAL", "LESS_EQUAL", "LESS", "NOT", "ISVOID", 
		"NEW", "START_CASE", "END_CASE", "OF", "BIGER_EQUAL", "IN", "WHILE", "START_LOOP", 
		"END_LOOP", "START_IF", "END_IF", "ELSE", "THEN", "OPENA", "CLOSEA", "SEM", 
		"COM", "DOTS", "DOT", "AT", "STRING", "ID", "TYPE"
	};


	public pass1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "pass1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\60\u0123\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\6\2a\n\2\r\2\16\2b\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\7\3k\n\3\f\3\16\3n\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4v\n\4\f\4\16\4y"+
		"\13\4\3\4\3\4\3\4\3\4\3\4\3\5\6\5\u0081\n\5\r\5\16\5\u0082\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3"+
		"#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+"+
		"\3,\3,\3-\3-\7-\u010f\n-\f-\16-\u0112\13-\3-\3-\3.\3.\7.\u0118\n.\f.\16"+
		".\u011b\13.\3/\3/\7/\u011f\n/\f/\16/\u0122\13/\4w\u0110\2\60\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\30\t\2\13\f\16\17\"\"))^^xx~~\4\2\f"+
		"\f\17\17\4\2KKkk\4\2PPpp\4\2JJjj\4\2GGgg\4\2TTtt\4\2VVvv\4\2UUuu\4\2E"+
		"Eee\4\2NNnn\4\2CCcc\4\2WWww\4\2QQqq\4\2XXxx\4\2FFff\4\2YYyy\4\2HHhh\4"+
		"\2RRrr\3\2c|\6\2\62;C\\aac|\3\2C\\\u0129\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\3`\3\2\2\2\5f\3\2\2\2\7q\3\2\2\2\t\u0080\3\2"+
		"\2\2\13\u0084\3\2\2\2\r\u008d\3\2\2\2\17\u0093\3\2\2\2\21\u0097\3\2\2"+
		"\2\23\u0099\3\2\2\2\25\u009b\3\2\2\2\27\u009d\3\2\2\2\31\u009f\3\2\2\2"+
		"\33\u00a2\3\2\2\2\35\u00a7\3\2\2\2\37\u00ad\3\2\2\2!\u00af\3\2\2\2#\u00b1"+
		"\3\2\2\2%\u00b3\3\2\2\2\'\u00b7\3\2\2\2)\u00b9\3\2\2\2+\u00bc\3\2\2\2"+
		"-\u00be\3\2\2\2/\u00c0\3\2\2\2\61\u00c7\3\2\2\2\63\u00cb\3\2\2\2\65\u00d0"+
		"\3\2\2\2\67\u00d5\3\2\2\29\u00d8\3\2\2\2;\u00db\3\2\2\2=\u00de\3\2\2\2"+
		"?\u00e4\3\2\2\2A\u00e9\3\2\2\2C\u00ee\3\2\2\2E\u00f1\3\2\2\2G\u00f4\3"+
		"\2\2\2I\u00f9\3\2\2\2K\u00fe\3\2\2\2M\u0100\3\2\2\2O\u0102\3\2\2\2Q\u0104"+
		"\3\2\2\2S\u0106\3\2\2\2U\u0108\3\2\2\2W\u010a\3\2\2\2Y\u010c\3\2\2\2["+
		"\u0115\3\2\2\2]\u011c\3\2\2\2_a\t\2\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2"+
		"bc\3\2\2\2cd\3\2\2\2de\b\2\2\2e\4\3\2\2\2fg\7/\2\2gh\7/\2\2hl\3\2\2\2"+
		"ik\n\3\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2"+
		"op\b\3\2\2p\6\3\2\2\2qr\7*\2\2rs\7,\2\2sw\3\2\2\2tv\13\2\2\2ut\3\2\2\2"+
		"vy\3\2\2\2wx\3\2\2\2wu\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7,\2\2{|\7+\2\2|"+
		"}\3\2\2\2}~\b\4\2\2~\b\3\2\2\2\177\u0081\4\62;\2\u0080\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\n\3\2\2\2"+
		"\u0084\u0085\t\4\2\2\u0085\u0086\t\5\2\2\u0086\u0087\t\6\2\2\u0087\u0088"+
		"\t\7\2\2\u0088\u0089\t\b\2\2\u0089\u008a\t\4\2\2\u008a\u008b\t\t\2\2\u008b"+
		"\u008c\t\n\2\2\u008c\f\3\2\2\2\u008d\u008e\t\13\2\2\u008e\u008f\t\f\2"+
		"\2\u008f\u0090\t\r\2\2\u0090\u0091\t\n\2\2\u0091\u0092\t\n\2\2\u0092\16"+
		"\3\2\2\2\u0093\u0094\t\f\2\2\u0094\u0095\t\7\2\2\u0095\u0096\t\t\2\2\u0096"+
		"\20\3\2\2\2\u0097\u0098\7,\2\2\u0098\22\3\2\2\2\u0099\u009a\7\61\2\2\u009a"+
		"\24\3\2\2\2\u009b\u009c\7-\2\2\u009c\26\3\2\2\2\u009d\u009e\7/\2\2\u009e"+
		"\30\3\2\2\2\u009f\u00a0\7>\2\2\u00a0\u00a1\7/\2\2\u00a1\32\3\2\2\2\u00a2"+
		"\u00a3\7v\2\2\u00a3\u00a4\t\b\2\2\u00a4\u00a5\t\16\2\2\u00a5\u00a6\t\7"+
		"\2\2\u00a6\34\3\2\2\2\u00a7\u00a8\7h\2\2\u00a8\u00a9\t\r\2\2\u00a9\u00aa"+
		"\t\f\2\2\u00aa\u00ab\t\n\2\2\u00ab\u00ac\t\7\2\2\u00ac\36\3\2\2\2\u00ad"+
		"\u00ae\7$\2\2\u00ae \3\2\2\2\u00af\u00b0\7*\2\2\u00b0\"\3\2\2\2\u00b1"+
		"\u00b2\7+\2\2\u00b2$\3\2\2\2\u00b3\u00b4\t\5\2\2\u00b4\u00b5\t\17\2\2"+
		"\u00b5\u00b6\t\t\2\2\u00b6&\3\2\2\2\u00b7\u00b8\7?\2\2\u00b8(\3\2\2\2"+
		"\u00b9\u00ba\7>\2\2\u00ba\u00bb\7?\2\2\u00bb*\3\2\2\2\u00bc\u00bd\7>\2"+
		"\2\u00bd,\3\2\2\2\u00be\u00bf\7\u0080\2\2\u00bf.\3\2\2\2\u00c0\u00c1\t"+
		"\4\2\2\u00c1\u00c2\t\n\2\2\u00c2\u00c3\t\20\2\2\u00c3\u00c4\t\17\2\2\u00c4"+
		"\u00c5\t\4\2\2\u00c5\u00c6\t\21\2\2\u00c6\60\3\2\2\2\u00c7\u00c8\t\5\2"+
		"\2\u00c8\u00c9\t\7\2\2\u00c9\u00ca\t\22\2\2\u00ca\62\3\2\2\2\u00cb\u00cc"+
		"\t\13\2\2\u00cc\u00cd\t\r\2\2\u00cd\u00ce\t\n\2\2\u00ce\u00cf\t\7\2\2"+
		"\u00cf\64\3\2\2\2\u00d0\u00d1\t\7\2\2\u00d1\u00d2\t\n\2\2\u00d2\u00d3"+
		"\t\r\2\2\u00d3\u00d4\t\13\2\2\u00d4\66\3\2\2\2\u00d5\u00d6\t\17\2\2\u00d6"+
		"\u00d7\t\23\2\2\u00d78\3\2\2\2\u00d8\u00d9\7?\2\2\u00d9\u00da\7@\2\2\u00da"+
		":\3\2\2\2\u00db\u00dc\t\4\2\2\u00dc\u00dd\t\5\2\2\u00dd<\3\2\2\2\u00de"+
		"\u00df\t\22\2\2\u00df\u00e0\t\6\2\2\u00e0\u00e1\t\4\2\2\u00e1\u00e2\t"+
		"\f\2\2\u00e2\u00e3\t\7\2\2\u00e3>\3\2\2\2\u00e4\u00e5\t\f\2\2\u00e5\u00e6"+
		"\t\17\2\2\u00e6\u00e7\t\17\2\2\u00e7\u00e8\t\24\2\2\u00e8@\3\2\2\2\u00e9"+
		"\u00ea\t\24\2\2\u00ea\u00eb\t\17\2\2\u00eb\u00ec\t\17\2\2\u00ec\u00ed"+
		"\t\f\2\2\u00edB\3\2\2\2\u00ee\u00ef\t\4\2\2\u00ef\u00f0\t\23\2\2\u00f0"+
		"D\3\2\2\2\u00f1\u00f2\t\23\2\2\u00f2\u00f3\t\4\2\2\u00f3F\3\2\2\2\u00f4"+
		"\u00f5\t\7\2\2\u00f5\u00f6\t\f\2\2\u00f6\u00f7\t\n\2\2\u00f7\u00f8\t\7"+
		"\2\2\u00f8H\3\2\2\2\u00f9\u00fa\t\t\2\2\u00fa\u00fb\t\6\2\2\u00fb\u00fc"+
		"\t\7\2\2\u00fc\u00fd\t\5\2\2\u00fdJ\3\2\2\2\u00fe\u00ff\7}\2\2\u00ffL"+
		"\3\2\2\2\u0100\u0101\7\177\2\2\u0101N\3\2\2\2\u0102\u0103\7=\2\2\u0103"+
		"P\3\2\2\2\u0104\u0105\7.\2\2\u0105R\3\2\2\2\u0106\u0107\7<\2\2\u0107T"+
		"\3\2\2\2\u0108\u0109\7\60\2\2\u0109V\3\2\2\2\u010a\u010b\7B\2\2\u010b"+
		"X\3\2\2\2\u010c\u0110\7$\2\2\u010d\u010f\13\2\2\2\u010e\u010d\3\2\2\2"+
		"\u010f\u0112\3\2\2\2\u0110\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0113"+
		"\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7$\2\2\u0114Z\3\2\2\2\u0115\u0119"+
		"\t\25\2\2\u0116\u0118\t\26\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2"+
		"\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\\\3\2\2\2\u011b\u0119\3"+
		"\2\2\2\u011c\u0120\t\27\2\2\u011d\u011f\t\26\2\2\u011e\u011d\3\2\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121^\3\2\2\2"+
		"\u0122\u0120\3\2\2\2\f\2blw\u0082\u0110\u0117\u0119\u011e\u0120\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}