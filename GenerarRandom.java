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
public class GenerarRandom {
    
    public static String DameUnNombre(){
        String retorno="";
        int random = (int)Math.random()*10;
        switch(random){
            case 0: 
                retorno = "Alfredo";
                break;
            case 1: 
                retorno = "Rogelio";
                break;
            case 2: 
                retorno = "Julieta";
                break;
            case 3: 
                retorno = "Alfredo";
                break;
        }
        return retorno;
    }
    
    public static String DameUnApellido(){
        String retorno="";
        int random = (int)Math.random()*10;
        switch(random){
            case 0: 
                retorno = "Mercurio";
                break;
            case 1: 
                retorno = "Agua";
                break;
            case 2: 
                retorno = "Roberto";
                break;
            case 3: 
                retorno = "Alfredo";
                break;
        }
        return retorno;
    }
    
    public static int DameUnaEdad(){
        int random = (int)Math.random()*100;
        
        return random;
    }
}
