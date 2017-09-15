/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocinco;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class EjercicioCinco {

    /**
     * @param args the command line arguments
     * Se necesita pedir dos números y sumarlos, mostrar el resultado.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int NumeroUno;
        int NumeroDos;
        int Suma;
        System.out.println("Por favor introduzca el primer numero");
        Scanner misc = new Scanner (System.in);
        NumeroUno = misc.nextInt();
        System.out.println("Por favor introduzca el segundo numero");
        NumeroDos = misc.nextInt();
        Suma = NumeroUno+NumeroDos;
        System.out.println("El resultado es "+Suma);
        }
    
}
