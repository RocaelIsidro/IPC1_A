/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import java.io.*;

/**
 *
 * @author Rocael
 */
public class Manejoarchivo {

    public void escribir(String nombreArchivo) {
        File archivo = new File(nombreArchivo);

        if(archivo.exists()){
            
        }
        try {
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            //for
            pw.write("El, archivo ,de texto nuevo\n");
            pw.append("Seguimos escribiendo\n");
            pw.append("Ya gane IPC1");

            pw.close();
            bw.close();

        } catch (IOException e) {

        }

    }
    
    public void escribirFile(String nombre){
        try {
            File archivo = new File("EstadoJuego.txt");
            try (FileWriter escribir = new FileWriter(archivo, true)) {
                escribir.write("JUGADOR 1:  ");
                escribir.write("////SIGUIENTE JUEGO////");
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
            System.out.println("Error al escribir");
        }
    }
    
    public void Mostrarcontenido(String nombreArchivo){
        String cadena="";
        
        try{
        FileReader fr=new FileReader(nombreArchivo);
        BufferedReader br=new BufferedReader(fr);
        
        int posvector=0;
            while((cadena=br.readLine())!=null){
                //cadena split , 
                //
                
                posvector++;
                
                System.out.println(cadena);
            }
        
        br.close();
        }catch(Exception e){
            
        }
        
    }
}
