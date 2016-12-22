package krishna;

/**
 *
 * @author student
 */
public class q {
    q()
    {}
    boolean bool=true;
    int y =-1;
    synchronized public void producer(int x)
    {
        while(!bool)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e.toString());
            }
            
        }
        y=x;
        System.out.println("producer is called"+y);
        bool=false;
        notify();
    }
    synchronized public int consumer()
    {
        while(bool)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e.toString());
            }
        }
        System.out.println("consumer is called"+y);
        bool=true;
        notify();
        return 0;
    }
    
}
