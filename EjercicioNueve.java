/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionueve;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class EjercicioNueve {

    /**
     * @param args the command line arguments
     * Se ingresa la cantidad y precio de un producto y se informa el total a pagar.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner (System.in);
        int Cantidad;
        int Precio;
        int Total;
        System.out.println("Por favor ingrese la cantidad");
        Cantidad = misc.nextInt();
        System.out.println("Por favor ingrese el precio");
        Precio = misc.nextInt();
        Total = Cantidad * Precio;
        System.out.println("El total a pagar es "+Total);
                
    }
    
}
