
package krishna;


public class cons implements Runnable{
    Thread t;
    String k;
    q Q;
    cons(String s, q j )
    {
        k=s;
        t=new Thread( this,k);
        t.start();
        Q=j;
    }
    public void run()
    {
        int i;
        for(i=0;i<10;i++)
        {
            Q.consumer();
        }
    }
    
    
}
