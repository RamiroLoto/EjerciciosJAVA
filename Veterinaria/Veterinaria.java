/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveterinaria;

import java.util.ArrayList;

/**
 *
 * @author Rama
 */
public class Veterinaria {
    private String _nombre;
    private String _dueno;
    private ArrayList<Mascota> _listadoDeMascotas;
    private float _precioGato;
    private float _precioPerro;
    
    
    public Veterinaria(String nombre, String dueno, float precioGato, float precioPerro){
        this._nombre = nombre;
        this._dueno = dueno;
        this._precioGato = precioGato;
        this._precioPerro = precioPerro;
        this._listadoDeMascotas = new ArrayList<Mascota>();
    }
    
    public void IngresarAnimal(Mascota nueva){
        this._listadoDeMascotas.add(nueva);
    }
    
    public void MostrarTotalFacturado(){
        if(this._listadoDeMascotas.size() > 0){
            System.out.println("La cantidad facturada fue: "+(this._precioGato*this._listadoDeMascotas.size())+(this._precioPerro*this._listadoDeMascotas.size()));
        }
    }
    
    public void MostrarTotalFacturadoTipo(String tipo){
        
    }
    
    public String toString(){
        return ("Nombre: "+this._nombre+" Dueño: "+this._dueno+" Precio de gato: "+this._precioGato+ "Precio de perro: "+this._precioPerro);
    }
    
    public void MostrarVeterinaria(){
        System.out.println(this.toString());
    }
}
