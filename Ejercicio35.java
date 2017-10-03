/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio35;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class Ejercicio35 {

    /**
     * @param args the command line arguments 35- Las lámparas están al mismo
     * precio de $35 pesos final. A. Si compra 6 o más lamparitas bajo consumo
     * tiene un descuento del 50%. B. Si compra 5 lamparitas bajo consumo marca
     * "ArgentinaLuz" se hace un descuento del 40 % y si es de otra marca el
     * descuento es del 30%. C. Si compra 4 lamparitas bajo consumo marca
     * "ArgentinaLuz" o “FelipeLamparas” se hace un descuento del 25 % y si es
     * de otra marca el descuento es del 20%. D. Si compra 3 lamparitas bajo
     * consumo marca "ArgentinaLuz" el descuento es del 15%, si es
     * “FelipeLamparas” se hace un descuento del 10 % y si es de otra marca un
     * 5%. E. Si el importe final con descuento suma más de $120 se debe sumar
     * un 10% de ingresos brutos en informar del impuesto con el siguiente
     * mensaje: ”IIBB Usted pago X”, siendo X el impuesto que se pagó
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

        if (Cantidad > 5) {
            Total = ((Precio * Cantidad) * 0.50);
            System.out.println("El total es: " + Total);
        } else {
            if ((Cantidad == 5) && (Marca.equals("ArgentinaLuz"))) {
                Total = ((Precio * Cantidad) * 0.40);
                System.out.println("El total es: " + Total);
            } else {
                if (Cantidad == 5) {
                    Total = ((Precio * Cantidad) * 0.30);
                    System.out.println("El total es: " + Total);
                } else {
                    if ((Cantidad == 4) && (Marca.equals("ArgentinaLuz")) || (Marca.equals("FelipeLamparas"))) {
                        Total = ((Precio * Cantidad) * 0.25);
                        System.out.println("El total es: " + Total);
                    } else {
                        if (Cantidad == 4) {
                            Total = ((Precio * Cantidad) * 0.20);
                            System.out.println("El total es: " + Total);
                        } else {
                            if ((Cantidad == 3) && (Marca.equals("ArgentinaLuz"))) {
                                Total = ((Precio * Cantidad) * 0.15);
                                System.out.println("El total es: " + Total);
                            } else {
                                if ((Cantidad == 3) && (Marca.equals("FelipeLamparas"))) {
                                    Total = ((Precio * Cantidad) * 0.10);
                                    System.out.println("El total es: " + Total);
                                } else {
                                    if (Cantidad == 3) {
                                        Total = ((Precio * Cantidad) * 0.5);
                                        System.out.println("El total es: " + Total);
                                    } else {
                                        Total = (Precio * Cantidad);
                                        System.out.println("El total es: " + Total);

                                    }
                                }
                            }
                        }
                    }

                }
            }

        }
        if (Total > 120) {
            Impuesto = ((Precio * Cantidad) * 0.1);
            System.out.println("IIBB: usted pagó " + Impuesto + " de impuestos");
        }
    }
}
