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
public class pattern_split {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        String res[];
        String s="my name is krishna janolia .i lived in a small village ,near indore";
        pat=Pattern.compile("[,.]");
        mat=pat.matcher(s);
        res=pat.split(s);
        for(String k:res)
        {
            System.out.println(k);
        }
    }
    
}
