/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applet;

import java.applet.Applet;

/**
 *
 * @author student
 */
import java.applet.*;
import java.awt.*;
import java.awt.Event;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
public class my_ap extends Applet implements  MouseListener,MouseMotionListener
{
    int MouseX=0;
    int MouseY=0;
    String msg="";
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
       setBackground(Color.GRAY);
       addMouseListener(this);
       addMouseMotionListener(this);
    }

    // TODO overwrite start(), stop() and destroy() methods

    public void mouseClicked(MouseEvent e) {
        MouseX=0;
        MouseY=10;
        msg="mouse is clicked";
        repaint();
    }

    
    public void mousePressed(MouseEvent e) {
      MouseX=e.getX();
      MouseY=e.getY();
      System.out.println("x is "+e.getXOnScreen());
      System.out.println("y is "+e.getYOnScreen());
      msg="mouse presed";
    }

    
    public void mouseReleased(MouseEvent e) {
        MouseX=e.getX();
        MouseY=e.getY();
        msg="mouse release";
    }

    
    public void mouseEntered(MouseEvent e) {
        MouseX=1;
        MouseY=10;
        msg="mose is entered";
        repaint();
    }

    
    public void mouseExited(MouseEvent e) {
        MouseX=2;
        MouseY=10;
        msg="mouse exited";
        repaint();
    }

    
    public void mouseDragged(MouseEvent e) {
        MouseX=e.getX();
        MouseY=e.getY();
        msg="*";
        showStatus("Moving mouse at " + e.getX() + ", " + e.getY());
    }

   
    public void mouseMoved(MouseEvent e) {
        
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,100,100);
    }
}
