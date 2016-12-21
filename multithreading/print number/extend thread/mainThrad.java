package krishna;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewClass2 n= new NewClass2();
        try
        {
                int i;
                for(i=0;i<10;i++)
                {
                    System.out.println(i+"in main thread");
                    Thread.sleep(600);
                }
     
     
        }
        catch(InterruptedException e)
        {
            System.out.println(e.toString());
        }
    }
    
}
