/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controldecompra;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Comercio {

    private String _elDueño;
    private ArrayList<Articulo> ListadoArticulos;
    private ArrayList<Venta> ListadoVentas;

    public Comercio(String nombre) {
        this._elDueño = nombre;
        this.ListadoArticulos = new ArrayList<Articulo>();
        this.ListadoVentas = new ArrayList<Venta>();
    }

    public String VenderArticulo(Articulo primero, int Cant) {

        for (Articulo miart : this.ListadoArticulos) {
            if (Articulo.SonIguales(miart, primero)) {
                if (miart.GetterStock() > Cant) {
                    Venta nuevaVenta = new Venta(primero, Cant);
                    this.ListadoVentas.add(nuevaVenta);
                    miart.SetterStock(miart.GetterStock()-Cant);
                    return "pude vender";
                } else {
                    return "no hay stock suficiente";
                }
            }
        }
        return "no tengo el producto";
    }

    public void MostrarArticulos() {
        for (Articulo aux : this.ListadoArticulos) {
            aux.MostrarArticulo();
        }
    }

    public void MostrarVentas() {
        float gananciaTotal = 0;
        for (Venta aux : this.ListadoVentas) {
            gananciaTotal += gananciaTotal + aux.RetornarGanancia();
            aux.MostrarVenta();
        }
        System.out.println("La ganancia es: " + gananciaTotal);
    }

    public String Comprar(Articulo primero, int Cant) {

        for (Articulo miart : this.ListadoArticulos) {
            if (Articulo.SonIguales(miart, primero)) {
                miart.SetterStock(miart.GetterStock() + primero.GetterStock());
                return "Se sumó al stock";
            }
        }
        primero.SetterStock(Cant);
        this.ListadoArticulos.add(primero);
        return "Se agregó uno nuevo";
    }
}