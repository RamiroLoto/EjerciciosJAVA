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
public class Articulo {
    
    private String _nombre;
    private int _codigo;
    private double _precioCosto;
    private double _precioVenta;
    private int _stock;
    
    public double DamePrecioVenta(){
        return this._precioVenta;
    }
    
    public String DameNombreYCodigo(){
        String NomYCod = this._nombre + this._codigo;
        return NomYCod;
    }
    
    public void SetPrecioCosto(double PrecioCosto){
        this._precioCosto = PrecioCosto;
    }
    
    public void SetStock(int Stock){
        this._stock = Stock;
    }
    
    public Articulo(String nombre, int codigo, double precioCosto, int Stock){
        this._nombre = nombre;
        this._codigo = codigo;
        this._precioCosto = precioCosto;
        this._precioVenta = precioCosto + precioCosto * 0.25;
        this._stock = Stock;
        
    }
    
    public boolean HayStock(){
        return this._stock > 0;
    }
    
    public static boolean SonIguales(Articulo primero, Articulo segundo){
        return (primero._nombre.equals(segundo._nombre))&&(primero._codigo==segundo._codigo);
    }
    
    public void MostrarArticulo(){
        System.out.println("El nombre del articulo es: "+this._nombre);
        System.out.println("La cantidad del articulo es: "+this._stock);
    }
    
   
}
