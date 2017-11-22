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
public class AlumnoEgresado extends Alumno {
    private Date _fechaEgr;
    private float _promedio;
    
    public void MostrarLosDatos(){
        super.MostrarLosDatos();
        System.out.println("fe:"+this._fechaEgr);
        System.out.println("p: "+this._promedio);
    }
}
