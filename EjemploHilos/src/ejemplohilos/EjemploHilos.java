/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplohilos;

/**
 *
 * @author Rocael
 */
public class EjemploHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Hilo hilo1 = new Hilo("Hilo 1");
                Hilo hilo2 = new Hilo("Hilo 2");
                hilo1.setMensaje("Este es el mensaje del hilo 1");
                hilo2.setMensaje("Mensaje hilo 2");
                hilo1.start();
                hilo2.start();
    }
    
}
