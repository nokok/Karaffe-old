// Generated from Karaffe.g4 by ANTLR 4.7.1
package org.karaffe.compiler.frontend.karaffe.antlrautogenerated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KaraffeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FALLTHROUGH=1, EXTENSION=2, PROTEDTED=3, ABSTRACT=4, CONTINUE=5, INTERNAL=6, 
		READONLY=7, PRIVATE=8, IMPORT=9, PUBLIC=10, RETURN=11, SEALED=12, STATIC=13, 
		ASYNC=14, AWAIT=15, BREAK=16, CLASS=17, DEFER=18, FALSE=19, MATCH=20, 
		SUPER=21, THROW=22, WHILE=23, CASE=24, ELSE=25, ENUM=26, FUNC=27, INIT=28, 
		MAIN=29, NULL=30, OPEN=31, THIS=32, TRUE=33, TYPE=34, DEF=35, FOR=36, 
		LET=37, NEW=38, VAR=39, EQEQEQ=40, NOTEQEQ=41, CRANGE=42, AS=43, IS=44, 
		IF=45, IN=46, RANGE=47, POW=48, AND=49, OR=50, EQEQ=51, NOTEQ=52, LE=53, 
		GE=54, ARROW=55, DARROW=56, RARROW=57, GT=58, LT=59, BANG=60, COMMA=61, 
		PLUS=62, MINUS=63, MUL=64, DIV=65, MOD=66, EQ=67, QUOTE=68, DQUOTE=69, 
		LPAREN=70, RPAREN=71, LBRACE=72, RBRACE=73, LBRACK=74, RBRACK=75, SEMI=76, 
		DOT=77, StringLiteral=78, IntegerLiteral=79, Identifier=80, Whitespace=81;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"FALLTHROUGH", "EXTENSION", "PROTEDTED", "ABSTRACT", "CONTINUE", "INTERNAL", 
		"READONLY", "PRIVATE", "IMPORT", "PUBLIC", "RETURN", "SEALED", "STATIC", 
		"ASYNC", "AWAIT", "BREAK", "CLASS", "DEFER", "FALSE", "MATCH", "SUPER", 
		"THROW", "WHILE", "CASE", "ELSE", "ENUM", "FUNC", "INIT", "MAIN", "NULL", 
		"OPEN", "THIS", "TRUE", "TYPE", "DEF", "FOR", "LET", "NEW", "VAR", "EQEQEQ", 
		"NOTEQEQ", "CRANGE", "AS", "IS", "IF", "IN", "RANGE", "POW", "AND", "OR", 
		"EQEQ", "NOTEQ", "LE", "GE", "ARROW", "DARROW", "RARROW", "GT", "LT", 
		"BANG", "COMMA", "PLUS", "MINUS", "MUL", "DIV", "MOD", "EQ", "QUOTE", 
		"DQUOTE", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "DOT", "StringLiteral", "StringChars", "StringChar", "EscapeSeq", 
		"IntegerLiteral", "Identifier", "IdentifierHead", "IdentifierBody", "NonZeroDigit", 
		"Digit", "Whitespace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'fallthrough'", "'extension'", "'protected'", "'abstract'", "'continue'", 
		"'internal'", "'readonly'", "'private'", "'import'", "'public'", "'return'", 
		"'sealed'", "'static'", "'async'", "'await'", "'break'", "'class'", "'defer'", 
		"'false'", "'match'", "'super'", "'throw'", "'while'", "'case'", "'else'", 
		"'enum'", "'func'", "'init'", "'main'", "'null'", "'open'", "'this'", 
		"'true'", "'type'", "'def'", "'for'", "'let'", "'new'", "'var'", "'==='", 
		"'!=='", "'..<'", "'as'", "'is'", "'if'", "'in'", "'..'", "'**'", "'&&'", 
		"'||'", "'=='", "'!='", "'<='", "'>='", "'->'", "'=>'", "'<-'", "'>'", 
		"'<'", "'!'", "','", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'''", 
		"'\"'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FALLTHROUGH", "EXTENSION", "PROTEDTED", "ABSTRACT", "CONTINUE", 
		"INTERNAL", "READONLY", "PRIVATE", "IMPORT", "PUBLIC", "RETURN", "SEALED", 
		"STATIC", "ASYNC", "AWAIT", "BREAK", "CLASS", "DEFER", "FALSE", "MATCH", 
		"SUPER", "THROW", "WHILE", "CASE", "ELSE", "ENUM", "FUNC", "INIT", "MAIN", 
		"NULL", "OPEN", "THIS", "TRUE", "TYPE", "DEF", "FOR", "LET", "NEW", "VAR", 
		"EQEQEQ", "NOTEQEQ", "CRANGE", "AS", "IS", "IF", "IN", "RANGE", "POW", 
		"AND", "OR", "EQEQ", "NOTEQ", "LE", "GE", "ARROW", "DARROW", "RARROW", 
		"GT", "LT", "BANG", "COMMA", "PLUS", "MINUS", "MUL", "DIV", "MOD", "EQ", 
		"QUOTE", "DQUOTE", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "DOT", "StringLiteral", "IntegerLiteral", "Identifier", "Whitespace"
	};
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


	public KaraffeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Karaffe.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2S\u023f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3"+
		"*\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3<\3<"+
		"\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H"+
		"\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\5O\u020d\nO\3O\3O\3P\6P"+
		"\u0212\nP\rP\16P\u0213\3Q\3Q\5Q\u0218\nQ\3R\3R\3R\3S\3S\6S\u021f\nS\r"+
		"S\16S\u0220\3S\5S\u0224\nS\3T\3T\7T\u0228\nT\fT\16T\u022b\13T\3U\3U\3"+
		"V\3V\5V\u0231\nV\3W\3W\3X\3X\5X\u0237\nX\3Y\6Y\u023a\nY\rY\16Y\u023b\3"+
		"Y\3Y\2\2Z\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008b"+
		"G\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009f"+
		"\2\u00a1\2\u00a3\2\u00a5Q\u00a7R\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1"+
		"S\3\2\b\6\2\f\f\17\17$$^^\n\2$$))^^ddhhppttvw\4\2C\\c|\4\2\62;aa\3\2\63"+
		";\5\2\13\f\17\17\"\"\2\u0240\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00b1\3\2\2\2\3\u00b3"+
		"\3\2\2\2\5\u00bf\3\2\2\2\7\u00c9\3\2\2\2\t\u00d3\3\2\2\2\13\u00dc\3\2"+
		"\2\2\r\u00e5\3\2\2\2\17\u00ee\3\2\2\2\21\u00f7\3\2\2\2\23\u00ff\3\2\2"+
		"\2\25\u0106\3\2\2\2\27\u010d\3\2\2\2\31\u0114\3\2\2\2\33\u011b\3\2\2\2"+
		"\35\u0122\3\2\2\2\37\u0128\3\2\2\2!\u012e\3\2\2\2#\u0134\3\2\2\2%\u013a"+
		"\3\2\2\2\'\u0140\3\2\2\2)\u0146\3\2\2\2+\u014c\3\2\2\2-\u0152\3\2\2\2"+
		"/\u0158\3\2\2\2\61\u015e\3\2\2\2\63\u0163\3\2\2\2\65\u0168\3\2\2\2\67"+
		"\u016d\3\2\2\29\u0172\3\2\2\2;\u0177\3\2\2\2=\u017c\3\2\2\2?\u0181\3\2"+
		"\2\2A\u0186\3\2\2\2C\u018b\3\2\2\2E\u0190\3\2\2\2G\u0195\3\2\2\2I\u0199"+
		"\3\2\2\2K\u019d\3\2\2\2M\u01a1\3\2\2\2O\u01a5\3\2\2\2Q\u01a9\3\2\2\2S"+
		"\u01ad\3\2\2\2U\u01b1\3\2\2\2W\u01b5\3\2\2\2Y\u01b8\3\2\2\2[\u01bb\3\2"+
		"\2\2]\u01be\3\2\2\2_\u01c1\3\2\2\2a\u01c4\3\2\2\2c\u01c7\3\2\2\2e\u01ca"+
		"\3\2\2\2g\u01cd\3\2\2\2i\u01d0\3\2\2\2k\u01d3\3\2\2\2m\u01d6\3\2\2\2o"+
		"\u01d9\3\2\2\2q\u01dc\3\2\2\2s\u01df\3\2\2\2u\u01e2\3\2\2\2w\u01e4\3\2"+
		"\2\2y\u01e6\3\2\2\2{\u01e8\3\2\2\2}\u01ea\3\2\2\2\177\u01ec\3\2\2\2\u0081"+
		"\u01ee\3\2\2\2\u0083\u01f0\3\2\2\2\u0085\u01f2\3\2\2\2\u0087\u01f4\3\2"+
		"\2\2\u0089\u01f6\3\2\2\2\u008b\u01f8\3\2\2\2\u008d\u01fa\3\2\2\2\u008f"+
		"\u01fc\3\2\2\2\u0091\u01fe\3\2\2\2\u0093\u0200\3\2\2\2\u0095\u0202\3\2"+
		"\2\2\u0097\u0204\3\2\2\2\u0099\u0206\3\2\2\2\u009b\u0208\3\2\2\2\u009d"+
		"\u020a\3\2\2\2\u009f\u0211\3\2\2\2\u00a1\u0217\3\2\2\2\u00a3\u0219\3\2"+
		"\2\2\u00a5\u0223\3\2\2\2\u00a7\u0225\3\2\2\2\u00a9\u022c\3\2\2\2\u00ab"+
		"\u0230\3\2\2\2\u00ad\u0232\3\2\2\2\u00af\u0236\3\2\2\2\u00b1\u0239\3\2"+
		"\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7"+
		"\7n\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7j\2\2\u00b9\u00ba\7t\2\2\u00ba"+
		"\u00bb\7q\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7i\2\2\u00bd\u00be\7j\2\2"+
		"\u00be\4\3\2\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7z\2\2\u00c1\u00c2\7v"+
		"\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6"+
		"\7k\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7p\2\2\u00c8\6\3\2\2\2\u00c9\u00ca"+
		"\7r\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7v\2\2\u00cd"+
		"\u00ce\7g\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7g\2\2"+
		"\u00d1\u00d2\7f\2\2\u00d2\b\3\2\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7d"+
		"\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9"+
		"\7c\2\2\u00d9\u00da\7e\2\2\u00da\u00db\7v\2\2\u00db\n\3\2\2\2\u00dc\u00dd"+
		"\7e\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7v\2\2\u00e0"+
		"\u00e1\7k\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7w\2\2\u00e3\u00e4\7g\2\2"+
		"\u00e4\f\3\2\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7v"+
		"\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec"+
		"\7c\2\2\u00ec\u00ed\7n\2\2\u00ed\16\3\2\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0"+
		"\7g\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7f\2\2\u00f2\u00f3\7q\2\2\u00f3"+
		"\u00f4\7p\2\2\u00f4\u00f5\7n\2\2\u00f5\u00f6\7{\2\2\u00f6\20\3\2\2\2\u00f7"+
		"\u00f8\7r\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7x\2\2"+
		"\u00fb\u00fc\7c\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7g\2\2\u00fe\22\3\2"+
		"\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7o\2\2\u0101\u0102\7r\2\2\u0102\u0103"+
		"\7q\2\2\u0103\u0104\7t\2\2\u0104\u0105\7v\2\2\u0105\24\3\2\2\2\u0106\u0107"+
		"\7r\2\2\u0107\u0108\7w\2\2\u0108\u0109\7d\2\2\u0109\u010a\7n\2\2\u010a"+
		"\u010b\7k\2\2\u010b\u010c\7e\2\2\u010c\26\3\2\2\2\u010d\u010e\7t\2\2\u010e"+
		"\u010f\7g\2\2\u010f\u0110\7v\2\2\u0110\u0111\7w\2\2\u0111\u0112\7t\2\2"+
		"\u0112\u0113\7p\2\2\u0113\30\3\2\2\2\u0114\u0115\7u\2\2\u0115\u0116\7"+
		"g\2\2\u0116\u0117\7c\2\2\u0117\u0118\7n\2\2\u0118\u0119\7g\2\2\u0119\u011a"+
		"\7f\2\2\u011a\32\3\2\2\2\u011b\u011c\7u\2\2\u011c\u011d\7v\2\2\u011d\u011e"+
		"\7c\2\2\u011e\u011f\7v\2\2\u011f\u0120\7k\2\2\u0120\u0121\7e\2\2\u0121"+
		"\34\3\2\2\2\u0122\u0123\7c\2\2\u0123\u0124\7u\2\2\u0124\u0125\7{\2\2\u0125"+
		"\u0126\7p\2\2\u0126\u0127\7e\2\2\u0127\36\3\2\2\2\u0128\u0129\7c\2\2\u0129"+
		"\u012a\7y\2\2\u012a\u012b\7c\2\2\u012b\u012c\7k\2\2\u012c\u012d\7v\2\2"+
		"\u012d \3\2\2\2\u012e\u012f\7d\2\2\u012f\u0130\7t\2\2\u0130\u0131\7g\2"+
		"\2\u0131\u0132\7c\2\2\u0132\u0133\7m\2\2\u0133\"\3\2\2\2\u0134\u0135\7"+
		"e\2\2\u0135\u0136\7n\2\2\u0136\u0137\7c\2\2\u0137\u0138\7u\2\2\u0138\u0139"+
		"\7u\2\2\u0139$\3\2\2\2\u013a\u013b\7f\2\2\u013b\u013c\7g\2\2\u013c\u013d"+
		"\7h\2\2\u013d\u013e\7g\2\2\u013e\u013f\7t\2\2\u013f&\3\2\2\2\u0140\u0141"+
		"\7h\2\2\u0141\u0142\7c\2\2\u0142\u0143\7n\2\2\u0143\u0144\7u\2\2\u0144"+
		"\u0145\7g\2\2\u0145(\3\2\2\2\u0146\u0147\7o\2\2\u0147\u0148\7c\2\2\u0148"+
		"\u0149\7v\2\2\u0149\u014a\7e\2\2\u014a\u014b\7j\2\2\u014b*\3\2\2\2\u014c"+
		"\u014d\7u\2\2\u014d\u014e\7w\2\2\u014e\u014f\7r\2\2\u014f\u0150\7g\2\2"+
		"\u0150\u0151\7t\2\2\u0151,\3\2\2\2\u0152\u0153\7v\2\2\u0153\u0154\7j\2"+
		"\2\u0154\u0155\7t\2\2\u0155\u0156\7q\2\2\u0156\u0157\7y\2\2\u0157.\3\2"+
		"\2\2\u0158\u0159\7y\2\2\u0159\u015a\7j\2\2\u015a\u015b\7k\2\2\u015b\u015c"+
		"\7n\2\2\u015c\u015d\7g\2\2\u015d\60\3\2\2\2\u015e\u015f\7e\2\2\u015f\u0160"+
		"\7c\2\2\u0160\u0161\7u\2\2\u0161\u0162\7g\2\2\u0162\62\3\2\2\2\u0163\u0164"+
		"\7g\2\2\u0164\u0165\7n\2\2\u0165\u0166\7u\2\2\u0166\u0167\7g\2\2\u0167"+
		"\64\3\2\2\2\u0168\u0169\7g\2\2\u0169\u016a\7p\2\2\u016a\u016b\7w\2\2\u016b"+
		"\u016c\7o\2\2\u016c\66\3\2\2\2\u016d\u016e\7h\2\2\u016e\u016f\7w\2\2\u016f"+
		"\u0170\7p\2\2\u0170\u0171\7e\2\2\u01718\3\2\2\2\u0172\u0173\7k\2\2\u0173"+
		"\u0174\7p\2\2\u0174\u0175\7k\2\2\u0175\u0176\7v\2\2\u0176:\3\2\2\2\u0177"+
		"\u0178\7o\2\2\u0178\u0179\7c\2\2\u0179\u017a\7k\2\2\u017a\u017b\7p\2\2"+
		"\u017b<\3\2\2\2\u017c\u017d\7p\2\2\u017d\u017e\7w\2\2\u017e\u017f\7n\2"+
		"\2\u017f\u0180\7n\2\2\u0180>\3\2\2\2\u0181\u0182\7q\2\2\u0182\u0183\7"+
		"r\2\2\u0183\u0184\7g\2\2\u0184\u0185\7p\2\2\u0185@\3\2\2\2\u0186\u0187"+
		"\7v\2\2\u0187\u0188\7j\2\2\u0188\u0189\7k\2\2\u0189\u018a\7u\2\2\u018a"+
		"B\3\2\2\2\u018b\u018c\7v\2\2\u018c\u018d\7t\2\2\u018d\u018e\7w\2\2\u018e"+
		"\u018f\7g\2\2\u018fD\3\2\2\2\u0190\u0191\7v\2\2\u0191\u0192\7{\2\2\u0192"+
		"\u0193\7r\2\2\u0193\u0194\7g\2\2\u0194F\3\2\2\2\u0195\u0196\7f\2\2\u0196"+
		"\u0197\7g\2\2\u0197\u0198\7h\2\2\u0198H\3\2\2\2\u0199\u019a\7h\2\2\u019a"+
		"\u019b\7q\2\2\u019b\u019c\7t\2\2\u019cJ\3\2\2\2\u019d\u019e\7n\2\2\u019e"+
		"\u019f\7g\2\2\u019f\u01a0\7v\2\2\u01a0L\3\2\2\2\u01a1\u01a2\7p\2\2\u01a2"+
		"\u01a3\7g\2\2\u01a3\u01a4\7y\2\2\u01a4N\3\2\2\2\u01a5\u01a6\7x\2\2\u01a6"+
		"\u01a7\7c\2\2\u01a7\u01a8\7t\2\2\u01a8P\3\2\2\2\u01a9\u01aa\7?\2\2\u01aa"+
		"\u01ab\7?\2\2\u01ab\u01ac\7?\2\2\u01acR\3\2\2\2\u01ad\u01ae\7#\2\2\u01ae"+
		"\u01af\7?\2\2\u01af\u01b0\7?\2\2\u01b0T\3\2\2\2\u01b1\u01b2\7\60\2\2\u01b2"+
		"\u01b3\7\60\2\2\u01b3\u01b4\7>\2\2\u01b4V\3\2\2\2\u01b5\u01b6\7c\2\2\u01b6"+
		"\u01b7\7u\2\2\u01b7X\3\2\2\2\u01b8\u01b9\7k\2\2\u01b9\u01ba\7u\2\2\u01ba"+
		"Z\3\2\2\2\u01bb\u01bc\7k\2\2\u01bc\u01bd\7h\2\2\u01bd\\\3\2\2\2\u01be"+
		"\u01bf\7k\2\2\u01bf\u01c0\7p\2\2\u01c0^\3\2\2\2\u01c1\u01c2\7\60\2\2\u01c2"+
		"\u01c3\7\60\2\2\u01c3`\3\2\2\2\u01c4\u01c5\7,\2\2\u01c5\u01c6\7,\2\2\u01c6"+
		"b\3\2\2\2\u01c7\u01c8\7(\2\2\u01c8\u01c9\7(\2\2\u01c9d\3\2\2\2\u01ca\u01cb"+
		"\7~\2\2\u01cb\u01cc\7~\2\2\u01ccf\3\2\2\2\u01cd\u01ce\7?\2\2\u01ce\u01cf"+
		"\7?\2\2\u01cfh\3\2\2\2\u01d0\u01d1\7#\2\2\u01d1\u01d2\7?\2\2\u01d2j\3"+
		"\2\2\2\u01d3\u01d4\7>\2\2\u01d4\u01d5\7?\2\2\u01d5l\3\2\2\2\u01d6\u01d7"+
		"\7@\2\2\u01d7\u01d8\7?\2\2\u01d8n\3\2\2\2\u01d9\u01da\7/\2\2\u01da\u01db"+
		"\7@\2\2\u01dbp\3\2\2\2\u01dc\u01dd\7?\2\2\u01dd\u01de\7@\2\2\u01der\3"+
		"\2\2\2\u01df\u01e0\7>\2\2\u01e0\u01e1\7/\2\2\u01e1t\3\2\2\2\u01e2\u01e3"+
		"\7@\2\2\u01e3v\3\2\2\2\u01e4\u01e5\7>\2\2\u01e5x\3\2\2\2\u01e6\u01e7\7"+
		"#\2\2\u01e7z\3\2\2\2\u01e8\u01e9\7.\2\2\u01e9|\3\2\2\2\u01ea\u01eb\7-"+
		"\2\2\u01eb~\3\2\2\2\u01ec\u01ed\7/\2\2\u01ed\u0080\3\2\2\2\u01ee\u01ef"+
		"\7,\2\2\u01ef\u0082\3\2\2\2\u01f0\u01f1\7\61\2\2\u01f1\u0084\3\2\2\2\u01f2"+
		"\u01f3\7\'\2\2\u01f3\u0086\3\2\2\2\u01f4\u01f5\7?\2\2\u01f5\u0088\3\2"+
		"\2\2\u01f6\u01f7\7)\2\2\u01f7\u008a\3\2\2\2\u01f8\u01f9\7$\2\2\u01f9\u008c"+
		"\3\2\2\2\u01fa\u01fb\7*\2\2\u01fb\u008e\3\2\2\2\u01fc\u01fd\7+\2\2\u01fd"+
		"\u0090\3\2\2\2\u01fe\u01ff\7}\2\2\u01ff\u0092\3\2\2\2\u0200\u0201\7\177"+
		"\2\2\u0201\u0094\3\2\2\2\u0202\u0203\7]\2\2\u0203\u0096\3\2\2\2\u0204"+
		"\u0205\7_\2\2\u0205\u0098\3\2\2\2\u0206\u0207\7=\2\2\u0207\u009a\3\2\2"+
		"\2\u0208\u0209\7\60\2\2\u0209\u009c\3\2\2\2\u020a\u020c\5\u008bF\2\u020b"+
		"\u020d\5\u009fP\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e"+
		"\3\2\2\2\u020e\u020f\5\u008bF\2\u020f\u009e\3\2\2\2\u0210\u0212\5\u00a1"+
		"Q\2\u0211\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0211\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u00a0\3\2\2\2\u0215\u0218\n\2\2\2\u0216\u0218\5\u00a3"+
		"R\2\u0217\u0215\3\2\2\2\u0217\u0216\3\2\2\2\u0218\u00a2\3\2\2\2\u0219"+
		"\u021a\7^\2\2\u021a\u021b\t\3\2\2\u021b\u00a4\3\2\2\2\u021c\u021e\5\u00ad"+
		"W\2\u021d\u021f\5\u00afX\2\u021e\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0224\5\u00af"+
		"X\2\u0223\u021c\3\2\2\2\u0223\u0222\3\2\2\2\u0224\u00a6\3\2\2\2\u0225"+
		"\u0229\5\u00a9U\2\u0226\u0228\5\u00abV\2\u0227\u0226\3\2\2\2\u0228\u022b"+
		"\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u00a8\3\2\2\2\u022b"+
		"\u0229\3\2\2\2\u022c\u022d\t\4\2\2\u022d\u00aa\3\2\2\2\u022e\u0231\5\u00a9"+
		"U\2\u022f\u0231\t\5\2\2\u0230\u022e\3\2\2\2\u0230\u022f\3\2\2\2\u0231"+
		"\u00ac\3\2\2\2\u0232\u0233\t\6\2\2\u0233\u00ae\3\2\2\2\u0234\u0237\7\62"+
		"\2\2\u0235\u0237\5\u00adW\2\u0236\u0234\3\2\2\2\u0236\u0235\3\2\2\2\u0237"+
		"\u00b0\3\2\2\2\u0238\u023a\t\7\2\2\u0239\u0238\3\2\2\2\u023a\u023b\3\2"+
		"\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"\u023e\bY\2\2\u023e\u00b2\3\2\2\2\f\2\u020c\u0213\u0217\u0220\u0223\u0229"+
		"\u0230\u0236\u023b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
