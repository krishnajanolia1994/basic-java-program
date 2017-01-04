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
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class httpcon_url {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
            URL l;
        try {
            l = new URL("https://www.google.co.in/");
             System.out.println("port  is  "+ l.getPort());
             System.out.println("protocol is "+ l.getProtocol());
             System.out.println("host is "+l.getHost());
             System.out.println("file  " +l.getFile() );
             HttpURLConnection uc=(HttpURLConnection)l.openConnection();
             System.out.println("request method "+ uc.getRequestMethod());
             System.out.println("responce massage is "+uc.getResponseMessage());
             System.out.println(""+ uc);
        } catch (MalformedURLException ex) {
            Logger.getLogger(con_url.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(con_url.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
}
