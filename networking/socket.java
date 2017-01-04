/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkin_in_java;

/**
 *
 * @author student
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class socket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Socket s=new Socket("internic.net",43);
            InputStream in=s.getInputStream();
            OutputStream ou=s.getOutputStream();
            String str = (args.length == 0 ? "osborne.com" : args[0]) + "\n";
            byte b[]=new byte[str.length()];
            b=str.getBytes();
            ou.write(b);
            int c;
            while((c=in.read())!=-1)
            {
                System.out.print((char)c);
            }
            s.close();
        } catch (IOException ex) {
            Logger.getLogger(packate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
