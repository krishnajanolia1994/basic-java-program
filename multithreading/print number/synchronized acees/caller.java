import java.util.*;

/**
 *
 * @author student
 */
public class caller implements Runnable{
    String s;
    Thread t;
    callme j;
    caller(String k ,callme m )
    {
        j=m;
        s=k;
        t=new Thread(this,s);
        t.start();
    }

   
    
    public void run()
    {
        synchronized(j)
        {
            j.call(s);
        }
    }
}
