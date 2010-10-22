/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prioridad;

/**
 *
 * @author LuisPasos
 */
interface PriQueue {

    public int size();
public boolean isEmpty();
public void insertItem(Object item, int k);
public Object minElem()
throws PriQueueEmptyException;
public Object removeMinElem()
throws PriQueueEmptyException;
public int minKey()
throws PriQueueEmptyException;
}
