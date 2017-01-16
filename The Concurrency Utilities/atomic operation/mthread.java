/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
class mthread implements Runnable{
    String a;
    ReentrantLock lock;
    int v;
    public mthread(ReentrantLock lock, String a,int v) {
        this.lock=lock;
        this.a=a;
        this.v=v;
        
        new Thread(this).start();
    }
    public void run()
    {
        try
        {
            int i;
            System.out.println(a+ " befor incresing "+count.c);
            i=count.c.getAndSet(v);
            System.out.println(a+" after incresing "+count.c);

            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(mthread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
