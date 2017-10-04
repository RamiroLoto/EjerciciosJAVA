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
public class Iteraciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        diferencia entre if and while
        
        Integer edad = 18;
        while(edad < 17){
            System.out.println("es menor");
        }
        while(edad > 17){
            System.out.println("es mayor");
        }
         */

        /*Integer Contador = 0;
        Scanner misc = new Scanner(System.in);
        String Aux;
        Integer Edad;
        Integer Sumador = 0;
        Integer Promedio;
        while (Contador < 3) {
            System.out.println("Ingree su edad persona numero: " + Contador);
            Aux = misc.next();
            Edad = Integer.parseInt(Aux);
            Sumador = Sumador + Edad;
            Contador++;
        }
        Promedio = Sumador/3;
        System.out.println("El promedio es: "+Promedio);
        */
        GuiaWhile.MostrarPares();
    }
    
}
