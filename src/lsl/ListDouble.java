/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lsl;

/**
 *
 * @author Huallo
 */

public class ListDouble extends ListaPadre {


     // construct empty List with "list" as the name
     public ListDouble(){
         this( "list" );
     }

     // construct an empty List with a name
     public ListDouble( String listName ){
        name = listName;
        firstNode = lastNode = null;
     }

      public synchronized void insertAtFront( Object insertItem ){
           if ( isEmpty() ) // firstNode and lastNode refer to same object
            firstNode = lastNode = new ListNodeDouble( insertItem );
           else{
             ListNodeDouble  nuevo = new ListNodeDouble(insertItem);
             nuevo.nextNode = firstNode;
             ((ListNodeDouble)firstNode).beforeNode=nuevo;
             firstNode = nuevo;
           }
      }

      public synchronized void insertAtBack( Object insertItem ){
          if ( isEmpty() ) // firstNode and lastNode refer to same Object
            firstNode = lastNode = new ListNodeDouble( insertItem );
          else{
              ListNodeDouble nuevo = new ListNodeDouble(insertItem);
              nuevo.beforeNode=(ListNodeDouble)lastNode;
              lastNode.nextNode=nuevo;
              lastNode=nuevo;

          }
      }

      public synchronized Object removeFromFront() throws EmptyListException{
           if ( isEmpty() ) // throw exception if List is empty
            throw new EmptyListException( name );
           Object removedItem = firstNode.data; // retrieve data being removed
           // update references firstNode and lastNode
         if ( firstNode == lastNode )
            firstNode = lastNode = null;
         else
            firstNode = (ListNodeDouble) firstNode.nextNode;
           ((ListNodeDouble)firstNode).beforeNode=null;

        return removedItem; // return removed node data
      }

      public synchronized Object removeFromBack() throws EmptyListException{
         if ( isEmpty() ) // throw exception if List is empty
             throw new EmptyListException( name );

        Object removedItem= lastNode.data; // retrieve data being removed

         // update references firstNode and lastNode
         if ( firstNode == lastNode )
             firstNode = lastNode = null;

         else { // locate new last node

         ListNode current = firstNode;

         // loop while current node does not refer to lastNode
         while ( current.nextNode != lastNode )
            current = current.nextNode;

         lastNode = (ListNodeDouble) current; // current is new lastNode
         current.nextNode = null;
         }

         return removedItem; // return removed node data
     } // end method removeFromBack


     public synchronized void insertInOrder(Object insertItem){
         ListNodeDouble current, anterior, auxNode;
         if(isEmpty()){
              firstNode = lastNode = new ListNodeDouble( insertItem );
         }
         else{
             current = (ListNodeDouble)firstNode;
             anterior = (ListNodeDouble)firstNode;
             if(firstNode==lastNode){
                 if((Integer)insertItem <(Integer)firstNode.data){
                     this.insertAtBack(insertItem);
                 }
                 else{
                     this.insertAtFront(insertItem);
                 }
             }
             else{
                 while ( (Integer)current.data > (Integer)insertItem && current.nextNode!=firstNode){
                     anterior = current;
                     current = (ListNodeDouble)current.nextNode;
                 }
                 if(current == firstNode){
                     this.insertAtFront(insertItem);
                 }
                 else{
                     if(lastNode == current && (Integer)current.data>(Integer)insertItem){
                        this.insertAtBack(insertItem);
                     }
                     else{
                        //ListNodeDouble nuevo = new ListNodeDouble(insertItem);
                        auxNode= current;
                        anterior.nextNode= new ListNodeDouble( insertItem );
                        auxNode.beforeNode=(ListNodeDouble)anterior.nextNode;
                        anterior.nextNode.nextNode=auxNode;
                        current.beforeNode=(ListNodeDouble) anterior.nextNode;
                        current.beforeNode.beforeNode=anterior;
                     }
                 }
             }
         }
     }

      public synchronized void insertInOrder2(Object insertItem){
          if(isEmpty())
              firstNode = lastNode = new ListNodeDouble( insertItem );

           else{
             if(firstNode==lastNode){
                 if((Integer)insertItem <(Integer)firstNode.data){
                     this.insertAtBack(insertItem);
                 }
                 else{
                     this.insertAtFront(insertItem);
                 }
             }

             else{
                ListNodeDouble current = (ListNodeDouble)firstNode;
                ListNodeDouble anterior = null;
                 while(current!=null && (Integer)insertItem < (Integer)current.data){
                     anterior = current;
                     current = (ListNodeDouble)current.nextNode;
                 }
                 if(anterior==null)
                     insertAtFront(insertItem);
                 else
                     if(anterior== lastNode)
                         insertAtBack(insertItem);

             else{
                 ListNodeDouble nuevo = new ListNodeDouble(insertItem);
                 anterior.nextNode = nuevo;
                 nuevo.nextNode = current;
                 nuevo.beforeNode=anterior;
                 current.beforeNode=nuevo;
             }
      }
 }

     }

     /*  public synchronized boolean isEmpty(){
        return firstNode == null; // return true if List is empty
     }

       public synchronized void print(){
         if ( isEmpty()){
             System.out.println( "Empty " + name );
             return;
         }

     System.out.print( "The " + name + " is: " );

     ListNodeDouble current = firstNode;

     // while not at end of list, output current node's data
     while ( current != null ){
         System.out.print( current.data.toString() + " " );
         current =  (ListNodeDouble) current.nextNode;
     }

     System.out.println( "\n" );

     }*/

        public synchronized void printBack(){
         if ( isEmpty()){
             System.out.println( "Empty " + name );
             return;
         }

     System.out.print( "The " + name + " is: " );

     ListNodeDouble current = (ListNodeDouble)lastNode;

     // while not at end of list, output current node's data
     while ( current != null ){
         System.out.print( current.data.toString() + " " );
         current =  (ListNodeDouble) current.beforeNode;
     }

     System.out.println( "\n" );

     }

  public ListNodeDouble getFirstNode() {
        return (ListNodeDouble) firstNode;
    }

    public ListNodeDouble getLastNode() {
        return (ListNodeDouble) lastNode;
    }


}
