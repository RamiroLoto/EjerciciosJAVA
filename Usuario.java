/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocalseyobjetos;

/**
 *
 * @author alumno
 */
public class Usuario {
    
    //atributos (afuera de los metodos y adentro de las clases
    private String nombre;
    private String clave;
    
    //metodos getters
    public String GetNombre(){
        return this.nombre.toUpperCase();
        //toUpperCase convierte palabra a mayuscula.
    }
    
    public String GetClave(){
        return this.clave;
    }
    
    //metodos getters
    //public void SetNombre(String dato)
    public void DameNombre(String dato){
        this.nombre = dato;
    }
    //public void SetClave(String dato)
    public void DameClave(String dato){
        if(dato.length()<4){
            this.clave = "mal";
        }else{
            this.clave = dato;
        }
        
    }
    
    public void mostrarDatos(){
        System.out.println("su nombre de usuario es: "+this.GetNombre()+" clave:"+this.clave);
    }
    
}
