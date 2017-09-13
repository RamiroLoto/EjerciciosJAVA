
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioDos {

    /**
     * @param args the command line arguments
     * Se debe pedir un nombre y se debe mostrar el mismo nombre. 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nombre;
        //Comando String recibe una variable escrita.
        Scanner miescanner = new Scanner (System.in);
        //Importar la clase "Scanner" permite crear un escaner propio (miescanner)
        //Y se lo activa utilizando la función "new Scanner (system.in)"  
        System.out.println("Ingrese Nombre");
        Nombre = miescanner.nextLine();
        //comando ".nextLine" define cuál va a ser la entrada para el Scanner. 
        System.out.println("El nombre es "+ Nombre);
        //Al final del resultado que se va a mostrar "Concatenamos" la variable 
        //"Nombre" para que muestre el resultado pedido. 
        
                
       
    }
    
}
