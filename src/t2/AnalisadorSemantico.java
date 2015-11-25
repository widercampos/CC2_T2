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
        return errou;
    }

    @Override
    public void enterDefinir(PortHTMLParser.DefinirContext ctx) {
        String nomeVar = ctx.IDENT().getSymbol().getText();
        if (tabela.existeSimbolo(nomeVar)) {
            // ERRO: já existe
            int linha = ctx.IDENT().getSymbol().getLine();
            System.out.println("Linha " + linha + ": ERRO semântico: variável " + nomeVar + " ja declarada anteriormente.");
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
                // ERRO: variável não declarada
                int linha = ctx.IDENT().getSymbol().getLine();
                System.out.println("Linha " + linha + ": ERRO semântico: variável " + nomeVar + " nao declarada.");
                errou = true;
            }
        } /* se não usou, não importa pro semântico */

    }

    @Override
    public void enterUrl(PortHTMLParser.UrlContext ctx) {
        if (ctx.IDENT() != null) /* usou variável */ {
            String nomeVar = ctx.IDENT().getSymbol().getText();
            if (!tabela.existeSimbolo(nomeVar)) {
                // ERRO: variável não declarada
                int linha = ctx.IDENT().getSymbol().getLine();
                System.out.println("Linha " + linha + ": ERRO semântico: variável " + nomeVar + " nao declarada.");
                errou = true;
            }
        } /* se não usou, não importa pro semântico */

    }

    @Override
    public void enterLinha(PortHTMLParser.LinhaContext ctx) {
        // verificar se o usuário colocou soma maior que 12
        int soma = 0;
        int span = 0; /* só inicializei pra compilar, mas é ctza que vai ter um 
         * valor pelo switch abaixo, pq passou pelo sintático */


        for (PortHTMLParser.Coluna_tagsContext colTagCtx : ctx.coluna_tags()) {
            switch (colTagCtx.coluna().SPAN().getText()) {
                case "span1":
                    span = 1;
                    break;
                case "span2":
                    span = 2;
                    break;
                case "span3":
                    span = 3;
                    break;
                case "span4":
                    span = 4;
                    break;
                case "span5":
                    span = 5;
                    break;
                case "span6":
                    span = 6;
                    break;
                case "span7":
                    span = 7;
                    break;
                case "span8":
                    span = 8;
                    break;
                case "span9":
                    span = 9;
                    break;
                case "span10":
                    span = 10;
                    break;
                case "span11":
                    span = 11;
                    break;
                case "span12":
                    span = 12;
                    break;
            }
            soma += span;
        }
        
        if (soma > 12) {
            int linha = ctx.getStart().getLine();
            System.out.println("Linha " + linha + ": ERRO semântico: soma das colunas é maior que 12.");
        }
    }

}
