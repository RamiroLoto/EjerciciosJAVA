/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodoce;

import java.util.Scanner;



/**
 *
 * @author alumno
 */
public class EjercicioDoce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner (System.in);
        String DataAux;
        Integer Importe;
        //Diferentes 
        System.out.println("Ingresar el importe");
        DataAux = misc.next();
        Importe = Integer.parseInt(DataAux);

        System.out.println("El total es " + Importe * 1.35);

    }

}
