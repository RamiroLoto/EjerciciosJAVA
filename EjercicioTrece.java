/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotrece;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class EjercicioTrece {

    /**
     * @param args the command line arguments Se ingresa una edad y se informa
     * si es mayor de edad.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner(System.in);
        Integer Edad;
        String DatoAux;

        System.out.println("Ingrese la edad");
        DatoAux = misc.next();
        Edad = Integer.parseInt(DatoAux);
        //usamos la función parseint para convertir el string recibido en integer.
        if (Edad > 17) {
            System.out.println("Es mayor");
        } else {
            System.out.println("Es menor");

        }
    }

}
