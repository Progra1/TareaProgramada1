/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasDatos;

/**
 *
 * @author Giancarlo Herrera Bertarioni
 */
public class Nodo {
    private Lista element;
    private Nodo next;
    
    public Nodo(){
        this.element = null;
        this.next = null;
    }
    
    public Nodo(Lista element){
        this.element=element;
        this.next = null;  
    }
    public Lista getElement(){
        return this.element;
    }
    public Nodo getNext(){
        return this.next;
    }
    public void setNext(Nodo next){
        this.next=next;
    }
}