/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomovimiento;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Rocael
 */
public class Tablero {
    public int tam=0;
    public JPanel fondo=null;
    
    //pos del guerrero
    public int posjugx=0;
    
    public int[] vec;
    public JLabel[] veclabel;
    public ImageIcon guerrero;
    public int tambloquex=0;
    
    public Tablero(int tam,JPanel fondo){
        this.tam=tam;
        this.fondo=fondo;
        llenar(tam);
    }
    
    public void llenar(int tam){
        tambloquex=800/tam;
        vec=new int[tam];
        veclabel=new JLabel[tam];
        
        vec[0]=1;
        
        for(int i=1;i<tam;i++){
            vec[i]=0;
        }
        
        ImageIcon guerrtemp=new ImageIcon(getClass().getResource("/Imagenes/mago.png"));
        Image t4=guerrtemp.getImage();
        Image r4=t4.getScaledInstance(tambloquex, 150, Image.SCALE_SMOOTH);
        guerrero=new ImageIcon(r4);
        
        repintar();
        
        }
        
    public void repintar(){
            for(int i=0;i<tam;i++){
                //vacio
                JLabel tablero;
                if(vec[i]==0){
                    tablero=new JLabel();
                    tablero.setOpaque(false);
                    tablero.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
                    tablero.setBounds(i*tambloquex, 0, tambloquex, 150);
                    veclabel[i]=tablero;
                    fondo.add(veclabel[i], BorderLayout.CENTER);
                    fondo.repaint();
                }//guerrero
                else if(vec[i]==1){
                    tablero=new JLabel(guerrero);
                    tablero.setOpaque(false);
                    tablero.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
                    tablero.setBounds(i*tambloquex, 0, tambloquex, 150);
                    veclabel[i]=tablero;
                    fondo.add(veclabel[i], BorderLayout.CENTER);
                    fondo.repaint();
                }
                
            }
        }
    
}

    
    
    

