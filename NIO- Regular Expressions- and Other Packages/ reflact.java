/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nio;
import java.lang.reflect.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author student
 */
public class reflact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        try
        {
            Class c= Class.forName("java.awt.Dimension");
            Constructor con[]=c.getConstructors();
            System.out.println("consructor are");

            for(Constructor k:con)
            {
                System.out.println(k);
            }
            System.out.println("methods are");
            Method mot[]=c.getMethods();
            for(Method  k:mot)
            {
                System.out.println(k);
            }
            System.out.println("field are");
            Field f[]=c.getFields();
            for(Field  k:f)
            {
                System.out.println(k);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(reflact.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
