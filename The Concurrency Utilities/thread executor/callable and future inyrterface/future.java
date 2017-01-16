/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class future {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExecutorService ex=Executors.newFixedThreadPool(2);
        Future<Integer> f1;
        Future<Integer> f2;
        Future<Integer> f3;
        Future<Integer> f4;
        System.out.println("strted");
        f1=ex.submit(new Sum(15,5));
        f2=ex.submit(new Div(15,5));
        f3=ex.submit(new fact(5));
        f4=ex.submit(new mult(15,5));
        try
        {
            System.out.println(" sum of number is "+f1.get());
            System.out.println(" division of number is "+f2.get());
            System.out.println(" factorial of number is "+f3.get());
            System.out.println(" multiplication of number is "+f4.get());
        } catch (InterruptedException ex1) {
            Logger.getLogger(future.class.getName()).log(Level.SEVERE, null, ex1);
        } catch (ExecutionException ex1) {
            Logger.getLogger(future.class.getName()).log(Level.SEVERE, null, ex1);
        }
    }
    
}
