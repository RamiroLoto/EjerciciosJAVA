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
public class ProductoImportado extends Producto{
    
    private String _pais;
    private float _impuesto;
    
    public ProductoImportado(int ID, String nombre, float precio, String pais, float impuesto){
        super(ID, nombre, precio);
        this._pais = pais;
        this._impuesto = impuesto;
    }
    
    public float GetterPrecio(){
        return (this._precio + this._impuesto) ;
    } 
    
    public void MostrarProducto(){
        super.MostrarProducto();
        System.out.println("Pais: "+this._pais+" impuesto: "+this._impuesto);
    }
    
    public String toString(){
        return "esto es importado";
    }
    
}
