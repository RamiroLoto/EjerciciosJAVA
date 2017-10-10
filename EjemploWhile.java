/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EjemploWhile.SalidaPorLogica();
        //EjemploWhile.IteracionSinCantidad();
        //EjemploWhile.PromedioConIf();
        //EjemploWhile.PromedioConWhile();
        //EjemploWhile.PedirNumeros();
        EjemploWhile.MostrarMenu();
    }//finaliza main
   
    /**
    * pide dos numeros e informa el promedio 
    */
    
    public static void PromedioConIf () {
        Scanner misc = new Scanner (System.in);
        Integer numerouno;
        Integer numerodos;
        Integer Promedio;
        String Aux;
        
        System.out.println("Ingrese numero #1: ");
        Aux = misc.next();
        numerouno = Integer.parseInt(Aux);
        
        System.out.println("Ingrese numero #2: ");
        Aux = misc.next();
        numerodos = Integer.parseInt(Aux);
        
        Promedio = (numerouno + numerodos)/2;
        System.out.println("El promedio es: "+Promedio);
    }//finaliza promedio con if
    
    /**
    *Pide dos numeros e informa el promedio
    */
    public static void PromedioConWhile () {
        Scanner misc = new Scanner (System.in);
        Integer Numero;
        Integer Promedio;
        Integer Contador=0;
        Integer Suma=0;
        String Aux;
        
        
        while(Contador<3){
            Contador++;
            System.out.println("Ingrese numero #"+Contador+": ");
            Aux = misc.next();
            Numero = Integer.parseInt(Aux);
            Suma += Numero;
        }
        Promedio = Suma/Contador;
        System.out.println("El promedio es: "+Promedio);
    }
    
    
    /**
     * Cuando no sabemos la cantidad de iteraciones
     */
    public static void IteracionSinCantidad (){
        String Continuar="si";
        
        while(!Continuar.equals("no")){
            System.out.println("Hola, desea continuar?");
            Scanner misc = new Scanner(System.in);
            Continuar = misc.next();  
    }
        
    }
    /**
     * Ejercicio igual anterior pero cambia la lógica utilizada.
     */
    public static void SalidaPorLogica(){
        String continuar="si";
        while(true){
            System.out.println("Hola, desea continuar?");
            Scanner misc = new Scanner(System.in);
            continuar = misc.next();
            if(continuar.equals("no")){
                break;
            }
        }
    }
    
    public static void PedirNumeros (){
        Scanner misc = new Scanner(System.in);
        Integer numero;
        Integer contador=0;
        Integer Suma=0;
        String Aux;
        while(contador<10 && Suma<50){
            contador++;
            System.out.println("ingrese numero"+contador+": ");
            Aux = misc.next();
            numero = Integer.parseInt(Aux);
            Suma += numero;
        }
        System.out.println("La suma es "+Suma);
   System.out.println("La cantidad es "+contador);
    }
    
    public static void MostrarMenu (){
        String opcion="";
        Integer NumeroUno;
        Integer NumeroDos;
        String Aux;
        Integer Resultado;
        Scanner misc = new Scanner(System.in);
        
        while(!opcion.equals("6")){
            
            System.out.println("1-sumar");
            System.out.println("2-restar");
            System.out.println("3-multiplicar");
            System.out.println("4-dividir");
            System.out.println("6-salir");
            System.out.println("ingrese opcion deseada");
            opcion = misc.next();
            switch(opcion){
                case "1":
                    EjemploWhile.Sumar();
                    break;
                case "2":
                    EjemploWhile.Restar();
                    break;
                case "3":
                    EjemploWhile.Multiplicar();
                    break;
                case "4":
                    EjemploWhile.Dividir();
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
        System.out.println("Cerró el menú");
    }
    
    public static void Sumar (){
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
    public static void Restar(){
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
    public static void Multiplicar(){
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
    public static void Dividir(){
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
