/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioocho;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class EjercicioOcho {

    /**
     * @param args the command line arguments
     * Se pide el largo y ancho de un terreno u se pide la superficie del mismo.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner (System.in); 
        int Largo;
        int Ancho;
        int Superficie;
        System.out.println("Por favor ingrese el largo del terreno");
        Largo = misc.nextInt();
        System.out.println("Por favor ingrese el ancho del terreno");
        Ancho = misc.nextInt();
        Superficie = Largo * Ancho; 
        System.out.println("La superficie del terreno es "+ Superficie);
    }
    
}
