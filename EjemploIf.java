/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploif;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class EjemploIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner(System.in);
        // defino variables
        String nombre;
        String clave;
        String sexo;
        String localidad;
        String colorfavorito;

        // tomo datos 
        System.out.println("ingrese nombre:");
        nombre = misc.next();

        System.out.println("ingrese clave:");
        clave = misc.next();

        System.out.println("ingrese sexo: ");
        sexo = misc.next();

        System.out.println("ingrese localidad: ");
        localidad = misc.next();

        System.out.println("ingrese color favorito: ");
        colorfavorito = misc.next();

        /**
         * si es masculino que viva en lanus o avellaneda y que si color
         * favorito sea el rojo, mostrar el mensaje "sos de independiente" si el
         * nombre es Andrea, la localidad es Morón y el color favorito es verde
         * o azul, mostrar el mensaje "Feliz primavera"
         */
        if (nombre.equals("admin")) {
            System.out.println("bienvenido administrador");
        } else {
            System.out.println("bienvenido " + nombre);
        }

        // ingresa m para masculino, f para femenino. 
        if (localidad.equals("lanus") && sexo.equals("f")) {
            System.out.println("Bienvenida");
        }

//        if (sexo.equals("f")) {
//            System.out.println("Feliz dia de la mujer");
//        }
//        
//        if (localidad.equals("lanus")){
//            System.out.println("Bienvenidas mujeres de lanus");
//        }
        if (colorfavorito.equals("celeste") || colorfavorito.equals("blanco")) {
            System.out.println("Sos un patriota");
        }
//        con el comando || (ó) me ahorro todo esto:
//        if(colorfavorito.equals("celeste")){
//            System.out.println("sos un patriota");
//        }
//        if(colorfavorito.equals("blanco")){
//            System.out.println("sos un patriota");
//        }

        if (localidad.equals("lanus") || localidad.equals("avellaneda") && sexo.equals("m") && colorfavorito.equals("rojo")) {
            System.out.println("Sos de independiente");
        }
        if (nombre.equals("andrea") && localidad.equals("moron") && colorfavorito.equals("verde") || colorfavorito.equals("azul")) {
            System.out.println("Feliz primavera");
        }
    }

}
