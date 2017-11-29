/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploproductoconteiner;

/**
 *
 * @author alumno
 */
public class ProductoNacional extends Producto {
    
    private String _provincia;
    
    public ProductoNacional (int ID, String nombre, float precio, String provincia){
        super(ID, nombre, precio);
        this._provincia = provincia;
    }
    
    public float GetterPrecio(){
        return super.GetterPrecio();
    }
    
    public void MostrarProducto(){
        super.MostrarProducto();
        System.out.println("Provincia: "+this._provincia);
    }
}
