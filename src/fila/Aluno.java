/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

import java.util.Arrays;

/**
 *
 * @author Daniel Brunno
 */
public class Aluno {
    
    // Declarando e Inicializando um array de Aluno com capacidade 10.
    
    private int tam;
    private String nome;   
    private Object[] alunos = new Aluno[tam];

    public Object[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Object[] alunos) {
        this.alunos = alunos;
    }
    

    
    public void setTam(int tam) {
        this.tam = tam;
    }

    public int getTam() {
        return tam;
    } 
       
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" + "alunos=" + Arrays.toString(alunos) + '}';
    }
    
}
