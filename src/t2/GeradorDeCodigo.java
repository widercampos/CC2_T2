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
    String aux = ""; //Buffer para Strings

    public GeradorDeCodigo() {
    }

    public String TiraAspas(String codigo) {
        aux = "";
        aux = codigo.replace("\"", " ");
        return aux;
    }

    public GeradorDeCodigo(Saida out) {
        this.out = out;
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
                + "<TITLE>" + ctx.titulo_site().getText() + "</TITLE>" + " \n");
    }

    @Override
    public void exitCabecalho(PortHTMLParser.CabecalhoContext ctx) {
        out.printCodigo("</HEAD>" + "\n");
    }

    @Override
    public void enterCorpo(PortHTMLParser.CorpoContext ctx) {
        out.printCodigo("<BODY>" + "\n");
    }

    @Override
    public void exitCorpo(PortHTMLParser.CorpoContext ctx) {
        out.printCodigo("</BODY>" + "\n");
    }

    @Override
    public void enterBotao(PortHTMLParser.BotaoContext ctx) {

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

}
