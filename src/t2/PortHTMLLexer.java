// Generated from PortHTML.g4 by ANTLR 4.5.1
package t2;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PortHTMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, COMENTARIO=44, CADEIA=45, 
		ESP=46, SPAN=47, IDENT=48, INT=49, COORDENADA=50, WS=51;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "COMENTARIO", "CADEIA", "ESP", "SPAN", "IDENT", "INT", 
		"COORDENADA", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'site'", "'fim-site'", "'cabecalho'", "'fim-cabecalho'", "'corpo'", 
		"'fim-corpo'", "'menu-fixo'", "'fim-fixo'", "'linha'", "'fim-linha'", 
		"'coluna'", "'fim-coluna'", "'definir'", "'como'", "'container'", "'link'", 
		"'fim-link'", "'texto'", "'fim-texto'", "'botao'", "'fim-botao'", "'aviso'", 
		"'alerta'", "'sucesso'", "'erro'", "'titulo'", "'fim-titulo'", "'subtitulo'", 
		"'fim-subtitulo'", "'imagem'", "'fim-imagem'", "'dimensoes'", "'fim-dimensoes'", 
		"'mapa'", "'fim-mapa'", "'azul'", "'vermelho'", "'branco'", "'preto'", 
		"'verde'", "'amarelo'", "'rosa'", "'cinza'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "COMENTARIO", "CADEIA", 
		"ESP", "SPAN", "IDENT", "INT", "COORDENADA", "WS"
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


	public PortHTMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PortHTML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\65\u0296\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3"+
		"+\3+\3,\3,\3,\3,\3,\3,\3-\3-\7-\u01cc\n-\f-\16-\u01cf\13-\3-\3-\3-\3-"+
		"\3.\3.\7.\u01d7\n.\f.\16.\u01da\13.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0235\n/\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\5\60\u0276\n\60\3\61\3\61\7\61\u027a\n\61\f\61\16\61\u027d\13\61\3"+
		"\62\6\62\u0280\n\62\r\62\16\62\u0281\3\63\3\63\5\63\u0286\n\63\3\63\6"+
		"\63\u0289\n\63\r\63\16\63\u028a\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\2\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65\3\2\b\4\2\f\f\17\17\5\2\f\f\17\17$$\4\2C\\c|\7\2//\62;C\\aac|\4\2"+
		"--//\5\2\13\f\17\17\"\"\u02b1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3"+
		"i\3\2\2\2\5n\3\2\2\2\7w\3\2\2\2\t\u0081\3\2\2\2\13\u008f\3\2\2\2\r\u0095"+
		"\3\2\2\2\17\u009f\3\2\2\2\21\u00a9\3\2\2\2\23\u00b2\3\2\2\2\25\u00b8\3"+
		"\2\2\2\27\u00c2\3\2\2\2\31\u00c9\3\2\2\2\33\u00d4\3\2\2\2\35\u00dc\3\2"+
		"\2\2\37\u00e1\3\2\2\2!\u00eb\3\2\2\2#\u00f0\3\2\2\2%\u00f9\3\2\2\2\'\u00ff"+
		"\3\2\2\2)\u0109\3\2\2\2+\u010f\3\2\2\2-\u0119\3\2\2\2/\u011f\3\2\2\2\61"+
		"\u0126\3\2\2\2\63\u012e\3\2\2\2\65\u0133\3\2\2\2\67\u013a\3\2\2\29\u0145"+
		"\3\2\2\2;\u014f\3\2\2\2=\u015d\3\2\2\2?\u0164\3\2\2\2A\u016f\3\2\2\2C"+
		"\u0179\3\2\2\2E\u0187\3\2\2\2G\u018c\3\2\2\2I\u0195\3\2\2\2K\u019a\3\2"+
		"\2\2M\u01a3\3\2\2\2O\u01aa\3\2\2\2Q\u01b0\3\2\2\2S\u01b6\3\2\2\2U\u01be"+
		"\3\2\2\2W\u01c3\3\2\2\2Y\u01c9\3\2\2\2[\u01d4\3\2\2\2]\u0234\3\2\2\2_"+
		"\u0275\3\2\2\2a\u0277\3\2\2\2c\u027f\3\2\2\2e\u0283\3\2\2\2g\u0292\3\2"+
		"\2\2ij\7u\2\2jk\7k\2\2kl\7v\2\2lm\7g\2\2m\4\3\2\2\2no\7h\2\2op\7k\2\2"+
		"pq\7o\2\2qr\7/\2\2rs\7u\2\2st\7k\2\2tu\7v\2\2uv\7g\2\2v\6\3\2\2\2wx\7"+
		"e\2\2xy\7c\2\2yz\7d\2\2z{\7g\2\2{|\7e\2\2|}\7c\2\2}~\7n\2\2~\177\7j\2"+
		"\2\177\u0080\7q\2\2\u0080\b\3\2\2\2\u0081\u0082\7h\2\2\u0082\u0083\7k"+
		"\2\2\u0083\u0084\7o\2\2\u0084\u0085\7/\2\2\u0085\u0086\7e\2\2\u0086\u0087"+
		"\7c\2\2\u0087\u0088\7d\2\2\u0088\u0089\7g\2\2\u0089\u008a\7e\2\2\u008a"+
		"\u008b\7c\2\2\u008b\u008c\7n\2\2\u008c\u008d\7j\2\2\u008d\u008e\7q\2\2"+
		"\u008e\n\3\2\2\2\u008f\u0090\7e\2\2\u0090\u0091\7q\2\2\u0091\u0092\7t"+
		"\2\2\u0092\u0093\7r\2\2\u0093\u0094\7q\2\2\u0094\f\3\2\2\2\u0095\u0096"+
		"\7h\2\2\u0096\u0097\7k\2\2\u0097\u0098\7o\2\2\u0098\u0099\7/\2\2\u0099"+
		"\u009a\7e\2\2\u009a\u009b\7q\2\2\u009b\u009c\7t\2\2\u009c\u009d\7r\2\2"+
		"\u009d\u009e\7q\2\2\u009e\16\3\2\2\2\u009f\u00a0\7o\2\2\u00a0\u00a1\7"+
		"g\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7/\2\2\u00a4\u00a5"+
		"\7h\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7z\2\2\u00a7\u00a8\7q\2\2\u00a8"+
		"\20\3\2\2\2\u00a9\u00aa\7h\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7o\2\2\u00ac"+
		"\u00ad\7/\2\2\u00ad\u00ae\7h\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7z\2\2"+
		"\u00b0\u00b1\7q\2\2\u00b1\22\3\2\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7"+
		"k\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7\7c\2\2\u00b7\24"+
		"\3\2\2\2\u00b8\u00b9\7h\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7o\2\2\u00bb"+
		"\u00bc\7/\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7p\2\2"+
		"\u00bf\u00c0\7j\2\2\u00c0\u00c1\7c\2\2\u00c1\26\3\2\2\2\u00c2\u00c3\7"+
		"e\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7w\2\2\u00c6\u00c7"+
		"\7p\2\2\u00c7\u00c8\7c\2\2\u00c8\30\3\2\2\2\u00c9\u00ca\7h\2\2\u00ca\u00cb"+
		"\7k\2\2\u00cb\u00cc\7o\2\2\u00cc\u00cd\7/\2\2\u00cd\u00ce\7e\2\2\u00ce"+
		"\u00cf\7q\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7p\2\2"+
		"\u00d2\u00d3\7c\2\2\u00d3\32\3\2\2\2\u00d4\u00d5\7f\2\2\u00d5\u00d6\7"+
		"g\2\2\u00d6\u00d7\7h\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da"+
		"\7k\2\2\u00da\u00db\7t\2\2\u00db\34\3\2\2\2\u00dc\u00dd\7e\2\2\u00dd\u00de"+
		"\7q\2\2\u00de\u00df\7o\2\2\u00df\u00e0\7q\2\2\u00e0\36\3\2\2\2\u00e1\u00e2"+
		"\7e\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7v\2\2\u00e5"+
		"\u00e6\7c\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9\7g\2\2"+
		"\u00e9\u00ea\7t\2\2\u00ea \3\2\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7k\2"+
		"\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7m\2\2\u00ef\"\3\2\2\2\u00f0\u00f1\7"+
		"h\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7o\2\2\u00f3\u00f4\7/\2\2\u00f4\u00f5"+
		"\7n\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7m\2\2\u00f8"+
		"$\3\2\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7z\2\2\u00fc"+
		"\u00fd\7v\2\2\u00fd\u00fe\7q\2\2\u00fe&\3\2\2\2\u00ff\u0100\7h\2\2\u0100"+
		"\u0101\7k\2\2\u0101\u0102\7o\2\2\u0102\u0103\7/\2\2\u0103\u0104\7v\2\2"+
		"\u0104\u0105\7g\2\2\u0105\u0106\7z\2\2\u0106\u0107\7v\2\2\u0107\u0108"+
		"\7q\2\2\u0108(\3\2\2\2\u0109\u010a\7d\2\2\u010a\u010b\7q\2\2\u010b\u010c"+
		"\7v\2\2\u010c\u010d\7c\2\2\u010d\u010e\7q\2\2\u010e*\3\2\2\2\u010f\u0110"+
		"\7h\2\2\u0110\u0111\7k\2\2\u0111\u0112\7o\2\2\u0112\u0113\7/\2\2\u0113"+
		"\u0114\7d\2\2\u0114\u0115\7q\2\2\u0115\u0116\7v\2\2\u0116\u0117\7c\2\2"+
		"\u0117\u0118\7q\2\2\u0118,\3\2\2\2\u0119\u011a\7c\2\2\u011a\u011b\7x\2"+
		"\2\u011b\u011c\7k\2\2\u011c\u011d\7u\2\2\u011d\u011e\7q\2\2\u011e.\3\2"+
		"\2\2\u011f\u0120\7c\2\2\u0120\u0121\7n\2\2\u0121\u0122\7g\2\2\u0122\u0123"+
		"\7t\2\2\u0123\u0124\7v\2\2\u0124\u0125\7c\2\2\u0125\60\3\2\2\2\u0126\u0127"+
		"\7u\2\2\u0127\u0128\7w\2\2\u0128\u0129\7e\2\2\u0129\u012a\7g\2\2\u012a"+
		"\u012b\7u\2\2\u012b\u012c\7u\2\2\u012c\u012d\7q\2\2\u012d\62\3\2\2\2\u012e"+
		"\u012f\7g\2\2\u012f\u0130\7t\2\2\u0130\u0131\7t\2\2\u0131\u0132\7q\2\2"+
		"\u0132\64\3\2\2\2\u0133\u0134\7v\2\2\u0134\u0135\7k\2\2\u0135\u0136\7"+
		"v\2\2\u0136\u0137\7w\2\2\u0137\u0138\7n\2\2\u0138\u0139\7q\2\2\u0139\66"+
		"\3\2\2\2\u013a\u013b\7h\2\2\u013b\u013c\7k\2\2\u013c\u013d\7o\2\2\u013d"+
		"\u013e\7/\2\2\u013e\u013f\7v\2\2\u013f\u0140\7k\2\2\u0140\u0141\7v\2\2"+
		"\u0141\u0142\7w\2\2\u0142\u0143\7n\2\2\u0143\u0144\7q\2\2\u01448\3\2\2"+
		"\2\u0145\u0146\7u\2\2\u0146\u0147\7w\2\2\u0147\u0148\7d\2\2\u0148\u0149"+
		"\7v\2\2\u0149\u014a\7k\2\2\u014a\u014b\7v\2\2\u014b\u014c\7w\2\2\u014c"+
		"\u014d\7n\2\2\u014d\u014e\7q\2\2\u014e:\3\2\2\2\u014f\u0150\7h\2\2\u0150"+
		"\u0151\7k\2\2\u0151\u0152\7o\2\2\u0152\u0153\7/\2\2\u0153\u0154\7u\2\2"+
		"\u0154\u0155\7w\2\2\u0155\u0156\7d\2\2\u0156\u0157\7v\2\2\u0157\u0158"+
		"\7k\2\2\u0158\u0159\7v\2\2\u0159\u015a\7w\2\2\u015a\u015b\7n\2\2\u015b"+
		"\u015c\7q\2\2\u015c<\3\2\2\2\u015d\u015e\7k\2\2\u015e\u015f\7o\2\2\u015f"+
		"\u0160\7c\2\2\u0160\u0161\7i\2\2\u0161\u0162\7g\2\2\u0162\u0163\7o\2\2"+
		"\u0163>\3\2\2\2\u0164\u0165\7h\2\2\u0165\u0166\7k\2\2\u0166\u0167\7o\2"+
		"\2\u0167\u0168\7/\2\2\u0168\u0169\7k\2\2\u0169\u016a\7o\2\2\u016a\u016b"+
		"\7c\2\2\u016b\u016c\7i\2\2\u016c\u016d\7g\2\2\u016d\u016e\7o\2\2\u016e"+
		"@\3\2\2\2\u016f\u0170\7f\2\2\u0170\u0171\7k\2\2\u0171\u0172\7o\2\2\u0172"+
		"\u0173\7g\2\2\u0173\u0174\7p\2\2\u0174\u0175\7u\2\2\u0175\u0176\7q\2\2"+
		"\u0176\u0177\7g\2\2\u0177\u0178\7u\2\2\u0178B\3\2\2\2\u0179\u017a\7h\2"+
		"\2\u017a\u017b\7k\2\2\u017b\u017c\7o\2\2\u017c\u017d\7/\2\2\u017d\u017e"+
		"\7f\2\2\u017e\u017f\7k\2\2\u017f\u0180\7o\2\2\u0180\u0181\7g\2\2\u0181"+
		"\u0182\7p\2\2\u0182\u0183\7u\2\2\u0183\u0184\7q\2\2\u0184\u0185\7g\2\2"+
		"\u0185\u0186\7u\2\2\u0186D\3\2\2\2\u0187\u0188\7o\2\2\u0188\u0189\7c\2"+
		"\2\u0189\u018a\7r\2\2\u018a\u018b\7c\2\2\u018bF\3\2\2\2\u018c\u018d\7"+
		"h\2\2\u018d\u018e\7k\2\2\u018e\u018f\7o\2\2\u018f\u0190\7/\2\2\u0190\u0191"+
		"\7o\2\2\u0191\u0192\7c\2\2\u0192\u0193\7r\2\2\u0193\u0194\7c\2\2\u0194"+
		"H\3\2\2\2\u0195\u0196\7c\2\2\u0196\u0197\7|\2\2\u0197\u0198\7w\2\2\u0198"+
		"\u0199\7n\2\2\u0199J\3\2\2\2\u019a\u019b\7x\2\2\u019b\u019c\7g\2\2\u019c"+
		"\u019d\7t\2\2\u019d\u019e\7o\2\2\u019e\u019f\7g\2\2\u019f\u01a0\7n\2\2"+
		"\u01a0\u01a1\7j\2\2\u01a1\u01a2\7q\2\2\u01a2L\3\2\2\2\u01a3\u01a4\7d\2"+
		"\2\u01a4\u01a5\7t\2\2\u01a5\u01a6\7c\2\2\u01a6\u01a7\7p\2\2\u01a7\u01a8"+
		"\7e\2\2\u01a8\u01a9\7q\2\2\u01a9N\3\2\2\2\u01aa\u01ab\7r\2\2\u01ab\u01ac"+
		"\7t\2\2\u01ac\u01ad\7g\2\2\u01ad\u01ae\7v\2\2\u01ae\u01af\7q\2\2\u01af"+
		"P\3\2\2\2\u01b0\u01b1\7x\2\2\u01b1\u01b2\7g\2\2\u01b2\u01b3\7t\2\2\u01b3"+
		"\u01b4\7f\2\2\u01b4\u01b5\7g\2\2\u01b5R\3\2\2\2\u01b6\u01b7\7c\2\2\u01b7"+
		"\u01b8\7o\2\2\u01b8\u01b9\7c\2\2\u01b9\u01ba\7t\2\2\u01ba\u01bb\7g\2\2"+
		"\u01bb\u01bc\7n\2\2\u01bc\u01bd\7q\2\2\u01bdT\3\2\2\2\u01be\u01bf\7t\2"+
		"\2\u01bf\u01c0\7q\2\2\u01c0\u01c1\7u\2\2\u01c1\u01c2\7c\2\2\u01c2V\3\2"+
		"\2\2\u01c3\u01c4\7e\2\2\u01c4\u01c5\7k\2\2\u01c5\u01c6\7p\2\2\u01c6\u01c7"+
		"\7|\2\2\u01c7\u01c8\7c\2\2\u01c8X\3\2\2\2\u01c9\u01cd\7}\2\2\u01ca\u01cc"+
		"\n\2\2\2\u01cb\u01ca\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d1\7\177"+
		"\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\b-\2\2\u01d3Z\3\2\2\2\u01d4\u01d8"+
		"\7$\2\2\u01d5\u01d7\n\3\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8"+
		"\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01db\3\2\2\2\u01da\u01d8\3\2"+
		"\2\2\u01db\u01dc\7$\2\2\u01dc\\\3\2\2\2\u01dd\u01de\7q\2\2\u01de\u01df"+
		"\7h\2\2\u01df\u01e0\7h\2\2\u01e0\u01e1\7u\2\2\u01e1\u01e2\7g\2\2\u01e2"+
		"\u01e3\7v\2\2\u01e3\u0235\7\63\2\2\u01e4\u01e5\7q\2\2\u01e5\u01e6\7h\2"+
		"\2\u01e6\u01e7\7h\2\2\u01e7\u01e8\7u\2\2\u01e8\u01e9\7g\2\2\u01e9\u01ea"+
		"\7v\2\2\u01ea\u0235\7\64\2\2\u01eb\u01ec\7q\2\2\u01ec\u01ed\7h\2\2\u01ed"+
		"\u01ee\7h\2\2\u01ee\u01ef\7u\2\2\u01ef\u01f0\7g\2\2\u01f0\u01f1\7v\2\2"+
		"\u01f1\u0235\7\65\2\2\u01f2\u01f3\7q\2\2\u01f3\u01f4\7h\2\2\u01f4\u01f5"+
		"\7h\2\2\u01f5\u01f6\7u\2\2\u01f6\u01f7\7g\2\2\u01f7\u01f8\7v\2\2\u01f8"+
		"\u0235\7\66\2\2\u01f9\u01fa\7q\2\2\u01fa\u01fb\7h\2\2\u01fb\u01fc\7h\2"+
		"\2\u01fc\u01fd\7u\2\2\u01fd\u01fe\7g\2\2\u01fe\u01ff\7v\2\2\u01ff\u0235"+
		"\7\67\2\2\u0200\u0201\7q\2\2\u0201\u0202\7h\2\2\u0202\u0203\7h\2\2\u0203"+
		"\u0204\7u\2\2\u0204\u0205\7g\2\2\u0205\u0206\7v\2\2\u0206\u0235\78\2\2"+
		"\u0207\u0208\7q\2\2\u0208\u0209\7h\2\2\u0209\u020a\7h\2\2\u020a\u020b"+
		"\7u\2\2\u020b\u020c\7g\2\2\u020c\u020d\7v\2\2\u020d\u0235\79\2\2\u020e"+
		"\u020f\7q\2\2\u020f\u0210\7h\2\2\u0210\u0211\7h\2\2\u0211\u0212\7u\2\2"+
		"\u0212\u0213\7g\2\2\u0213\u0214\7v\2\2\u0214\u0235\7:\2\2\u0215\u0216"+
		"\7q\2\2\u0216\u0217\7h\2\2\u0217\u0218\7h\2\2\u0218\u0219\7u\2\2\u0219"+
		"\u021a\7g\2\2\u021a\u021b\7v\2\2\u021b\u0235\7;\2\2\u021c\u021d\7q\2\2"+
		"\u021d\u021e\7h\2\2\u021e\u021f\7h\2\2\u021f\u0220\7u\2\2\u0220\u0221"+
		"\7g\2\2\u0221\u0222\7v\2\2\u0222\u0223\7\63\2\2\u0223\u0235\7\62\2\2\u0224"+
		"\u0225\7q\2\2\u0225\u0226\7h\2\2\u0226\u0227\7h\2\2\u0227\u0228\7u\2\2"+
		"\u0228\u0229\7g\2\2\u0229\u022a\7v\2\2\u022a\u022b\7\63\2\2\u022b\u0235"+
		"\7\63\2\2\u022c\u022d\7q\2\2\u022d\u022e\7h\2\2\u022e\u022f\7h\2\2\u022f"+
		"\u0230\7u\2\2\u0230\u0231\7g\2\2\u0231\u0232\7v\2\2\u0232\u0233\7\63\2"+
		"\2\u0233\u0235\7\64\2\2\u0234\u01dd\3\2\2\2\u0234\u01e4\3\2\2\2\u0234"+
		"\u01eb\3\2\2\2\u0234\u01f2\3\2\2\2\u0234\u01f9\3\2\2\2\u0234\u0200\3\2"+
		"\2\2\u0234\u0207\3\2\2\2\u0234\u020e\3\2\2\2\u0234\u0215\3\2\2\2\u0234"+
		"\u021c\3\2\2\2\u0234\u0224\3\2\2\2\u0234\u022c\3\2\2\2\u0235^\3\2\2\2"+
		"\u0236\u0237\7u\2\2\u0237\u0238\7r\2\2\u0238\u0239\7c\2\2\u0239\u023a"+
		"\7p\2\2\u023a\u0276\7\63\2\2\u023b\u023c\7u\2\2\u023c\u023d\7r\2\2\u023d"+
		"\u023e\7c\2\2\u023e\u023f\7p\2\2\u023f\u0276\7\64\2\2\u0240\u0241\7u\2"+
		"\2\u0241\u0242\7r\2\2\u0242\u0243\7c\2\2\u0243\u0244\7p\2\2\u0244\u0276"+
		"\7\65\2\2\u0245\u0246\7u\2\2\u0246\u0247\7r\2\2\u0247\u0248\7c\2\2\u0248"+
		"\u0249\7p\2\2\u0249\u0276\7\66\2\2\u024a\u024b\7u\2\2\u024b\u024c\7r\2"+
		"\2\u024c\u024d\7c\2\2\u024d\u024e\7p\2\2\u024e\u0276\7\67\2\2\u024f\u0250"+
		"\7u\2\2\u0250\u0251\7r\2\2\u0251\u0252\7c\2\2\u0252\u0253\7p\2\2\u0253"+
		"\u0276\78\2\2\u0254\u0255\7u\2\2\u0255\u0256\7r\2\2\u0256\u0257\7c\2\2"+
		"\u0257\u0258\7p\2\2\u0258\u0276\79\2\2\u0259\u025a\7u\2\2\u025a\u025b"+
		"\7r\2\2\u025b\u025c\7c\2\2\u025c\u025d\7p\2\2\u025d\u0276\7:\2\2\u025e"+
		"\u025f\7u\2\2\u025f\u0260\7r\2\2\u0260\u0261\7c\2\2\u0261\u0262\7p\2\2"+
		"\u0262\u0276\7;\2\2\u0263\u0264\7u\2\2\u0264\u0265\7r\2\2\u0265\u0266"+
		"\7c\2\2\u0266\u0267\7p\2\2\u0267\u0268\7\63\2\2\u0268\u0276\7\62\2\2\u0269"+
		"\u026a\7u\2\2\u026a\u026b\7r\2\2\u026b\u026c\7c\2\2\u026c\u026d\7p\2\2"+
		"\u026d\u026e\7\63\2\2\u026e\u0276\7\63\2\2\u026f\u0270\7u\2\2\u0270\u0271"+
		"\7r\2\2\u0271\u0272\7c\2\2\u0272\u0273\7p\2\2\u0273\u0274\7\63\2\2\u0274"+
		"\u0276\7\64\2\2\u0275\u0236\3\2\2\2\u0275\u023b\3\2\2\2\u0275\u0240\3"+
		"\2\2\2\u0275\u0245\3\2\2\2\u0275\u024a\3\2\2\2\u0275\u024f\3\2\2\2\u0275"+
		"\u0254\3\2\2\2\u0275\u0259\3\2\2\2\u0275\u025e\3\2\2\2\u0275\u0263\3\2"+
		"\2\2\u0275\u0269\3\2\2\2\u0275\u026f\3\2\2\2\u0276`\3\2\2\2\u0277\u027b"+
		"\t\4\2\2\u0278\u027a\t\5\2\2\u0279\u0278\3\2\2\2\u027a\u027d\3\2\2\2\u027b"+
		"\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027cb\3\2\2\2\u027d\u027b\3\2\2\2"+
		"\u027e\u0280\4\62;\2\u027f\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u027f"+
		"\3\2\2\2\u0281\u0282\3\2\2\2\u0282d\3\2\2\2\u0283\u0285\t\6\2\2\u0284"+
		"\u0286\4\62;\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0288\3\2"+
		"\2\2\u0287\u0289\4\62;\2\u0288\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a"+
		"\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\7\60"+
		"\2\2\u028d\u028e\4\62;\2\u028e\u028f\4\62;\2\u028f\u0290\4\62;\2\u0290"+
		"\u0291\4\62;\2\u0291f\3\2\2\2\u0292\u0293\t\7\2\2\u0293\u0294\3\2\2\2"+
		"\u0294\u0295\b\64\3\2\u0295h\3\2\2\2\13\2\u01cd\u01d8\u0234\u0275\u027b"+
		"\u0281\u0285\u028a\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}