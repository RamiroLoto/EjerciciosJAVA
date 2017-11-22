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
public class FacturaA extends Documento {
    
//    public void setterNumero(int numero){
//        this._numero = numero;
//    }
    
    private float _IVA;
    public FacturaA(int numero){
        super(numero);
    }
    
    public void MostrarDatos(){
        super.MostrarDatosCompletos();
        System.out.println("iva: "+this._IVA);
    }
}
