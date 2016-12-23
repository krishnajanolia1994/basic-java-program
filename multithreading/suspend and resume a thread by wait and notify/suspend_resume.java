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
public class suspend_resume implements Runnable{
    Thread t;
    String s;
    boolean flag_suspend;
    suspend_resume(String k)
    {
        s=k;
        t=new Thread(this,k);
        t.start();
        flag_suspend=false;
    }
    public void run()
    {
        int i;
        try
        {
            synchronized(this)
            {
                while(flag_suspend)
                {
                    wait();
                }
            }
            for(i=0;i<10;i++)
            {
                System.out.println(i+" thread "+ s +" is running");
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e.toString());
        }
    }
    
    public void suspend()
    {
        flag_suspend=true;
    }
    synchronized void resume()
    {
        System.out.println("thread "+ s +"  is resumrd ");
        flag_suspend=false;
        notify();
    }
}
