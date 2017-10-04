/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;
/**
 *
 * @author Rama
 */
public class GuiaIf {
    //13- Se ingresa un color y una localidad, si es avellaneda o Lanús y 
    //el color es rojo, mostrar el mensaje “sos de independiente”.
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
    //15-Se pide el nombre, el sexo y la localidad. Si se llama José o maría 
    //y es de sexo masculino, viviendo en morón, se muestra el mensaje “sos de morón”.
    public static void HacerEjercicio15(){
    }
    
    //16-Se debe ingresar un edad e informar si es mayor de edad o no. 
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
    //17-Se pide una edad y se informa si es niño adolescente o mayor de edad
    public static void HacerEjercicio17(){
        
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
    //19- se ingresa un importe, si supera los 100 pesos se  le suma un 
    //impuesto del 23%, si no se les descuenta el 50%
    public static void HacerEjercicio19(){
        
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
    //21- se ingresa una nota, si es 10 mostrar excelente, si esta entre 9 y 4 mostrar aprobó , de lo contrario mostrar “ la próxima será” .
    public static void HacerEjercicio21(){
        
    }
    //Ferretería Ferrete
    //Debemos hacer una serie de aplicaciones para este negocio
    //22- Debemos pedir el ancho y el largo de un terreno e informar cuantos 
    //metros de alambre necesitamos para dar tres (3) vueltas de alambre.
    public static void HacerEjercicio22(){
        
    }
    //23- Debemos pedir el ancho, el largo de un terreno y la cantidad de hilos 
    //de alambre e informar cuantos metros de alambre necesitamos para completar las vueltas de alambre.
    public static void HacerEjercicio23(){
        
    }
    //24-Sabiendo que necesito 2 bolsas de cal y 3 de cemento para una pared de 
    //1 metro cuadrado, se pide el alto y ancho y se informa la cantidad de cada material que necesito.
    public static void HacerEjercicio24(){
        
    }
    //25- de pide una temperatura y se pide si se quiere pasar Celsius o Fahrenheit, 
    //hacer la cuenta y mostrar el resultado.
    public static void HacerEjercicio25(){
        
    }
    //26- para una pileta se necesita saber la superficie, se debe pedir que 
    //tipo de pileta tiene (cuadrada o redonda) de ser redonda, pedir el radio
    //y si es cuadrada pedir el largo y el ancho, mostrar la superficie de la pileta.
    public static void HacerEjercicio26(){
        
    }
}
