
package applet;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.List;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;










public class scroll_bar extends Applet implements AdjustmentListener{
    String msg="";
    int x,y;
    int horil=10;
    int vetil=10;
    Scrollbar hori,veti;
    public void init() {
        hori=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,10);
        veti=new Scrollbar(Scrollbar.VERTICAL,0,10,0,10);
        add(hori);
        add(veti);
        hori.addMouseMotionListener(new MouseMotionAdapter()
        {
        public void mouseDragged(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            veti.setValue(y);
            hori.setValue(x);
            repaint();
            
        }
        }
        );
        veti.addMouseMotionListener(new MouseMotionAdapter()
        { 
           public void mouseDragged(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            veti.setValue(y);
            hori.setValue(x);
            repaint(); 
           }
        }
        );
        hori.addAdjustmentListener(this);
        veti.addAdjustmentListener(this);

    }
     
     
    

  
   
    public void paint(Graphics g)
    {
       msg = "Vertical: " + veti.getValue();
       msg += ", Horizontal: " + hori.getValue();
       g.drawString(msg, 6, 160);
       // show current mouse drag position
       g.drawString("*", hori.getValue(),
       veti.getValue());
    }

   

    public void adjustmentValueChanged(AdjustmentEvent e) {
        repaint();
    }

   
        
  
}
