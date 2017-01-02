/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.io.*;
public class filter implements FilenameFilter{
    String s;
    filter(String k)
    {
        s=k;
    }
     public boolean accept(File obj,String k)
     {
         if(k.endsWith(s))
             return true;
         else 
             return false;
     }
    
}
