/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseis;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class EjercicioSeis {

    /**
     * @param args the command line arguments
     * Se piden tres números e informar el promedio.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int NumeroUno;
        int NumeroDos;
        int NumeroTres;
        int Promedio;
        int Suma;
        Scanner misc = new Scanner (System.in);
        System.out.println("Por favor introduzca el primer numero");
        NumeroUno = misc.nextInt();
        System.out.println("Por favor introduzca el segundo numero");
        NumeroDos = misc.nextInt();
        System.out.println("Por favor introduzca el tercer numero");
        NumeroTres = misc.nextInt();
        Suma = NumeroUno+NumeroDos+NumeroTres;
        Promedio = Suma/3; 
        System.out.println("El resultado es "+Promedio);
        }
    
}
