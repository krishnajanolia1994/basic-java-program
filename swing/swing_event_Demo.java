/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author student
 */
public class swing_event_Demo {
    swing_event_Demo()
    {
        JFrame jf=new JFrame("first jFrame");
        jf.setSize(250,250);
        jf.setBackground(Color.GRAY);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        JLabel jl =new JLabel();
       // jf.add(jl);
        JButton jb=new JButton("change");
        jf.add(jb);
        jb.add(jl);
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jl.setText("text of label is changed");
                
            }
        }
        
        );
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new swing_event_Demo();
            }
        }
        );
    }
    
}
