/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author student
 */
public class prod_con_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Q q = new Q();
        //produce prod=new produce(q);
        consum con=new consum(q);
        produce prod=new produce(q);
        
    }
    
}
