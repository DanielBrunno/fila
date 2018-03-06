/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

/**
 *
 * @author Daniel Brunno
 */
public interface IFila {
    
public int tamanho();

public boolean estaVazia();

public Object inicio() 
        throws EFilaVazia; 

public void enfileirar(Object o); 

public Object desenfileirar() 
        throws EFilaVazia;

    
}
