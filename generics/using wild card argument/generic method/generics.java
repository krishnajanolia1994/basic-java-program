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
public class generics {
    public <t,e extends t> void show(t a , e b)
    {
        System.out.println("value of t "+ a);
        System.out.println("value of e "+ b);
    }
    
}
