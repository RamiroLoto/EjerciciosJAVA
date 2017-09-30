/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author educacionit
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner(System.in);
        int cont=0;
        String clave;
        do{
            System.out.println("ingrese clave");
            clave = misc.next();
            if (clave.equals("1234")){
                break;
            }
            cont++;
            if (cont==1){
                System.out.println("Tiene dos chances");
            }
            if (cont==2){
                System.out.println("Tiene una chance");
            }
        
        }while(cont<3);
        
        if (cont==3){
            System.out.println("Tres veces fallidas");
        }else{
            System.out.println("Bienvenido al sistema");
        }
    }
}
