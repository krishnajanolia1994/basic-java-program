/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krishna;

/**
 *
 * @author student
 */
public class NewMain3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        q Q=new q();
        cons con =new  cons("this is consumer thread",Q);
        prod pro =new  prod("this is consumer thread",Q);
        
    }
    
}
