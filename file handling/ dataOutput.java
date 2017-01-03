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
public class dataOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
        
        FileOutputStream ba=new   FileOutputStream("hiroshima_n");
        //
        DataOutputStream out = new DataOutputStream(ba);
        for(int i=0;i<10;i++)
        {
           out.writeInt(i);
        }
        FileInputStream bi=new   FileInputStream("hiroshima_n");
        //
        DataInputStream in = new DataInputStream(bi);
        for(int i=0;i<10;i++)
            System.out.println(in.readInt());
    }
    
}
