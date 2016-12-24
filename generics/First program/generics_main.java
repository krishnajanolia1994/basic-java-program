/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krishna.generics;

/**
 *
 * @author student
 */
public class generics_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        generics <Integer> k;
        k = new generics<Integer>(55);
        System.out.println("value of k is "+ k.getob());
        k.sowtype();
    }
    
}
