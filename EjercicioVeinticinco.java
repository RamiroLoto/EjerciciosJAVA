/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveinticinco;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class EjercicioVeinticinco {

    /**
     * @param args the command line arguments
     * 25-Sabiendo que necesito 2 bolsas de cal y 3 de cemento para una pared 
     * de 1 metro cuadrado, se pide el alto y ancho y se informa la cantidad 
     * de cada material que necesito.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner(System.in);
        Integer Ancho;
        Integer Largo;
        Integer Superficie;
        Integer ResultadoCal;
        Integer ResultadoCemento;
        
        System.out.println("Ingrese el Ancho:");
        Ancho = misc.nextInt();
        
        System.out.println("Ingrese el Largo:");
        Largo = misc.nextInt();
        
        Superficie = Ancho * Largo;
        
        ResultadoCal = Superficie * 2;
        ResultadoCemento = Superficie * 3;
        
        System.out.println("Se necesitan "+ResultadoCal+" bolsas de cal"+" y "+ResultadoCemento+" de cemento");
    }
    
}
