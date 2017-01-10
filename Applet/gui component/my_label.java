
package applet;

import java.applet.Applet;
import java.awt.Label;





public class my_label extends Applet {

    String msg1="first";
    String msg2="second";
    String msg3="third";
    public void init() {
        Label l1=new Label("one");
        Label l2=new Label("two");
        Label l3=new Label("three");
        add(l1);
        add(l2);
        add(l3);
    }
        
  
}
