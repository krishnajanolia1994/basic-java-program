/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author student
 */
public class cycle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CyclicBarrier cb=new CyclicBarrier(3 , new action()); 
        System.out.println("stsrting");
        new MyTread(cb,"a");
        new MyTread(cb,"b");
        new MyTread(cb,"c");
    }
    
}
