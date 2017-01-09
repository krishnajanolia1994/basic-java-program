
package networkin_in_java;

import java.applet.Applet;
import java.awt.Color;
import static java.awt.Color.blue;
import static java.awt.Color.green;
import static java.awt.Color.red;
import java.awt.Graphics;

public class cocor extends Applet {

    
    public void init() {
    }
    Color c=new Color(100,10,10);
    Color c1=new Color(21,111,41);
    Color c2=new Color(22,32,42);
    Color c3=new Color(100,33,150);


    
    public void paint(Graphics g)
    {
        int x[]={30, 200, 30, 200, 30};
        int y[]={30, 30, 200, 200, 30};
        int num=5;
        g.drawPolygon(x, y, num);
        g.setColor(c);
        g.drawOval(10, 10, 50, 60);
        g.setColor(c1);
        g.drawOval(0, 10, 50, 60);
        g.setColor(c3);
        g.drawOval(30, 10, 50, 60);
        g.setColor(c2);
        g.drawOval(0, 110, 50, 60);
        
    }

}
