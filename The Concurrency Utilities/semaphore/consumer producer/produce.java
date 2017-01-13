/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
class produce implements Runnable{
    Q q;
    

    produce(Q q) {
        this.q=q;
        new Thread(this).start();
    }

    
    public void run()
    {
        try
        {
            int i;
            for(i=0;i<10;i++)
            {
                q.put(i);
                Thread.sleep(150);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(consum.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
