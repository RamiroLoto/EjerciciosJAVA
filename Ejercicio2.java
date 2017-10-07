/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoproyecto;

/**
 *
 * @author educacionit
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double promedio;
        double inflacionanual=0;
        double [] inflacion = {0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9};
        String [] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        double menor = inflacion[0];
        double mayor = 0;
        String mes_mayor="";
        String mes_menor="";
        for (int i = 0; i < inflacion.length; i++){
        inflacionanual += inflacion [i];
        if (inflacion[i] > mayor) {
            mayor = inflacion[i];
            mes_mayor = meses[i];
        }
        if (inflacion[i] < menor){
            menor = inflacion[i];
            mes_menor = meses[i];
        }
        inflacionanual += inflacion [i]; 
        
            
        }
        promedio = inflacionanual/12;
        System.out.println("Mes inflacion mayor "+mes_mayor+": "+mayor);
        System.out.println("Mes inflacion menor "+mes_menor+": "+menor);
        System.out.println("Inflacion Anual: "+ inflacionanual);
        System.out.println("Promedio es: "+promedio);
        
    }
    
}
