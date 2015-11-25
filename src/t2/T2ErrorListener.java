package t2;

import java.util.BitSet;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class T2ErrorListener implements ANTLRErrorListener {
    private static boolean errou = false; // variável pra ver se teve erro sintático
    
    public boolean temErro(){
        /* método pra verificar se teve erro sintático */
        return errou;
    }
    
    @Override
    public void syntaxError(Recognizer<?, ?> rcgnzr, Object o, int i, int i1, String string, RecognitionException re) {
        Token t = (Token)o;
        String tkName = t.getText();
        if(tkName.equals("<EOF>")) 
        {tkName = "EOF";
        System.out.println("Linha " + i + ": erro sintatico proximo a \"" + tkName + "\"."); }
        else{
        System.out.println("Linha " + i + ": erro sintatico proximo a \"" + tkName + "\"."); }
        
        errou = true;
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean bln, BitSet bitset, ATNConfigSet atncs) {
    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitset, ATNConfigSet atncs) {
    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atncs) {
    }

}
