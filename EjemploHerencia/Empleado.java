/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author alumno
 */
public class Empleado extends Persona {
    protected Puesto Puesto;
    protected double Sueldo;
    
    public Empleado(int edad, String nombre, double Sueldo, Puesto puesto){
        super (edad, nombre);
        this.Puesto = puesto;
        this.Sueldo = Sueldo;
    }
    
    @Override
    public String MostrarDatos(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.MostrarDatos());
        sb.append("Puesto: "+this.Puesto+"\n");
        sb.append("Sueldo: "+this.Sueldo);
        return sb.toString();
    }
            
}
