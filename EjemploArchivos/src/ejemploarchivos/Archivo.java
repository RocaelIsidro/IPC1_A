/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarchivos;

/**
 *
 * @author Rocael
 */
import java.io.*;//no olviden importar esta librería al inicio de su programa
import java.util.logging.Level;
import java.util.logging.Logger;

//esto es solo un método, no una clase, el método deberá ser incluido en una clase java para su uso
public class Archivo {

    public void escribir(String nombreArchivo) {
        File archivo;
        archivo = new File(nombreArchivo);

        //Escritura
        try {
            FileWriter w = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);

            bw = new BufferedWriter(new FileWriter(archivo));
            wr.write("El fichero de texto ya estaba creado.");//escribimos en el archivo
            wr.append(" - y aqui continua"); //concatenamos en el archivo sin borrar lo existente
            //ahora cerramos los flujos de canales de datos, al cerrarlos el archivo quedará guardado con información escrita
            //de no hacerlo no se escribirá nada en el archivo
            wr.close();

            bw.close();

            bw.close();
        } catch (IOException e) {
        };
    }

    public void crear() {
        try {
            String ruta = "/home/rocael/archivo.txt";
            File archivo = new File(ruta);
            BufferedWriter bw;
            if (archivo.exists()) {
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write("El fichero de texto ya estaba creado.");
            } else {
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write("Acabo de crear el fichero de texto.");
            }
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void escribir() {
        try {
            File archivo = new File("EstadoJuego.txt");
            try (FileWriter escribir = new FileWriter(archivo, true)) {
                escribir.write("JUGADOR 1:  ");
                escribir.write("////SIGUIENTE JUEGO////");
            }
        } catch (Exception e) {
            System.out.println("Error al escribir");
        }

    }

    public void mostrarContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while ((cadena = b.readLine()) != null) {
            System.out.println(cadena);
        }
        b.close();
    }
}
