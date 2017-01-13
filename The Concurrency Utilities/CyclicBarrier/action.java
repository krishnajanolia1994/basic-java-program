/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author student
 */
class action implements Runnable {

    public action() {
        new  Thread(this).start();
    }
    public void run()
    {
        System.out.println("finished");
    }
    
}
