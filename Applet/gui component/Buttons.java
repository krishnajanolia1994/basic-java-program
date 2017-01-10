
package applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





public class Buttons extends Applet implements ActionListener{
    String msg="";

    Button yes,no;
    String msg1="first";
    String msg2="second";
    String msg3="third";
    public void init() {
        yes=new Button("yes");
        no=new Button("no");
        add(yes);
        add(no);
        yes.addActionListener(this);
        no.addActionListener(this);
    }

  
    public void actionPerformed(ActionEvent e) {
        String s="";
        s=e.getActionCommand();
        if(s.equals("yes"))
        {
            msg=" yes is called";
            repaint();
        }
        else
            msg="no is called";
            repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(msg, 50,50);
    }
        
  
}
