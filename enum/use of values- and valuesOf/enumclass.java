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
public class enumclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewEnum n1;
        NewEnum n3;
        n1=NewEnum.krishna;
        NewEnum n2;
        n2=NewEnum.krishna;
        NewEnum n[]=NewEnum.values();
        for(NewEnum k: n)
        {
            System.out.println("constant of enum are "+ k);
        }
        n3=NewEnum.valueOf("anjali");
        System.out.println("value of n3 is "+ n3);
    }
}
