/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
class Q {
    int n;
    int k;
    Semaphore con=new Semaphore(0);
    Semaphore  prod=new Semaphore(1);
    public void put(int k) 
    {
         try
         {
             prod.acquire();
             n=k;
         } catch (InterruptedException ex) {
            Logger.getLogger(Q.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("put "+  n);
        con.release();
    }
    public void get() throws InterruptedException
    {
        try
        {
            con.acquire();
            
        }catch (InterruptedException ex) {
            Logger.getLogger(Q.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("got"+n);
        prod.release();
        
    }
}
