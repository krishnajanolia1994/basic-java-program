
package applet;

import java.applet.*;
import java.awt.*;
/*
<applet code=" my_param_app" width=300 height=80>
<param name=kri value="krishna">
<param name=f_kri value="samvatram">
<param name=fr_kri value="nikhil">
<param name=s_kri value="javahar navoday vidhyalay manpur">
</applet>
*/


public class my_param_app extends Applet {
    String kri;
    String f_kri;
    String fr_kri;
    String s_kri;
    public void init() {
        setForeground(Color.BLUE);
        setBackground(Color.GRAY);
    }
    public void strart()
    {
        kri=getParameter("kri");
        f_kri=getParameter("f_kri");
        fr_kri=getParameter("fr_kri");
        s_kri=getParameter("s_kri");
    }
    public void paint (Graphics g )
    {
        g.drawString(kri, 100, 100);
        g.drawString(f_kri, 110,100);
        g.drawString(fr_kri, 120, 100);
        g.drawString(s_kri, 130,100);
    }

}
