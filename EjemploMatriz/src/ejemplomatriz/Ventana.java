/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomatriz;

/**
 *
 * @author Rocael
 */
import javax.swing.JOptionPane;
class Ventana{

public Ventana(){}


public int ingresarFilas(){

int filas = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite tamaño deseado (sera tamaño x tamaño)","Matriz cuadrada",JOptionPane.QUESTION_MESSAGE));

return filas;

}
}
