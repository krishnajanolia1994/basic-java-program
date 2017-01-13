
package newpackage;

import java.util.concurrent.CountDownLatch;

/**
 *
 * @author student
 */
class myThread implements Runnable{
    CountDownLatch cdl;

    public myThread(CountDownLatch cdl) {
        this.cdl=cdl;
        new Thread( this).start();
    }
    public void run()
    {
        int i;
        for(i=0;i<10;i++)
        {
            cdl.countDown();
            System.out.println(i);
        }
    }
    
}
