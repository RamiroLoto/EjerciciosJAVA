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
public class Laboratorio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] valores = {10,20,5,15,30,20};
        int suma = 0;
        int mayor = 0;
        int cantidad=0;
        for (int i=0 ; i < valores.length ; i++){
            //informar el vector de la forma "indice: X, Valor; Y"
            System.out.println("Indice "+i+", Valor "+valores[i]);
            //totalizar el vector e informar el total
            suma += valores[i];
            //informar el contenido de las posiciones impares.
            if (i % 2 != 0){
                System.out.println("Posicion impar "+i+" valor: "+valores[i]);
            }
            if (valores[i]>mayor){
                mayor = valores[i];
            } 
           
            if (valores[i] == 20){
                cantidad++;
            }
        
        }
        System.out.println("Suma "+suma);
        System.out.println("El mayor es: "+mayor);
        System.out.println("El numero 20 aparece: "+cantidad+" veces");
    }
    
}
