
package applet;

import java.applet.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class banner extends Applet implements Runnable{
    Thread t=null;
    String msg="hey hi i am krishna janolia";
    boolean flag;
    public void init() {
       setForeground(Color.BLUE);
       setBackground(Color.GRAY);
    }
    public void start()
    {
        t=new Thread(this);
        t.start();
        flag=false;
    }
    public void run()
    {
        char ch;
        int i=0;
        int k=msg.length();
        try
        {
            for( ;  ; )
            {
                repaint();
                ch=msg.charAt(i);
                msg=msg.substring(i,msg.length());
                msg+=ch;
                Thread.sleep(1000);
                if((i+1)==k)
                    i=0;
                else
                    i++;
                if(flag)
                    break;
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(banner.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (StringIndexOutOfBoundsException ex) {
            Logger.getLogger(banner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void stop()
    {
        flag=true;
    }
    public void paint(Graphics g)
    {
        g.drawString(msg, 100,100);
    }
}
