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
class consum implements Runnable{
    Q q;
    public consum(Q q) {
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
                q.get();
                Thread.sleep(150);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(consum.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
