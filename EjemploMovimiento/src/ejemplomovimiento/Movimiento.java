/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomovimiento;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rocael
 */
public class Movimiento extends Thread {
    public int cantidad=0;
    public Tablero tab=null;
    
    public Movimiento(int cantidad, Tablero tab){
        this.cantidad=cantidad;
        this.tab=tab;
    }
    
    public void mover(int cantidad){
        try {
            if(cantidad<=0){
                return;
            }
            if(Comprobar()){
                //regresar el jugador a la posicion 0
                cantidad=0;
                tab.vec[tab.tam-1]=0;
                tab.veclabel[tab.tam-1].setIcon(null);
                tab.posjugx=0;
                tab.vec[0]=1;
                tab.repintar();
                return;
            }
            //mover una posicion
            tab.veclabel[tab.posjugx].setIcon(null);
            tab.vec[tab.posjugx]=0;
            tab.repintar();
            tab.posjugx=tab.posjugx+1;
            tab.vec[tab.posjugx]=1;
            tab.repintar();
            cantidad--;
            Thread.sleep(500);
            
            mover(cantidad);
        } catch (InterruptedException ex) {
            Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public boolean Comprobar(){
        if(tab.posjugx>=tab.tam-1){
            return true;
        }
        return false;
    }
    
    public void run(){
        mover(cantidad);
    }
    
    
}
