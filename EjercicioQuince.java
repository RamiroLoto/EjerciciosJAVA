/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioquince;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class EjercicioQuince {

    /**
     * @param args the command line arguments
     * Indicar un importe, si es mayor a 100, hacer un aumento del 23%
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner (System.in);
        Integer Importe;
        String DatoAux;
        
        System.out.println("Por favor ingrese importe");
        DatoAux = misc.next();
        Importe = Integer.parseInt(DatoAux);
        
        if (Importe > 100){
            System.out.println("El importe es "+ Importe * 1.23);
        }else{
            System.out.println("El importe es "+ Importe);
        }
               
    }
    
}
