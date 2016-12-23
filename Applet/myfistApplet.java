/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krishna;

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author student
 */
public class NewApplet1 extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    public void paint(Graphics g)
    {
        g.drawString("it is my first app", 100, 100);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
