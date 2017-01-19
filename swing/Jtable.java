
import java.awt.FlowLayout;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;





public class Jtable extends JApplet {
    
    JLabel l;
    JTable t;
    JScrollPane sp;
    

    
    public void init() {
        try {
            SwingUtilities.invokeAndWait(this::makegui);
        } catch (InterruptedException | InvocationTargetException ex) {
            Logger.getLogger(NewJApplet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void makegui()
    {
        setLayout(new FlowLayout());
        l=new JLabel("table for student information");
        String s[]={"name","roll no","section"};
        String s1[][]=
        {
            { "Gail", "4567", "865" },
            { "Ken", "7566", "555" },
            { "Viviane", "5634", "587" },
            { "Melanie", "7345", "922" },
            { "Anne", "1237", "333" },
            { "John", "5656", "314" },
            { "Matt", "5672", "217" },
            { "Claire", "6741", "444" },
            { "Erwin", "9023", "519" },
            { "Ellen", "1134", "532" },
            { "Jennifer", "5689", "112" },
            { "Ed", "9030", "133" },
            { "Helen", "6751", "145" },
            { "Gail", "4567", "865" },
            { "Ken", "7566", "555" },
            { "Viviane", "5634", "587" },
            { "Melanie", "7345", "922" },
            { "Anne", "1237", "333" },
            { "John", "5656", "314" },
            { "Matt", "5672", "217" },
            { "Claire", "6741", "444" },
            { "Erwin", "9023", "519" },
            { "Ellen", "1134", "532" },
            { "Jennifer", "5689", "112" },
            { "Ed", "9030", "133" },
            { "Helen", "6751", "145" },
            { "Gail", "4567", "865" },
            { "Ken", "7566", "555" },
            { "Viviane", "5634", "587" },
            { "Melanie", "7345", "922" },
            { "Anne", "1237", "333" },
            { "John", "5656", "314" },
            { "Matt", "5672", "217" },
            { "Claire", "6741", "444" },
            { "Erwin", "9023", "519" },
            { "Ellen", "1134", "532" },
            { "Jennifer", "5689", "112" },
            { "Ed", "9030", "133" },
            { "Helen", "6751", "145" },
            { "Gail", "4567", "865" },
            { "Ken", "7566", "555" },
            { "Viviane", "5634", "587" },
            { "Melanie", "7345", "922" },
            { "Anne", "1237", "333" },
            { "John", "5656", "314" },
            { "Matt", "5672", "217" },
            { "Claire", "6741", "444" },
            { "Erwin", "9023", "519" },
            { "Ellen", "1134", "532" },
            { "Jennifer", "5689", "112" },
            { "Ed", "9030", "133" },
            { "Helen", "6751", "145" }
                
                
                
        };
        t=new JTable(s1,s);
        sp=new JScrollPane(t);
        add(sp);
    }

}
