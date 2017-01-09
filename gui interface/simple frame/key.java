/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkin_in_java;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author student
 */
public class key extends KeyAdapter{
    NewClass cl;
    key(NewClass cl)
    {
        this.cl=cl;
    }

   

   

    
   

    public void keyTyped(KeyEvent e) {
        cl.ch=e.getKeyChar();
        cl.repaint();
    }

    
    
}
