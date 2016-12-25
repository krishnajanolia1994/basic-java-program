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
public class stringBuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuffer s = null;
       // s.ensureCapacity(10);
        
        //System.out.println(s.capacity());
        s=new StringBuffer("hello i am krishna janolia");
        s.ensureCapacity(10);
        System.out.println(s);
        s.append(" i am student of m.tech");
        System.out.println(s);
        s.append(s, 0, 3);
        System.out.println(s);
        s.delete(0, 5);
        System.out.println(s);
        char ch[]=new char[5];
        s.getChars(0, 5, ch, 0);
        System.out.println(ch);
        int i =s.capacity();
        System.out.println(i);
        System.out.println(s.getClass());
        String str=new String(" krishna ");
        i=s.indexOf(str, 0);
        System.out.println(i);
        s.insert(10, str);
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        
    }
    
}
