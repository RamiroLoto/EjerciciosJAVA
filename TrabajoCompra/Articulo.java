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
public class Articulo {
    private String _nombre;
    private int _codigo;
    private float _precioCosto;
    private float _precioVenta;
    private int _stock;
    
    /*
    los getters siempre retornan algo. Ej: DameNombreYCogido.
    */
    
    public float GetterPrecioVenta(){
        return this._precioVenta;
    }
    
    public String GetterNombreYCodigo(){
        String NomYCod = this._nombre + this._codigo;
        return NomYCod;
    }
    
    public int GetterStock(){
        return this._stock;
    }
    
    public float GetterGanancia(){
        return this._precioVenta - this._precioCosto;
    }
    
    /*
    los setter siempre tienen parametros de ingreso y retornan void.
    */
    
    public void SetterPrecioCosto(float PrecioCosto){
        this._precioCosto = PrecioCosto;
    }
    
    public void SetterStock(int Stock){
        this._stock = Stock;
    }
    
    public Articulo(String nombre, int codigo, float precioCosto, int Stock){
        this._nombre = nombre;
        this._codigo = codigo;
        this._precioCosto = precioCosto;
        this._precioVenta = this._precioCosto * (float)1.25;
        this._stock = Stock;
        
    }
    
    public boolean HayStock(){
        //version mas simplificada:
        return (this._stock>0);
        
        //if(this._stock < 0){
        //    return false;
        //}
        //return true;

        //Esta es preferible, resolver el metodo y despues la logica.
        //boolean retorno = false;
        //if(this._stock>0){
        //    retorno = true;
        //}
        //return retorno;
        
    }
    
    public static boolean SonIguales(Articulo primero, Articulo segundo){
        boolean retorno = false;
        if ((primero.GetterNombreYCodigo().equals(segundo.GetterNombreYCodigo()))) {
            retorno = true;
        }
        return retorno;
    }
    
    public void MostrarArticulo(){
        System.out.println("El nombre del articulo es: "+this._nombre);
        System.out.println("El codigo es: "+this._codigo);
        System.out.println("La cantidad del articulo es: "+this._stock);
        System.out.println("El precio de costo es: "+this._precioCosto);
        System.out.println("El precio de venta es: "+this._precioVenta);
    }
}
