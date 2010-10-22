/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pilas;

/**
 *
 * @author Huallo
 */
public class StackEmptyException extends RuntimeException{
    public StackEmptyException(){
        this("Pila");
    }
    public StackEmptyException(String name){
        super(name + "esta vacia");
    }

}
