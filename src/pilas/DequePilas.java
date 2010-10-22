/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pilas;

import deque.DequeStack;
/**
 *
 * @author pasos
 */
public class DequePilas implements Stack{


    private DequeStack deque;


    public int size() {
       // throw new UnsupportedOperationException("Not supported yet.");
         return deque.size();
    }

    public boolean isEmpty() {
       // throw new UnsupportedOperationException("Not supported yet.");
        return deque.isEmpty();
    }

    public void push(Object o) {
        //throw new UnsupportedOperationException("Not supported yet.");
         deque.insertLast(o);
    }

    public Object pop() throws StackEmptyException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object top() throws StackEmptyException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
