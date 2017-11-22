/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documento;

import java.util.Date;

/**
 *
 * @author alumno
 */
public class Alumno extends Persona {
    private Date _fechaIng;
    private int _legajo;
    
    public void MostrarLosDatos(){
        super.MostrarLosDatos();
        System.out.println("fi:"+this._fechaIng);
        System.out.println("leg:  "+this._legajo);
    }
}
