/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotres;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class EjercicioTres {

    /**
     * @param args the command line arguments
     * Se debe pedir el nombre y el apellido, luego mostrarlo en el siguiente mensaje 
     * “su nombre es XXXXX y XXXXXX es su apellido”.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nombre;
        String Apellido;
        System.out.println ("Por favor ingrese su nombre");
        Scanner misc = new Scanner(System.in);
        Nombre = misc.nextLine();
        System.out.println("Por favor ingrese su apellido");
        Apellido = misc.nextLine();
        System.out.println("Su nombre es "+Nombre+" y "+Apellido+" es su apellido");
       }
    
}
