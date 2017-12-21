/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploexcepcion;

/**
 *
 * @author Rocael
 */
public class DividirCeroException extends Exception {
  
    public DividirCeroException() { 
        
    } 
    public int val;
    
    public DividirCeroException(int res) {
        this.val= res;
    }
}
