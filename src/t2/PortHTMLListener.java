// Generated from PortHTML.g4 by ANTLR 4.5.1
package t2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PortHTMLParser}.
 */
public interface PortHTMLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#site}.
	 * @param ctx the parse tree
	 */
	void enterSite(PortHTMLParser.SiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#site}.
	 * @param ctx the parse tree
	 */
	void exitSite(PortHTMLParser.SiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#cabecalho}.
	 * @param ctx the parse tree
	 */
	void enterCabecalho(PortHTMLParser.CabecalhoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#cabecalho}.
	 * @param ctx the parse tree
	 */
	void exitCabecalho(PortHTMLParser.CabecalhoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(PortHTMLParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(PortHTMLParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#tags}.
	 * @param ctx the parse tree
	 */
	void enterTags(PortHTMLParser.TagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#tags}.
	 * @param ctx the parse tree
	 */
	void exitTags(PortHTMLParser.TagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#definir}.
	 * @param ctx the parse tree
	 */
	void enterDefinir(PortHTMLParser.DefinirContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#definir}.
	 * @param ctx the parse tree
	 */
	void exitDefinir(PortHTMLParser.DefinirContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#menu_fixo}.
	 * @param ctx the parse tree
	 */
	void enterMenu_fixo(PortHTMLParser.Menu_fixoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#menu_fixo}.
	 * @param ctx the parse tree
	 */
	void exitMenu_fixo(PortHTMLParser.Menu_fixoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(PortHTMLParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(PortHTMLParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#container}.
	 * @param ctx the parse tree
	 */
	void enterContainer(PortHTMLParser.ContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#container}.
	 * @param ctx the parse tree
	 */
	void exitContainer(PortHTMLParser.ContainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(PortHTMLParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(PortHTMLParser.LinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#texto}.
	 * @param ctx the parse tree
	 */
	void enterTexto(PortHTMLParser.TextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#texto}.
	 * @param ctx the parse tree
	 */
	void exitTexto(PortHTMLParser.TextoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#botao}.
	 * @param ctx the parse tree
	 */
	void enterBotao(PortHTMLParser.BotaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#botao}.
	 * @param ctx the parse tree
	 */
	void exitBotao(PortHTMLParser.BotaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#estado}.
	 * @param ctx the parse tree
	 */
	void enterEstado(PortHTMLParser.EstadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#estado}.
	 * @param ctx the parse tree
	 */
	void exitEstado(PortHTMLParser.EstadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#titulo}.
	 * @param ctx the parse tree
	 */
	void enterTitulo(PortHTMLParser.TituloContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#titulo}.
	 * @param ctx the parse tree
	 */
	void exitTitulo(PortHTMLParser.TituloContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#subtitulo}.
	 * @param ctx the parse tree
	 */
	void enterSubtitulo(PortHTMLParser.SubtituloContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#subtitulo}.
	 * @param ctx the parse tree
	 */
	void exitSubtitulo(PortHTMLParser.SubtituloContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#cor}.
	 * @param ctx the parse tree
	 */
	void enterCor(PortHTMLParser.CorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#cor}.
	 * @param ctx the parse tree
	 */
	void exitCor(PortHTMLParser.CorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#imagem}.
	 * @param ctx the parse tree
	 */
	void enterImagem(PortHTMLParser.ImagemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#imagem}.
	 * @param ctx the parse tree
	 */
	void exitImagem(PortHTMLParser.ImagemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#dimensoes}.
	 * @param ctx the parse tree
	 */
	void enterDimensoes(PortHTMLParser.DimensoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#dimensoes}.
	 * @param ctx the parse tree
	 */
	void exitDimensoes(PortHTMLParser.DimensoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#largura}.
	 * @param ctx the parse tree
	 */
	void enterLargura(PortHTMLParser.LarguraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#largura}.
	 * @param ctx the parse tree
	 */
	void exitLargura(PortHTMLParser.LarguraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#altura}.
	 * @param ctx the parse tree
	 */
	void enterAltura(PortHTMLParser.AlturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#altura}.
	 * @param ctx the parse tree
	 */
	void exitAltura(PortHTMLParser.AlturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#mapa}.
	 * @param ctx the parse tree
	 */
	void enterMapa(PortHTMLParser.MapaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#mapa}.
	 * @param ctx the parse tree
	 */
	void exitMapa(PortHTMLParser.MapaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#pais}.
	 * @param ctx the parse tree
	 */
	void enterPais(PortHTMLParser.PaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#pais}.
	 * @param ctx the parse tree
	 */
	void exitPais(PortHTMLParser.PaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#cidade}.
	 * @param ctx the parse tree
	 */
	void enterCidade(PortHTMLParser.CidadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#cidade}.
	 * @param ctx the parse tree
	 */
	void exitCidade(PortHTMLParser.CidadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#coordenadas}.
	 * @param ctx the parse tree
	 */
	void enterCoordenadas(PortHTMLParser.CoordenadasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#coordenadas}.
	 * @param ctx the parse tree
	 */
	void exitCoordenadas(PortHTMLParser.CoordenadasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#slide_show}.
	 * @param ctx the parse tree
	 */
	void enterSlide_show(PortHTMLParser.Slide_showContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#slide_show}.
	 * @param ctx the parse tree
	 */
	void exitSlide_show(PortHTMLParser.Slide_showContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#titulo_site}.
	 * @param ctx the parse tree
	 */
	void enterTitulo_site(PortHTMLParser.Titulo_siteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#titulo_site}.
	 * @param ctx the parse tree
	 */
	void exitTitulo_site(PortHTMLParser.Titulo_siteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#nome_pagina}.
	 * @param ctx the parse tree
	 */
	void enterNome_pagina(PortHTMLParser.Nome_paginaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#nome_pagina}.
	 * @param ctx the parse tree
	 */
	void exitNome_pagina(PortHTMLParser.Nome_paginaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(PortHTMLParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(PortHTMLParser.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortHTMLParser#nome_cor}.
	 * @param ctx the parse tree
	 */
	void enterNome_cor(PortHTMLParser.Nome_corContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortHTMLParser#nome_cor}.
	 * @param ctx the parse tree
	 */
	void exitNome_cor(PortHTMLParser.Nome_corContext ctx);
}