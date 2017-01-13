
package newpackage;

import java.util.concurrent.Semaphore;


public class NewMain {

    public static void main(String[] args) {
        Semaphore sem=new Semaphore(1);
        new Incre(sem,"a");
        new Decre(sem,"b");
        System.out.print(sem);
    }
    
}
