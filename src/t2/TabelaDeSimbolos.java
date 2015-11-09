package t2;

import java.util.ArrayList;
import java.util.List;

public class TabelaDeSimbolos {

        private List<EntradaTabelaDeSimbolos> simbolos;

    public TabelaDeSimbolos() {
        simbolos = new ArrayList<EntradaTabelaDeSimbolos>();
    }

    public void adicionarSimbolo(String nome, String tipo) {
        simbolos.add(new EntradaTabelaDeSimbolos(nome, tipo));
    }

    public void adicionarSimbolos(List<String> nomes, String tipo) {
        for (String s : nomes) {
            simbolos.add(new EntradaTabelaDeSimbolos(s, tipo));
        }
    }

    public boolean existeSimbolo(String nome) {
        for (EntradaTabelaDeSimbolos etds : simbolos) {
            if (etds.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public EntradaTabelaDeSimbolos buscaSimbolo (String nome){
        for (EntradaTabelaDeSimbolos etds : simbolos){
            if (etds.getNome().equals(nome)){
                return etds;
            }
        }
        
        return null;
    }
    
    public String buscaTipoVariavel(String nome) {
        for (EntradaTabelaDeSimbolos etds : simbolos) {
            if (etds.getNome().equals(nome)) {
                return etds.getTipo();
            }
        }
        return null;
    }

}
