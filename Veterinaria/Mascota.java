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
public class Mascota {
    
    private String _nombre;
    private String _raza;
    boolean _estaBanado;
    private String _sexo;
    
    public Mascota(String nombre, String raza){
        this._nombre = nombre;
        this._raza = raza;
        this._estaBanado = false;
    }
    
    public String GetterNombre(){
        return this._nombre;
    }
    
    public void estaBanado(){
        if (this._estaBanado = false){
            this._estaBanado = true;
        }
    }
    
    public String toString(){
        return ("nombre: "+this._nombre+" raza: "+this._raza+" sexo: "+this._sexo);
    }
}
