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
public class Decre implements Runnable{
    Semaphore sem;
    int i;
    String s;
    coun c=new coun();
    Decre(Semaphore sem,String s)
    {
        this.sem=sem;
        this.s=s;
        new Thread(this).start();
    }
    public void run()
    {
        try
        {
            sem.acquire();
            for(i=0;i<10;i++)
            {
                c.count--;
                System.out.println(c.count);
                Thread.sleep(1);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Incre.class.getName()).log(Level.SEVERE, null, ex);
        }
        sem.release();
    }
    
}
