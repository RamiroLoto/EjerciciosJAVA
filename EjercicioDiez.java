/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodiez;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class EjercicioDiez {

    /**
     * @param args the command line arguments Se ingresa la cantidad de
     * ganadores da la lotería nacional y el monto total del premio, informar
     * cuánto dinero le corresponde a cada uno.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner(System.in);
        int Cantidad;
        int Premio;
        int Resultado;
        System.out.println("Por favor ingrese la cantidad de ganadores");
        Cantidad = misc.nextInt();
        System.out.println("Por favor ingrese el total del premio");
        Premio = misc.nextInt();
        Resultado = Premio / Cantidad;
        System.out.println("A cada ganador le corresponden " + Resultado + " pesos");

    }

}
