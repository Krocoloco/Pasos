/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prioridad;

/**
 *
 * @author LuisPasos
 */
class PriQueueEmptyException extends RuntimeException {

     public PriQueueEmptyException(){
        this("Pila");
    }
    public PriQueueEmptyException(String name){
        super(name + "esta vacia");
    }


}
