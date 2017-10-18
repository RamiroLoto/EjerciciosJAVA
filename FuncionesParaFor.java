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
        int sumaAnteriores;
        int sumaPosteriores;
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
        int fibonacci;
        int anterior=0;
        int actual=1;
        for (int contador = 0; contador < 30; contador++) {
            fibonacci= anterior+actual;
            anterior=actual;
            actual=fibonacci;
            System.out.println("es el: "+fibonacci);
            
        }
    }
    
    public static void RetornarMayor(){
        Integer NumUno=9, NumDos=6, NumTres=3;
        
        if (NumUno>NumDos&&NumUno>NumTres){
            System.out.println("El primero numero: "+NumUno+" es el mayor");
        } else if (NumDos>NumUno&&NumDos>NumTres){
            System.out.println("El segundo numero: "+NumDos+" es el mayor");
        } else {
            System.out.println("El tercer numero: "+NumTres+" es el mayor");
        }
    }
    
    /**
    * Recorrer los numeros del 1 al 100
    * Mostrar en lugar del numero la palabra "UTN" para todos 
    * los multiplos de 3 (tres)
    * mostrar en lugar del numero la palbra "FRA" para todos 
    * los multiplos de 5 (tres)
    * y mostrar la palabra "UTN FRA" para todos los multiplos de 3 y 5. (ej: 15)
    */
    
    public static void SerieUtnFra(){
        for (int contador = 1; contador < 100; contador++) {
            if(contador%3==0&&contador%5==0){
                System.out.println("UTN FRA");}
            else if(contador%3==0){
                System.out.println("UTN");
            } else if(contador%5==0){
                System.out.println("FRA");
            } else {
                System.out.println(contador);
            }
        }
    }
    
    /**
     * 153 = 1^3 + 5^3 + 3^3 = 153 
     */
    public static void NumeroArmstrong(){
        int numeroIngresado=371;
        
        int numeroAux=153;
        int cantidadDigitos=0;
        
        //hacemos esto en caso de que el numero sea negativo.
        if(numeroAux<0){
            numeroAux*=-1;
        }
        
        while(numeroAux>0){
            numeroAux/=10;
            cantidadDigitos++;
        }
        
        int digito;
        int suma=0;
        int AuxNumero=numeroIngresado;
        while(AuxNumero>0){
        digito=AuxNumero%10;
        suma+=(int)Math.pow(digito,cantidadDigitos);
        AuxNumero/=10;}
        
        System.out.println(suma);
        if(suma==numeroIngresado){
            System.out.println("Es armstrong");
        }else{
            System.out.println("No es armstrong");
        }
        
    }
    
    public static void HacerPiramide(){
        int CantidadDeFilas=7;
        for (int contador = 1; contador < CantidadDeFilas; contador++) {
            for (int contadorLugares = CantidadDeFilas-1; contadorLugares > contador; contadorLugares--) {
                System.out.print(" ");
            }
            
            for (int contadorDos = 1; contadorDos <=(2*contador-1); contadorDos++) {
                System.out.print("X");
            }
            System.out.println("");
        }
    }
    /**
     * 1
     * 12
     * 123
     * 1234
     * 12345
     */
    public static void MostrarNumeros(){
        for (int contador = 1; contador < 6; contador++) {
            for (int contadorDos = 5; contadorDos > contador ; contadorDos--) {
                System.out.println(contador);
            }
        }
    }
}
