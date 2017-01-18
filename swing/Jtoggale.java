/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

/**
 *
 * @author student
 */
public class Jtoggale extends JApplet {
    
    JToggleButton b;
    JLabel l;

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
        b=new JToggleButton("b");
        l=new JLabel();
        setLayout(new FlowLayout());
        
        b.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(b.isSelected())
                    l.setText("item is selected");
                else
                    l.setText("item is deselected");
                
            }
        });
        add(b);
        add(l);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
