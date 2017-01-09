
package networkin_in_java;

import java.applet.Applet;
import java.awt.Graphics;

public class polygon extends Applet {

    
    public void init() {
    }
    public void paint(Graphics g)
    {
        int x[]={30, 200, 30, 200, 30};
        int y[]={30, 30, 200, 200, 30};
        int num=5;
        g.drawPolygon(x, y, num);
    }

}
