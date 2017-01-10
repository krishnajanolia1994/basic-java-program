
package applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





public class button_by_dource extends Applet implements ActionListener{
    String msg="";

    String button="botton";
    Button lb[]=new Button[15];
    int i;
    
    String msg1="first";
    String msg2="second";
    String msg3="third";
    public void init() {
        for( i =0;i<15;i++)
        {
            lb[i]=new Button(button + "  " +i);
            add(lb[i]);
            lb[i].addActionListener(this);
        }
        
        
    }

  
    public void actionPerformed(ActionEvent e) {
        String s="";
        e.getSource();
        for(i=0;i<15;i++)
        {
            if(s.equals(lb[i]))
            {
                msg+=lb[i].getLabel();
                repaint();
            }
        }
    }
    public void paint(Graphics g)
    {
        g.drawString(msg, 0,1000);
    }
        
  
}
