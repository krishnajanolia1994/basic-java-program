

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jaxax.swing.*;


public class Jcombo extends JApplet {
    JList li;
    JComboBox js;
    JLabel l;
    String s[]={"indore","pune","heydrabad","mumbai","delhi","agra"
                ,"colcata","illahbad","jamshedpur","haweli","pawai","rajawada",
                "shrinagar","gudagaw","gaziabad","merut","benglore","masoor","cochi"
                ,"tiravntpuram","varangal","mengluru","siya","ram","ravan","last"};

    @Override
    public void init() {
        try {
            SwingUtilities.invokeAndWait(this::makegui);
        } catch (InterruptedException | InvocationTargetException ex) {
            Logger.getLogger(NewJApplet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void makegui()
    {
        setLayout(new FlowLayout());
        l=new JLabel("enter a choice for city");
        js=new JComboBox(s);
        js.addItemListener( new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l.setText("you selected  "+s[js.getSelectedIndex()]);
            }
        });
        add(l);
        add(js);
    }

}
