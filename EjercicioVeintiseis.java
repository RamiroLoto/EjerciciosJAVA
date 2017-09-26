/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveintiseis;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class EjercicioVeintiseis {

    /**
     * @param args the command line arguments
     * 26- de pide una temperatura y se pide si se quiere pasar Celsius o 
     * Fahrenheit, hacer la cuenta y mostrar el resultado.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner(System.in);
        Double Temperatura;
        String Respuesta;
        Double Conversion;
        
        System.out.println("Ingrese una temperatura en grados Celsius");
        Temperatura = misc.nextDouble();
        
        System.out.println("Le gustaria pasar la temperatura a Farenheit?");
        Respuesta = misc.next();
        
        Conversion = (Temperatura * 9) / 5 + 32;
        
        if (Respuesta.equals("Si")){
            System.out.println("La temperatura en Farenheit es: "+ Conversion);
        } else {
            System.out.println("La temperatura en Celsius es: "+Temperatura);
        }
                
    }
    
}
