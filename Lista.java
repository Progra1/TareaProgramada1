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
public class Lista {
    private Object[] elements;
    private int max;
    private int size;
    private int pos;
    
    public Lista(int max){
        this.max = max;
        this.size = 0;
        this.pos = 0;
        this.elements = new Object[max];
    }
    
    public Object find(int Lugar){
        for (int i=0 ; i<=this.size ; i++){
            if (i==Lugar){
                return this.elements[i];
            }
        }
        return -1;
    }
    
    public void append(Object element){
        if (this.size == this.max){
            System.out.println("List is full");
            return;
        }

        this.elements[this.size] = element;
        this.size++;
    }
 
    public Object getElement(){
        if (this.pos < 0 || this.pos >= this.size) {
            System.out.println("Index out of bounds");
            return null;
        }

        return this.elements[this.pos];
    }

    public void goToStart(){
        this.pos = 0;
    }

    public void goToEnd(){
        this.pos = this.size - 1;
    }

    public void goToPos(int pos){
        if (pos < 0 || pos >= this.size) {
            System.out.println("Index out of bounds");
            return;
        }
        this.pos = pos;
    }

    public void previous() {
        if (this.pos > 0) {
            this.pos--;
        }
    }

    public void next(){
        if (this.pos < this.size) {
            pos++;
        }
    }

    public int getPos() {
        return this.pos;
    }

    public int getSize(){
        return this.size;
    }

    public String toString(){
        String result = "";
        for(int i = 0; i < this.size; i++){
            result += " " + this.elements[i].toString();
        }
        return result;
    }
    
    // Especificaciones de la Tarea (Clase Virtual)

    
    public void trimToSize(){
        int x = (this.elements.length)-1;
        int contador = 0;
        while (contador<x){
            if(this.elements[contador]==null){
                this.max = contador;
                break;
            }
            contador++;
        }
    }
}
