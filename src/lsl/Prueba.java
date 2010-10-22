/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lsl;

/**
 *
 * @author Huallo
 */
public class Prueba {
    public static void main( String args[] ){
        List lista = new List();
        lista.insertInOrder(1);
        lista.insertInOrder(0);
        lista.insertInOrder(345);
        lista.insertInOrder(22);
        lista.insertInOrder(7);
        lista.insertInOrder(14);
        lista.print();
        //lista.removeObject(45);
        //lista.removePenultimo();
        //lista.eliminaPar();
        //lista.invierteLista();
        lista.print();

    }

}
