/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveintidos;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class EjercicioVeintidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner(System.in);
        System.out.println("Ingrese una nota");
        Integer Nota;
        
        Nota = misc.nextInt();
        
        if(Nota>=10){
            System.out.println("Excelente");
        }else if ((Nota<10)&&(Nota>3)){
            System.out.println("Aprobó");
        }else{
            System.out.println("La próxima será");
        }
    }
    
}
