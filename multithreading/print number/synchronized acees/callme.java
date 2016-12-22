package krishna;

/**
 *
 * @author student
 */
public class callme_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        callme k1=new callme();
        caller m1=new caller("hello",k1);
        caller m2=new caller("world",k1);
        caller m3=new caller("well come",k1);
        
        
    }
    
}
