
package applet;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;







public class checkbox_group extends Applet implements ItemListener{
    String msg="";
    

    Checkbox b1,b2,b3;
    CheckboxGroup cg;
    public void init() {
     b1=new     Checkbox(" krishna",cg,true);
     b2=new     Checkbox(" nikhil",cg,false);
     b3=new     Checkbox(" anjali",cg,false);
     add(b1);
     add(b2);
     add(b3);
     b1.addItemListener(this);
     b2.addItemListener(this);
     b3.addItemListener(this);
    }

  
   
    public void paint(Graphics g)
    {
        msg +="  the student passed" + cg.getSelectedCheckbox().getLabel();
        
        g.drawString(msg, 0,200);
        
    }

    public void itemStateChanged(ItemEvent e) {
        repaint();
    }
        
  
}
