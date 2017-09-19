/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocatorce;

import com.sun.org.apache.xpath.internal.operations.Equals;
import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class EjercicioCatorce {

    /**
     * @param args the command line arguments Se pide ingresar una clave, si es
     * "UTN750" se mostrará el mensaje bienvenido, de lo contrario el mensaje
     * "clave errónea"
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner(System.in);
        String Clave;

        System.out.println("Ingrese Clave");
        Clave = misc.next();

        if (Clave.equals("UTN750")) {
            System.out.println("Bienvenido");
        } else {
            System.out.println("Clave errónea");
        }

    }

}
