
package newpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewMain1 {

    
    public static void main(String[] args) {
        CountDownLatch cdl=new CountDownLatch(5);
        CountDownLatch cdl1=new CountDownLatch(5);
        CountDownLatch cdl2=new CountDownLatch(5);
        CountDownLatch cdl3=new CountDownLatch(5);

        ExecutorService es=Executors.newFixedThreadPool(2);
        es.execute(new myThread(cdl,"a"));
        es.execute(new myThread(cdl1,"b"));
        es.execute(new myThread(cdl2,"c"));
        es.execute(new myThread(cdl3,"d"));
        try
        {
            cdl.await();
            cdl1.await();
            cdl2.await();
            cdl3.await();
            
        }catch(InterruptedException ex)
        {
            System.out.println(ex.toString());
        }
        es.shutdown();
        System.out.print("done");
    }
    
}
