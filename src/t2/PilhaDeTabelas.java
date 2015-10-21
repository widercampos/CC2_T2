/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t2;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class PilhaDeTabelas {

    private LinkedList<TabelaDeSimbolos> pilha;

    public PilhaDeTabelas() {
        pilha = new LinkedList<TabelaDeSimbolos>();
    }

    public void empilhar(TabelaDeSimbolos ts) {
        pilha.push(ts);
    }

    public TabelaDeSimbolos topo() {
        return pilha.peek();
    }

    public boolean existeSimbolo(String nome, Categoria categoria) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.existeSimbolo(nome, categoria)) {
                return true;
            }
        }
        return false;
    }

    public String buscaTipoVariavel(String nome, Categoria categoria) {
        for (TabelaDeSimbolos ts : pilha) {
            String resposta = ts.buscaTipoVariavel(nome, categoria);
            if (resposta != null) {
                /* achou o tipo da variavel */
                return resposta;
            }
        }
        /* não achou a variavel na pilha */
        return null;
    }

    public EntradaTabelaDeSimbolos buscaSimbolo(String nome) {
        EntradaTabelaDeSimbolos resposta = null;
        TabelaDeSimbolos ts = null;
        
        for (int i = 0; resposta == null && i < pilha.size(); i++) {
            ts = pilha.get(i);
            resposta = ts.buscaSimbolo(nome);
        }
        
//        /* não quis usar break */
//        for (TabelaDeSimbolos ts : pilha){
//            resposta = ts.buscaSimbolo(nome);
//            
//            if (ts.buscaSimbolo(nome) != null){
//                break;
//            }
//        }
        
        return resposta;
    }

    public void desempilhar() {
        TabelaDeSimbolos ret = pilha.pop();
        Saida.println(ret.toString());
    }

    public List getTodasTabelas() {
        return pilha;
    }
}
