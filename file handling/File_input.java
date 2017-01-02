/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */import java.io.*;
public class File_input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String s="my name is krishna"+
                "i leave in indore "+
                "my village nabe if nagpur"+
                "if u want to marry me u will have to live in  my willage"+
                " along with me and my parants "+
                "gote it";
        byte buf[]=s.getBytes();
        FileOutputStream f=new   FileOutputStream("krishna.txt");
        f.write(buf);
        f.close();
    }
    
}
