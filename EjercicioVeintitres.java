/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveintitres;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class EjercicioVeintitres {

    /**
     * @param args the command line arguments
     * Debemos pedir el ancho y el largo de un terreno e informar cuantos metros
     * de alambre necesitamos para dar tres (3) vueltas de alambre.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner (System.in);
        Integer Ancho;
        Integer Largo;
        Integer Resultado;
        
        System.out.println("Ingresar ancho del terreno");
        Ancho = misc.nextInt();
        
        System.out.println("Ingresar largo del terreno");
        Largo = misc.nextInt();
        
        Resultado = ((Ancho * 2) + (Largo * 2)) * 3;
        System.out.println("El resultado para colocar tres vueltas de alambre en el terreno es: "+Resultado);
    }
    
}
