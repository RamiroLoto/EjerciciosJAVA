/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documento;

/**
 *
 * @author alumno
 */
public class FacturaB extends Documento {
    
    private float _IIBB;
    
    public FacturaB(int numero){
        super(numero);
    }
    
    public void MostrarDatos(){
        super.MostrarDatosCompletos();
        System.out.println("IIBB: "+this._IIBB);
    }
}
