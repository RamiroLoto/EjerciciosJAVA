/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteracionwhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class IteracionWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner misc = new Scanner(System.in);
        String Clave;
        
        System.out.println("Ingrese clave");
        Clave = misc.next();
        
        while(!Clave.equals("1234")){
            System.out.println("Error, reingrese clave");
            Clave = misc.next();
        }
        
        System.out.println("Bienvenido");
        */
        Integer micontador=0;
        
        while(micontador<3){
            micontador=micontador+1;
            System.out.println("contando");
        }
        System.out.println("terminé");
    }
    
}
