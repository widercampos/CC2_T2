/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2;

/**
 *
 * @author J
 */
public class GeradorDeCodigo extends PortHTMLBaseListener {

    private static Saida out;
    private static TabelaDeSimbolos tabela;
    String aux = ""; //Buffer para Strings
    boolean primeiro = true;

    public GeradorDeCodigo() {
        tabela = new TabelaDeSimbolos();
    }

    public String TiraAspas(String codigo) {
        aux = "";
        aux = codigo.replace("\"", "");
        return aux;
    }

    public GeradorDeCodigo(Saida out) {
        this.out = out;
        tabela = new TabelaDeSimbolos();
    }

    @Override
    public void enterSite(PortHTMLParser.SiteContext ctx) {
        out.printCodigo("<!DOCTYPE html>" + "\n"
                + "<HTML lang=\"pt-br\">" + "\n");
    }

    @Override
    public void exitSite(PortHTMLParser.SiteContext ctx) {
        out.printCodigo("</HTML>");
    }

    @Override
    public void enterCabecalho(PortHTMLParser.CabecalhoContext ctx) {
        out.printCodigo("<HEAD>" + "\n"
                + "<link rel=\"stylesheet\" href=\"css/bootstrap.css\">"
                + " \n"
                + "<link rel=\"stylesheet\" href=\"css/bootstrap-responsive.css\">"
                + " \n"
                + "<TITLE>" + TiraAspas(ctx.titulo_site().getText()) + "</TITLE>" + " \n");
    }

    @Override
    public void exitCabecalho(PortHTMLParser.CabecalhoContext ctx) {
        out.printCodigo("</HEAD>" + "\n");
    }

    @Override
    public void enterDefinir(PortHTMLParser.DefinirContext ctx) {
        // já foi verificada a validade da declaração no analisador semântico
        String nomeVar = ctx.IDENT().getSymbol().getText();
        tabela.adicionarSimbolo(nomeVar, "", TiraAspas(ctx.CADEIA().getText()));

    }

    @Override
    public void enterCorpo(PortHTMLParser.CorpoContext ctx) {
        if (ctx.cor_fundo() != null) {
            out.printCodigo("<BODY Bgcolor=" + "\"" + MudaCor(ctx.cor_fundo().getText()) + "\">" + "\n");
        } else {
            out.printCodigo("<BODY>" + "\n");
        }

    }

    public String MudaCor(String cor) {
        switch (cor) {
            case "azul":
                cor = "blue";
                break;
            case "vermelho":
                cor = "red";
                break;
            case "branco":
                cor = "white";
                break;
            case "preto":
                cor = "black";
                break;
            case "verde":
                cor = "green";
                break;
            case "amarelo":
                cor = "yellow";
                break;
            case "rosa":
                cor = "pink";
                break;
            case "cinza":
                cor = "gray";
                break;
        }
        return cor;
    }

    @Override
    public void exitCorpo(PortHTMLParser.CorpoContext ctx) {
        out.printCodigo("</BODY>" + "\n");
    }

    @Override
    public void enterBotao(PortHTMLParser.BotaoContext ctx) {
        out.printCodigo("\n");
        out.printCodigo("<button class=\"btn ");
        if (ctx.estado() != null) {
            String tipoEstado = ctx.estado().getText();

            switch (tipoEstado) {
                case "aviso":
                    out.printCodigo("btn-info\">");
                    break;
                case "alerta":
                    out.printCodigo("btn-warning\">");
                    break;
                case "sucesso":
                    out.printCodigo("btn-success\">");
                    break;
                case "erro":
                    out.printCodigo("btn-danger\">");
                    break;
            }
        } else {
            out.printCodigo("\">");
        }

        out.printCodigo(TiraAspas(ctx.CADEIA().toString()));
        out.printCodigo("</button></br>");

    }

    @Override
    public void enterTexto(PortHTMLParser.TextoContext ctx) {
        out.printCodigo("\n");
        out.printCodigo("<p class=\"text");
        if (ctx.estado() != null) {
            String tipoEstado = ctx.estado().getText();

            switch (tipoEstado) {
                case "aviso":
                    out.printCodigo("-info\">");
                    break;
                case "alerta":
                    out.printCodigo("-warning\">");
                    break;
                case "sucesso":
                    out.printCodigo("-success\">");
                    break;
                case "erro":
                    out.printCodigo("-error\">");
                    break;
            }
        } else {
            out.printCodigo("\">");
        }
        if (ctx.CADEIA() != null) {
            out.printCodigo(TiraAspas(ctx.CADEIA().toString()));
        } else /* é uma variável, ctx.IDENT() != null */ {
            out.printCodigo(tabela.buscaValor(ctx.IDENT().getText()));
        }
        out.printCodigo("</p></br>");
    }

    @Override
    public void enterLink(PortHTMLParser.LinkContext ctx) {
        //<a href="Sobre.html"  > Sobre o Trabalho </a>
        out.printCodigo("\n");
        out.printCodigo("<a href=\"");
        if (ctx.url().CADEIA() != null) {
            /* é uma cadeia simples*/
            out.printCodigo(TiraAspas(ctx.url().CADEIA().toString()) + "\"> ");
        } else /* é uma variável armazenando o link */ {
            String var = ctx.url().IDENT().getText();
            out.printCodigo(tabela.buscaValor(var) + "\"> ");
        }
        out.printCodigo(TiraAspas(ctx.nome_pagina().CADEIA().toString()));
        out.printCodigo(" </a>");
        //out.printCodigo("<br>");
    }

    @Override
    public void enterTitulo(PortHTMLParser.TituloContext ctx) {
        out.printCodigo("\n");
        out.printCodigo("<h1>" + TiraAspas(ctx.CADEIA().toString()) + "</h1>");
        out.printCodigo(" \n <br>");
    }

    @Override
    public void enterSubtitulo(PortHTMLParser.SubtituloContext ctx) {
        out.printCodigo("\n");
        out.printCodigo("<h3>" + TiraAspas(ctx.CADEIA().toString()) + "</h3>");
        out.printCodigo(" \n <br>");
    }

    @Override
    public void enterImagem(PortHTMLParser.ImagemContext ctx) {
        out.printCodigo("\n");
        out.printCodigo("<img src=");
        if (ctx.url().CADEIA() != null) {
            /* é uma cadeia simples*/
            out.printCodigo((ctx.url().CADEIA().toString()));
        } else /* é uma variável armazenando o link */ {
            String var = ctx.url().IDENT().getText();
            out.printCodigo("\"" + tabela.buscaValor(var) + "\"");
        }
        out.printCodigo(" height=\"" + ctx.dimensoes().altura().getText() + "\"");
        out.printCodigo(" width=\"" + ctx.dimensoes().largura().getText() + "\"");
        out.printCodigo(">");
        out.printCodigo(" \n <br>");
    }

    @Override
    public void enterMapa(PortHTMLParser.MapaContext ctx) {

        out.printCodigo("\n");
        out.printCodigo(" <style>\n"
                + "     \n"
                + "      #map {\n"
                + "        width: 450px;\n"
                + "        height: 400px;\n"
                + "      }\n"
                + "    </style>");
        out.printCodigo("<div id=\"map\"></div>\n"
                + "    <script>\n"
                + "\n"
                + "var map;\n"
                + "function initMap() {\n"
                + "  map = new google.maps.Map(document.getElementById('map'), {\n"
                + "    center: {lat:" + ctx.coordenadas().latitude().COORDENADA() + ", lng:" + ctx.coordenadas().longitude().COORDENADA() + "},\n"
                + "    zoom: 8\n"
                + "  });\n"
                + "}\n"
                + "\n"
                + "    </script>\n"
                + "    <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyDdUWK9joLAF3RC-_DbZLr6A-IXhXOk4So&callback=initMap\"\n"
                + "        async defer></script>");

    }

    @Override
    public void enterLinha(PortHTMLParser.LinhaContext ctx) {
        out.printCodigo("\n");
        out.printCodigo("<div class=\"row-fluid\"> \n");

    }

    @Override
    public void enterColuna_tags(PortHTMLParser.Coluna_tagsContext ctx) {
        out.printCodigo("<div class=\"");

        out.printCodigo(ctx.coluna().SPAN().getText());
        out.printCodigo(" ");
        if (ctx.coluna().ESP() != null) {
            out.printCodigo(ctx.coluna().ESP().getText());
            out.printCodigo(" ");
        }
        out.printCodigo("\">");
    }

    @Override
    public void exitColuna_tags(PortHTMLParser.Coluna_tagsContext ctx) {
        out.printCodigo("</div>\n");
    }

    @Override
    public void exitLinha(PortHTMLParser.LinhaContext ctx) {
        out.printCodigo("</div>\n");
    }

    @Override
    public void enterMenu_fixo(PortHTMLParser.Menu_fixoContext ctx) {
        out.printCodigo("<div class=\"navbar navbar-fixed-top\">\n"
                + "          <div class=\"navbar\">\n"
                + "      <div class=\"navbar-inner\">");
        out.printCodigo("<a class=\"brand\" href=\"#\">   </a> \n");
        out.printCodigo("<ul class=\"nav\">\n");
    }

    @Override
    public void enterNome_link(PortHTMLParser.Nome_linkContext ctx) {
        if (primeiro) {
            primeiro = false;
            out.printCodigo("<li class=\"active\">\n");
        } else {
            out.printCodigo("<li>\n");
        }
    }

    @Override
    public void exitNome_link(PortHTMLParser.Nome_linkContext ctx) {
        out.printCodigo("</li>\n");
    }

    @Override
    public void exitMenu_fixo(PortHTMLParser.Menu_fixoContext ctx) {
        out.printCodigo(" </ul>\n"
                + "      </div>\n"
                + "    </div>\n"
                + "    </div><br><br><br>\n");
    }

}
