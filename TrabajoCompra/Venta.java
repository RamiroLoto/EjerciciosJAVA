/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controldecompra;

/**
 *
 * @author alumno
 */
public class Venta {
    private Articulo _artVendido;
    private int _cantidad;
    
    public Venta (Articulo artVendido, int Cant){
        this._artVendido = artVendido;
        this._cantidad = Cant;
    }
    
    public float RetornarGanancia(){
        float ganancia = this._artVendido.GetterGanancia()*this._cantidad;
        return ganancia;
    }
    
    public void MostrarVenta(){
        System.out.println(""+ this._cantidad);
        System.out.println("articulo ");
        this._artVendido.MostrarArticulo();
    }
}
