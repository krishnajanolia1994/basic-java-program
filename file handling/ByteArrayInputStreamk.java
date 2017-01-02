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
public class ByteArrayInputStreamk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
        
        ByteArrayOutputStream in= new ByteArrayOutputStream();
         String temp="hello my name is krishna";
        byte b[]=new byte[20];
        b=temp.getBytes();
        in.write(b);
        System.out.println(in.toString());
        byte c[]=in.toByteArray();
        for(byte by : c)
        {
            System.out.print((char) by);
        }
        
    }
    
}
