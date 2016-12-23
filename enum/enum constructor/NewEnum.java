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
public enum NewEnum {
    nikhil(1),anjali(100),krishna(101),joy(105);
    private int value;
    NewEnum(int k)
    {
        value=k;
    }
    public int getPrise()
    {
        return value;
    }
    
}
