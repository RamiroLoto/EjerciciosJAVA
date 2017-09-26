/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodieciseis;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class EjercicioVeinte {

    /**
     * @param args the command line arguments
     * Se ingresa un importe del pasaje de avión y el mes de viaje, 
     * si el mes es enero, se les descuenta un 10% por temporada baja
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner (System.in);
        Integer Importe;
        String DatoAux;
        String Mes;
        Double Descuento;
        
        System.out.println("Por favor ingrese importe");
        DatoAux = misc.next();
        Importe = Integer.parseInt(DatoAux);
        
        Descuento = Importe * 0.10;
        
        System.out.println("Por favor ingrese mes de viaje");
        Mes = misc.next();
        
       
        
        if (Mes.equals("Enero")){
            System.out.println("El importe es "+ (Importe - Descuento));
        }else{
            System.out.println("El importe es "+ Importe);
        }
    }
    
}
