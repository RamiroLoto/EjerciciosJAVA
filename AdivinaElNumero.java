/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnumero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class AdivinaElNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rnd = new Random();
        int NumeroRandom = rnd.nextInt(11) + 1;
        int Numero;
        Scanner misc = new Scanner(System.in);
        System.out.println("Advine el numero");
        Numero = misc.nextInt();
        /* Otra forma de hacerlo:
        (Con scanner importado)
        Integer numero
        String DatoAux
        (Pedir numero y parsear
        Integer Random = (int) (Math.random()*10)+1;
        Se multiplica por diez y se suma uno por que si no los valores van de 0,1 a 0,9
        Se agregan los parentesis entre 'Math' y '10' para que se realice la distributiva
         */
        if (Numero == NumeroRandom) {
            System.out.println("Acertó");
        } else {
            if (Numero > NumeroRandom) {
                System.out.println("Te pasaste");
            } else {
                System.out.println("Te faltó");
            }
            System.out.println("No acertó");
        }

    }

}
//Enunciado: informar si: 
//A si le erró por un punto: mensaje "casi casi"
//B si le erró por 2 puntos: mensaje "cerca"
//C si le erró por 3 puntos: mensaje "ni cerca"
//D si le erró por 4 puntos: mensaje "bien lejos"
//E resto: mensaje "sos horrible en este juego"