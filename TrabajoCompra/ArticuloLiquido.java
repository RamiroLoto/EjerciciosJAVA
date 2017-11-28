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
public class ArticuloLiquido extends Articulo {
    
     public ArticuloLiquido (String nombre, int codigo, double precioCosto, int stock){
        super(nombre, codigo, precioCosto, stock);
    }
    
    private int _CanLit;
    
    public int SetCantidadLitros (int CanLit){
        this._CanLit = CanLit;
        return CanLit;
    }
}
