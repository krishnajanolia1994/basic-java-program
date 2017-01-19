
import java.awt.FlowLayout;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;





public class Jtree extends JApplet {
    
    JLabel l;
    JTree t;
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
        l=new JLabel("select a path");
        DefaultMutableTreeNode a=new DefaultMutableTreeNode("a");
        DefaultMutableTreeNode b=new DefaultMutableTreeNode("b");
        a.add(b);
        DefaultMutableTreeNode c=new DefaultMutableTreeNode("c");
        a.add(c);
        DefaultMutableTreeNode d=new DefaultMutableTreeNode("d");
        a.add(d);
        DefaultMutableTreeNode e=new DefaultMutableTreeNode("e");
        d.add(e);
        DefaultMutableTreeNode f=new DefaultMutableTreeNode("e");
        d.add(f);
        DefaultMutableTreeNode g=new DefaultMutableTreeNode("g");
        t=new JTree(a);
        t.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                l.setText("your selected path is   "+e.getPath());
            }
        });
        add(l);
        //add(t);
        sp=new JScrollPane(t);
        add(sp);
    }

}
