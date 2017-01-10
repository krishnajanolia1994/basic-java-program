
package applet;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class text extends Applet implements ActionListener{
    String msg="";
    String n="krishna";
    TextField text;
    Label l;
    public void init() {
        l=new Label("name",Label.RIGHT);
        text=new TextField(n);
        add(l);
        add(text);
        addActionListener(this);
    }
     
     
    

  
   
    public void paint(Graphics g)
    {
       msg=text.getText();
       g.drawString(msg,100,100);
    }

   

    

    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    

   
        
  
}
