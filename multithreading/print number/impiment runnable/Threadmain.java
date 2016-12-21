package krishna;

/**
 *
 * @author student
 */
public class threadmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        NewClass1 n= new NewClass1();
        try
        {
            int i;
            for(i=0;i<10;i++)
            {
                System.out.println(i+"in main thread");
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e) 
        {
            System.out.println(e.toString());
        }
            
    }
    
}
