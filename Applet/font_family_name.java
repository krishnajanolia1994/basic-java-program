
package applet;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.applet.Applet;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class font_family_name extends Applet {

   
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
        Font f=new Font(Font.MONOSPACED,Font.ITALIC,100);
        setFont(f);
        
        g.drawString(msg,0,100);
    }

}
