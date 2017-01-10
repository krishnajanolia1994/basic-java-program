
package applet;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.applet.Applet;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class 
package applet;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.applet.Applet;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class line_change_gui extends Applet {

    int x,y;
    String msg="";
    GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
    String s[]=ge.getAvailableFontFamilyNames();
     int a=0; 
    public void init() {
        
        addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e) {
                msg=s[a];
                if(a<s.length)
                    a=a+1;
                else 
                    a=0;
                repaint();
        }
        });
    }
    
    
    public void start()
    {
    }
    public void paint(Graphics g)
    {
        String Dialog = null;
        Font f=new Font(Font.MONOSPACED,Font.ITALIC,10);
        setFont(f);
        FontMetrics fm=g.getFontMetrics(f);
        nextLine("he mt name is krishna  ",g);
        sameLine("who is yr best Friend",g);
    }

    private void nextLine(String s, Graphics g) {
        FontMetrics fm=g.getFontMetrics();
        y+=fm.getHeight();
        x=0;
        g.drawString(s, x, y);
    }

    private void sameLine(String s, Graphics g) {
        FontMetrics fm=g.getFontMetrics();
                x+=fm.stringWidth(s)+20;

        g.drawString(s, x, y);
    }

    

}
 extends Applet {

    int x,y;
    String msg="";
    GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
    String s[]=ge.getAvailableFontFamilyNames();
     int a=0; 
    public void init() {
        
        addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e) {
                msg=s[a];
                if(a<s.length)
                    a=a+1;
                else 
                    a=0;
                repaint();
        }
        });
    }
    
    
    public void start()
    {
    }
    public void paint(Graphics g)
    {
        String Dialog = null;
        Font f=new Font(Font.MONOSPACED,Font.ITALIC,10);
        setFont(f);
        FontMetrics fm=g.getFontMetrics(f);
        nextLine("he mt name is krishna  ",g);
        sameLine("who is yr best Friend",g);
    }

    private void nextLine(String s, Graphics g) {
        FontMetrics fm=g.getFontMetrics();
        y+=fm.getHeight();
        x=0;
        g.drawString(s, x, y);
    }

    private void sameLine(String s, Graphics g) {
        FontMetrics fm=g.getFontMetrics();
                x+=fm.stringWidth(s)+20;

        g.drawString(s, x, y);
    }

    

}
