/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krishna.String;

/**
 *
 * @author student
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s;
        char ch[] = {'1', '5', '3', '4', '7'} ;
        s=new String(ch);
        String s2=new String(s);
        String s3=new String(ch,1,3);
        byte b[]= {65, 66, 67, 68, 69, 70};
        String s4=new String( b);
        System.out.println("s is " +s+" s1 is " +s2+ " s3 " + s3 +" s4  is "+ s4);
        System.out.println("length of s is  " +s.length()+"  length of  s1 is  " +s2.length()+ "  length of  s3  " + s3.length() +"  length of  s4  is  "+ s4.length());
        System.out.println(s.charAt(2));
        char c[]= new char[5];
        byte a[]= new byte[5];
        s.getChars(0, 0, c, 0);
        s.getBytes(0, 0, a, 0);
        System.out.println(c+"   "+ a);
        
    }
    
}
