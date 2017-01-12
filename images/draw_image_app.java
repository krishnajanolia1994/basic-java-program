/*
* <applet code="immage_app" width=248 height=146>
* <param name="img" value="/home/student/Downloads/images.jpeg">
* </applet>
*/
package newpackage;

import java.applet.Applet;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;


public class draw_image_app extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Image imges;
    String s="";
    public void init() {
        
        imges=getImage(getDocumentBase(),getParameter("img"));
        s+=getParameter("img");
    }
    public void paint(Graphics g)
    {
        g.drawImage(imges, 0, 0, this);
        g.drawString(s,100,100);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
