/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.util.*;
public class stingToken {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String in= "my name is khan =  i am not tererist";
        StringTokenizer st = new  StringTokenizer(in ,"=");
        String key=st.nextToken();
        String value = st.nextToken();
        System.out.print(key + "  "+ value);
        
    }
    
}
