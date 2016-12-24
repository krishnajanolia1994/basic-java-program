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
public class generics<t,v> {
    t ob;
    v ob2;
    generics (t a,v b)
    {
        ob=a;
        ob2=b;
    }
    public t getob1()
    {
        return ob;
    }
    public v getob2()
    {
        return ob2;
    }
    public boolean Same(generics<?,?> k)
    {
        if(this.ob==k.ob && this.ob2==k.ob2)
        {
            return true;
        }
        else
            return false;
        
    }
    public void sowtype()
    {
        System.out.println("the perameter of object ob is  " + ob.getClass().getName());
        System.out.println("the perameter of object ob2 is  " + ob2.getClass().getName());

    }
}
