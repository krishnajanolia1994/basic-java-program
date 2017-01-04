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
import java.net.*;
public class Krishna_net {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        // TODO code application logic here
        InetAddress Adress=InetAddress.getLocalHost();
        System.out.println(Adress);
    }
    
}
