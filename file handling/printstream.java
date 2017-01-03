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
public class printstream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String s="my name is krishna"+
                "my friend name is nikhil jahria"+
                "we both belongs to smae family of school"+
                "that is jnv "+
                "he completed his 12 th from jnv mandla "+
                "i complited my 12 th from jnv indore ";
        int count=s.length();
        byte b[]=new byte[count];
        b=s.getBytes();
        FileOutputStream ba=new   FileOutputStream("hiroshima_n");
        PrintStream bf=new PrintStream(ba);
        bf.print(bf);
        bf.close();
    }
    
}
