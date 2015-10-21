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
        SaidaParser out = new SaidaParser();
// Descomente as linhas abaixo para testar o analisador gerado.
// Obs: a linha abaixo está configurada para usar como entrada o arquivo lua1.txt
// Modifique-a para testar os demais exemplos
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]));
        PortHTMLLexer lexer = new PortHTMLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PortHTMLParser parser = new PortHTMLParser(tokens);
        parser.addErrorListener(new T2ErrorListener(out));
        
        try {
            parser.site();
//            PortHTMLParser.SiteContext raiz = parser.site();
//            AnalisadorSemantico as = new AnalisadorSemantico(out);
//            ParseTreeWalker ptw = new ParseTreeWalker();
//            ptw.walk(null, raiz);
        } catch(ParseCancellationException pce) {
//         if (pce.getMessage() != null) {
//         out.println(pce.getMessage());
//         }
        }

        
/* não sei q diabos é isso */              
//        if (!out.isModificado()) {
//            out.println("Fim da analise. Sem erros sintaticos.");
//            out.println("Tabela de simbolos:");
//
//            TabelaDeSimbolos.imprimirTabela(out);
//            System.out.print(out);
//        } else {
//            out.println("Fim da analise. Com erros sintaticos.");
//        }

        
        // descomentar quando fizer o semântico:
        // out.println("Fim da compilacao");

        PrintWriter pw = new PrintWriter(new File(args[1]));
        pw.print(out.toString());
        pw.flush();
        pw.close();
    }
    

    }
