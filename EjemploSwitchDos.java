/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploswitchdos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploSwitchDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner(System.in);
        Integer MesDelAño;
        String DatoAux;
        //leemos la variable .next()
        //Parseamos
        
        System.out.println("Ingrese mes del año");
        DatoAux = misc.next();
        MesDelAño = Integer.parseInt(DatoAux);
        
        switch (MesDelAño)
        {
            case 1:
            System.out.println("Es verano");
        }
        
        
    }
    
}
