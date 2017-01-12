/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Image;

/**
 *
 * @author student
 */
public class create_image {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Canvas c;
        c=new Canvas();
        Image img=c.createImage(100,100);
        Component co=new Component() {};
        Image img2=co.createImage(100,100);
    }
    
}
