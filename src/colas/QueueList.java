/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package colas;

import lsl.List;

/**
 *
 * @author pasos
 */
public class QueueList implements Queue{
    private List lista;
    public int contador;

    public int size() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return contador;
    }

    public boolean isEmpty() {
       // throw new UnsupportedOperationException("Not supported yet.");
         return lista.isEmpty();
    }

    public void enqueue(Object o) {
       // throw new UnsupportedOperationException("Not supported yet.");
         lista.insertAtBack(o);
        contador++;
    }

    public Object dequeue() throws QueueEmptyException {
        //throw new UnsupportedOperationException("Not supported yet.");
        Object objeto= lista.removeFromFront();
        contador--;
        return objeto;
    }

    public Object front() throws QueueEmptyException {
       // throw new UnsupportedOperationException("Not supported yet.");
        if(isEmpty())
          throw new QueueEmptyException();
       else
           return lista.getFirstNode().getObject();
    }

    public static void main(String args[]){
        QueueList pila = new QueueList();
        pila.enqueue("Hola");
        pila.enqueue("Pila!!!");
        pila.enqueue(231);
        pila.enqueue(34.5);
        while(!pila.isEmpty()){
            System.out.println("Hay" + pila.size() + "elementos en la pila");
            System.out.println(pila.front());
        }
    }
}
