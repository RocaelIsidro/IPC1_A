/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

/**
 *
 * @author Rocael
 */
public class Archivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manejoarchivo ma=new Manejoarchivo();
        ma.escribir("IPC1.txt");
        
        ma.Mostrarcontenido("IPC1.txt");
    }
    
}
