/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploproductoconteiner;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Conteiner {

    private int _capacidad;
    private ArrayList<Producto> _listadoDeProductos;

    public Conteiner(int capacidad) {
        this._capacidad = capacidad;
        this._listadoDeProductos = new ArrayList<Producto>();
    }

    public float GetterPrecioTotal() {
        float retorno = 0;
        for (Producto auxProducto : this._listadoDeProductos) {
            retorno += auxProducto.GetterPrecio();
        }
        return retorno;
    }

    public int GetterCantidadElementos() {
        int retorno = this._listadoDeProductos.size();
        return retorno;
    }

    public int GetterCantidadLugaresLibres() {
        int retorno = this._capacidad - this._listadoDeProductos.size();
        return retorno;
    }

    public void MostrarConteiner() {
        System.out.println("Capacidad maxima: " + this._capacidad);
        System.out.println("Lugares libres: " + this.GetterCantidadLugaresLibres());
        System.out.println("Lugares ocupados: " + this.GetterCantidadElementos());
        System.out.println("Listado de productos:");
        int contador = 1;
        for (Producto aux : this._listadoDeProductos) {
            System.out.println(contador);
            aux.MostrarProducto();
            System.out.println("El precio es: "+ aux.GetterPrecio());
            contador++;
        }
    }

    public boolean CargarProducto(Producto algunProducto) {
        if (this.GetterCantidadLugaresLibres() > 0) {
            this._listadoDeProductos.add(algunProducto);
            return true;
        }
        return false;
    }
    
    public void Ordenar(){
        for (int i = 0; i < this._listadoDeProductos.size(); i++) {
            
            for (int j = 0; j < this._listadoDeProductos.size()-1; j++) {
            
                if(this._listadoDeProductos.get(j)._precio<this._listadoDeProductos.get(j+1)._precio){
                    Producto aux;
                    aux = this._listadoDeProductos.get(j);
                    this._listadoDeProductos.set(j, this._listadoDeProductos.get(j+1));
                    this._listadoDeProductos.set(j+1, aux);
                }
            }
        }
    }
}
