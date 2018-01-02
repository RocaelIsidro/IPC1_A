/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasimple;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rocael
 */
public class Graficador {
    
     public void CrearDot(String nombre, Lista li) 
    {
        FileWriter writer=null;
        PrintWriter pw  = null;
      //  String a = GenerarDot(raiz);
           
        try {
            writer = new FileWriter(nombre+".dot");
            pw = new PrintWriter(writer);
            pw.println("digraph lista{");
            pw.println("rankdir=LR");
            //pw.println("rankdir=UD");
            pw.println("node [margin=0 fontcolor=blue fontsize=32 width=0.5 shape=box style=filled]");
            
            pw.println(li.generarDot());
            pw.println("\n }");
            pw.close(); 
        } catch (Exception ex) {
        }finally{
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException ex) {
                    Logger.getLogger(NodoPersona.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
   
    
    
         public void GenerarImagen( String direccionDot, String direccionPng){ 
        try {
            //Ejecuta el proceso
            String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
            String cmd = dotPath + " -Tjpg " +direccionDot+" -o "+direccionPng;
            System.out.println(cmd);
            Runtime.getRuntime().exec(cmd); 
            // pbuilder.start();     
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

       /*Graficar*/
    
    
     public String Reemplazar(int nombre){
        String cad=Integer.toString(nombre);
        return cad.replaceAll("-","_");
    }
   
    
     
    
}
