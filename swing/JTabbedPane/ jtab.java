/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JApplet;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author student
 */
public class jtab extends JApplet {
    JTabbedPane t;
    

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable()
            {
                public void run()
                {
                    makegui();
                }
            });
        } catch (InterruptedException ex) {
            Logger.getLogger(text.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(text.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void makegui()
    {
        t=new JTabbedPane();
        t.addTab("krishna", new k());
        t.addTab("nikhil", new k1());
        t.addTab("anjali", new k2());
        t.addTab("devesh", new k3());
        t.addTab("khushabu", new k4());
        add(t);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
