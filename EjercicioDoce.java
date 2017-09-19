/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodoce;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class EjercicioDoce {

    /**
     * @param args the command line arguments Se ingresa el importe de un
     * producto importado y se le debe agregar el 35 % de impuestos internos.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner(System.in);
        int Importe;
        int Impuesto;
        int Total;
        System.out.println("Por favor ingrese el importe");
        Importe = misc.nextInt();
        Impuesto = (Importe * 35) / 100;
        Total = Importe + Impuesto;
        System.out.println("El importa total es " + Total);

    }

}
