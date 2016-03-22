/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasDatos;

/**
 *
 * @author giancarloherrerabertarioni
 */
public class ColaPrioridad {
    private Nodo front;
    private Nodo rear;
    private int size;
    
    public ColaPrioridad (){
        this.front = new Nodo();
        this.rear = new Nodo();
        this.size = 0;
    }
    public void encolar(Nodo temp){
        if(this.size==0){
            temp.setNext(null);
            this.front.setNext(temp);
            this.rear.setNext(temp);
            this.size++;
        }
        temp.setNext(null);
        this.rear.setNext(temp);
        this.rear=temp;
        this.size++;
    }
    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        if (this.size==0){
            return true;
        }
        return false;
    }
    public Lista getAlgunElemento(ColaPrioridad cola,int lugar){
        Lista elemento = new Lista(cola.size);
        if(cola.isEmpty()==false){
            Nodo temp = this.front;
            for(int i=0; i>=cola.size();i++){
                elemento.append(temp.getNext().getElement().find(lugar));
                temp = temp.getNext();
            }
            return elemento;
        }
        return null;
    }

    public static void main (String args[]){
        ColaPrioridad k = new ColaPrioridad();
        Lista list = new Lista(3);
        list.append("Honul");
        list.append("12");
        list.append("27/03/15");
        Lista list1 = new Lista(3);
        list1.append("HHH");
        list1.append("12");
        list1.append("27/03/15");
        Nodo h = new Nodo(list);
        Nodo d = new Nodo(list1);
        k.encolar(h);
        k.encolar(d);
        System.out.println(k.size());
        Lista lol = k.getAlgunElemento(k, 0);
        System.out.println(lol);
        for (list.goToStart(); list.getPos() < list.getSize(); list.next()){
            System.out.println("Elemento # " + list.getPos() + ", Habitación: " + list.getElement());
        }
    }
}


