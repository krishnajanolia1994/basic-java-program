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
public class threadkmain {
    public static void main(String[] args)
    {
    
        threadk k1=new threadk("first");
        threadk k2=new threadk("second");
        threadk k3=new threadk("third");
        threadk k4=new threadk("fourth");

        int i;
        try
        {
            for(i=0;i<10;i++)
            {
                System.out.println("u r running main  " +i+"  thread");
                Thread.sleep(200);
                if(i==2)
                {
                    System.out.println("second thread is suspended");
                    k2.t.suspend();
                }
                if(i==4)
                {
                    System.out.println("second thread is resumed");
                    k2.t.resume();
                }
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(e.toString());
        }
    }
    
}
