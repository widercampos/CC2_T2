package t2;

import java.util.ArrayList;
import java.util.List;

public class TabelaDeSimbolos {

    private List<EntradaTabelaDeSimbolos> simbolos;

    public TabelaDeSimbolos() {
        simbolos = new ArrayList<EntradaTabelaDeSimbolos>();
    }

    public void adicionarSimbolo(String nome, String tipo, String valor) {
        simbolos.add(new EntradaTabelaDeSimbolos(nome, tipo, valor));
    }

    public boolean existeSimbolo(String nome) {
        for (EntradaTabelaDeSimbolos etds : simbolos) {
            if (etds.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public EntradaTabelaDeSimbolos buscaSimbolo(String nome) {
        for (EntradaTabelaDeSimbolos etds : simbolos) {
            if (etds.getNome().equals(nome)) {
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

    public String buscaValor(String nome) {
        for (EntradaTabelaDeSimbolos etds : simbolos) {
            if (etds.getNome().equals(nome)) {
                return etds.getValor();
            }
        }
        return null;
    }

}
