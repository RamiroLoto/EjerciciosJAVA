/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoejemplo;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class NuevoEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner(System.in);
        String Mes;
        String Vacaciones;
        int Edad;
        //si paso los 80 y se va de vacaciones en invierno: "vacunate contra la gripe"
        
        System.out.println("Vas de vacaciones?");
        Vacaciones = misc.next();
        if (Vacaciones.equals("Si")) {
            System.out.println("Ingrese un mes del año: ");
            Mes = misc.next();
            
            switch (Mes)
            {
                case "enero":
                case "febrero":
                    System.out.println("Lindo veranito");
                    break;
                case "julio":
                    System.out.println("Ingrese edad");
                    Edad = misc.nextInt();
                    if (Edad>=80){
                        System.out.println("Vacunate contra la gripe");
                    }
                    System.out.println("Lindo invierno");
                    break;
                default:
                    System.out.println("No estamos en verano");
                    break;

            }
        }
    }

}
