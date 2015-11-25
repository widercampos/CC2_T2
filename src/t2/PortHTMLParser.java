// Generated from C:\Users\J\Desktop\CC2\T2\src\t2\PortHTML.g4 by ANTLR 4.5.1
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
		COMENTARIO=46, CADEIA=47, ESP=48, SPAN=49, IDENT=50, INT=51, COORDENADA=52, 
		WS=53;
	public static final int
		RULE_site = 0, RULE_cabecalho = 1, RULE_corpo = 2, RULE_tags = 3, RULE_menu_fixo = 4, 
		RULE_nome_link = 5, RULE_linha = 6, RULE_coluna_tags = 7, RULE_coluna = 8, 
		RULE_definir = 9, RULE_container = 10, RULE_link = 11, RULE_texto = 12, 
		RULE_botao = 13, RULE_estado = 14, RULE_titulo = 15, RULE_subtitulo = 16, 
		RULE_cor_fundo = 17, RULE_imagem = 18, RULE_dimensoes = 19, RULE_largura = 20, 
		RULE_altura = 21, RULE_mapa = 22, RULE_pais = 23, RULE_cidade = 24, RULE_coordenadas = 25, 
		RULE_slide_show = 26, RULE_titulo_site = 27, RULE_nome_pagina = 28, RULE_url = 29, 
		RULE_nome_cor = 30, RULE_latitude = 31, RULE_longitude = 32;
	public static final String[] ruleNames = {
		"site", "cabecalho", "corpo", "tags", "menu_fixo", "nome_link", "linha", 
		"coluna_tags", "coluna", "definir", "container", "link", "texto", "botao", 
		"estado", "titulo", "subtitulo", "cor_fundo", "imagem", "dimensoes", "largura", 
		"altura", "mapa", "pais", "cidade", "coordenadas", "slide_show", "titulo_site", 
		"nome_pagina", "url", "nome_cor", "latitude", "longitude"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'site'", "'fim-site'", "'cabecalho'", "'fim-cabecalho'", "'corpo'", 
		"'fim-corpo'", "'menu-fixo'", "'fim-fixo'", "'linha'", "'fim-linha'", 
		"'coluna'", "'fim-coluna'", "'definir'", "'como'", "'container'", "'link'", 
		"'fim-link'", "'texto'", "'fim-texto'", "'botao'", "'fim-botao'", "'aviso'", 
		"'alerta'", "'sucesso'", "'erro'", "'titulo'", "'fim-titulo'", "'subtitulo'", 
		"'fim-subtitulo'", "'imagem'", "'fim-imagem'", "'dimensoes'", "'fim-dimensoes'", 
		"'mapa'", "'fim-mapa'", "'slide-show'", "'fim-slide-show'", "'azul'", 
		"'vermelho'", "'branco'", "'preto'", "'verde'", "'amarelo'", "'rosa'", 
		"'cinza'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "COMENTARIO", 
		"CADEIA", "ESP", "SPAN", "IDENT", "INT", "COORDENADA", "WS"
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
			setState(66);
			match(T__0);
			setState(67);
			cabecalho();
			setState(68);
			corpo();
			setState(69);
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
			setState(71);
			match(T__2);
			setState(72);
			titulo_site();
			setState(73);
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
		public Cor_fundoContext cor_fundo() {
			return getRuleContext(Cor_fundoContext.class,0);
		}
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
			setState(75);
			match(T__4);
			setState(77);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) {
				{
				setState(76);
				cor_fundo();
				}
			}

			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__12) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__33) | (1L << T__35))) != 0)) {
				{
				{
				setState(79);
				tags();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
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
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public TituloContext titulo() {
			return getRuleContext(TituloContext.class,0);
		}
		public SubtituloContext subtitulo() {
			return getRuleContext(SubtituloContext.class,0);
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
		public Menu_fixoContext menu_fixo() {
			return getRuleContext(Menu_fixoContext.class,0);
		}
		public DefinirContext definir() {
			return getRuleContext(DefinirContext.class,0);
		}
		public LinhaContext linha() {
			return getRuleContext(LinhaContext.class,0);
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
			setState(98);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				link();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				texto();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				titulo();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				subtitulo();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				imagem();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				mapa();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				botao();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 8);
				{
				setState(94);
				slide_show();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 9);
				{
				setState(95);
				menu_fixo();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 10);
				{
				setState(96);
				definir();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 11);
				{
				setState(97);
				linha();
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
		public List<Nome_linkContext> nome_link() {
			return getRuleContexts(Nome_linkContext.class);
		}
		public Nome_linkContext nome_link(int i) {
			return getRuleContext(Nome_linkContext.class,i);
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
			setState(100);
			match(T__6);
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				nome_link();
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__15 );
			setState(106);
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

	public static class Nome_linkContext extends ParserRuleContext {
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public Nome_linkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterNome_link(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitNome_link(this);
		}
	}

	public final Nome_linkContext nome_link() throws RecognitionException {
		Nome_linkContext _localctx = new Nome_linkContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nome_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			link();
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

	public static class LinhaContext extends ParserRuleContext {
		public List<Coluna_tagsContext> coluna_tags() {
			return getRuleContexts(Coluna_tagsContext.class);
		}
		public Coluna_tagsContext coluna_tags(int i) {
			return getRuleContext(Coluna_tagsContext.class,i);
		}
		public LinhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterLinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitLinha(this);
		}
	}

	public final LinhaContext linha() throws RecognitionException {
		LinhaContext _localctx = new LinhaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_linha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__8);
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				coluna_tags();
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 );
			setState(116);
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

	public static class Coluna_tagsContext extends ParserRuleContext {
		public ColunaContext coluna() {
			return getRuleContext(ColunaContext.class,0);
		}
		public List<TagsContext> tags() {
			return getRuleContexts(TagsContext.class);
		}
		public TagsContext tags(int i) {
			return getRuleContext(TagsContext.class,i);
		}
		public Coluna_tagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coluna_tags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterColuna_tags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitColuna_tags(this);
		}
	}

	public final Coluna_tagsContext coluna_tags() throws RecognitionException {
		Coluna_tagsContext _localctx = new Coluna_tagsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_coluna_tags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__10);
			setState(119);
			coluna();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__12) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__33) | (1L << T__35))) != 0)) {
				{
				{
				setState(120);
				tags();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
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

	public static class ColunaContext extends ParserRuleContext {
		public TerminalNode SPAN() { return getToken(PortHTMLParser.SPAN, 0); }
		public TerminalNode ESP() { return getToken(PortHTMLParser.ESP, 0); }
		public ColunaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coluna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterColuna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitColuna(this);
		}
	}

	public final ColunaContext coluna() throws RecognitionException {
		ColunaContext _localctx = new ColunaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_coluna);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(SPAN);
			setState(130);
			_la = _input.LA(1);
			if (_la==ESP) {
				{
				setState(129);
				match(ESP);
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

	public static class DefinirContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(PortHTMLParser.IDENT, 0); }
		public TerminalNode CADEIA() { return getToken(PortHTMLParser.CADEIA, 0); }
		public DefinirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterDefinir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitDefinir(this);
		}
	}

	public final DefinirContext definir() throws RecognitionException {
		DefinirContext _localctx = new DefinirContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_definir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__12);
			setState(133);
			match(IDENT);
			setState(134);
			match(T__13);
			setState(135);
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
		enterRule(_localctx, 20, RULE_container);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
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
		enterRule(_localctx, 22, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__15);
			setState(140);
			url();
			setState(141);
			nome_pagina();
			setState(142);
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

	public static class TextoContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(PortHTMLParser.CADEIA, 0); }
		public EstadoContext estado() {
			return getRuleContext(EstadoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(PortHTMLParser.IDENT, 0); }
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
		enterRule(_localctx, 24, RULE_texto);
		int _la;
		try {
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(T__17);
				setState(146);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) {
					{
					setState(145);
					estado();
					}
				}

				setState(148);
				match(CADEIA);
				setState(149);
				match(T__18);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(T__17);
				setState(152);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) {
					{
					setState(151);
					estado();
					}
				}

				setState(154);
				match(IDENT);
				setState(155);
				match(T__18);
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
		enterRule(_localctx, 26, RULE_botao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__19);
			setState(160);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) {
				{
				setState(159);
				estado();
				}
			}

			setState(162);
			match(CADEIA);
			setState(163);
			match(T__20);
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
		enterRule(_localctx, 28, RULE_estado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
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
		public TerminalNode CADEIA() { return getToken(PortHTMLParser.CADEIA, 0); }
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
		enterRule(_localctx, 30, RULE_titulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__25);
			setState(168);
			match(CADEIA);
			setState(169);
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

	public static class SubtituloContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(PortHTMLParser.CADEIA, 0); }
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
		enterRule(_localctx, 32, RULE_subtitulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__27);
			setState(172);
			match(CADEIA);
			setState(173);
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
		enterRule(_localctx, 34, RULE_cor_fundo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			nome_cor();
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
		enterRule(_localctx, 36, RULE_imagem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__29);
			setState(178);
			url();
			setState(179);
			dimensoes();
			setState(180);
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
		enterRule(_localctx, 38, RULE_dimensoes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__31);
			setState(183);
			largura();
			setState(184);
			altura();
			setState(185);
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

	public static class LarguraContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PortHTMLParser.INT, 0); }
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
		enterRule(_localctx, 40, RULE_largura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(INT);
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
		public TerminalNode INT() { return getToken(PortHTMLParser.INT, 0); }
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
		enterRule(_localctx, 42, RULE_altura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(INT);
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
		enterRule(_localctx, 44, RULE_mapa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__33);
			setState(192);
			coordenadas();
			setState(193);
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
		enterRule(_localctx, 46, RULE_pais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(195);
				texto();
				}
				}
				setState(198); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__17 );
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
		enterRule(_localctx, 48, RULE_cidade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(200);
				texto();
				}
				}
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__17 );
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
		public LatitudeContext latitude() {
			return getRuleContext(LatitudeContext.class,0);
		}
		public LongitudeContext longitude() {
			return getRuleContext(LongitudeContext.class,0);
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
		enterRule(_localctx, 50, RULE_coordenadas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			latitude();
			setState(206);
			longitude();
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
		enterRule(_localctx, 52, RULE_slide_show);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__35);
			setState(213); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(209);
				imagem();
				setState(211);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(210);
					texto();
					}
				}

				}
				}
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__29 );
			setState(217);
			match(T__36);
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
		enterRule(_localctx, 54, RULE_titulo_site);
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
		enterRule(_localctx, 56, RULE_nome_pagina);
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

	public static class UrlContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(PortHTMLParser.CADEIA, 0); }
		public TerminalNode IDENT() { return getToken(PortHTMLParser.IDENT, 0); }
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
		enterRule(_localctx, 58, RULE_url);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !(_la==CADEIA || _la==IDENT) ) {
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
		enterRule(_localctx, 60, RULE_nome_cor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) ) {
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

	public static class LatitudeContext extends ParserRuleContext {
		public TerminalNode COORDENADA() { return getToken(PortHTMLParser.COORDENADA, 0); }
		public LatitudeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latitude; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterLatitude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitLatitude(this);
		}
	}

	public final LatitudeContext latitude() throws RecognitionException {
		LatitudeContext _localctx = new LatitudeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_latitude);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(COORDENADA);
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

	public static class LongitudeContext extends ParserRuleContext {
		public TerminalNode COORDENADA() { return getToken(PortHTMLParser.COORDENADA, 0); }
		public LongitudeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longitude; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterLongitude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitLongitude(this);
		}
	}

	public final LongitudeContext longitude() throws RecognitionException {
		LongitudeContext _localctx = new LongitudeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_longitude);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(COORDENADA);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\u00ea\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\5\4P\n\4\3\4\7"+
		"\4S\n\4\f\4\16\4V\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5e\n\5\3\6\3\6\6\6i\n\6\r\6\16\6j\3\6\3\6\3\7\3\7\3\b\3\b\6\bs"+
		"\n\b\r\b\16\bt\3\b\3\b\3\t\3\t\3\t\7\t|\n\t\f\t\16\t\177\13\t\3\t\3\t"+
		"\3\n\3\n\5\n\u0085\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\5\16\u0095\n\16\3\16\3\16\3\16\3\16\5\16\u009b\n\16\3"+
		"\16\3\16\5\16\u009f\n\16\3\17\3\17\5\17\u00a3\n\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\31\6\31\u00c7\n\31\r\31\16\31\u00c8\3\32\6\32\u00cc\n\32\r\32"+
		"\16\32\u00cd\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u00d6\n\34\6\34\u00d8"+
		"\n\34\r\34\16\34\u00d9\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3"+
		"!\3!\3\"\3\"\3\"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@B\2\5\3\2\30\33\4\2\61\61\64\64\3\2(/\u00e0\2D\3\2\2"+
		"\2\4I\3\2\2\2\6M\3\2\2\2\bd\3\2\2\2\nf\3\2\2\2\fn\3\2\2\2\16p\3\2\2\2"+
		"\20x\3\2\2\2\22\u0082\3\2\2\2\24\u0086\3\2\2\2\26\u008b\3\2\2\2\30\u008d"+
		"\3\2\2\2\32\u009e\3\2\2\2\34\u00a0\3\2\2\2\36\u00a7\3\2\2\2 \u00a9\3\2"+
		"\2\2\"\u00ad\3\2\2\2$\u00b1\3\2\2\2&\u00b3\3\2\2\2(\u00b8\3\2\2\2*\u00bd"+
		"\3\2\2\2,\u00bf\3\2\2\2.\u00c1\3\2\2\2\60\u00c6\3\2\2\2\62\u00cb\3\2\2"+
		"\2\64\u00cf\3\2\2\2\66\u00d2\3\2\2\28\u00dd\3\2\2\2:\u00df\3\2\2\2<\u00e1"+
		"\3\2\2\2>\u00e3\3\2\2\2@\u00e5\3\2\2\2B\u00e7\3\2\2\2DE\7\3\2\2EF\5\4"+
		"\3\2FG\5\6\4\2GH\7\4\2\2H\3\3\2\2\2IJ\7\5\2\2JK\58\35\2KL\7\6\2\2L\5\3"+
		"\2\2\2MO\7\7\2\2NP\5$\23\2ON\3\2\2\2OP\3\2\2\2PT\3\2\2\2QS\5\b\5\2RQ\3"+
		"\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\b\2\2X\7"+
		"\3\2\2\2Ye\5\30\r\2Ze\5\32\16\2[e\5 \21\2\\e\5\"\22\2]e\5&\24\2^e\5.\30"+
		"\2_e\5\34\17\2`e\5\66\34\2ae\5\n\6\2be\5\24\13\2ce\5\16\b\2dY\3\2\2\2"+
		"dZ\3\2\2\2d[\3\2\2\2d\\\3\2\2\2d]\3\2\2\2d^\3\2\2\2d_\3\2\2\2d`\3\2\2"+
		"\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2e\t\3\2\2\2fh\7\t\2\2gi\5\f\7\2hg\3\2"+
		"\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\n\2\2m\13\3\2\2\2no\5"+
		"\30\r\2o\r\3\2\2\2pr\7\13\2\2qs\5\20\t\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2"+
		"tu\3\2\2\2uv\3\2\2\2vw\7\f\2\2w\17\3\2\2\2xy\7\r\2\2y}\5\22\n\2z|\5\b"+
		"\5\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3"+
		"\2\2\2\u0080\u0081\7\16\2\2\u0081\21\3\2\2\2\u0082\u0084\7\63\2\2\u0083"+
		"\u0085\7\62\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\23\3\2\2"+
		"\2\u0086\u0087\7\17\2\2\u0087\u0088\7\64\2\2\u0088\u0089\7\20\2\2\u0089"+
		"\u008a\7\61\2\2\u008a\25\3\2\2\2\u008b\u008c\7\21\2\2\u008c\27\3\2\2\2"+
		"\u008d\u008e\7\22\2\2\u008e\u008f\5<\37\2\u008f\u0090\5:\36\2\u0090\u0091"+
		"\7\23\2\2\u0091\31\3\2\2\2\u0092\u0094\7\24\2\2\u0093\u0095\5\36\20\2"+
		"\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097"+
		"\7\61\2\2\u0097\u009f\7\25\2\2\u0098\u009a\7\24\2\2\u0099\u009b\5\36\20"+
		"\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d"+
		"\7\64\2\2\u009d\u009f\7\25\2\2\u009e\u0092\3\2\2\2\u009e\u0098\3\2\2\2"+
		"\u009f\33\3\2\2\2\u00a0\u00a2\7\26\2\2\u00a1\u00a3\5\36\20\2\u00a2\u00a1"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7\61\2\2"+
		"\u00a5\u00a6\7\27\2\2\u00a6\35\3\2\2\2\u00a7\u00a8\t\2\2\2\u00a8\37\3"+
		"\2\2\2\u00a9\u00aa\7\34\2\2\u00aa\u00ab\7\61\2\2\u00ab\u00ac\7\35\2\2"+
		"\u00ac!\3\2\2\2\u00ad\u00ae\7\36\2\2\u00ae\u00af\7\61\2\2\u00af\u00b0"+
		"\7\37\2\2\u00b0#\3\2\2\2\u00b1\u00b2\5> \2\u00b2%\3\2\2\2\u00b3\u00b4"+
		"\7 \2\2\u00b4\u00b5\5<\37\2\u00b5\u00b6\5(\25\2\u00b6\u00b7\7!\2\2\u00b7"+
		"\'\3\2\2\2\u00b8\u00b9\7\"\2\2\u00b9\u00ba\5*\26\2\u00ba\u00bb\5,\27\2"+
		"\u00bb\u00bc\7#\2\2\u00bc)\3\2\2\2\u00bd\u00be\7\65\2\2\u00be+\3\2\2\2"+
		"\u00bf\u00c0\7\65\2\2\u00c0-\3\2\2\2\u00c1\u00c2\7$\2\2\u00c2\u00c3\5"+
		"\64\33\2\u00c3\u00c4\7%\2\2\u00c4/\3\2\2\2\u00c5\u00c7\5\32\16\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\61\3\2\2\2\u00ca\u00cc\5\32\16\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\63\3\2\2"+
		"\2\u00cf\u00d0\5@!\2\u00d0\u00d1\5B\"\2\u00d1\65\3\2\2\2\u00d2\u00d7\7"+
		"&\2\2\u00d3\u00d5\5&\24\2\u00d4\u00d6\5\32\16\2\u00d5\u00d4\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dc\7\'\2\2\u00dc\67\3\2\2\2\u00dd\u00de\7\61\2\2\u00de9\3\2\2\2\u00df"+
		"\u00e0\7\61\2\2\u00e0;\3\2\2\2\u00e1\u00e2\t\3\2\2\u00e2=\3\2\2\2\u00e3"+
		"\u00e4\t\4\2\2\u00e4?\3\2\2\2\u00e5\u00e6\7\66\2\2\u00e6A\3\2\2\2\u00e7"+
		"\u00e8\7\66\2\2\u00e8C\3\2\2\2\21OTdjt}\u0084\u0094\u009a\u009e\u00a2"+
		"\u00c8\u00cd\u00d5\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}