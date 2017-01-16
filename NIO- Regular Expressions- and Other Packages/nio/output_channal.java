
package nio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class output_channal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileOutputStream fout;
        FileChannel fch;
        ByteBuffer mbuf;
        try
        {
            fout=new FileOutputStream("krishna.txt");
            fch=fout.getChannel();
            mbuf=ByteBuffer.allocate(100);
            byte b;
            for(b=0;b<100;b++)
                mbuf.put(b);
           mbuf.rewind();
           fch.write(mbuf);
            fch.close();
            fout.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(output_channal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
