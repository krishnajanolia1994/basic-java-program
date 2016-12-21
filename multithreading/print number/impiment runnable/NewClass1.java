package krishna;
import java.lang.Runnable;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class NewClass1 implements Runnable  {

    Thread t;
    NewClass1()
    {
        t=new Thread (this,"my thread");
        t.start();
    }

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet.");
        try
        {
            int i;
            for(i=0;i<10;i++)
            {
                System.out.println(i+ "in child thread ");
                Thread.sleep(500);
            }
        } catch (InterruptedException ex) {
            System.out.println("child intrupted");
        }
    }


    

}
        
   
    
}
