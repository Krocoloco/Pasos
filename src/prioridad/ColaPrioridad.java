/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prioridad;

/**
 *
 * @author LuisPasos
 */
public class ColaPrioridad implements PriQueue{

    private int maxSize;
    private long[] queArray;
    private int nItems;

    public int size() {
      //  throw new UnsupportedOperationException("Not supported yet.");
        return nItems;
    }

    public boolean isEmpty() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return (nItems==0);
    }

    public void insert(){

    }

    public void insertItem(Object item, int k) {
       // throw new UnsupportedOperationException("Not supported yet.");
        int j;
        if(nItems==0)   //if no items
            queArray[nItems++] = (Integer)item;
        else {
            for(j=nItems-1;j>=0;j--){
                if(k>queArray[j])
                    queArray[j+1]= queArray[j];
                else
                    break;
            }
            queArray[j+1]= (Integer)item;
            nItems++;
        }
    }

    public Object minElem() throws PriQueueEmptyException {
        //throw new UnsupportedOperationException("Not supported yet.");
        return queArray[nItems-1];
    }

    public Object removeMinElem() throws PriQueueEmptyException {
       // throw new UnsupportedOperationException("Not supported yet.");
        return queArray[--nItems];
    }


    public int minKey()throws PriQueueEmptyException{
        //throw new UnsupportedOperationException("Not supported yet.");
        return (int) queArray[nItems-1];
    }
}
