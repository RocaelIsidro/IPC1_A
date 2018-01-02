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
public class NodoPersona {
    private int dpi=0;
    private String nombre="";
    private NodoPersona siguiente=null;

    public NodoPersona(int dpi,String nombre, NodoPersona siguiente) {
        this.dpi = dpi;
        this.nombre=nombre;
        this.siguiente = siguiente;
    }

    public NodoPersona() {
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoPersona getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPersona siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
