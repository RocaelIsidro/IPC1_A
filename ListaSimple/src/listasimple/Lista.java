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
public class Lista {
    // Puntero que indica el inicio de la lista o conocida tambien
    // como cabeza de la lista.
    private NodoPersona inicio;
    
    // Variable para registrar el tamaño de la lista.
    private int tamanio;

    public NodoPersona getInicio() {
        return inicio;
    }

    public void setInicio(NodoPersona inicio) {
        this.inicio = inicio;
    }
    
    
    
    /**
     * Constructor por defecto.
     */
    public void Lista(){
        inicio =  null;
        tamanio = 0;
    }
    /**
     * Consulta si la lista esta vacia.
     * @return true si el primer nodo (inicio), no apunta a otro nodo.
     */
    public boolean esVacia(){
        return inicio == null;
    }
    /**
     * Consulta cuantos elementos (nodos) tiene la lista.
     * @return numero entero entre [0,n] donde n es el numero de elementos
     * que contenga la lista.
     */
    public int getTamanio(){
        return tamanio;
    }
    /**
     * Agrega un nuevo nodo al final de la lista.
     * @param valor a agregar.
     */
    public void agregarAlFinal(int valor,String nombre){
        // Define un nuevo nodo.
        NodoPersona nuevo = new NodoPersona();
        // Agrega al valor al nodo.
        nuevo.setDpi(valor);
        nuevo.setNombre(nombre);
        // Consulta si la lista esta vacia.
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            inicio = nuevo;
        // Caso contrario recorre la lista hasta llegar al ultimo nodo
        //y agrega el nuevo.
        } else{
            // Crea ua copia de la lista.
            NodoPersona aux = inicio;
            // Recorre la lista hasta llegar al ultimo nodo.
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            // Agrega el nuevo nodo al final de la lista.
            aux.setSiguiente(nuevo);
        }
        // Incrementa el contador de tamaño de la lista
        tamanio++;
    }
    /**
     * Agrega un nuevo nodo al inicio de la lista.
     * @param valor a agregar.
     */   
    public void agregarAlInicio(int valor, String nombre){
        // Define un nuevo nodo.
        NodoPersona nuevo = new NodoPersona();
        // Agrega al valor al nodo.
        nuevo.setDpi(valor);
        nuevo.setNombre(nombre);
        // Consulta si la lista esta vacia.
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            inicio = nuevo;
        // Caso contrario va agregando los nodos al inicio de la lista.
        } else{
            // Une el nuevo nodo con la lista existente.
            nuevo.setSiguiente(inicio);
            // Renombra al nuevo nodo como el inicio de la lista.
            inicio = nuevo;
        }
        // Incrementa el contador de tamaño de la lista.
        tamanio++;
    }
    /**
     * Obtiene el valor de un nodo en una determinada posición.
     * @param posicion del nodo que se desea obtener su valor.
     * @return un numero entero entre [0,n-1] n = numero de nodos de la lista.
     * @throws Exception
     */
    public int getValor(int posicion) throws Exception{
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        if(posicion>=0 && posicion<tamanio){
            // Consulta si la posicion es el inicio de la lista.
            if (posicion == 0) {
                // Retorna el valor del inicio de la lista.
                return inicio.getDpi();
            }else{
                // Crea una copia de la lista.
                NodoPersona aux = inicio;
                // Recorre la lista hasta la posición ingresada.
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                // Retorna el valor del nodo.
                return aux.getDpi();
            }
        // Crea una excepción de Posicion inexistente en la lista.
        } else {
            throw new Exception("Posicion inexistente en la lista.");
        }
    }
    /**
     * Busca si existe un valor en la lista.
     * @param referencia valor a buscar.
     * @return true si existe el valor en la lista.
     */
    public boolean buscar(int referencia){
        // Crea una copia de la lista.
        NodoPersona aux = inicio;
        // Bandera para indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta 
        // llegar al final de la lista.
        while(aux != null && encontrado != true){
            // Consulta si el valor del nodo es igual al de referencia.
            if (referencia == aux.getDpi()){
                // Canbia el valor de la bandera.
                encontrado = true;
            }
            else{
                // Avansa al siguiente. nodo.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el resultado de la bandera.
        return encontrado;
    }
    /**
     * Consulta la posición de un elemento en la lista
     * @param referencia valor del nodo el cual se desea saber la posición.
     * @return un valor entero entre [0,n] que indica la posición del nodo. 
     * @throws Exception 
     */
    
    public void removerPorReferencia(int referencia){
        // Consulta si el valor de referencia existe en la lista.
        if (buscar(referencia)) {
            // Consulta si el nodo a eliminar es el pirmero
            if (inicio.getDpi() == referencia) {
                // El primer nodo apunta al siguiente.
                inicio = inicio.getSiguiente();
            } else{
                // Crea ua copia de la lista.
                NodoPersona aux = inicio;
                // Recorre la lista hasta llegar al nodo anterior 
                // al de referencia.
                while(aux.getSiguiente().getDpi() != referencia){
                    aux = aux.getSiguiente();
                }
                // Guarda el nodo siguiente del nodo a eliminar.
                NodoPersona siguiente = aux.getSiguiente().getSiguiente();
                // Enlaza el nodo anterior al de eliminar con el 
                // sguiente despues de el.
                aux.setSiguiente(siguiente);  
            }
            // Disminuye el contador de tamaño de la lista.
            tamanio--;
        }
    }
  
    /**
     * Elimina la lista
     */
    public void eliminar(){
        // Elimina el valor y la referencia a los demas nodos.
        inicio = null;
        // Reinicia el contador de tamaño de la lista a 0.
        tamanio = 0;
    }
    /**
     * Mustra en pantalla los elementos de la lista.
     */
    public void listar(){
        // Verifica si la lista contiene elementoa.
        if (!esVacia()) {
            // Crea una copia de la lista.
            NodoPersona aux = inicio;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while(aux != null){
                // Imprime en pantalla el valor del nodo.
                System.out.print(i + ".[ " + aux.getDpi() +" | "+aux.getNombre()+ " ]" + " ->  ");
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                i++;
            }
        }
    }

    /*
    public String GenerarDot(NodoPersona inicio){
        String cad="";
        
        if(inicio!=null){
        cad+="nodo" + Reemplazar(inicio.hashCode())+ "[label=\""+raiz.getEtiqueta()+ " : "+raiz.getId()+"\"];\n";
                
        for(NodoPersona hijo : raiz.hijos){
            cad+="nodo" + Reemplazar(raiz.hashCode())+"->"+"nodo" + Reemplazar(hijo.hashCode())+";\n";
            cad+=GenerarDot(hijo);
        }
           
        }
        return cad;
    }
  */  
    
    
    public String generarDot(){
        String cadena="";
        // Verifica si la lista contiene elementoa.
        if (!esVacia()) {
            // Crea una copia de la lista.
            NodoPersona aux = inicio;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            System.out.println( ".[ " + aux.getDpi() +" | "+aux.getNombre()+ " ]" + " ->  ");
          cadena+="nodo" + inicio.hashCode()+ "[label=\""+inicio.getDpi()+ " : "+inicio.getNombre()+"\"];\n";
           String anterior="nodo"+inicio.hashCode();  
           aux=aux.getSiguiente();
            while(aux != null){
                // Imprime en pantalla el valor del nodo.
                cadena+="nodo" + aux.hashCode()+ "[label=\""+aux.getDpi()+ " : "+aux.getNombre()+"\"];\n";
                cadena+=anterior+"->"+"nodo" + aux.hashCode()+";\n";
                anterior="nodo"+aux.hashCode();
               // System.out.println(i + ".[ " + aux.getDpi() +" | "+aux.getNombre()+ " ]" + " ->  ");
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                
            }
        }
        return cadena;
    }

}
