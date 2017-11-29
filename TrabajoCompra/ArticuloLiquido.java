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
public class ArticuloLiquido extends Articulo {
    private int _CanLit;
    
    public ArticuloLiquido (String nombre, int codigo, float precioCosto, int stock, int litros){
        super(nombre, codigo, precioCosto, stock);
        this._CanLit = litros;
    }
    
    public int SetCantidadLitros (int CanLit){
        this._CanLit = CanLit;
        return CanLit;
    }
}
