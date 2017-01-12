
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class myAction implements ActionListener{
    frame f;
    myAction(frame f)
    {
        this.f=f;
    }


   

    String msg="";
    public void actionPerformed(ActionEvent e) {
        String comand;
        
        comand=e.getActionCommand();
        if(comand=="m11")
            msg+="open file is called";
        else
        if(comand=="m12")
            msg+="close file is called";
        else
        if(comand=="m13")
            msg+="save file is called";
        else
        if(comand=="m14")
            msg+="import file is called";
        else
        if(comand=="m21")
            msg+="undu file is called";
        else
        if(comand=="m22")
            msg+="redu file is called";
        else
        if(comand=="m23")
            msg+="cut file is called";
        else
        if(comand=="m24")
            msg+="copy file is called";
        else
        if(comand=="m31")
            msg+="run file is called";
        else
        if(comand=="m32")
            msg+="test file is called";
        else
        if(comand=="m33")
            msg+="build file is called";
        else
        if(comand=="m34")
            msg+="no file is called";
        else
        if(comand=="m41")
            msg+="ecllips project is called";
        else
        if(comand=="m42")
            msg+="note pade project is called";
        else
        if(comand=="m43")
            msg+="java projrct  is called";
        else
        if(comand=="m44")
            msg+="my project is called";
        f.mass+=msg;
        f.repaint();
    }
    
}
