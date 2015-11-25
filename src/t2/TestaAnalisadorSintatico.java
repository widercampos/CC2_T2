package t2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class TestaAnalisadorSintatico {

    public static void main(String args[]) throws IOException, RecognitionException {
        Saida o = new Saida();
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]));
        PortHTMLLexer lexer = new PortHTMLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PortHTMLParser parser = new PortHTMLParser(tokens);

//      parser.site();
        PortHTMLParser.SiteContext raiz = parser.site();
        AnalisadorSemantico as = new AnalisadorSemantico();
        GeradorDeCodigo gdc = new GeradorDeCodigo(o);
        ParseTreeWalker ptw = new ParseTreeWalker();
        ptw.walk(as, raiz);
        if (!as.temErro()) /* não teve erro no semântico, pode gerar */{
            ptw.walk(gdc, raiz);
        }

        PrintWriter pw = new PrintWriter(new File(args[1]));
        pw.print(o.getTextoCodigo());
        //pw.print(out.toString());
        pw.flush();
        pw.close();
    }

}
