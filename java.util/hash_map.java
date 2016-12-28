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
public class my_map {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String ,Integer> hm=new HashMap();
        String s;
        s="krishna";
        Integer i =new Integer(14);
        hm.put(s, i);
        s="nikhil";
        i=45;
        hm.put(s, i);
        s="anajli";
        i=10;
        hm.put(s, i);
        s="ritesh";
        i=13;
        hm.put(s, i);
        Set<Map.Entry<String,Integer>> set=hm.entrySet();
        for(Map.Entry<String,Integer> me : set)
        {
            System.out.println(me.getKey());
            System.out.println(me.getValue());
        }
    }
    
}
