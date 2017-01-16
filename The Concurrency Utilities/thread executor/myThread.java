
package newpackage;

import java.util.concurrent.CountDownLatch;

/**
 *
 * @author student
 */
class myThread implements Runnable{
    CountDownLatch cdl;
    String s;

    public myThread(CountDownLatch cdl,String s) {
        this.cdl=cdl;
        this.s=s;
        new Thread( this).start();
    }
    public void run()
    {
        int i;
        for(i=0;i<5;i++)
        {
            cdl.countDown();
            System.out.println(i+ " in thread  "+s);
            
        }
    }
    
}
