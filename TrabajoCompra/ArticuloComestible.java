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
public class ArticuloComestible extends Articulo {
    
    public ArticuloComestible(String nombre, int codigo, double precioCosto, int stock){
        super(nombre, codigo, precioCosto, stock);
    }
    
    private int _FecVen;
    
    public int SetFechaVencimiento (int Fecha){
        this._FecVen = Fecha;
        return Fecha;
    }
}
