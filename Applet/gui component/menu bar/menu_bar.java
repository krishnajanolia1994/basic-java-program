

import java.applet.Applet;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;


public class menu_bar extends Applet {

   Frame f;

    public void init() {
        f=new frame();
        f.setSize(250, 250);
        f.setVisible(true);
    }
    public void start()
    {
        f.setVisible(true);
    }
    public void stop()
    {
        f.setVisible(false);
    }

}
