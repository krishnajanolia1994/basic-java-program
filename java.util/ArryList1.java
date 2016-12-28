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
public class ArrayList1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> l = new ArrayList<Integer>();
        Integer i=new Integer(10);
        l.add(i);
        l.add(i);
        l.add(i);
        i=20;
        l.add(1, i);
        l.remove(1);
        Iterator it=l.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(l.size());
        int size= l.size();
        Integer I[]=new Integer[size];
        for(Integer k : I)
        {
            System.out.println(k);
        }
        l.toArray(I);
        //I=(Integer[]) l.toArray();
        for(Integer k : I)
        {
            System.out.println(k);
        }
    }
    
}
