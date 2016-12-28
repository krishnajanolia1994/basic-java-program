/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newkrishna.java_util;
import java.util.*;
/**
 *
 * @author student
 */
public class LinkedList_k {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> l= new LinkedList<Integer>();
        Integer i=new Integer(10);
        l.add(i);
        l.add(i);
        l.add(i);
        l.add(i);
        i=9;
        l.addFirst(i);
        i=11;
        l.addLast(i);
        l.add(i);
        l.add(i);
        Iterator it=l.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        l.removeFirst();
        l.removeLast();
        it=l.iterator();
        System.out.println();
        while(it.hasNext())
        {
            //System.out.println();
            System.out.print(it.next()+" ");
        }
    }
    
}
