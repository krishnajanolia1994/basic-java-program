
package applet;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Checkbox;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JApplet;

public class card_layout extends JApplet implements ActionListener{

    CardLayout cl;
    Panel pn;
    Button win,oth;
    public void init() {
        
        win=new Button("windows");
        oth=new Button("other ");
        add(win);
        add(oth);
        cl=new CardLayout();
        pn=new Panel();
        pn.setLayout(cl);
        Panel wp=new Panel();
        Checkbox xp=new Checkbox("xp");
        Checkbox vista=new Checkbox("vista");
        wp.add(xp);
        wp.add(vista);
        Panel op=new Panel();
        Checkbox lin=new Checkbox("linux");
        Checkbox mac=new Checkbox("mac");
        op.add(lin);
        op.add(mac);
        pn.add(wp,"window");
        pn.add(op,"others");
        add(pn);
        addActionListener(this);
        addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent me) {
                cl.next(pn);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== win)
        {
            cl.show(pn, "windows");
        }
        else
            cl.show(pn,"others");
        
    }

}
