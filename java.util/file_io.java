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
public class file_io {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File p = new File("/","myfile");
        System.out.println(" name"+ p.getName() );
        System.out.println("obsulute path of file"+ p.getAbsolutePath());
        System.out.println("parant file" + p.getParent());
        System.out.println("dose file exist "+ p.exists());
        System.out.println("can write" + p.canWrite());
        System.out.println("can read"+p.canRead());
    }
    
}
