/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package deque;

/**
 *
 * @author pasos
 */
class DequeEmptyException extends RuntimeException {

    public DequeEmptyException(){
        this("Deque");
    }

    public DequeEmptyException(String nombre){
        super(nombre + "vacio");
    }
}
