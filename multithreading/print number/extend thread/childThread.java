package krishna;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class NewClass2 extends Thread {
    NewClass2()
    {
        super("this is child thread");
        start();
    }
    public void run()
    {
        int i;
        try
        {
            for(i=0;i<10;i++)
            {
                System.out.println(i+"this is in child thread");
                Thread.sleep(500);

            }
        } catch (InterruptedException ex) {
            System.out.println(ex.toString());
        }
        
    }
