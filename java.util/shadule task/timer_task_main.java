/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newkrishna.java_util;

/**
 *
 * @author student
 */
import java.util.*;
public class timer_task_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        timer_task t=new timer_task();
        Timer T=new Timer();
        T.schedule(t, 10000);
    }
    
}
