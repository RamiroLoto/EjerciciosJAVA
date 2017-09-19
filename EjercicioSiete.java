/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosiete;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class EjercicioSiete {

    /**
     * @param args the command line arguments
     * Se pide la base de un cuadrado y se informa el perímetro
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Base;
        int Resultado;
        Scanner misc = new Scanner (System.in);  
        System.out.println("Por favor ingrese la base del cuadrado");
        Base = misc.nextInt();
        Resultado = Base * 4;
        System.out.println("El perímetro del cuadrado es "+ Resultado);
    }
    
}
