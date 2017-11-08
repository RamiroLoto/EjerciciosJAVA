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
public class Lapicera {

    private int _rojo = 100;
    private int _azul = 100;

    public void Escribir(String unColor, int unaCantidad) {

        if (unColor.equalsIgnoreCase("Rojo")) {

            if (unaCantidad < this._rojo) {
                this._rojo -= unaCantidad;
            } else {
                System.out.println("No hay rojo");
            }
        }

        if (unColor.equalsIgnoreCase("Azul")) {

            if (unaCantidad < this._azul) {
                this._azul -= unaCantidad;
            } else {
                System.out.println("No hay azul");
            }
        }
    }

    public void Cargar(String Color, int unaCantidad) {
        if (Color.equalsIgnoreCase("Rojo")) {
            this._rojo += unaCantidad;
        } 

        if (Color.equals("Azul")) {
            this._azul += unaCantidad;
        } 
    }

}
