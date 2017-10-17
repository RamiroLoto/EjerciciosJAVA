/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofor;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class FuncionesParaFor {

    public static void Saludar() {
        System.out.println("Hola");
    }

    public static void MostrarNumeroCreciente() {
        int contador;
        for (contador = 0; contador < 10; contador++) {
            System.out.println("El numero es: " + contador);
        }
    }

    public static void MostrarNumeroDecreciente() {
        for (int contador = 100; contador > 0; contador--) {
            System.out.println("El numero es: " + contador);
        }
    }

    public static void MostrarNumerosPares() {
        for (int contador = 0; contador < 100; contador++) {
            if (contador % 2 == 0) {
                System.out.println("El numero es: " + contador);
            }
        }
    }

    public static void MostrarNumerosDivisiblesPorSeis() {
        for (int contador = 0; contador < 100; contador++) {
            if (contador % 6 == 0) {
                System.out.println("El numero es: " + contador);
            }
        }
    }

    public static void MostrarTablaDeMultiplicar() {
        Scanner misc = new Scanner(System.in);
        int numero;
        int resultado;
        String Aux;

        System.out.println("Ingrese un numero entre 0 y 20");
        Aux = misc.next();
        numero = Integer.parseInt(Aux);

        while (numero < 0 || numero > 20) {
            System.out.println("Error, numero no esta entre 0 y 20 ");
            System.out.println("ingrese numero entre 0 y 20");
            Aux = misc.next();
            numero = Integer.parseInt(Aux);
        }

        for (int contador = 1; contador < 11; contador++) {
            resultado = numero * contador;
            System.out.println(numero + " * " + contador + " = " + resultado);
        }
    }

    public static void MostrarTablaDeDividir() {
        Scanner misc = new Scanner(System.in);
        float numero;
        float resultado;
        String Aux;

        System.out.println("Ingrese un numero entre 0 y 20");
        Aux = misc.next();
        numero = Float.parseFloat(Aux);

        while (numero < 0 || numero > 20) {
            System.out.println("Error, numero no esta entre 0 y 20 ");
            System.out.println("ingrese numero entre 0 y 20");
            Aux = misc.next();
            numero = Float.parseFloat(Aux);
        }

        for (int contador = 1; contador < 11; contador++) {
            resultado = numero / contador;
            System.out.println(numero + " / " + contador + " = " + resultado);
        }
    }

    public static void MostrarNumeroPrimo() {
        Integer numero = 7;
        int contador;
        boolean bandera = true;
        for (contador = 2; contador < numero; contador++) {
            if (numero % contador == 0) {
                bandera = false;
                break;
            }
        }

        if (bandera == false) {
            System.out.println("No es primo");
        } else {
            System.out.println("Es primo");
        }

        /*if (contador == numero) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }*/
    }

    public static void MostrarNumerosPrimosDelUnoAlCien() {
        Integer numero = 100;
        int contador;
        boolean bandera = true;
        for (contador = 2; contador < numero; contador++) {

            if (numero % contador == 0) {
                bandera = false;

            } else {
                System.out.println(contador);
            }
        }

    }

    public static void CentroNumerico() {

        int numero = 7;
        int sumaAnteriores = 0;
        int sumaPosteriores = 0;
        boolean EsCentroNumerico = false;
        for (int contador = 1; contador < numero; contador++) {
            sumaAnteriores += contador;
        }
        //System.out.println(sumaAnteriores);

        for (int posterior = numero + 1;; posterior++) {
            sumaPosteriores += posterior;

            //System.out.println(sumaPosteriores);
            if (sumaAnteriores == sumaPosteriores) {
                EsCentroNumerico = true;
                break;
            }
            if (sumaPosteriores > sumaAnteriores) {
                break;
            }
        }
        if (EsCentroNumerico == true) {
            System.out.println("Es centro numerico");
        } else {
            System.out.println("No es centro numerico");
        }
    }

    public static void MostrarCentrosNumericos() {
        int numero;
        int sumaAnteriores = 0;
        int sumaPosteriores = 0;
        boolean EsCentroNumerico = false;

        for (numero = 0; numero < 1000; numero++) {
            sumaAnteriores = 0;
            sumaPosteriores = 0;
            for (int contador = 1; contador < numero; contador++) {
                sumaAnteriores += contador;
            }
            //System.out.println(sumaAnteriores);

            for (int posterior = numero + 1; ; posterior++) {
                sumaPosteriores += posterior;

                //System.out.println(sumaPosteriores);
                if (sumaAnteriores == sumaPosteriores) {
                    EsCentroNumerico = true;
                    break;
                }
                if (sumaPosteriores > sumaAnteriores) {
                    EsCentroNumerico = false;
                    break;
                }
            }
            if (EsCentroNumerico == true) {
                System.out.println(numero);
            } 

        }
        
    }
    
    public static void FibonacciSucesion(){
        int numero=1;
        int suma=1;
        int anterior=1;
        int Fibonacci=0;
        int auxanterior;
        for (int contador = 1; contador < 10; contador++) {
            auxanterior = Fibonacci;
            Fibonacci = suma+auxanterior;
            
            anterior=Fibonacci;
            
            suma+=contador;
            System.out.println("serie "+Fibonacci);
        }
    }
}
