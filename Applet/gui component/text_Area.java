
package applet;

import java.applet.Applet;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.TextArea;



public class text_Area extends Applet {
    String msg="jhbagkjhxbckjahbcdjsbkhdbchjxbjcjhsbdzkHXBhjSBCjhb\nn"+
            "gzdjchb dshsdj bcxhjdkhwk jhcskdhksjf jsckjsdhjk jhsjh\n"+
            "dsjhkjbchjhb jd;lij ghs fhfkjf huhdfhkshf fhskdjhjsdf dhsj\n"+
            "fckjxdnvkjkfvndslfkjbvksjdckjbnxbc";
    TextArea text;
    Label l;
    public void init() {
        l=new Label("name",Label.RIGHT);
        text=new TextArea(msg,20,10,Scrollbar.HORIZONTAL);
        add(l);
        add(text);
        
    }
     
     
    

  
}
