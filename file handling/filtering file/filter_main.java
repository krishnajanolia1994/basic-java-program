/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter_main;

/**
 *
 * @author student
 */
import java.io.*;
public class filter_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f=new File("file");
        System.out.print(f.isDirectory());
        FilenameFilter Only=new filter("html");
        String s[]=f.list();
        for(String k : s)
        {
            System.out.println(k);
        }
    }
    
}
