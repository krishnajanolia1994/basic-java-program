

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class JList extends JApplet {
    JList li;
    JScrollPane js;
    JLabel l;
    JLabel l1;
    String s[]={"indore","pune","heydrabad","mumbai","delhi","agra"
                ,"colcata","illahbad","jamshedpur","haweli","pawai","rajawada",
                "shrinagar","gudagaw","gaziabad","merut","benglore","masoor","cochi"
                ,"tiravntpuram","varangal","mengluru","siya","ram","ravan","last"};

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
            Logger.getLogger(NewJApplet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(NewJApplet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void makegui()
    {
        setLayout(new FlowLayout());
        l=new JLabel();
        l1=new JLabel();
        li=new JList(s);
        li.setSelectionForeground(Color.DARK_GRAY);
        li.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        js=new JScrollPane(li);
        Dimension preferredSize;
        preferredSize=new Dimension();
        preferredSize.setSize(100,100);
        js.setPreferredSize(preferredSize);
        li.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                int ind;
                ind=li.getAnchorSelectionIndex();
                l1.setText(" you hava selected  "+s[ind]);
            }
        } );
        l.setText("enter a choice:--");
        add(l);
        add(l1);
        add(js);
    }

}
