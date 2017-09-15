/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuatro;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class EjercicioCuatro {

    /**
     * @param args the command line arguments
     * Al ingresar la edad y el nombre mostrar el siguiente mensaje: 
     * “ Usted se llama “ XXXXXX y tiene XX años de edad”.
     */

    public static void main(String[] args) {
        // TODO code application logic here
        String Nombre;
        int Edad;
        Scanner misc = new Scanner (System.in);
        System.out.println("Por favor ingrese su nombre");
        Nombre = misc.nextLine();
        System.out.println("Por favor ingrese su edad");
        Edad = misc.nextInt();
        System.out.println("Usted se llama "+Nombre+" Y tiene "+Edad+" años de edad");
        }
    
    
}
