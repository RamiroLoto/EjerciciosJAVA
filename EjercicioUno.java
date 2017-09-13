/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciouno;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int NumeroUno;
        Scanner misc = new Scanner(System.in);
        System.out.println("Por favor ingrese un número: ");
        NumeroUno= misc.nextInt();
        System.out.println("el numero " + NumeroUno);
        int NumeroDos;
        System.out.println("Por favor ingrese otro número: ");
        Scanner misca = new Scanner(System.in);
        NumeroDos= misca.nextInt();
        System.out.println("el número " + NumeroDos);
        System.out.println("El resultado es: " + NumeroUno "+" NumeroDos);
        // TODO code application logic here
    }
    
}
