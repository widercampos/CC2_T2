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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, COMENTARIO=50, CADEIA=51, INT=52, 
		COORD=53, WS=54;
	public static final int
		RULE_site = 0, RULE_cabecalho = 1, RULE_corpo = 2, RULE_tags = 3, RULE_menu_fixo = 4, 
		RULE_div = 5, RULE_container = 6, RULE_link = 7, RULE_paragrafo = 8, RULE_texto = 9, 
		RULE_botao = 10, RULE_estado = 11, RULE_titulo = 12, RULE_subtitulo = 13, 
		RULE_cor_fundo = 14, RULE_cor_texto = 15, RULE_imagem = 16, RULE_dimensoes = 17, 
		RULE_largura = 18, RULE_altura = 19, RULE_mapa = 20, RULE_pais = 21, RULE_cidade = 22, 
		RULE_coordenadas = 23, RULE_slide_show = 24, RULE_titulo_site = 25, RULE_nome_pagina = 26, 
		RULE_url = 27, RULE_nome_cor = 28;
	public static final String[] ruleNames = {
		"site", "cabecalho", "corpo", "tags", "menu_fixo", "div", "container", 
		"link", "paragrafo", "texto", "botao", "estado", "titulo", "subtitulo", 
		"cor_fundo", "cor_texto", "imagem", "dimensoes", "largura", "altura", 
		"mapa", "pais", "cidade", "coordenadas", "slide_show", "titulo_site", 
		"nome_pagina", "url", "nome_cor"
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
			setState(58);
			match(T__0);
			setState(59);
			cabecalho();
			setState(60);
			corpo();
			setState(61);
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
			setState(63);
			match(T__2);
			setState(64);
			titulo_site();
			setState(65);
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
			setState(67);
			match(T__4);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__31) | (1L << T__35) | (1L << T__38))) != 0)) {
				{
				{
				setState(68);
				tags();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
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
		public BotaoContext botao() {
			return getRuleContext(BotaoContext.class,0);
		}
		public Slide_showContext slide_show() {
			return getRuleContext(Slide_showContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public Menu_fixoContext menu_fixo() {
			return getRuleContext(Menu_fixoContext.class,0);
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
			setState(89);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				link();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				paragrafo();
				}
				break;
			case T__15:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				texto();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				titulo();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				subtitulo();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				cor_fundo();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 7);
				{
				setState(82);
				imagem();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 8);
				{
				setState(83);
				mapa();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 9);
				{
				setState(84);
				botao();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 10);
				{
				setState(85);
				slide_show();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 11);
				{
				setState(86);
				div();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 12);
				{
				setState(87);
				container();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 13);
				{
				setState(88);
				menu_fixo();
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

	public static class Menu_fixoContext extends ParserRuleContext {
		public List<LinkContext> link() {
			return getRuleContexts(LinkContext.class);
		}
		public LinkContext link(int i) {
			return getRuleContext(LinkContext.class,i);
		}
		public Menu_fixoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menu_fixo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterMenu_fixo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitMenu_fixo(this);
		}
	}

	public final Menu_fixoContext menu_fixo() throws RecognitionException {
		Menu_fixoContext _localctx = new Menu_fixoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_menu_fixo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__6);
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				link();
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
			setState(97);
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

	public static class DivContext extends ParserRuleContext {
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public List<TagsContext> tags() {
			return getRuleContexts(TagsContext.class);
		}
		public TagsContext tags(int i) {
			return getRuleContext(TagsContext.class,i);
		}
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitDiv(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__8);
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(100);
				container();
				}
				break;
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__31) | (1L << T__35) | (1L << T__38))) != 0)) {
				{
				{
				setState(103);
				tags();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
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

	public static class ContainerContext extends ParserRuleContext {
		public ContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitContainer(this);
		}
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_container);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__10);
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
		enterRule(_localctx, 14, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__11);
			setState(114);
			url();
			setState(115);
			nome_pagina();
			setState(116);
			match(T__12);
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
		enterRule(_localctx, 16, RULE_paragrafo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__13);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) {
				{
				{
				setState(119);
				texto();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(T__14);
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
		public TerminalNode CADEIA() { return getToken(PortHTMLParser.CADEIA, 0); }
		public EstadoContext estado() {
			return getRuleContext(EstadoContext.class,0);
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
		enterRule(_localctx, 18, RULE_texto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) {
				{
				setState(127);
				estado();
				}
			}

			setState(130);
			match(T__15);
			setState(131);
			match(CADEIA);
			setState(132);
			match(T__16);
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
		public TerminalNode CADEIA() { return getToken(PortHTMLParser.CADEIA, 0); }
		public EstadoContext estado() {
			return getRuleContext(EstadoContext.class,0);
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
		enterRule(_localctx, 20, RULE_botao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__17);
			setState(136);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) {
				{
				setState(135);
				estado();
				}
			}

			setState(138);
			match(CADEIA);
			setState(139);
			match(T__18);
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
		enterRule(_localctx, 22, RULE_estado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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
		enterRule(_localctx, 24, RULE_titulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__23);
			setState(144);
			texto();
			setState(145);
			match(T__24);
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
		enterRule(_localctx, 26, RULE_subtitulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__25);
			setState(148);
			texto();
			setState(149);
			match(T__26);
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
		enterRule(_localctx, 28, RULE_cor_fundo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__27);
			setState(152);
			nome_cor();
			setState(153);
			match(T__28);
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
		enterRule(_localctx, 30, RULE_cor_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__29);
			setState(156);
			nome_cor();
			setState(157);
			match(T__30);
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
		enterRule(_localctx, 32, RULE_imagem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__31);
			setState(160);
			url();
			setState(161);
			dimensoes();
			setState(162);
			match(T__32);
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
		enterRule(_localctx, 34, RULE_dimensoes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__33);
			setState(165);
			largura();
			setState(166);
			altura();
			setState(167);
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
		enterRule(_localctx, 36, RULE_largura);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(169);
					match(INT);
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 38, RULE_altura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(175);
				match(INT);
				}
				}
				setState(180);
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
		enterRule(_localctx, 40, RULE_mapa);
		try {
			setState(191);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(T__35);
				setState(182);
				pais();
				setState(183);
				match(T__36);
				setState(184);
				cidade();
				setState(185);
				match(T__37);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(T__35);
				setState(188);
				coordenadas();
				setState(189);
				match(T__37);
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
		enterRule(_localctx, 42, RULE_pais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(193);
				texto();
				}
				}
				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0) );
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
		enterRule(_localctx, 44, RULE_cidade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198);
				texto();
				}
				}
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0) );
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
		enterRule(_localctx, 46, RULE_coordenadas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(COORD);
			setState(204);
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
		enterRule(_localctx, 48, RULE_slide_show);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__38);
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(207);
				imagem();
				setState(209);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) {
					{
					setState(208);
					texto();
					}
				}

				}
				}
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__31 );
			setState(215);
			match(T__39);
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
		public TerminalNode CADEIA() { return getToken(PortHTMLParser.CADEIA, 0); }
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
		enterRule(_localctx, 50, RULE_titulo_site);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
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

	public static class Nome_paginaContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(PortHTMLParser.CADEIA, 0); }
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
		enterRule(_localctx, 52, RULE_nome_pagina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
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
		enterRule(_localctx, 54, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
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
		enterRule(_localctx, 56, RULE_nome_cor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48))) != 0)) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38\u00e4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\\\n\5\3\6\3\6\6\6`\n\6\r\6"+
		"\16\6a\3\6\3\6\3\7\3\7\5\7h\n\7\3\7\7\7k\n\7\f\7\16\7n\13\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\7\n{\n\n\f\n\16\n~\13\n\3\n\3\n\3\13"+
		"\5\13\u0083\n\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u008b\n\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\7\24\u00ad\n\24\f\24\16\24\u00b0\13\24\3\25\7\25\u00b3\n\25\f\25\16"+
		"\25\u00b6\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u00c2\n\26\3\27\6\27\u00c5\n\27\r\27\16\27\u00c6\3\30\6\30\u00ca\n\30"+
		"\r\30\16\30\u00cb\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u00d4\n\32\6\32\u00d6"+
		"\n\32\r\32\16\32\u00d7\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:\2\4\3\2\26\31\3\2+\63\u00e0\2<\3\2\2\2\4A\3\2\2\2\6E\3\2\2\2"+
		"\b[\3\2\2\2\n]\3\2\2\2\fe\3\2\2\2\16q\3\2\2\2\20s\3\2\2\2\22x\3\2\2\2"+
		"\24\u0082\3\2\2\2\26\u0088\3\2\2\2\30\u008f\3\2\2\2\32\u0091\3\2\2\2\34"+
		"\u0095\3\2\2\2\36\u0099\3\2\2\2 \u009d\3\2\2\2\"\u00a1\3\2\2\2$\u00a6"+
		"\3\2\2\2&\u00ae\3\2\2\2(\u00b4\3\2\2\2*\u00c1\3\2\2\2,\u00c4\3\2\2\2."+
		"\u00c9\3\2\2\2\60\u00cd\3\2\2\2\62\u00d0\3\2\2\2\64\u00db\3\2\2\2\66\u00dd"+
		"\3\2\2\28\u00df\3\2\2\2:\u00e1\3\2\2\2<=\7\3\2\2=>\5\4\3\2>?\5\6\4\2?"+
		"@\7\4\2\2@\3\3\2\2\2AB\7\5\2\2BC\5\64\33\2CD\7\6\2\2D\5\3\2\2\2EI\7\7"+
		"\2\2FH\5\b\5\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2"+
		"\2\2LM\7\b\2\2M\7\3\2\2\2N\\\5\20\t\2O\\\5\22\n\2P\\\5\24\13\2Q\\\5\32"+
		"\16\2R\\\5\34\17\2S\\\5\36\20\2T\\\5\"\22\2U\\\5*\26\2V\\\5\26\f\2W\\"+
		"\5\62\32\2X\\\5\f\7\2Y\\\5\16\b\2Z\\\5\n\6\2[N\3\2\2\2[O\3\2\2\2[P\3\2"+
		"\2\2[Q\3\2\2\2[R\3\2\2\2[S\3\2\2\2[T\3\2\2\2[U\3\2\2\2[V\3\2\2\2[W\3\2"+
		"\2\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\t\3\2\2\2]_\7\t\2\2^`\5\20\t\2_^"+
		"\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\n\2\2d\13\3\2\2\2"+
		"eg\7\13\2\2fh\5\16\b\2gf\3\2\2\2gh\3\2\2\2hl\3\2\2\2ik\5\b\5\2ji\3\2\2"+
		"\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\f\2\2p\r\3\2"+
		"\2\2qr\7\r\2\2r\17\3\2\2\2st\7\16\2\2tu\58\35\2uv\5\66\34\2vw\7\17\2\2"+
		"w\21\3\2\2\2x|\7\20\2\2y{\5\24\13\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3"+
		"\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\21\2\2\u0080\23\3\2\2\2\u0081"+
		"\u0083\5\30\r\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3"+
		"\2\2\2\u0084\u0085\7\22\2\2\u0085\u0086\7\65\2\2\u0086\u0087\7\23\2\2"+
		"\u0087\25\3\2\2\2\u0088\u008a\7\24\2\2\u0089\u008b\5\30\r\2\u008a\u0089"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\65\2\2"+
		"\u008d\u008e\7\25\2\2\u008e\27\3\2\2\2\u008f\u0090\t\2\2\2\u0090\31\3"+
		"\2\2\2\u0091\u0092\7\32\2\2\u0092\u0093\5\24\13\2\u0093\u0094\7\33\2\2"+
		"\u0094\33\3\2\2\2\u0095\u0096\7\34\2\2\u0096\u0097\5\24\13\2\u0097\u0098"+
		"\7\35\2\2\u0098\35\3\2\2\2\u0099\u009a\7\36\2\2\u009a\u009b\5:\36\2\u009b"+
		"\u009c\7\37\2\2\u009c\37\3\2\2\2\u009d\u009e\7 \2\2\u009e\u009f\5:\36"+
		"\2\u009f\u00a0\7!\2\2\u00a0!\3\2\2\2\u00a1\u00a2\7\"\2\2\u00a2\u00a3\5"+
		"8\35\2\u00a3\u00a4\5$\23\2\u00a4\u00a5\7#\2\2\u00a5#\3\2\2\2\u00a6\u00a7"+
		"\7$\2\2\u00a7\u00a8\5&\24\2\u00a8\u00a9\5(\25\2\u00a9\u00aa\7%\2\2\u00aa"+
		"%\3\2\2\2\u00ab\u00ad\7\66\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2"+
		"\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\'\3\2\2\2\u00b0\u00ae\3"+
		"\2\2\2\u00b1\u00b3\7\66\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5)\3\2\2\2\u00b6\u00b4\3\2\2\2"+
		"\u00b7\u00b8\7&\2\2\u00b8\u00b9\5,\27\2\u00b9\u00ba\7\'\2\2\u00ba\u00bb"+
		"\5.\30\2\u00bb\u00bc\7(\2\2\u00bc\u00c2\3\2\2\2\u00bd\u00be\7&\2\2\u00be"+
		"\u00bf\5\60\31\2\u00bf\u00c0\7(\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00b7\3"+
		"\2\2\2\u00c1\u00bd\3\2\2\2\u00c2+\3\2\2\2\u00c3\u00c5\5\24\13\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7-\3\2\2\2\u00c8\u00ca\5\24\13\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc/\3\2\2\2\u00cd"+
		"\u00ce\7\67\2\2\u00ce\u00cf\7\67\2\2\u00cf\61\3\2\2\2\u00d0\u00d5\7)\2"+
		"\2\u00d1\u00d3\5\"\22\2\u00d2\u00d4\5\24\13\2\u00d3\u00d2\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\7*\2\2\u00da\63\3\2\2\2\u00db\u00dc\7\65\2\2\u00dc\65\3\2\2\2\u00dd"+
		"\u00de\7\65\2\2\u00de\67\3\2\2\2\u00df\u00e0\7\65\2\2\u00e09\3\2\2\2\u00e1"+
		"\u00e2\t\3\2\2\u00e2;\3\2\2\2\21I[agl|\u0082\u008a\u00ae\u00b4\u00c1\u00c6"+
		"\u00cb\u00d3\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}