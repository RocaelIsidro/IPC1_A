/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasimple;

/**
 *
 * @author Rocael
 */
public class ListaSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista lista = new Lista();
        Graficador graf=new Graficador();
        
        System.out.println("<<-- Ejemplo de lista simple -->>\n");
        System.out.println(lista.generarDot());
//        graf.CrearDot("lista", lista);
  //      graf.GenerarImagen("lista.dot","lista.png");
        // Agregar al final de la lista
        lista.agregarAlFinal(12,"Roca");
        System.out.println(lista.generarDot());
       /* graf.CrearDot("lista1", lista);
        graf.GenerarImagen("lista1.dot","lista1.png");
        */
       lista.agregarAlInicio(15,"Eduardo");
       lista.agregarAlInicio(16,"Jorge");
       lista.agregarAlInicio(16,"Jorge");
       lista.agregarAlInicio(16,"Jorge");
       lista.agregarAlInicio(16,"Jorge");
       lista.agregarAlInicio(16,"Jorge");
       lista.agregarAlInicio(16,"Jorge");
        System.out.println("<<-- Lista -->>");
        lista.listar();
        lista.removerPorReferencia(15);
        System.out.println(lista.buscar(5));
        System.out.println(lista.buscar(12));
        System.out.println("<<-- Lista -->>");
        lista.listar();
        
        graf.CrearDot("lista1", lista);
        graf.GenerarImagen("lista1.dot","Lis.png");
        
        
        //System.out.println(lista.generarDot());
        /*graf.CrearDot("lista2", lista);
        graf.GenerarImagen("lista2.dot","lista2.png");
       
        lista.agregarAlFinal(9,"Isidro");
        // Agregar in inicio de la lista
        lista.removerPorReferencia(15);        
        lista.agregarAlInicio(41,"Felipe");
        lista.agregarAlInicio(6,"Ivan");
        
        System.out.println(lista.generarDot());
        /*graf.CrearDot("lista3", lista);
         graf.GenerarImagen("lista3.dot","lista3.png");
        */
       /* System.out.println("\n\n<<-- Tamaño -->");
        System.out.println(lista.getTamanio());
        
        System.out.println("\nConsulta si existe el valor 30");
        System.out.println(lista.buscar(30));
            
        System.out.println("\nElimina la lista");
        lista.eliminar();
        
        System.out.println("\nConsulta si la lista está vacia");
        System.out.println(lista.esVacia());
        
        System.out.println("\n\n<<-- Fin de ejemplo lista simple -->>");
        */
    }
    
}
