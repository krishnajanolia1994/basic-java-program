
package networkin_in_java;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

public class Env_color_family extends Applet {
    String msg="";

    
    public void init() {
    }
    
    
    
    public void paint(Graphics g)
    {
        String FontLi[];
        GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
         FontLi=ge.getAvailableFontFamilyNames();
        for(String m :  FontLi)
        {
            msg+=m;
            msg+=" ";
        }
        
        g.drawString(msg,0, 320);
    }

}
