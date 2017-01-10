
package applet;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.applet.Applet;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Font_app extends Applet {

   
    String msg="";
    Frame f=new Frame("krishna");
    public void init() {
        addWindowListener(new WindowAdapter()
        {
         
        });
    }
    GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
    
    public void start()
    {
        f.setSize(1000, 250);
    }
    public void paint(Graphics g)
    {
        String Dialog = null;
        Font f=new Font(Font.MONOSPACED,Font.ITALIC,100);
        setFont(f);
        for(String s: ge.getAvailableFontFamilyNames())
        {
            msg=msg+"  " +s;
        }
        g.drawString(msg,0,100);
    }

}
