/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer opcion;
        Scanner misc = new Scanner(System.in);
        System.out.println("Qué ejercicio quiere probar?");
        String Aux = misc.next();
        opcion = Integer.parseInt(Aux);
        switch (opcion){
            case 1: 
                GuiaInicial.HacerEjercicio1();
                break;
            case 2:
                GuiaInicial.HacerEjercicio2();
                break;
            case 3:
                GuiaInicial.HacerEjercicio3();
                break;
            case 4:
                GuiaInicial.HacerEjercicio4();
                break;
            case 5:
                GuiaInicial.HacerEjercicio5();
                break;
            case 7:
                GuiaInicial.HacerEjercicio7();
                break;    
            case 9:
                GuiaInicial.HacerEjercicio9();
                break;
            case 11:
                GuiaInicial.HacerEjercicio11();
                break;    
            case 14:
                GuiaIf.HacerEjercicio14();
                break;
            case 16:
                GuiaIf.HacerEjercicio16();
                break;
            case 18:
                GuiaIf.HacerEjercicio18();
                break;        
            case 20:
                GuiaIf.HacerEjercicio20();
                break;
        }
    }
    
}


