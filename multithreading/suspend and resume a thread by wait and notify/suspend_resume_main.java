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
public class suspend_resume_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        suspend_resume k1=new suspend_resume("first");
        suspend_resume k2=new suspend_resume("second");
        suspend_resume k3=new suspend_resume("third");
        suspend_resume k4=new suspend_resume("fourth");

        int i;
        try
        {
            for(i=0;i<10;i++)
            {
                System.out.println(i+" u r running main thread");
                Thread.sleep(200);
                if(i==2)
                {
                    System.out.println("second thread is suspended");
                    k2.suspend();
                }
                if(i==4)
                {
                    System.out.println("second thread is resumed");
                    k2.resume();
                }
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(e.toString());
        }
    }
    
}
