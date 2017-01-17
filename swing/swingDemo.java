/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author student
 */
public class swingDemo {
    swingDemo()
    {
        JFrame jf=new JFrame("first jFrame");
        jf.setSize(250,250);
        jf.setBackground(Color.GRAY);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        JLabel jl=new JLabel("swing is powerful gui");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new swingDemo();
            }
        }
        );
    }
    
}
