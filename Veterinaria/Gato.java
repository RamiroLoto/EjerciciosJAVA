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
public class Gato extends Mascota {
    private boolean _arana;
    
    public Gato(String nombre, String raza){
        super(nombre, raza);
        this._arana = false;
    }
    
    public void Arana(){
        if(this._arana=false){
            this._arana = true;
        }
    }
    
    public String toString(){
        if(this._arana=true){
            return "El gato araña";
        }
        return "El gato no araña";
    }
}
