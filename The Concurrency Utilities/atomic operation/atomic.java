/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author student
 */
public class atomic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ReentrantLock lock=new ReentrantLock();
        new mthread(lock,"a",1);
        new mthread(lock,"b",2);
        new mthread(lock,"c",3);
    }
    
}
