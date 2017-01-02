/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.io.*;
public class file {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File f =new File("home");
        f.mkdirs();
        System.out.println(f.exists());
        System.out.println(f.isDirectory());


    }
    
}
