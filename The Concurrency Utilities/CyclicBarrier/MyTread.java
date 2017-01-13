/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
class MyTread implements Runnable{

    String s;
    CyclicBarrier cb;
    public MyTread(CyclicBarrier cb,String a) {
        s=a;
        this.cb=cb;
        new Thread().start();
    }
    public void run()
    {
        try
        {
            System.out.println(s);
            cb.await();
        } catch (InterruptedException ex) {
            System.out.println(ex);
        } catch (BrokenBarrierException ex) {
            System.out.println(ex);

        }
    }
    
}
