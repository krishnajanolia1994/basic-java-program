
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class frame extends Frame {
    
        
        
        MenuBar m;
        Menu m1,m2,m3,m4;
        MenuItem m11,m12,m13,m14;
        MenuItem m21,m22,m23,m24;
        MenuItem m31,m32,m33,m34;
        MenuItem m41,m42,m43,m44;
  
    String mass=" ";

     frame() {
       
       
        
        m=new MenuBar();
        setMenuBar(m);
        m1=new Menu("file");
        m11=new MenuItem(" open file");
        m12=new MenuItem(" close file");
        m13=new MenuItem(" save file");
        m14=new MenuItem(" import file");
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);
        m4=new Menu("import project");
        m41=new MenuItem("ecllips project");
        m42=new MenuItem("note pade project");
        m43=new MenuItem(" java projrct ");
        m44=new MenuItem(" my project");
        m4.add(m44);
        m4.add(m41);
        m4.add(m42);
        m4.add(m43);
        m1.add(m4);
        m2=new Menu("edit");
        m21=new MenuItem(" undo file");
        m22=new MenuItem(" redu file");
        m23=new MenuItem(" cut file");
        m24=new MenuItem(" copy file");
        m2.add(m21);
        m2.add(m22);
        m2.add(m23);
        m2.add(m24);
        m3= new Menu("run");
        m31=new MenuItem(" run project");
        m32=new MenuItem(" test project");
        m33=new MenuItem(" build project");
        m34=new MenuItem(" no");
        m3.add(m31);
        m3.add(m31);
        m3.add(m31);
        m3.add(m31);
        m.add(m1);
        m.add(m2);
        m.add(m3);
        myAction my=new myAction(this);
        m11.addActionListener(my);
        m12.addActionListener(my);
        m13.addActionListener(my);
        m14.addActionListener(my);
        m21.addActionListener(my);
        m22.addActionListener(my);
        m23.addActionListener(my);
        m24.addActionListener(my);
        m31.addActionListener(my);
        m32.addActionListener(my);
        m33.addActionListener(my);
        m34.addActionListener(my);
        m41.addActionListener(my);
        m42.addActionListener(my);
        m43.addActionListener(my);
        m44.addActionListener(my);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we) {
                setVisible(false);
            }
        });
    }
    public void paint(Graphics g)
    {
        g.drawString(mass, 100,100);
    }
}
