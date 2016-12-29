/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.util.*;
public class vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector<Integer > v=new Vector<Integer>();
        Integer i=new Integer(10);
        v.add(i);
        v.add(i);
        v.add(i);
        i=15;
        v.add(i);
        Iterator it=v.listIterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+ "  ");
        }
        System.out.println("Size of vactor is" + v.capacity());
        System.out.println("number of element in vactor is" + v.size());
        
                
    }
    
}
