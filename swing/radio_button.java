
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author student
 */
public class radio_button extends JApplet implements ActionListener{
    
    
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
        
        JRadioButton a;
        JRadioButton b;
        JRadioButton c;
        JRadioButton d;
        setLayout(new FlowLayout());

        a=new JRadioButton("java");
        l=new JLabel("krishna");
        b=new JRadioButton("c++");
        c=new JRadioButton("python ");
        d=new JRadioButton("matlab");
        a.addActionListener((ActionListener) this);
        b.addActionListener((ActionListener) this);
        c.addActionListener((ActionListener) this);
        d.addActionListener((ActionListener) this);
        add(a);
        add(b);
        add(c);
        add(d);
        ButtonGroup bg=new ButtonGroup();
        bg.add(a);
        bg.add(b);
        bg.add(c);
        bg.add(d);
        add(l);
        
    }

    // TODO overwrite start(), stop() and destroy() methods

    public void actionPerformed(ActionEvent e) {
        l.setText(e.getActionCommand());
    }
}
