/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class GuiaInicial {

    public static void Saludar() {
        System.out.println("Hola");
    }
    //1- Se debe mostrar el siguiente mensaje “esto funciona de maravilla”.
    public static void HacerEjercicio1() {
        System.out.println("Esto funciona de maravilla");
    }
    //2- Se debe pedir el nombre y luego mostrarlo.
    public static void HacerEjercicio2(){
        Scanner misc = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre");
        nombre = misc.next();
        System.out.println("Su nombre es "+nombre);
    }
    //3- Se debe pedir el nombre y el apellido, luego mostrarlo en el siguiente mensaje “su nombre
    //es XXXXX y XXXXXX es su apellido”.
    public static void HacerEjercicio3(){
        Scanner misc = new Scanner(System.in);
        String nombre;
        String apellido;
        System.out.println("Ingrese su nombre");
        nombre = misc.next();
        System.out.println("Ingrese su apellido");
        apellido = misc.next();
        System.out.println("Su nombre es "+nombre+" y "+apellido+" es su apellido");
    }
    //4- Al ingresar la edad y el nombre mostrar el siguiente mensaje: “ Usted se llama “ XXXXXX y
    //tiene XX años de edad”.
    public static void HacerEjercicio4(){
        Scanner misc = new Scanner(System.in);
        String nombre;
        Integer edad;
        System.out.println("Ingrese su nombre");
        nombre = misc.next();
        System.out.println("Ingrese su edad");
        edad = misc.nextInt();
        System.out.println("Su nombre es "+nombre+" y tiene "+edad+" años de edad");
    }
    //5- Se necesita pedir dos números y sumarlos, mostrar el resultado.
    public static void HacerEjercicio5(){
        Scanner misc = new Scanner(System.in);
        Integer NumeroUno;
        Integer NumeroDos;
        Integer Suma;
        System.out.println("Ingrese primer numero");
        NumeroUno = misc.nextInt();
        System.out.println("Ingrese segundo numero");
        NumeroDos = misc.nextInt();
        Suma = NumeroUno + NumeroDos;
        System.out.println("La suma de los numeros es "+Suma);
    }
    //7- Se pide la base de un cuadrado y se informa el perímetro
    public static void HacerEjercicio7(){
    Scanner misc = new Scanner(System.in);
    Integer base;
    Integer perímetro;    
    System.out.println("Ingrese la base del cuadrado");
    base = misc.nextInt();
    perímetro = base * 4;
        System.out.println("El perímetro es "+perímetro);
}
    //9- Se ingresa la cantidad y precio de un producto y se informa el total a pagar.
    public static void HacerEjercicio9(){
        Scanner misc = new Scanner(System.in);
        Integer Cantidad;
        Integer Precio;
        Integer Total;
        System.out.println("Ingrese la cantidad");
        Cantidad = misc.nextInt();
        System.out.println("Ingrese el precio");
        Precio = misc.nextInt();
        Total = Cantidad * Precio;
        System.out.println("El total es "+Total);
    }
    //11- Se pide el valor de la hora de trabajo de un empleado y la cantidad de horas trabajadas,
    //informar cuanto le corresponde de sueldo, restándole el 15% de aportes.
    public static void HacerEjercicio11(){
        Scanner misc = new Scanner(System.in);
        Integer Horas;
        Integer Valor;
        Double Sueldo;
        System.out.println("Ingresar valor de horas de trabajo");
        Horas = misc.nextInt();
        System.out.println("Ingresar cantidad de horas trabajadas");
        Valor = misc.nextInt();
        Sueldo = (Horas * Valor) * 1.15;
        System.out.println("El total del sueldo menos 15% de aportes es "+Sueldo);
        
    }
}    
