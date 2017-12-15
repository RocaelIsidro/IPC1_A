/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarchivos;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rocael
 */
public class EjemploArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Archivo a = new Archivo();
    a.escribir("Hola.txt");
        try {
            a.mostrarContenido("Hola.txt");
        } catch (IOException ex) {
            Logger.getLogger(EjemploArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
