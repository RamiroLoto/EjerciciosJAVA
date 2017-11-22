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
public class Remito extends Documento {
    
    private Date fechaEnt;
    
    private float _IVA;
    public Remito(int numero){
        super(numero);
    }
    
    public void MostrarDatos(){
        super.MostrarDatosCompletos();
        System.out.println("fe:"+this.fechaEnt);
    }

}
