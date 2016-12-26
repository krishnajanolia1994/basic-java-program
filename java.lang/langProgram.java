/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krishna.javaLang;

/**
 *
 * @author student
 */
public class langProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        i=5000;
        Integer k=new Integer(i);
        i= k.hashCode();
        System.out.println(i);
        i= (byte) k.byteValue();
        System.out.println(i);
        byte b=22;
        System.out.println("byte b is"+b);
        System.out.println(i);
        byte c=21;
        Byte B=new Byte(b);
        B.compare(b,c);
        String s = new String("1");
        i=Integer.parseInt(s);
        System.out.println(i);
        float f_1 = 1.1f;
        float f_2 = 1.2f;
        float f_3;
        Float f1=new Float(3.01);
        Float f2=new Float(3.65);
        int comp=f1.compare(f_1,f_2);
        comp=f1.compareTo(f2);
        double d=f1.doubleValue();
        boolean b_=f1.equals(f2);
        f_1=Float.floatToIntBits(f_1);
        f_1=Float.floatToRawIntBits(f_1);
        i=f1.hashCode();
        System.out.println(i);
        if(f1.isNaN())
        {
            System.out.println("he invoking object contains a value that is\n" +
"not a number");
        }
        else
        {
            System.out.println("he invoking object contains a value that is\n" +
"not a number");
        }
        String s1;
        s1=f1.toHexString(f1); 
        System.out.println(s1);
        Float f3;
        f3=Float.valueOf(f_1);
        byte b_1=10;
        Byte b1=new Byte(b_1);
        s1=b1.toString();
        Byte b2;
        b2=Byte.decode(s1);
    }
    
    
}
