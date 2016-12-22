/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krishna;
//import java .lang.Runnable;
//import java.io.*;
/**
 *
 * @author student
 */
public class prod implements Runnable{
    Thread t;
    String k;
    q Q;
    prod(String s, q j )
    {
        k=s;
        t=new Thread(this,k);
        t.start();
        Q=j;
    }
    public void run()
    {
        int i;
        for(i=0;i<10;i++)
        {
            Q.producer(i);
        }
    }
    
    
}
