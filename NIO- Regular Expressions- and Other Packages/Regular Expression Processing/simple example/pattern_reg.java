/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author student
 */
public class pattern_reg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        pat=Pattern.compile("k*");
        mat=pat.matcher("k kk kkk kmk");
        while(mat.find())
        {
            System.out.println("element font "+mat.group());
        }
    }
    
}
