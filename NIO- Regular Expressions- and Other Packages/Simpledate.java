/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nio;

import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * @author student
 */
public class Simpledate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleDateFormat df;
        Date date=new Date();
        df=new SimpleDateFormat("dd MM YY hh:mm:ss  zzzz");
        System.out.println("current time is "+df.format(date));
    }
    
}
