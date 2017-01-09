/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkin_in_java;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author student
 */
public class mouse extends MouseAdapter{
    NewClass cl;
    

    

    mouse(NewClass aThis) {
        cl=aThis;
    }

    

    

    
    public void mouseClicked(MouseEvent e) {
        cl.x=e.getX();
        cl.y=e.getX();
        cl.repaint();

    }


    
    
}
