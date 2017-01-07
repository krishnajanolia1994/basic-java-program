/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applet;

import java.awt.Color;
import java.awt.Frame;

/**
 *
 * @author student
 */
public class frame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Frame f=new Frame();
        String s="krishna";
        f.setBackground(Color.yellow);
        f.setVisible(true);
        f.setSize(1000,500);
        f.setTitle(s);
        Thread.sleep(10000);
        f.setVisible(false);
        
    }
    
}
