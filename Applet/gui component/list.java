
package applet;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;










public class list extends Applet implements ActionListener{
    String msg="";
    List os,br;
    public void init() {
        os=new List(4,false);
        br=new List(3,true);
        os.add("windows");
        os.add("dos");
        os.add("linux");
        os.add("mac");
        add(os);
        br.add("opera mini");
        br.add("google Chrom");
        br.add("Internet explorer");
        add(br);
        os.addActionListener(this);
        br.addActionListener(this);
        
    }
     
     
    

  
   
    public void paint(Graphics g)
    {
       int s[];
       s=os.getSelectedIndexes();
       for(int ind :s )
       {
           msg+="  "+ os.getItem(s[ind]);
       }
       g.drawString(msg,0,100);
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
    }

   
        
  
}
