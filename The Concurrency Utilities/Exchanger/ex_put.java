
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
class ex_put implements Runnable{

    Exchanger<String> ex;
    public ex_put(Exchanger<String> ex) {
        this.ex=ex;
        new Thread(this).start();
    }
    public void run()
    {
    String str="";
    char ch='a';
    
            
            int i;
            for(i=0;i<20;i++)
            {
                str+=ch;
                ch++;
                if(i%5==0)
                {
                    try
                    {
                        str=ex.exchange(str);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ex_put.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
    }
    
}
