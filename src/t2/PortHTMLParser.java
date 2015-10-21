// Generated from PortHTML.g4 by ANTLR 4.5.1
package t2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PortHTMLParser extends Parser {
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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, COMENTARIO=45, 
		CADEIA=46, INT=47, COORD=48, WS=49;
	public static final int
		RULE_site = 0, RULE_cabecalho = 1, RULE_corpo = 2, RULE_tags = 3, RULE_link = 4, 
		RULE_paragrafo = 5, RULE_texto = 6, RULE_botao = 7, RULE_estado = 8, RULE_titulo = 9, 
		RULE_subtitulo = 10, RULE_cor_fundo = 11, RULE_cor_texto = 12, RULE_imagem = 13, 
		RULE_dimensoes = 14, RULE_largura = 15, RULE_altura = 16, RULE_mapa = 17, 
		RULE_pais = 18, RULE_cidade = 19, RULE_coordenadas = 20, RULE_slide_show = 21, 
		RULE_titulo_site = 22, RULE_nome_pagina = 23, RULE_url = 24, RULE_nome_cor = 25;
	public static final String[] ruleNames = {
		"site", "cabecalho", "corpo", "tags", "link", "paragrafo", "texto", "botao", 
		"estado", "titulo", "subtitulo", "cor_fundo", "cor_texto", "imagem", "dimensoes", 
		"largura", "altura", "mapa", "pais", "cidade", "coordenadas", "slide_show", 
		"titulo_site", "nome_pagina", "url", "nome_cor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'site'", "'fim-site'", "'cabecalho'", "'fim-cabecalho'", "'corpo'", 
		"'fim-corpo'", "'link'", "'fim-link'", "'paragrafo'", "'fim-paragrafo'", 
		"'texto'", "'fim-texto'", "'botao'", "'fim-botao'", "'aviso'", "'alerta'", 
		"'sucesso'", "'erro'", "'titulo'", "'fim-titulo'", "'subtitulo'", "'fim-subtitulo'", 
		"'cor-fundo'", "'fim-cor-fundo'", "'cor-texto'", "'fim-cor-texto'", "'imagem'", 
		"'fim-imagem'", "'dimensoes'", "'fim-dimensoes'", "'mapa'", "','", "'fim-mapa'", 
		"'slide-show'", "'fim-slide-show'", "'azul'", "'vermelho'", "'branco'", 
		"'preto'", "'verde'", "'amarelo'", "'rosa'", "'cinza'", "'roxo'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "COMENTARIO", "CADEIA", 
		"INT", "COORD", "WS"
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

	@Override
	public String getGrammarFileName() { return "PortHTML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PortHTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SiteContext extends ParserRuleContext {
		public CabecalhoContext cabecalho() {
			return getRuleContext(CabecalhoContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public SiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_site; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterSite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitSite(this);
		}
	}

	public final SiteContext site() throws RecognitionException {
		SiteContext _localctx = new SiteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_site);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
			setState(53);
			cabecalho();
			setState(54);
			corpo();
			setState(55);
			match(T__1);
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

	public static class CabecalhoContext extends ParserRuleContext {
		public Titulo_siteContext titulo_site() {
			return getRuleContext(Titulo_siteContext.class,0);
		}
		public CabecalhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecalho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterCabecalho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitCabecalho(this);
		}
	}

	public final CabecalhoContext cabecalho() throws RecognitionException {
		CabecalhoContext _localctx = new CabecalhoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cabecalho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__2);
			setState(58);
			titulo_site();
			setState(59);
			match(T__3);
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

	public static class CorpoContext extends ParserRuleContext {
		public List<TagsContext> tags() {
			return getRuleContexts(TagsContext.class);
		}
		public TagsContext tags(int i) {
			return getRuleContext(TagsContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__4);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << T__26) | (1L << T__30))) != 0)) {
				{
				{
				setState(62);
				tags();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(T__5);
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

	public static class TagsContext extends ParserRuleContext {
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public ParagrafoContext paragrafo() {
			return getRuleContext(ParagrafoContext.class,0);
		}
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public TituloContext titulo() {
			return getRuleContext(TituloContext.class,0);
		}
		public SubtituloContext subtitulo() {
			return getRuleContext(SubtituloContext.class,0);
		}
		public Cor_fundoContext cor_fundo() {
			return getRuleContext(Cor_fundoContext.class,0);
		}
		public ImagemContext imagem() {
			return getRuleContext(ImagemContext.class,0);
		}
		public MapaContext mapa() {
			return getRuleContext(MapaContext.class,0);
		}
		public TagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitTags(this);
		}
	}

	public final TagsContext tags() throws RecognitionException {
		TagsContext _localctx = new TagsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tags);
		try {
			setState(78);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				link();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				paragrafo();
				}
				break;
			case T__10:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				texto();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				titulo();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				subtitulo();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				cor_fundo();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 7);
				{
				setState(76);
				imagem();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 8);
				{
				setState(77);
				mapa();
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

	public static class LinkContext extends ParserRuleContext {
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public Nome_paginaContext nome_pagina() {
			return getRuleContext(Nome_paginaContext.class,0);
		}
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitLink(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__6);
			setState(81);
			url();
			setState(82);
			nome_pagina();
			setState(83);
			match(T__7);
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

	public static class ParagrafoContext extends ParserRuleContext {
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public ParagrafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragrafo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterParagrafo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitParagrafo(this);
		}
	}

	public final ParagrafoContext paragrafo() throws RecognitionException {
		ParagrafoContext _localctx = new ParagrafoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paragrafo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__8);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				{
				setState(86);
				texto();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(T__9);
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

	public static class TextoContext extends ParserRuleContext {
		public EstadoContext estado() {
			return getRuleContext(EstadoContext.class,0);
		}
		public List<TerminalNode> CADEIA() { return getTokens(PortHTMLParser.CADEIA); }
		public TerminalNode CADEIA(int i) {
			return getToken(PortHTMLParser.CADEIA, i);
		}
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitTexto(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_texto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				setState(94);
				estado();
				}
			}

			setState(97);
			match(T__10);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CADEIA) {
				{
				{
				setState(98);
				match(CADEIA);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(T__11);
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

	public static class BotaoContext extends ParserRuleContext {
		public EstadoContext estado() {
			return getRuleContext(EstadoContext.class,0);
		}
		public List<TerminalNode> CADEIA() { return getTokens(PortHTMLParser.CADEIA); }
		public TerminalNode CADEIA(int i) {
			return getToken(PortHTMLParser.CADEIA, i);
		}
		public BotaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_botao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterBotao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitBotao(this);
		}
	}

	public final BotaoContext botao() throws RecognitionException {
		BotaoContext _localctx = new BotaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_botao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				setState(106);
				estado();
				}
			}

			setState(109);
			match(T__12);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CADEIA) {
				{
				{
				setState(110);
				match(CADEIA);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(T__13);
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

	public static class EstadoContext extends ParserRuleContext {
		public EstadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterEstado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitEstado(this);
		}
	}

	public final EstadoContext estado() throws RecognitionException {
		EstadoContext _localctx = new EstadoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_estado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class TituloContext extends ParserRuleContext {
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public TituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterTitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitTitulo(this);
		}
	}

	public final TituloContext titulo() throws RecognitionException {
		TituloContext _localctx = new TituloContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_titulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__18);
			setState(121);
			texto();
			setState(122);
			match(T__19);
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

	public static class SubtituloContext extends ParserRuleContext {
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public SubtituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtitulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterSubtitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitSubtitulo(this);
		}
	}

	public final SubtituloContext subtitulo() throws RecognitionException {
		SubtituloContext _localctx = new SubtituloContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_subtitulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__20);
			setState(125);
			texto();
			setState(126);
			match(T__21);
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

	public static class Cor_fundoContext extends ParserRuleContext {
		public Nome_corContext nome_cor() {
			return getRuleContext(Nome_corContext.class,0);
		}
		public Cor_fundoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cor_fundo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterCor_fundo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitCor_fundo(this);
		}
	}

	public final Cor_fundoContext cor_fundo() throws RecognitionException {
		Cor_fundoContext _localctx = new Cor_fundoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cor_fundo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__22);
			setState(129);
			nome_cor();
			setState(130);
			match(T__23);
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

	public static class Cor_textoContext extends ParserRuleContext {
		public Nome_corContext nome_cor() {
			return getRuleContext(Nome_corContext.class,0);
		}
		public Cor_textoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cor_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterCor_texto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitCor_texto(this);
		}
	}

	public final Cor_textoContext cor_texto() throws RecognitionException {
		Cor_textoContext _localctx = new Cor_textoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cor_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__24);
			setState(133);
			nome_cor();
			setState(134);
			match(T__25);
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

	public static class ImagemContext extends ParserRuleContext {
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public DimensoesContext dimensoes() {
			return getRuleContext(DimensoesContext.class,0);
		}
		public ImagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imagem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterImagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitImagem(this);
		}
	}

	public final ImagemContext imagem() throws RecognitionException {
		ImagemContext _localctx = new ImagemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_imagem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__26);
			setState(137);
			url();
			setState(138);
			dimensoes();
			setState(139);
			match(T__27);
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

	public static class DimensoesContext extends ParserRuleContext {
		public LarguraContext largura() {
			return getRuleContext(LarguraContext.class,0);
		}
		public AlturaContext altura() {
			return getRuleContext(AlturaContext.class,0);
		}
		public DimensoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterDimensoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitDimensoes(this);
		}
	}

	public final DimensoesContext dimensoes() throws RecognitionException {
		DimensoesContext _localctx = new DimensoesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dimensoes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__28);
			setState(142);
			largura();
			setState(143);
			altura();
			setState(144);
			match(T__29);
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

	public static class LarguraContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(PortHTMLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(PortHTMLParser.INT, i);
		}
		public LarguraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_largura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterLargura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitLargura(this);
		}
	}

	public final LarguraContext largura() throws RecognitionException {
		LarguraContext _localctx = new LarguraContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_largura);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(146);
					match(INT);
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class AlturaContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(PortHTMLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(PortHTMLParser.INT, i);
		}
		public AlturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterAltura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitAltura(this);
		}
	}

	public final AlturaContext altura() throws RecognitionException {
		AlturaContext _localctx = new AlturaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_altura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(152);
				match(INT);
				}
				}
				setState(157);
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

	public static class MapaContext extends ParserRuleContext {
		public PaisContext pais() {
			return getRuleContext(PaisContext.class,0);
		}
		public CidadeContext cidade() {
			return getRuleContext(CidadeContext.class,0);
		}
		public CoordenadasContext coordenadas() {
			return getRuleContext(CoordenadasContext.class,0);
		}
		public MapaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterMapa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitMapa(this);
		}
	}

	public final MapaContext mapa() throws RecognitionException {
		MapaContext _localctx = new MapaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mapa);
		try {
			setState(168);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(T__30);
				setState(159);
				pais();
				setState(160);
				match(T__31);
				setState(161);
				cidade();
				setState(162);
				match(T__32);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(T__30);
				setState(165);
				coordenadas();
				setState(166);
				match(T__32);
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

	public static class PaisContext extends ParserRuleContext {
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public PaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterPais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitPais(this);
		}
	}

	public final PaisContext pais() throws RecognitionException {
		PaisContext _localctx = new PaisContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(170);
				texto();
				}
				}
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0) );
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

	public static class CidadeContext extends ParserRuleContext {
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public CidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cidade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterCidade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitCidade(this);
		}
	}

	public final CidadeContext cidade() throws RecognitionException {
		CidadeContext _localctx = new CidadeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cidade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(175);
				texto();
				}
				}
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0) );
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

	public static class CoordenadasContext extends ParserRuleContext {
		public List<TerminalNode> COORD() { return getTokens(PortHTMLParser.COORD); }
		public TerminalNode COORD(int i) {
			return getToken(PortHTMLParser.COORD, i);
		}
		public CoordenadasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordenadas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterCoordenadas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitCoordenadas(this);
		}
	}

	public final CoordenadasContext coordenadas() throws RecognitionException {
		CoordenadasContext _localctx = new CoordenadasContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_coordenadas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(COORD);
			setState(181);
			match(COORD);
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

	public static class Slide_showContext extends ParserRuleContext {
		public List<ImagemContext> imagem() {
			return getRuleContexts(ImagemContext.class);
		}
		public ImagemContext imagem(int i) {
			return getRuleContext(ImagemContext.class,i);
		}
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public Slide_showContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slide_show; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterSlide_show(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitSlide_show(this);
		}
	}

	public final Slide_showContext slide_show() throws RecognitionException {
		Slide_showContext _localctx = new Slide_showContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_slide_show);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__33);
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184);
				imagem();
				setState(186);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) {
					{
					setState(185);
					texto();
					}
				}

				}
				}
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__26 );
			setState(192);
			match(T__34);
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

	public static class Titulo_siteContext extends ParserRuleContext {
		public List<TerminalNode> CADEIA() { return getTokens(PortHTMLParser.CADEIA); }
		public TerminalNode CADEIA(int i) {
			return getToken(PortHTMLParser.CADEIA, i);
		}
		public Titulo_siteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo_site; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterTitulo_site(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitTitulo_site(this);
		}
	}

	public final Titulo_siteContext titulo_site() throws RecognitionException {
		Titulo_siteContext _localctx = new Titulo_siteContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_titulo_site);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CADEIA) {
				{
				{
				setState(194);
				match(CADEIA);
				}
				}
				setState(199);
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

	public static class Nome_paginaContext extends ParserRuleContext {
		public List<TerminalNode> CADEIA() { return getTokens(PortHTMLParser.CADEIA); }
		public TerminalNode CADEIA(int i) {
			return getToken(PortHTMLParser.CADEIA, i);
		}
		public Nome_paginaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_pagina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterNome_pagina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitNome_pagina(this);
		}
	}

	public final Nome_paginaContext nome_pagina() throws RecognitionException {
		Nome_paginaContext _localctx = new Nome_paginaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_nome_pagina);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CADEIA) {
				{
				{
				setState(200);
				match(CADEIA);
				}
				}
				setState(205);
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

	public static class UrlContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(PortHTMLParser.CADEIA, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitUrl(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(CADEIA);
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

	public static class Nome_corContext extends ParserRuleContext {
		public Nome_corContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_cor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterNome_cor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitNome_cor(this);
		}
	}

	public final Nome_corContext nome_cor() throws RecognitionException {
		Nome_corContext _localctx = new Nome_corContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_nome_cor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u00d5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\7\4B"+
		"\n\4\f\4\16\4E\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\7\3\7\3\b\5\bb\n"+
		"\b\3\b\3\b\7\bf\n\b\f\b\16\bi\13\b\3\b\3\b\3\t\5\tn\n\t\3\t\3\t\7\tr\n"+
		"\t\f\t\16\tu\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\7\21\u0096\n\21\f\21\16\21\u0099\13\21\3\22\7\22"+
		"\u009c\n\22\f\22\16\22\u009f\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00ab\n\23\3\24\6\24\u00ae\n\24\r\24\16\24\u00af"+
		"\3\25\6\25\u00b3\n\25\r\25\16\25\u00b4\3\26\3\26\3\26\3\27\3\27\3\27\5"+
		"\27\u00bd\n\27\6\27\u00bf\n\27\r\27\16\27\u00c0\3\27\3\27\3\30\7\30\u00c6"+
		"\n\30\f\30\16\30\u00c9\13\30\3\31\7\31\u00cc\n\31\f\31\16\31\u00cf\13"+
		"\31\3\32\3\32\3\33\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\2\4\3\2\21\24\3\2&.\u00d0\2\66\3\2\2\2\4;\3\2\2"+
		"\2\6?\3\2\2\2\bP\3\2\2\2\nR\3\2\2\2\fW\3\2\2\2\16a\3\2\2\2\20m\3\2\2\2"+
		"\22x\3\2\2\2\24z\3\2\2\2\26~\3\2\2\2\30\u0082\3\2\2\2\32\u0086\3\2\2\2"+
		"\34\u008a\3\2\2\2\36\u008f\3\2\2\2 \u0097\3\2\2\2\"\u009d\3\2\2\2$\u00aa"+
		"\3\2\2\2&\u00ad\3\2\2\2(\u00b2\3\2\2\2*\u00b6\3\2\2\2,\u00b9\3\2\2\2."+
		"\u00c7\3\2\2\2\60\u00cd\3\2\2\2\62\u00d0\3\2\2\2\64\u00d2\3\2\2\2\66\67"+
		"\7\3\2\2\678\5\4\3\289\5\6\4\29:\7\4\2\2:\3\3\2\2\2;<\7\5\2\2<=\5.\30"+
		"\2=>\7\6\2\2>\5\3\2\2\2?C\7\7\2\2@B\5\b\5\2A@\3\2\2\2BE\3\2\2\2CA\3\2"+
		"\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\b\2\2G\7\3\2\2\2HQ\5\n\6\2IQ\5"+
		"\f\7\2JQ\5\16\b\2KQ\5\24\13\2LQ\5\26\f\2MQ\5\30\r\2NQ\5\34\17\2OQ\5$\23"+
		"\2PH\3\2\2\2PI\3\2\2\2PJ\3\2\2\2PK\3\2\2\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2"+
		"\2PO\3\2\2\2Q\t\3\2\2\2RS\7\t\2\2ST\5\62\32\2TU\5\60\31\2UV\7\n\2\2V\13"+
		"\3\2\2\2W[\7\13\2\2XZ\5\16\b\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2"+
		"\2\\^\3\2\2\2][\3\2\2\2^_\7\f\2\2_\r\3\2\2\2`b\5\22\n\2a`\3\2\2\2ab\3"+
		"\2\2\2bc\3\2\2\2cg\7\r\2\2df\7\60\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh"+
		"\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\16\2\2k\17\3\2\2\2ln\5\22\n\2ml\3\2\2"+
		"\2mn\3\2\2\2no\3\2\2\2os\7\17\2\2pr\7\60\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2"+
		"\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\20\2\2w\21\3\2\2\2xy\t\2\2\2y\23"+
		"\3\2\2\2z{\7\25\2\2{|\5\16\b\2|}\7\26\2\2}\25\3\2\2\2~\177\7\27\2\2\177"+
		"\u0080\5\16\b\2\u0080\u0081\7\30\2\2\u0081\27\3\2\2\2\u0082\u0083\7\31"+
		"\2\2\u0083\u0084\5\64\33\2\u0084\u0085\7\32\2\2\u0085\31\3\2\2\2\u0086"+
		"\u0087\7\33\2\2\u0087\u0088\5\64\33\2\u0088\u0089\7\34\2\2\u0089\33\3"+
		"\2\2\2\u008a\u008b\7\35\2\2\u008b\u008c\5\62\32\2\u008c\u008d\5\36\20"+
		"\2\u008d\u008e\7\36\2\2\u008e\35\3\2\2\2\u008f\u0090\7\37\2\2\u0090\u0091"+
		"\5 \21\2\u0091\u0092\5\"\22\2\u0092\u0093\7 \2\2\u0093\37\3\2\2\2\u0094"+
		"\u0096\7\61\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0098!\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009c"+
		"\7\61\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2"+
		"\u009d\u009e\3\2\2\2\u009e#\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7"+
		"!\2\2\u00a1\u00a2\5&\24\2\u00a2\u00a3\7\"\2\2\u00a3\u00a4\5(\25\2\u00a4"+
		"\u00a5\7#\2\2\u00a5\u00ab\3\2\2\2\u00a6\u00a7\7!\2\2\u00a7\u00a8\5*\26"+
		"\2\u00a8\u00a9\7#\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a0\3\2\2\2\u00aa\u00a6"+
		"\3\2\2\2\u00ab%\3\2\2\2\u00ac\u00ae\5\16\b\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\'\3\2\2\2"+
		"\u00b1\u00b3\5\16\b\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5)\3\2\2\2\u00b6\u00b7\7\62\2\2\u00b7"+
		"\u00b8\7\62\2\2\u00b8+\3\2\2\2\u00b9\u00be\7$\2\2\u00ba\u00bc\5\34\17"+
		"\2\u00bb\u00bd\5\16\b\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00ba\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7%\2\2\u00c3"+
		"-\3\2\2\2\u00c4\u00c6\7\60\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2"+
		"\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8/\3\2\2\2\u00c9\u00c7\3"+
		"\2\2\2\u00ca\u00cc\7\60\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\61\3\2\2\2\u00cf\u00cd\3\2\2"+
		"\2\u00d0\u00d1\7\60\2\2\u00d1\63\3\2\2\2\u00d2\u00d3\t\3\2\2\u00d3\65"+
		"\3\2\2\2\22CP[agms\u0097\u009d\u00aa\u00af\u00b4\u00bc\u00c0\u00c7\u00cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}