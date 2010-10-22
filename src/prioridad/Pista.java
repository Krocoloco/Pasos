/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prioridad;

import lsl.List;
import lsl.ListNode;
/**
 *
 * @author LuisPasos
 */
public class Pista implements PriQueue{

    private List lista;
    private int contador;

    public Pista(){
        lista = new List();
        contador=0;
    }

    public int size() {
       // throw new UnsupportedOperationException("Not supported yet.");
        return contador;
    }

    public boolean isEmpty() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return lista.isEmpty();
    }

    public void insert(Object item){
        insertItem(item,((Vuelo)item).getPrioridad());

    }


    public void insertItem(Object item, int k) {
       // throw new UnsupportedOperationException("Not supported yet.");
          if ( lista.isEmpty() ){ // firstNode and lastNode refer to same Object
             ListNode objeto = new ListNode(item) ;
             lista.setFirstNode(objeto);
             lista.setLastNode(objeto);
             }
          else{
          if (getFirstNode()==getLastNode()){
            if ((Integer)insertItem > (Integer)getFirstNode().data )
              insertAtFront(insertItem);
            else
              insertAtBack(insertItem);
          }
          else{
          ListNode current = getFirstNode();
          ListNode anterior = null;
          while(current!= null && (Integer)insertItem < (Integer)current.data){
              anterior = current;
              current = current.nextNode;
          }
          if (anterior == null)
              insertAtFront(insertItem);
          else
             if (anterior == getLastNode()){
               insertAtBack(insertItem);
             }
          else{
          ListNode nuevo = new ListNode(insertItem);
          anterior.nextNode = nuevo;
          nuevo.nextNode = current;
          }
              }
        }
    }

    public Object minElem() throws PriQueueEmptyException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object removeMinElem() throws PriQueueEmptyException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int minKey() throws PriQueueEmptyException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
