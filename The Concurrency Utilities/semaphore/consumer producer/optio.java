/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.concurrent.Semaphore;

/**
 *
 * @author student
 */
public class demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Semaphore f= new Semaphore(0);
        System.out.println(f);
        f.release();
        System.out.print(f);
    }
    
}
