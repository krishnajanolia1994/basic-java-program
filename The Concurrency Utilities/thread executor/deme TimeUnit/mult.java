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
class mult implements Callable<Integer> {

    int i,j;
    public mult(int i, int i0) {
        this.i=i;
        j=i0;
    }
    public Integer call()
    {
        return i*j;
    }
    
}
