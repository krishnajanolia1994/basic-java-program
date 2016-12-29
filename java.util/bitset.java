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
public class bitset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BitSet bt =new BitSet(16);
        System.out.print(bt);
        bt.set(5);
        bt.set(6);
         BitSet b =new BitSet(16);
        bt.and(b);
        System.out.print(bt);
    }
    
}
