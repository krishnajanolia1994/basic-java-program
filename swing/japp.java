
package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


public class japp extends JApplet {
    JLabel l;
    JLabel l1;

    JButton b1;
    JButton b2;
    
    public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable()
            {
                public void run()                
                {
                    makegui();
                }
            }
            );
        } catch (InterruptedException ex) {
            Logger.getLogger(my_japp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(my_japp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void makegui()
    {
        setLayout(new FlowLayout());
        l=new JLabel();

        b1=new JButton("b1");
        b2=new JButton("b2");
        
        
        add(b1);
        add(b2);
        add(l);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("b1 is pressed");
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("b2 is pressed");
            }
        });
        
    }

}
