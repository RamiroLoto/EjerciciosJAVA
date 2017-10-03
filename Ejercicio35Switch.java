/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio35.pkgswitch;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class Ejercicio35Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner(System.in);
        Integer Cantidad;
        Double Precio = 35.0;
        String Marca;
        Double Total;
        Double Impuesto;

        System.out.println("Ingrese cantidad de lamparas");
        Cantidad = misc.nextInt();

        System.out.println("Ingrese marca de lamparas");
        Marca = misc.next();

        switch (Cantidad) {
            case 5:
                switch (Marca) {
                    case "ArgentinaLuz":
                        Total = ((Precio * Cantidad) * 0.50);
                        System.out.println("El total es: " + Total);
                        break;
                    default:
                        Total = ((Precio * Cantidad) * 0.40);
                        System.out.println("El total es: " + Total);
                }
                break;
            case 4:
                switch (Marca) {
                    case "ArgentingaLuz":
                        Total = ((Precio * Cantidad) * 0.25);
                        System.out.println("El total es: " + Total);
                        break;
                    case "FelipeLamparas":
                        Total = ((Precio * Cantidad) * 0.25);
                        System.out.println("El total es: " + Total);
                        break;
                    default:
                        Total = ((Precio * Cantidad) * 0.20);
                        System.out.println("El total es: " + Total);
                }
                break;
            case 3:
                switch (Marca) {
                    case "ArgentinaLuz":
                        Total = ((Precio * Cantidad) * 0.15);
                        System.out.println("El total es: " + Total);
                        break;
                    case "FelipeLamparas":
                        Total = ((Precio * Cantidad) * 0.10);
                        System.out.println("El total es: " + Total);
                        break;
                    default:
                        Total = ((Precio * Cantidad) * 0.5);
                        System.out.println("El total es: " + Total);
                }
                break;
            case 2:
                Total = (Precio * Cantidad);
                System.out.println("El total es: " + Total);
                break;
            case 1:
                Total = (Precio * Cantidad);
                System.out.println("El total es: " + Total);
                break;
            default:
                Total = ((Precio * Cantidad) * 0.50);
                System.out.println("El total es: " + Total);
        }

        if (Total > 120) {
            Impuesto = (Total * 0.1);
            System.out.println("IIBB: usted pagó " + Impuesto + " de impuestos");
        }
    }
}
