/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

import fila.Aluno;

/**
 *
 * @author Daniel Brunno
 */
public class Fila implements IFila {

    /* Declarando as variáveis a serem usadas nos métodos da fila
    LENGENDA: 
                i = Elemento do inicio da fila
                f = Elemento do final da fila
                N = Tamanho da fila    
    */
    private int i, f , N = 10;
    
    // Instância de Array de Alunos;
    private Object[] alunos = new Aluno[N];

    // tamanho() retorne (N - i + f) % N    
    @Override
    public int tamanho() {
        return (N - 1 + f) % N;
    }

    //  Algoritmo estaVazia() return (i = f)
    @Override
    public boolean estaVazia() {
        return (i == f);
    }

    
    @Override
    public Object inicio() throws EFilaVazia {
        if (estaVazia()) {
            throw new EFilaVazia("Pilha Vazia");
        }
        return alunos[i];
    }

    @Override
    public void enfileirar(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object desenfileirar() throws EFilaVazia {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
