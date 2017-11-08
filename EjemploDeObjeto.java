/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodeobjeto;

/**
 *
 * @author alumno
 */
public class EjemploDeObjeto {

    /**
     * necesito una lapicera con dos colores. Rojo y azul.
     * Cada uno tiene una cantidad de 100.
     * el método escribir recibe el color 
     * y la cantidad de tinta -escribir("rojo",10)-
     * a utilizar, de no tener cantidad suficiente se muestra un mensaje.
     * el método Cargar tinta recibe el color, cargar ("Rojo",180) 
     * y la cantidad para cargar
     * 
     * 
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lapicera NuevaLapicera;
        NuevaLapicera = new Lapicera();
        
        NuevaLapicera.Escribir("Rojo", 120);
        NuevaLapicera.Escribir("Azul", 50);
        NuevaLapicera.Cargar("Rojo", 90);
        //Entonces Rojo termina en 10 (por que al no poder restarse 120 queda en 100 hasta restarse 90)
        //y azul queda en 150
        
    }
    
    
   
}
