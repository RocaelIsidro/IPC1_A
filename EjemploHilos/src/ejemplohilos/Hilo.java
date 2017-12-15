/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplohilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rocael
 */
public class Hilo extends Thread {

    String mensaje;

    public Hilo(String msg) {
        super(msg);
    }

    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println(mensaje);
           try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            

        }
        System.out.println("Este proceso ha terminado:" + this.getName());
    }

    public void setMensaje(String msj) {
        this.mensaje = msj;
    }

}
