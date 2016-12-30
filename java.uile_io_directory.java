/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

/**
 *
 * @author student
 */
import java.io.*;
public class file_io_directory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File p =new File("/home");
        System.out.println(p.isDirectory());
        System.out.println("the list of file of home");
        String s[]=p.list();
        int i=1;
        for(String list_f: s)
        {
            System.out.println(1+" file is "+ list_f);
            i++;
        }
    }
    
}
