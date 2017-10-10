/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorapoo;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Calculadora {
    
    public static void ArrancarCalculadora(){
        String opcion="";
        System.out.println("Bienvenido a la calculadora");
        while(!opcion.equals("6")){
        Calculadora.MostrarMenu();
        Scanner misc = new Scanner(System.in);
        opcion=misc.next();
        
        switch(opcion){
                case "1":
                    Calculadora.Sumar();
                    break;
                case "2":
                    Calculadora.Restar();
                    break;
                case "3":
                    Calculadora.Multiplicar();
                    break;
                case "4":
                    Calculadora.Dividir();
                    break;
                case "5":
                    
                    break;
                case "6":
                    System.out.println("Adios!");
                    break;
                
                default:
                    System.out.println("Ingresó una opción equivocada");
            }
    
        }
    }
    private static void MostrarMenu(){
        System.out.println("1-sumar");
        System.out.println("2-restar");
        System.out.println("3-multiplicar");
        System.out.println("4-dividir");
        System.out.println("6-salir");
        System.out.println("ingrese opcion deseada");
        
    }
    
    private static void Sumar (){
        Integer numeroUno;
        Integer numeroDos;
        Scanner misc = new Scanner(System.in);
        String Aux;
        Integer Resultado;
        //primero numero
        System.out.println("Ingrese primer numero");
        Aux=misc.next();
        numeroUno=Integer.parseInt(Aux);
        //segundo numero
        System.out.println("Ingrese segundo numero");
        Aux=misc.next();
        numeroDos=Integer.parseInt(Aux);
        
        Resultado = numeroUno + numeroDos;
        System.out.println("El resultado de la suma es: "+Resultado);
    }
    private static void Restar(){
        Integer numeroUno;
        Integer numeroDos;
        Scanner misc = new Scanner(System.in);
        String Aux;
        Integer Resultado;
        
        System.out.println("Ingrese primer numero");
        Aux = misc.next();
        numeroUno = Integer.parseInt(Aux);
                    
        System.out.println("Ingrese segundo numero");
        Aux = misc.next();
        numeroDos = Integer.parseInt(Aux);
                    
        Resultado = numeroUno - numeroDos;
        System.out.println("El resultado de la suma es: "+Resultado);
    }
    private static void Multiplicar(){
        Integer numeroUno;
        Integer numeroDos;
        Scanner misc = new Scanner(System.in);
        String Aux;
        Integer Resultado;
        
        System.out.println("Ingrese primer numero");
        Aux = misc.next();
        numeroUno = Integer.parseInt(Aux);
                    
        System.out.println("Ingrese segundo numero");
        Aux = misc.next();
        numeroDos = Integer.parseInt(Aux);
                    
        Resultado = numeroUno * numeroDos;
        System.out.println("El resultado de la multiplicacion es: "+Resultado);
    }
    private static void Dividir(){
        Integer numeroUno;
        Integer numeroDos;
        Scanner misc = new Scanner(System.in);
        String Aux;
        Integer Resultado;
        
        System.out.println("Ingrese primer numero");
        Aux = misc.next();
        numeroUno = Integer.parseInt(Aux);
                    
        System.out.println("Ingrese segundo numero");
        Aux = misc.next();
        numeroDos = Integer.parseInt(Aux);
                    
        Resultado = numeroUno / numeroDos;
        System.out.println("El resultado de la división es: "+Resultado);
    }
}
