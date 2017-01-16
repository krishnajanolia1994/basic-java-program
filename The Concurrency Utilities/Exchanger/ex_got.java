
import java.util.concurrent.Exchanger;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
class ex_got implements Runnable{

    Exchanger<String> ex;
    public ex_got(Exchanger<String> ex) {
    this.ex=ex;
    new Thread(this).start();
    }
    public void run()
    {
    String str;
    char ch='a';
    
            
            int i;
            for(i=0;i<20;i++)
            {
                try
                {
                    str=ex.exchange(str=new String());
                    System.out.println(str);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ex_put.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
    }
    
}
