/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controldecompra;

import java.util.ArrayList;

/**
 *
 * @author Rama
 */
public class Comercio {
    
    private String _elDueño;
    
    public Comercio(String nombre){
        this._elDueño = nombre;
    }
    
    ArrayList<Articulo> ListadoArticulos = new ArrayList<Articulo>();
    
    ArrayList<Venta> ListadoVentas = new ArrayList<Venta>();
    
    public void VenderArticulo(Articulo primero, Integer Cant){
        
        
    }
    
    public void MostrarArticulos(){
        for (Articulo Nuevo : ListadoArticulos){
            Nuevo.MostrarArticulo();
        }
    }
    
    public void MostrarVentas(){
        for (Venta Nueva : ListadoVentas){
            Nueva.MostrarVenta();
        }
    }
    
    public void Comprar (Articulo primero, Integer Cant){
        
    }
    
}
