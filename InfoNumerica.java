/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infonumerica;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class InfoNumerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se brinda informacion sobre un numero ingresado.
        Scanner misc = new Scanner(System.in);
        /*modulo %
        Integer NumeroUno;
        Integer NumeroDos;
        Integer Resultado;
        NumeroUno=2;
        NumeroDos=10;
        Resultado=2%10;
        System.out.println("El resultado de 2%10 es: "+Resultado);
        Resultado=10%2;
        System.out.println("El resultado de 10%2 es: "+Resultado);
        % da el resto entre 2 numeros, 2%10 = 2 por que no se puede dividir
        ya que no hay resultados con decimales, entonces queda el 2
        y 10%2 = 0 por que 10/2 = 5, con resto = 0.
         */
        Integer NumeroIngresado;
        String Aux;
        System.out.println("Ingrese un número");
        Aux = misc.next();
        NumeroIngresado = Integer.parseInt(Aux);

        /*
            1- informar si el numero es mayor o menor a 100.
            2- informar si es positivo o negativo.
            3- informar si es par.
         */
        if (NumeroIngresado > 100) {
            System.out.println("Es mayor a 100");
        } else {
            System.out.println("Es menor a 100");
        }
        if (NumeroIngresado != 0) {
            if (NumeroIngresado > 0) {
                System.out.println("es positivo");
            } else {
                System.out.println("es negativo");
            }
        }
        if (NumeroIngresado % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }

}
