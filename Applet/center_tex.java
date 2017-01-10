
package applet;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import javafx.scene.paint.Color;



public class center_tex extends Applet {

    int x,y;
    String msg="";
    GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
    String s[]=ge.getAvailableFontFamilyNames();
     int a=0; 
    public void init() {
        
        
    }
    
    
    public void start()
    {
    }
    public void paint(Graphics g)
    {
        Dimension d=this.getSize();
        g.setColor(java.awt.Color.white);
        g.fillRect(0, 0, d.width,d.height);
        g.setColor(java.awt.Color.red);
        String Dialog = null;
        Font f=new Font(Font.MONOSPACED,Font.ITALIC,50);
        setFont(f);
        print_c("hello frienf my name is krishna",g);
        
    }

    private void print_c(String s, Graphics g) {
        FontMetrics fm=g.getFontMetrics();
        Dimension d=this.getSize();
        int k=d.width-fm.stringWidth(s);
        x=k/2;
        y=(fm.getAscent()+((d.height-fm.getAscent())+fm.getDescent())/2);
        g.drawString(s, x, y);
    }

   

    

}
