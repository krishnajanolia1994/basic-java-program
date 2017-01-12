

import java.applet.Applet;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;


public class menu_bar extends Applet {

    MenuBar m;
    Menu m1,m2,m3,m4;
    MenuItem m11,m12,m13,m14;
    MenuItem m21,m22,m23,m24;
    MenuItem m31,m32,m33,m34;
    MenuItem m41,m42,m43,m44;

    public void init() {
        m=new MenuBar();
        m1=new Menu("file");
        MenuItem m11=new MenuItem(" open file");
        MenuItem m12=new MenuItem(" close file");
        MenuItem m13=new MenuItem(" save file");
        MenuItem m14=new MenuItem("  file");
        m4=new Menu("import project");
        MenuItem m11=new MenuItem(" open file");
        MenuItem m11=new MenuItem(" open file");
        MenuItem m11=new MenuItem(" open file");
        MenuItem m11=new MenuItem(" open file");
        m2=new Menu("edit");
        MenuItem m21=new MenuItem(" undo file");
        MenuItem m22=new MenuItem(" redu file");
        MenuItem m23=new MenuItem(" cut file");
        MenuItem m24=new MenuItem(" copy file");
        m3= new Menu("run");
        MenuItem m31=new MenuItem(" run project");
        MenuItem m32=new MenuItem(" test project");
        MenuItem m33=new MenuItem(" build project");
        MenuItem m34=new MenuItem(" ");
    }

}
