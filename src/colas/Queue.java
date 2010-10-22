/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package colas;

/**
 *
 * @author israel
 */
public interface Queue {
public int size();
public boolean isEmpty();
public void enqueue(Object o);
public Object dequeue()throws QueueEmptyException;
public Object front() throws QueueEmptyException;

}
