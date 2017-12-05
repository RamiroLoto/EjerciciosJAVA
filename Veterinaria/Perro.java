/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveterinaria;

/**
 *
 * @author Rama
 */
public class Perro extends Mascota {
    private boolean _muerde;
    private String _tamano;
    
    public Perro(String nombre, String raza, String tamano){
        super(nombre, raza);
        this._tamano = tamano;
        this._muerde = false;
    }
    
    public void Muerde(){
        if(this._muerde = false){
            this._muerde = true;
        }
    }
    
    public String toString(){
        if(this._muerde=true){
            return "tamaño: "+this._tamano+" el perro muerde";
        }
        return "tamaño: "+this._tamano+" el perro no muerde";
    }
}
