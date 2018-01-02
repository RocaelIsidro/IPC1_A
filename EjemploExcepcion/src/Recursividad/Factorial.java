/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

/**
 *
 * @author Rocael
 */
public class Factorial {
    
    public int calcularFact(int num){
        int resultado;
        if(num==0){
            resultado=1;
            return resultado;
        }else{
            resultado= num*calcularFact(num-1);
            return resultado;
        }
        
    }
    
      public static void main(String[] args) {
        // TODO code application logic here
        Factorial fac=new Factorial();
        System.out.println(fac.calcularFact(5));
        
    }
}
//