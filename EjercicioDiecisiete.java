/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodiecisiete;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class EjercicioDiecisiete {

    /**
     * @param args the command line arguments Se pide una edad y se informa si
     * es niño adolescente o mayor de edad
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner(System.in);
        Integer edad;
        String datoAux;

        System.out.println("ingrese edad: ");
        datoAux = misc.next();
        edad = Integer.parseInt(datoAux);

        if (edad > 17) 
        {
            System.out.println("Es mayor de edad");
        }
        else
        
            // son menores a 18
        if (edad < 13) 
        {
            System.out.println("Es niño");
        }
        else 
        {
            System.out.println("Es adolescente");
        }
    }
}
//        if(edad>17)
//        {
//            System.out.println("Es mayor");    
//        }
//        
//        if(edad<13)
//        {
//            System.out.println("Es niño");    
//        }
//        if (edad>12 && edad<18)
//        {
//            System.out.println("Es adolescente");
//        }
//        //en esta opcion usamos el microprocesador 3 veces para ingresar la edad, pero solo utilizando a una opcion, haciendolo pesado sin motivo.
    
//        if(edad>17)
//        {
//            System.out.println("Es mayor");    
//        }
//        else
//        
//        {
//            System.out.println("Es niño");    
//        }
//        if (edad>12 && edad<18)
//        {
//            System.out.println("Es adolescente");
//        }
//        Esto no funciona por que una opción no se tomaría en cuenta.
    

    

