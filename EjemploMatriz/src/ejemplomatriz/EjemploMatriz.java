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
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel ;
import javax.swing.JLabel ;
import java.awt.GridLayout;


class EjemploMatriz extends JFrame{

JButton [][]bMatriz;
JPanel Panel ;
JLabel Texto;
Ventana venta;

public EjemploMatriz(){
venta = new Ventana ();
add(getjPanel());
add(getTexto());
inicializadorEjemploMatriz();
}
public void inicializadorEjemploMatriz(){

setLayout(null);
setSize(600,600);
setVisible(true);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public JLabel getTexto(){

    Texto = new JLabel("matriz");
    Texto.setBounds(10,10,70,80);
    return Texto;


}

public JPanel getjPanel(){

    int num =(int)(Math.random()*10);
    int filas =venta.ingresarFilas();
    int columnas = filas;
    JButton bMatriz [][] = new JButton[filas][columnas];
    JPanel Panel= new JPanel();
    Panel.setLayout(new GridLayout(filas,columnas));

    for (int i=0; i< filas;i++) {
        for (int j=0; j<columnas;j++) {
            bMatriz[i][j] = new JButton(String.valueOf(num));
            bMatriz[i][j].setBounds(20,10,360,360);

            Panel.setBounds(100,100,270,300);
            Panel.add(bMatriz[i][j]);
        }
    }

    return Panel;
}
}

