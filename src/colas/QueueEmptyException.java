/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package colas;

/**
 *
 * @author pasos
 */
class QueueEmptyException extends RuntimeException {
        
    public QueueEmptyException(){
         this( "Pila" );

    }

public QueueEmptyException(String name){
    
    super(name + "esta vacia");
}


}
