/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioonce;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class EjercicioOnce {

    /**
     * @param args the command line arguments Se pide el valor de la hora de
     * trabajo de un empleado y la cantidad de horas trabajadas, informar cuanto
     * le corresponde de sueldo, restándole el 15% de aportes.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner(System.in);
        int Valor;
        int Horas;
        int Sueldo;
        int Aportes;
        System.out.println("Por favor ingresar el valor de la hora de trabajo");
        Valor = misc.nextInt();
        System.out.println("Por favor ingrese las horas trabajadas");
        Horas = misc.nextInt();
        Sueldo = Valor * Horas;
        Aportes = (Sueldo * 15) / 100;
        System.out.println("Su sueldo es " + (Sueldo - Aportes) + " pesos");

    }

}
