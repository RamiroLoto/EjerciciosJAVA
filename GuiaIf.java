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
public class GuiaIf {
    public static void HacerEjercicio13(){
        Scanner misc = new Scanner(System.in);
        String color;
        String localidad;
        System.out.println("Ingrese color");
        color = misc.next();
        System.out.println("Ingrese localidad");
        localidad = misc.next();
        if (color.equals("Rojo")&&(localidad.equals("Avellaneda")||localidad.equals("Lanus"))){
            System.out.println("Sos de independiente");
        }
    }
    //14- Se pide el sexo y el nombre, si es “f” de femenino, se muestra 
    //el mensaje” feliz dia XXXXX”, donde XXXX es el nombre.
    public static void HacerEjercicio14(){
        Scanner misc = new Scanner(System.in);
        String Sexo;
        String Nombre;
        System.out.println("Ingrese nombre");
        Nombre = misc.next();
        System.out.println("Ingrese sexo");
        Sexo = misc.next();
        if (Sexo.equals("f")){
            System.out.println("Feliz dia "+Nombre);
        }
    }
    //16-Se debe ingresar un edad  e  informar si es mayor de edad o no. 
    public static void HacerEjercicio16(){
    Scanner misc = new Scanner(System.in);
    Integer Edad;
    System.out.println("Ingrese una edad");
    Edad = misc.nextInt();
    if (Edad>=18){
        System.out.println("Es mayor de edad");
    } else {
        System.out.println("Es menor");
    }
    }
    //18- Se pide una clave  y si coincide de muestra el mensaje “Bienvenido”  
    //de lo contrario mostrar el mensaje “clave incorrecta.
    public static void HacerEjercicio18(){
        Scanner misc = new Scanner(System.in);
        String Clave;
        System.out.println("Ingrese clave");
        Clave = misc.next();
        if (Clave.equals("1234")){
            System.out.println("Bienvenido");
        }else{
            System.out.println("Clave incorrecta");
        }
    }
    //20- Se ingresa un importe del pasaje de avión y el mes de viaje, 
    //si el mes es enero, se les descuenta un 10% por temporada baja.
    public static void HacerEjercicio20(){
        Scanner misc = new Scanner(System.in);
        Double Importe;
        String Mes;
        
        System.out.println("Ingrese el importe");
        Importe = misc.nextDouble();
        System.out.println("Ingrese el mes");
        Mes = misc.next();
        
        if (Mes.equals("Enero")){
            System.out.println("El total es "+(Importe-Importe*0.10));
        }else{
            System.out.println("El total es "+Importe);
        }
    }        
}
