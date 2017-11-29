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
public class ArticuloComestible extends Articulo {
    private String _fecVen;
    
    public ArticuloComestible(String nombre, int codigo, float precioCosto, int stock, String Fecha){
        super(nombre, codigo, precioCosto, stock);
        this._fecVen = Fecha;
    }
    
    public String SetFechaVencimiento (String Fecha){
        this._fecVen = Fecha;
        return Fecha;
    }
}
