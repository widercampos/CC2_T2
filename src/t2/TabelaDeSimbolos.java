package t2;

import java.util.ArrayList;
import java.util.List;

public class TabelaDeSimbolos {

    private String escopo;
    private List<EntradaTabelaDeSimbolos> simbolos;

    public TabelaDeSimbolos(String escopo) {
        simbolos = new ArrayList<EntradaTabelaDeSimbolos>();
        this.escopo = escopo;
    }

    public void adicionarSimbolo(String nome, String tipo, Categoria categoria) {
        simbolos.add(new EntradaTabelaDeSimbolos(nome, tipo, categoria));
    }

    public void adicionarSimbolos(List<String> nomes, String tipo, Categoria categoria) {
        for (String s : nomes) {
            simbolos.add(new EntradaTabelaDeSimbolos(s, tipo, categoria));
        }
    }

    public boolean existeSimbolo(String nome, Categoria categoria) {
        for (EntradaTabelaDeSimbolos etds : simbolos) {
            if (etds.getNome().equals(nome) && etds.getCategoria() == categoria) {
                return true;
            }
        }
        return false;
    }
    
    public void setSubtabelaEtds (String nome, TabelaDeSimbolos subTabela){
        for (EntradaTabelaDeSimbolos etds : simbolos) {
            if (etds.getNome().equals(nome)) {
                etds.setSubTabela(subTabela);
            }
        }
    }
    
    public EntradaTabelaDeSimbolos buscaSimbolo (String nome){
        for (EntradaTabelaDeSimbolos etds : simbolos){
            if (etds.getNome().equals(nome)){
                return etds;
            }
        }
        
        return null;
    }
    
    public String buscaTipoVariavel(String nome, Categoria categoria) {
        for (EntradaTabelaDeSimbolos etds : simbolos) {
            if (etds.getNome().equals(nome) && etds.getCategoria() == categoria) {
                return etds.getTipo();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String ret = "Escopo: " + escopo;
        for (EntradaTabelaDeSimbolos etds : simbolos) {
            ret += "\n   " + etds;
        }
        return ret;
    }
}
