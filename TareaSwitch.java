/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaswitch;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class TareaSwitch {

    /**
     * @param args the command line arguments
     * SWITCH 
    28 – Se ingresa un mes del año, si es febrero o enero, mostrar el mensaje “Feliz verano” de lo contrario Informar “No es Verano”
    29- Se ingresa un mes del año, si es febrero o enero, mostrar el mensaje “Iniciando el año” ,si es junio o julio el mensaje” Mitad del año” y si es diciembre el mensaje fin de año.
    30- Se ingresa un mes del año y si es Enero: "que comiences bien el año!” , si es Marzo: "a clases!” , si es Julio: "se vienen las vacaciones!” , si es Diciembre: "Felices fiesta!”.
    31- Se ingresa un mes del año al seleccionar un mes informar: si tiene 28 días ,si tiene 30 días, si tiene 31 días.
    32- Al ingresar una hora del día, informar: si está entre las 7 y las 11: "Es de mañana.".
    33-al ingresar un signo del zodíaco devolver el nombre de la imagen asociada a ese signo
    34- Se pide un día de la semana, si es lunes mostrar el mensaje  “Buen comienzo”, para el resto de los días hábiles mostrar” a aguantar “ si es sábado o domingo  mostrar “ Buen fin de”.
    Ferretería Ferrete
    Debemos hacer una serie de aplicaciones para este negocio
    35- Las lámparas están al mismo precio de $35 pesos final. 
    A. Si compra 6 o más lamparitas bajo consumo tiene un descuento del 50%. 
    B. Si compra 5 lamparitas bajo consumo marca "ArgentinaLuz" se hace un descuento del 40 % y si es de otra marca el descuento es del 30%. 
    C. Si compra 4 lamparitas bajo consumo marca "ArgentinaLuz" o “FelipeLamparas” se hace un descuento del 25 % y si es de otra marca el descuento es del 20%. 
    D. Si compra 3 lamparitas bajo consumo marca "ArgentinaLuz" el descuento es del 15%, si es “FelipeLamparas” se hace un descuento del 10 % y si es de otra marca un 5%. 
    E. Si el importe final con descuento suma más de $120 se debe sumar un 10% de ingresos brutos en informar del impuesto con el siguiente mensaje:”IIBB Usted pago X”, siendo X el impuesto que se pagó
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner(System.in);
        Integer Cantidad;
        Integer Precio = 35;
        String Marca;
        Double Total;
        Double Impuesto;

        System.out.println("Ingrese cantidad de lamparas");
        Cantidad = misc.nextInt();

        System.out.println("Ingrese marca de lamparas");
        Marca = misc.next();

        if (Cantidad > 5) {
            Total = ((Precio * Cantidad) * 0.50);
            System.out.println("El total es: " + Total);
        } else if ((Cantidad == 5) && (Marca.equals("ArgentinaLuz"))) {
            Total = ((Precio * Cantidad) * 0.40);
            System.out.println("El total es: " + Total);
        } else {
            Total = ((Precio * Cantidad) * 0.30);
            System.out.println("El total es: " + Total);
        }
        if ((Cantidad == 4) && (Marca.equals("ArgentinaLuz")) || (Marca.equals("FelipeLamparas"))) {
            Total = ((Precio * Cantidad) * 0.25);
            System.out.println("El total es: " + Total);
        } else {
            Total = ((Precio * Cantidad) * 0.20);
            System.out.println("El total es: " + Total);
        }
        if ((Cantidad == 3) && (Marca.equals("ArgentinaLuz"))) {
            Total = ((Precio * Cantidad) * 0.15);
            System.out.println("El total es: " + Total);
        } else if ((Cantidad == 3) && (Marca.equals("FelipeLamparas"))) {
            Total = ((Precio * Cantidad) * 0.10);
            System.out.println("El total es: " + Total);
        } else {
            Total = ((Precio * Cantidad) * 0.5);
            System.out.println("El total es: " + Total);

        }
        if ((Precio*Cantidad)>120){
            Total = ((Precio * Cantidad) * 1.1);
            Impuesto = ((Precio * Cantidad) * 0.1);
            System.out.println("El total es: "+ Total +" IIBB: usted pagó "+Impuesto+" de impuestos");
        }
        
      }

    }
