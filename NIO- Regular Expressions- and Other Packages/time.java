/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nio;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author student
 */
public class time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateFormat df;
        Date date=new Date();
        df=DateFormat.getTimeInstance(DateFormat.SHORT, Locale.ITALY);
        System.out.println("current time is "+df.format(date));
    }
    
}
