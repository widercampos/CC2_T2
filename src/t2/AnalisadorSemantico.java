/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2;

/**
 *
 * @author Widerlani
 */
public class AnalisadorSemantico extends PortHTMLBaseListener {

    // é meio redundante colocar a tabela aqui e dps fazer a mesma coisa no gerador, mas...
    private static TabelaDeSimbolos tabela;
    private static boolean errou = false; // variável pra ver se teve erro semântico

    public AnalisadorSemantico() {
        tabela = new TabelaDeSimbolos();
    }

    public boolean temErro() {
        /* método pra ver se o semântico encontrou erros */
        return errou;
    }

    @Override
    public void enterDefinir(PortHTMLParser.DefinirContext ctx) {
        String nomeVar = ctx.IDENT().getSymbol().getText();
        if (tabela.existeSimbolo(nomeVar)) {
            // erro: já existe
            int linha = ctx.IDENT().getSymbol().getLine();
            System.out.println("Linha " + linha + ": erro semântico: variável \"" + nomeVar + "\" ja declarada anteriormente.");
            errou = true;
        } else /* ok, símbolo não declarado */ {
            tabela.adicionarSimbolo(nomeVar, "", ctx.CADEIA().getText());
        }
    }

    @Override
    public void enterTexto(PortHTMLParser.TextoContext ctx) {
        if (ctx.IDENT() != null) /* usou variável */ {
            String nomeVar = ctx.IDENT().getSymbol().getText();
            if (!tabela.existeSimbolo(nomeVar)) {
                // erro: variável não declarada
                int linha = ctx.IDENT().getSymbol().getLine();
                System.out.println("Linha " + linha + ": erro semântico: variável \"" + nomeVar + "\" nao declarada.");
                errou = true;
            }
        } /* se não usou, não importa pro semântico */

    }

    @Override
    public void enterUrl(PortHTMLParser.UrlContext ctx) {
        if (ctx.IDENT() != null) /* usou variável */ {
            String nomeVar = ctx.IDENT().getSymbol().getText();
            if (!tabela.existeSimbolo(nomeVar)) {
                // erro: variável não declarada
                int linha = ctx.IDENT().getSymbol().getLine();
                System.out.println("Linha " + linha + ": erro semântico: variável \"" + nomeVar + "\" nao declarada.");
                errou = true;
            }
        } /* se não usou, não importa pro semântico */

    }

    @Override
    public void enterLinha(PortHTMLParser.LinhaContext ctx) {
        // verificar se o usuário colocou soma maior que 12
        int soma = 0;

        for (PortHTMLParser.Coluna_tagsContext colTagCtx : ctx.coluna_tags()) {
            switch (colTagCtx.coluna().SPAN().getText()) {
                case "span1":
                    soma += 1;
                    break;
                case "span2":
                    soma += 2;
                    break;
                case "span3":
                    soma += 3;
                    break;
                case "span4":
                    soma += 4;
                    break;
                case "span5":
                    soma += 5;
                    break;
                case "span6":
                    soma += 6;
                    break;
                case "span7":
                    soma += 7;
                    break;
                case "span8":
                    soma += 8;
                    break;
                case "span9":
                    soma += 9;
                    break;
                case "span10":
                    soma += 10;
                    break;
                case "span11":
                    soma += 11;
                    break;
                case "span12":
                    soma += 12;
                    break;
            }

            if (colTagCtx.coluna().ESP() != null) {
                switch (colTagCtx.coluna().SPAN().getText()) {
                    case "offset1":
                        soma += 1;
                        break;
                    case "offset2":
                        soma += 2;
                        break;
                    case "offset3":
                        soma += 3;
                        break;
                    case "offset4":
                        soma += 4;
                        break;
                    case "offset5":
                        soma += 5;
                        break;
                    case "offset6":
                        soma += 6;
                        break;
                    case "offset7":
                        soma += 7;
                        break;
                    case "offset8":
                        soma += 8;
                        break;
                    case "offset9":
                        soma += 9;
                        break;
                    case "offset10":
                        soma += 10;
                        break;
                    case "offset11":
                        soma += 11;
                        break;
                    case "offset12":
                        soma += 12;
                        break;
                }
            }
        }

        if (soma > 12) {
            int linha = ctx.getStart().getLine();
            System.out.println("Linha " + linha + ": erro semântico: soma das colunas é maior que 12.");
        }
    }

    @Override
    public void enterCor(PortHTMLParser.CorContext ctx) {
        if (ctx.IDENT() != null) {
            String nomeVar = ctx.IDENT().getSymbol().getText();
            if (!tabela.existeSimbolo(nomeVar)) {
                // erro: variável não declarada
                int linha = ctx.IDENT().getSymbol().getLine();
                System.out.println("Linha " + linha + ": erro semântico: variável \"" + nomeVar + "\" nao declarada.");
                errou = true;
            }
        } /* se não usou, não importa pro semântico */

    }

}
