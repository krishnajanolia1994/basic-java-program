/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.concurrent.Callable;

/**
 *
 * @author student
 */
class fact implements Callable<Integer> {

    int fac;
    public fact(int i) {
        fac=i;
    }
    public Integer call()
    {
        Integer k=1;
        int i;
        int K=k.intValue();
        for(i=1;i<=fac;i++)
        {
            K*=i;
        }
        k=new Integer(K);
        return k;
    }
    
}
