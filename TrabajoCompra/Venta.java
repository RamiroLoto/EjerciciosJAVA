/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controldecompra;

/**
 *
 * @author Rama
 */
public class Venta {
    
    private Articulo _artVendido;
    private int _cantidad;
    
    public Venta (Articulo artVendido, int Cant){
        this._artVendido = artVendido;
        this._cantidad = Cant;
    }
    
    public float RetornarGanancia(double Precio, Integer Cant){
        float ganancia = (float)((Precio * Cant) * 0.25);
        return ganancia;
    }
    
    public void MostrarVenta(){
        System.out.println("El articulo vendido es: "+ this._artVendido);
    }
}
