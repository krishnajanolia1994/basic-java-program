
package newpackage;

import java.util.concurrent.CountDownLatch;

public class NewMain1 {

    
    public static void main(String[] args) {
        CountDownLatch cdl=new CountDownLatch(5);
        new myThread(cdl);
        try
        {
            cdl.await();
        }catch(InterruptedException ex)
        {
            System.out.println(ex.toString());
        }
        System.out.print("done");
    }
    
}
