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
public class formating {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Formatter fmt=new Formatter();
        int i=10;
        String s="indore";
        
        fmt.format(" hello %s this is my %d program in %s",s,i,s );
        System.out.print(fmt);
    }
    
}
