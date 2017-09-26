/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveinticuatro;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class EjercicioVeinticuatro {

    /**
     * @param args the command line arguments
     * 24- Debemos pedir el ancho, el largo de un terreno y la cantidad de hilos 
     * de alambre e informar cuantos metros de alambre necesitamos para completar las vueltas de alambre.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner(System.in);
        Integer Largo;
        Integer Ancho; 
        
        
        System.out.println("Ingrese el largo del terreno:");
        Largo = misc.nextInt();
        
        System.out.println("Ingrese el ancho del terreno:");
        Ancho = misc.nextInt();
        
    }
    
}
