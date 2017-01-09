/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkin_in_java;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author student
 */
public class NewClass extends Frame{
    String s="my name is krishna";
    public int x;
    int y;
    char ch;
    String xy=""+x;
    String outc="";
    
    
    NewClass()
    {
        addMouseListener(new mouse(this));
        addKeyListener(new key(this));
        addWindowListener(new WindowAdapter()
        {
             public void windowClosing(WindowEvent e) {
             setVisible(false);
    }
        });
    }
    public void paint(Graphics g)
    {
        g.drawString(s, 100,100);
        g.drawString(s, 100,115);
        xy=""+x;
        xy=" "+y;
        g.drawString(xy, 100, 130);
        xy="";
        xy=" "+y;
        String cha;
        cha=""+ch;
        g.drawString(xy, 100, 145);

    }
}
