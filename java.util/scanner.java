/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newkrishna.java_util;

/**
 *
 * @author student
 */
import java.util.*;
public class scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner src = new Scanner(System.in);
        int i;
        int sum=0;
        src.useDelimiter(" , *");
        int k=1;
        while(src.hasNext())
        {
            if(src.hasNextInt())
            {
                
                i=src.nextInt();
                sum+=i;
            }
            else
            {
                String s=src.next();
                if(s.equals("done"))
                break ;
            }
            
        }
        System.out.println("the sum of number is" + sum);
    }
    
}
