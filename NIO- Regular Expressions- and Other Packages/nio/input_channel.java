/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class input_channel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileInputStream fin;
        FileChannel fch;
        ByteBuffer bf;
        try
        {
            fin=new FileInputStream("krishna.txt");
            fch=fin.getChannel();
            long Size=fch.size();
            bf=ByteBuffer.allocate(100);
            fch.read(bf);
            bf.rewind();
            int i;
            for(i=0;i<100;i++)
            {
                System.out.println(bf.get());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(input_channel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(input_channel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
