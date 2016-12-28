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
public class hashset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet hs=new HashSet();
        Integer i=new Integer(12);
        hs.add(i);
        i=15;
        hs.add(i);
        i=19;
        hs.add(i);
        Iterator it=hs.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
    }
    
}
