/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinanumerotarea;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class AdivinaNumeroTarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner(System.in);
        Integer NumeroRandom = 3;//(int) (Math.random() * 10) + 1;
        Integer NumeroIngresado;
        String DatoAux;
        Integer Diferencia;

        System.out.println("Ingrese un numero");
        DatoAux = misc.next();
        NumeroIngresado = Integer.parseInt(DatoAux);

        if (NumeroIngresado.equals(NumeroRandom)) {
            System.out.println("Acertó");
        } else {
            if (NumeroIngresado > NumeroRandom) {
                System.out.println("se pasó");
            } else {
                System.out.println("faltó");
            }
            Diferencia = NumeroRandom - NumeroIngresado;
            Diferencia = Math.abs(Diferencia);
            switch (Diferencia) {
                case 1:
                    System.out.println("Casi casi");
                    break;
                case 2:
                    System.out.println("cerca");
                    break;
                case 3:
                    System.out.println("Ni cerca");
                    break;
                case 4:
                    System.out.println("Bien lejos");
                    break;
                default:
                    System.out.println("Sos horrible en este juego");
                //tambien se podia hacer un case negativo con el mismo mensaje para cada situación.
            }

        }

    }//llave pertenece a "public void string" (comentario puede ser usado como recordatorio de la pertenencia de la llave)

}
