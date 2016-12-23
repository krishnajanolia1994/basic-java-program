/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krishna;

/**
 *
 * @author student
 */
public class threadk implements Runnable {
    Thread t;
    String s;
    threadk(String k )
    {
        s=k;
        t= new Thread(this,s);
        t.start();
    }
    public void run()
    {
        int i;
        try
        {
            for(i=0;i<10;i++)
            {
                System.out.println("u r running"+ " "+ s +" "+i+" "  + "thread");
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e.toString());
        }
    }
    
}
