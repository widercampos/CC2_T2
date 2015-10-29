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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, COMENTARIO=50, CADEIA=51, INT=52, 
		COORD=53, WS=54;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"COMENTARIO", "CADEIA", "INT", "COORD", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'site'", "'fim-site'", "'cabecalho'", "'fim-cabecalho'", "'corpo'", 
		"'fim-corpo'", "'menu-fixo'", "'fim-fixo'", "'div'", "'fim-div'", "'container'", 
		"'link'", "'fim-link'", "'paragrafo'", "'fim-paragrafo'", "'texto'", "'fim-texto'", 
		"'botao'", "'fim-botao'", "'aviso'", "'alerta'", "'sucesso'", "'erro'", 
		"'titulo'", "'fim-titulo'", "'subtitulo'", "'fim-subtitulo'", "'cor-fundo'", 
		"'fim-cor-fundo'", "'cor-texto'", "'fim-cor-texto'", "'imagem'", "'fim-imagem'", 
		"'dimensoes'", "'fim-dimensoes'", "'mapa'", "','", "'fim-mapa'", "'slide-show'", 
		"'fim-slide-show'", "'azul'", "'vermelho'", "'branco'", "'preto'", "'verde'", 
		"'amarelo'", "'rosa'", "'cinza'", "'roxo'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "COMENTARIO", "CADEIA", "INT", "COORD", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\28\u0241\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%"+
		"\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*"+
		"\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-"+
		"\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\7\63\u0218"+
		"\n\63\f\63\16\63\u021b\13\63\3\63\3\63\3\63\3\63\3\64\3\64\7\64\u0223"+
		"\n\64\f\64\16\64\u0226\13\64\3\64\3\64\3\65\6\65\u022b\n\65\r\65\16\65"+
		"\u022c\3\66\3\66\5\66\u0231\n\66\3\66\6\66\u0234\n\66\r\66\16\66\u0235"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\2\28\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8\3\2\6\4\2\f\f"+
		"\17\17\5\2\f\f\17\17$$\4\2--//\5\2\13\f\17\17\"\"\u0245\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5"+
		"t\3\2\2\2\7}\3\2\2\2\t\u0087\3\2\2\2\13\u0095\3\2\2\2\r\u009b\3\2\2\2"+
		"\17\u00a5\3\2\2\2\21\u00af\3\2\2\2\23\u00b8\3\2\2\2\25\u00bc\3\2\2\2\27"+
		"\u00c4\3\2\2\2\31\u00ce\3\2\2\2\33\u00d3\3\2\2\2\35\u00dc\3\2\2\2\37\u00e6"+
		"\3\2\2\2!\u00f4\3\2\2\2#\u00fa\3\2\2\2%\u0104\3\2\2\2\'\u010a\3\2\2\2"+
		")\u0114\3\2\2\2+\u011a\3\2\2\2-\u0121\3\2\2\2/\u0129\3\2\2\2\61\u012e"+
		"\3\2\2\2\63\u0135\3\2\2\2\65\u0140\3\2\2\2\67\u014a\3\2\2\29\u0158\3\2"+
		"\2\2;\u0162\3\2\2\2=\u0170\3\2\2\2?\u017a\3\2\2\2A\u0188\3\2\2\2C\u018f"+
		"\3\2\2\2E\u019a\3\2\2\2G\u01a4\3\2\2\2I\u01b2\3\2\2\2K\u01b7\3\2\2\2M"+
		"\u01b9\3\2\2\2O\u01c2\3\2\2\2Q\u01cd\3\2\2\2S\u01dc\3\2\2\2U\u01e1\3\2"+
		"\2\2W\u01ea\3\2\2\2Y\u01f1\3\2\2\2[\u01f7\3\2\2\2]\u01fd\3\2\2\2_\u0205"+
		"\3\2\2\2a\u020a\3\2\2\2c\u0210\3\2\2\2e\u0215\3\2\2\2g\u0220\3\2\2\2i"+
		"\u022a\3\2\2\2k\u022e\3\2\2\2m\u023d\3\2\2\2op\7u\2\2pq\7k\2\2qr\7v\2"+
		"\2rs\7g\2\2s\4\3\2\2\2tu\7h\2\2uv\7k\2\2vw\7o\2\2wx\7/\2\2xy\7u\2\2yz"+
		"\7k\2\2z{\7v\2\2{|\7g\2\2|\6\3\2\2\2}~\7e\2\2~\177\7c\2\2\177\u0080\7"+
		"d\2\2\u0080\u0081\7g\2\2\u0081\u0082\7e\2\2\u0082\u0083\7c\2\2\u0083\u0084"+
		"\7n\2\2\u0084\u0085\7j\2\2\u0085\u0086\7q\2\2\u0086\b\3\2\2\2\u0087\u0088"+
		"\7h\2\2\u0088\u0089\7k\2\2\u0089\u008a\7o\2\2\u008a\u008b\7/\2\2\u008b"+
		"\u008c\7e\2\2\u008c\u008d\7c\2\2\u008d\u008e\7d\2\2\u008e\u008f\7g\2\2"+
		"\u008f\u0090\7e\2\2\u0090\u0091\7c\2\2\u0091\u0092\7n\2\2\u0092\u0093"+
		"\7j\2\2\u0093\u0094\7q\2\2\u0094\n\3\2\2\2\u0095\u0096\7e\2\2\u0096\u0097"+
		"\7q\2\2\u0097\u0098\7t\2\2\u0098\u0099\7r\2\2\u0099\u009a\7q\2\2\u009a"+
		"\f\3\2\2\2\u009b\u009c\7h\2\2\u009c\u009d\7k\2\2\u009d\u009e\7o\2\2\u009e"+
		"\u009f\7/\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7t\2\2"+
		"\u00a2\u00a3\7r\2\2\u00a3\u00a4\7q\2\2\u00a4\16\3\2\2\2\u00a5\u00a6\7"+
		"o\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa"+
		"\7/\2\2\u00aa\u00ab\7h\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7z\2\2\u00ad"+
		"\u00ae\7q\2\2\u00ae\20\3\2\2\2\u00af\u00b0\7h\2\2\u00b0\u00b1\7k\2\2\u00b1"+
		"\u00b2\7o\2\2\u00b2\u00b3\7/\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7k\2\2"+
		"\u00b5\u00b6\7z\2\2\u00b6\u00b7\7q\2\2\u00b7\22\3\2\2\2\u00b8\u00b9\7"+
		"f\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7x\2\2\u00bb\24\3\2\2\2\u00bc\u00bd"+
		"\7h\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7o\2\2\u00bf\u00c0\7/\2\2\u00c0"+
		"\u00c1\7f\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7x\2\2\u00c3\26\3\2\2\2\u00c4"+
		"\u00c5\7e\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7v\2\2"+
		"\u00c8\u00c9\7c\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc"+
		"\7g\2\2\u00cc\u00cd\7t\2\2\u00cd\30\3\2\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0"+
		"\7k\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7m\2\2\u00d2\32\3\2\2\2\u00d3\u00d4"+
		"\7h\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7o\2\2\u00d6\u00d7\7/\2\2\u00d7"+
		"\u00d8\7n\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7m\2\2"+
		"\u00db\34\3\2\2\2\u00dc\u00dd\7r\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7"+
		"t\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7i\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3"+
		"\7c\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5\7q\2\2\u00e5\36\3\2\2\2\u00e6\u00e7"+
		"\7h\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7o\2\2\u00e9\u00ea\7/\2\2\u00ea"+
		"\u00eb\7r\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7c\2\2"+
		"\u00ee\u00ef\7i\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2"+
		"\7h\2\2\u00f2\u00f3\7q\2\2\u00f3 \3\2\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6"+
		"\7g\2\2\u00f6\u00f7\7z\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7q\2\2\u00f9"+
		"\"\3\2\2\2\u00fa\u00fb\7h\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7o\2\2\u00fd"+
		"\u00fe\7/\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7z\2\2"+
		"\u0101\u0102\7v\2\2\u0102\u0103\7q\2\2\u0103$\3\2\2\2\u0104\u0105\7d\2"+
		"\2\u0105\u0106\7q\2\2\u0106\u0107\7v\2\2\u0107\u0108\7c\2\2\u0108\u0109"+
		"\7q\2\2\u0109&\3\2\2\2\u010a\u010b\7h\2\2\u010b\u010c\7k\2\2\u010c\u010d"+
		"\7o\2\2\u010d\u010e\7/\2\2\u010e\u010f\7d\2\2\u010f\u0110\7q\2\2\u0110"+
		"\u0111\7v\2\2\u0111\u0112\7c\2\2\u0112\u0113\7q\2\2\u0113(\3\2\2\2\u0114"+
		"\u0115\7c\2\2\u0115\u0116\7x\2\2\u0116\u0117\7k\2\2\u0117\u0118\7u\2\2"+
		"\u0118\u0119\7q\2\2\u0119*\3\2\2\2\u011a\u011b\7c\2\2\u011b\u011c\7n\2"+
		"\2\u011c\u011d\7g\2\2\u011d\u011e\7t\2\2\u011e\u011f\7v\2\2\u011f\u0120"+
		"\7c\2\2\u0120,\3\2\2\2\u0121\u0122\7u\2\2\u0122\u0123\7w\2\2\u0123\u0124"+
		"\7e\2\2\u0124\u0125\7g\2\2\u0125\u0126\7u\2\2\u0126\u0127\7u\2\2\u0127"+
		"\u0128\7q\2\2\u0128.\3\2\2\2\u0129\u012a\7g\2\2\u012a\u012b\7t\2\2\u012b"+
		"\u012c\7t\2\2\u012c\u012d\7q\2\2\u012d\60\3\2\2\2\u012e\u012f\7v\2\2\u012f"+
		"\u0130\7k\2\2\u0130\u0131\7v\2\2\u0131\u0132\7w\2\2\u0132\u0133\7n\2\2"+
		"\u0133\u0134\7q\2\2\u0134\62\3\2\2\2\u0135\u0136\7h\2\2\u0136\u0137\7"+
		"k\2\2\u0137\u0138\7o\2\2\u0138\u0139\7/\2\2\u0139\u013a\7v\2\2\u013a\u013b"+
		"\7k\2\2\u013b\u013c\7v\2\2\u013c\u013d\7w\2\2\u013d\u013e\7n\2\2\u013e"+
		"\u013f\7q\2\2\u013f\64\3\2\2\2\u0140\u0141\7u\2\2\u0141\u0142\7w\2\2\u0142"+
		"\u0143\7d\2\2\u0143\u0144\7v\2\2\u0144\u0145\7k\2\2\u0145\u0146\7v\2\2"+
		"\u0146\u0147\7w\2\2\u0147\u0148\7n\2\2\u0148\u0149\7q\2\2\u0149\66\3\2"+
		"\2\2\u014a\u014b\7h\2\2\u014b\u014c\7k\2\2\u014c\u014d\7o\2\2\u014d\u014e"+
		"\7/\2\2\u014e\u014f\7u\2\2\u014f\u0150\7w\2\2\u0150\u0151\7d\2\2\u0151"+
		"\u0152\7v\2\2\u0152\u0153\7k\2\2\u0153\u0154\7v\2\2\u0154\u0155\7w\2\2"+
		"\u0155\u0156\7n\2\2\u0156\u0157\7q\2\2\u01578\3\2\2\2\u0158\u0159\7e\2"+
		"\2\u0159\u015a\7q\2\2\u015a\u015b\7t\2\2\u015b\u015c\7/\2\2\u015c\u015d"+
		"\7h\2\2\u015d\u015e\7w\2\2\u015e\u015f\7p\2\2\u015f\u0160\7f\2\2\u0160"+
		"\u0161\7q\2\2\u0161:\3\2\2\2\u0162\u0163\7h\2\2\u0163\u0164\7k\2\2\u0164"+
		"\u0165\7o\2\2\u0165\u0166\7/\2\2\u0166\u0167\7e\2\2\u0167\u0168\7q\2\2"+
		"\u0168\u0169\7t\2\2\u0169\u016a\7/\2\2\u016a\u016b\7h\2\2\u016b\u016c"+
		"\7w\2\2\u016c\u016d\7p\2\2\u016d\u016e\7f\2\2\u016e\u016f\7q\2\2\u016f"+
		"<\3\2\2\2\u0170\u0171\7e\2\2\u0171\u0172\7q\2\2\u0172\u0173\7t\2\2\u0173"+
		"\u0174\7/\2\2\u0174\u0175\7v\2\2\u0175\u0176\7g\2\2\u0176\u0177\7z\2\2"+
		"\u0177\u0178\7v\2\2\u0178\u0179\7q\2\2\u0179>\3\2\2\2\u017a\u017b\7h\2"+
		"\2\u017b\u017c\7k\2\2\u017c\u017d\7o\2\2\u017d\u017e\7/\2\2\u017e\u017f"+
		"\7e\2\2\u017f\u0180\7q\2\2\u0180\u0181\7t\2\2\u0181\u0182\7/\2\2\u0182"+
		"\u0183\7v\2\2\u0183\u0184\7g\2\2\u0184\u0185\7z\2\2\u0185\u0186\7v\2\2"+
		"\u0186\u0187\7q\2\2\u0187@\3\2\2\2\u0188\u0189\7k\2\2\u0189\u018a\7o\2"+
		"\2\u018a\u018b\7c\2\2\u018b\u018c\7i\2\2\u018c\u018d\7g\2\2\u018d\u018e"+
		"\7o\2\2\u018eB\3\2\2\2\u018f\u0190\7h\2\2\u0190\u0191\7k\2\2\u0191\u0192"+
		"\7o\2\2\u0192\u0193\7/\2\2\u0193\u0194\7k\2\2\u0194\u0195\7o\2\2\u0195"+
		"\u0196\7c\2\2\u0196\u0197\7i\2\2\u0197\u0198\7g\2\2\u0198\u0199\7o\2\2"+
		"\u0199D\3\2\2\2\u019a\u019b\7f\2\2\u019b\u019c\7k\2\2\u019c\u019d\7o\2"+
		"\2\u019d\u019e\7g\2\2\u019e\u019f\7p\2\2\u019f\u01a0\7u\2\2\u01a0\u01a1"+
		"\7q\2\2\u01a1\u01a2\7g\2\2\u01a2\u01a3\7u\2\2\u01a3F\3\2\2\2\u01a4\u01a5"+
		"\7h\2\2\u01a5\u01a6\7k\2\2\u01a6\u01a7\7o\2\2\u01a7\u01a8\7/\2\2\u01a8"+
		"\u01a9\7f\2\2\u01a9\u01aa\7k\2\2\u01aa\u01ab\7o\2\2\u01ab\u01ac\7g\2\2"+
		"\u01ac\u01ad\7p\2\2\u01ad\u01ae\7u\2\2\u01ae\u01af\7q\2\2\u01af\u01b0"+
		"\7g\2\2\u01b0\u01b1\7u\2\2\u01b1H\3\2\2\2\u01b2\u01b3\7o\2\2\u01b3\u01b4"+
		"\7c\2\2\u01b4\u01b5\7r\2\2\u01b5\u01b6\7c\2\2\u01b6J\3\2\2\2\u01b7\u01b8"+
		"\7.\2\2\u01b8L\3\2\2\2\u01b9\u01ba\7h\2\2\u01ba\u01bb\7k\2\2\u01bb\u01bc"+
		"\7o\2\2\u01bc\u01bd\7/\2\2\u01bd\u01be\7o\2\2\u01be\u01bf\7c\2\2\u01bf"+
		"\u01c0\7r\2\2\u01c0\u01c1\7c\2\2\u01c1N\3\2\2\2\u01c2\u01c3\7u\2\2\u01c3"+
		"\u01c4\7n\2\2\u01c4\u01c5\7k\2\2\u01c5\u01c6\7f\2\2\u01c6\u01c7\7g\2\2"+
		"\u01c7\u01c8\7/\2\2\u01c8\u01c9\7u\2\2\u01c9\u01ca\7j\2\2\u01ca\u01cb"+
		"\7q\2\2\u01cb\u01cc\7y\2\2\u01ccP\3\2\2\2\u01cd\u01ce\7h\2\2\u01ce\u01cf"+
		"\7k\2\2\u01cf\u01d0\7o\2\2\u01d0\u01d1\7/\2\2\u01d1\u01d2\7u\2\2\u01d2"+
		"\u01d3\7n\2\2\u01d3\u01d4\7k\2\2\u01d4\u01d5\7f\2\2\u01d5\u01d6\7g\2\2"+
		"\u01d6\u01d7\7/\2\2\u01d7\u01d8\7u\2\2\u01d8\u01d9\7j\2\2\u01d9\u01da"+
		"\7q\2\2\u01da\u01db\7y\2\2\u01dbR\3\2\2\2\u01dc\u01dd\7c\2\2\u01dd\u01de"+
		"\7|\2\2\u01de\u01df\7w\2\2\u01df\u01e0\7n\2\2\u01e0T\3\2\2\2\u01e1\u01e2"+
		"\7x\2\2\u01e2\u01e3\7g\2\2\u01e3\u01e4\7t\2\2\u01e4\u01e5\7o\2\2\u01e5"+
		"\u01e6\7g\2\2\u01e6\u01e7\7n\2\2\u01e7\u01e8\7j\2\2\u01e8\u01e9\7q\2\2"+
		"\u01e9V\3\2\2\2\u01ea\u01eb\7d\2\2\u01eb\u01ec\7t\2\2\u01ec\u01ed\7c\2"+
		"\2\u01ed\u01ee\7p\2\2\u01ee\u01ef\7e\2\2\u01ef\u01f0\7q\2\2\u01f0X\3\2"+
		"\2\2\u01f1\u01f2\7r\2\2\u01f2\u01f3\7t\2\2\u01f3\u01f4\7g\2\2\u01f4\u01f5"+
		"\7v\2\2\u01f5\u01f6\7q\2\2\u01f6Z\3\2\2\2\u01f7\u01f8\7x\2\2\u01f8\u01f9"+
		"\7g\2\2\u01f9\u01fa\7t\2\2\u01fa\u01fb\7f\2\2\u01fb\u01fc\7g\2\2\u01fc"+
		"\\\3\2\2\2\u01fd\u01fe\7c\2\2\u01fe\u01ff\7o\2\2\u01ff\u0200\7c\2\2\u0200"+
		"\u0201\7t\2\2\u0201\u0202\7g\2\2\u0202\u0203\7n\2\2\u0203\u0204\7q\2\2"+
		"\u0204^\3\2\2\2\u0205\u0206\7t\2\2\u0206\u0207\7q\2\2\u0207\u0208\7u\2"+
		"\2\u0208\u0209\7c\2\2\u0209`\3\2\2\2\u020a\u020b\7e\2\2\u020b\u020c\7"+
		"k\2\2\u020c\u020d\7p\2\2\u020d\u020e\7|\2\2\u020e\u020f\7c\2\2\u020fb"+
		"\3\2\2\2\u0210\u0211\7t\2\2\u0211\u0212\7q\2\2\u0212\u0213\7z\2\2\u0213"+
		"\u0214\7q\2\2\u0214d\3\2\2\2\u0215\u0219\7}\2\2\u0216\u0218\n\2\2\2\u0217"+
		"\u0216\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2"+
		"\2\2\u021a\u021c\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021d\7\177\2\2\u021d"+
		"\u021e\3\2\2\2\u021e\u021f\b\63\2\2\u021ff\3\2\2\2\u0220\u0224\7$\2\2"+
		"\u0221\u0223\n\3\2\2\u0222\u0221\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222"+
		"\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0227\3\2\2\2\u0226\u0224\3\2\2\2\u0227"+
		"\u0228\7$\2\2\u0228h\3\2\2\2\u0229\u022b\4\62;\2\u022a\u0229\3\2\2\2\u022b"+
		"\u022c\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022dj\3\2\2\2"+
		"\u022e\u0230\t\4\2\2\u022f\u0231\4\62;\2\u0230\u022f\3\2\2\2\u0230\u0231"+
		"\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u0234\4\62;\2\u0233\u0232\3\2\2\2\u0234"+
		"\u0235\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\3\2"+
		"\2\2\u0237\u0238\7\60\2\2\u0238\u0239\4\62;\2\u0239\u023a\4\62;\2\u023a"+
		"\u023b\4\62;\2\u023b\u023c\4\62;\2\u023cl\3\2\2\2\u023d\u023e\t\5\2\2"+
		"\u023e\u023f\3\2\2\2\u023f\u0240\b\67\3\2\u0240n\3\2\2\2\b\2\u0219\u0224"+
		"\u022c\u0230\u0235\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}