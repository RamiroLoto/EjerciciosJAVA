/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteraciones;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class GuiaWhile {

    public static void SacarCantidadDeMayores() {
        /*
         pedir 5 edades e informar cuantos mayores a 18 hay.
         */
        Scanner misc = new Scanner(System.in);
        String Aux;
        Integer Edad;
        Integer Cantidad = 0;
        Integer Cuenta = 0;
        while (Cantidad < 5) {
            System.out.println("Ingrese una edad");
            Aux = misc.next();
            Edad = Integer.parseInt(Aux);
            if (Edad >= 18) {
                Cuenta++;
            }
            Cantidad++;
        }
        System.out.println("Hay " + Cuenta + " mayores de edad");

    }

    public static void SacarPositivo() {
        //1-Sacar cantidad de positivos.
        Scanner misc = new Scanner(System.in);
        String Aux;
        Integer Numero;
        Integer Cantidad = 0;
        Integer Cuenta = 0;
        while (Cantidad < 5) {
            System.out.println("Ingrese un numero");
            Aux = misc.next();
            Numero = Integer.parseInt(Aux);
            if (Numero > 0) {
                Cuenta++;
            }
            Cantidad++;
        }
        System.out.println("Hay " + Cuenta + " numeros positivos");

    }

    public static void SacarCantidadDePares() {
        //2-Sacar cantidad de pares
        Scanner misc = new Scanner(System.in);
        String Aux;
        Integer Numero;
        Integer Cantidad = 0;
        Integer Cuenta = 0;
        while (Cantidad < 5) {
            System.out.println("Ingrese un numero");
            Aux = misc.next();
            Numero = Integer.parseInt(Aux);
            if (Numero % 2 == 0) {
                Cuenta++;
            }
            Cantidad++;
        }
        System.out.println("Hay " + Cuenta + " numeros pares");

    }

    public static void SacarCantidadDeMarias() {
        //3-Sacar cantidad de Marias.
        Scanner misc = new Scanner(System.in);
        String Nombre;
        Integer Cantidad = 0;
        Integer Cuenta = 0;
        while (Cantidad < 5) {
            System.out.println("Ingrese un nombre");
            Nombre = misc.next();
            if (Nombre.equals("Maria")) {
                Cuenta++;
            }
            Cantidad++;
        }
        System.out.println("Hay " + Cuenta + " Marias");

    }

    public static void CuentaRegresiva() {
        //Que se muestren los numeros del 10 al 1.
        Integer contador = 10;

        while (contador>0) {
            System.out.println("Numero: "+ contador);
            contador--;
        }
    }
     public static void SumaDeNumeros() {
        //Mostrar los numeros del 10 al 1 y el promedio.
        Integer contador = 0;
        Integer sumador=0;
        Integer Cantidad=10;
        Integer Promedio=0;
        while (contador<Cantidad) {
            contador++;
            System.out.println("Numero: "+ contador);
            sumador = sumador+contador;
        }
        Promedio=sumador/Cantidad;
         System.out.println("El promedio es: "+Promedio);
    }
    
    public static void SacarPromedioDeEdades (){
        String Respuesta;
        Integer Edad=0;
        String Aux;
        Integer contador=0;
        Integer Sumador=0;
        Integer promedio=0;
        Scanner misc = new Scanner(System.in);
        
        System.out.println("Hay alguien para la edad?");
        Respuesta = misc.next();
        while (Respuesta.equals("Si")){
            System.out.println("Ingrese su edad");
            Aux = misc.next();
            Edad = Integer.parseInt(Aux);
            Sumador = Sumador+Edad; 
            contador++;
            System.out.println("Hay alguien más para la edad?");
            Respuesta = misc.next();
        }
        promedio = Sumador/contador;
        System.out.println("El promedio es: "+promedio);
    } 
    
    public static void MostrarPares (){
        Integer contador = 0;
        while(contador<100){
            
            
            contador++;
            if (contador%2==1){
            
                System.out.println("Es impar: "+contador);
            }
        }
    } 
}
