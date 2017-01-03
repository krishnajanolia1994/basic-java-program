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
        
        
        FileReader f=new FileReader("ch.txt");
        BufferedReader br =new BufferedReader(f);
        String s;
        while((s=br.readLine())!=null)
        {
            System.out.println(s);
        }
        f.close();
    }
    
}
