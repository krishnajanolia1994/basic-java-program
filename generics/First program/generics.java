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
public class generics<t> {
    t ob;
    generics (t a)
    {
        ob=a;
    }
    public t getob()
    {
        return ob;
    }
    public void sowtype()
    {
        System.out.println("the perameter of object is  " + ob.getClass().getName());
    }
}
