/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulauno;

/**
 *
 * @author alumno
 */
public class Auto {

    private int numero;
    private Escuderia escuderia;
    private String modelo;
    private Piloto elPiloto;
    private int TiempoRecorrido;
    
    public void Mostrar(){
        System.out.println("El numero de auto es: "+this.numero);
        System.out.println("La escudería es: "+this.escuderia.nombre);
        System.out.println("El modelo es: "+this.modelo);
        System.out.println("Y el tiempo recorrido fue: "+TiempoRecorrido);
        System.out.println("Piloto: "+this.elPiloto.DameNombreCompletoMayus());
    }
    
    public int DameElTiempoRecorrido(){
        return this.TiempoRecorrido;
    }
    
    public void AgregarTiempoRecorrido(int tiempo){
        this.TiempoRecorrido += tiempo;
    }

    public Auto(int numero) {
        this.elPiloto = new Piloto();
        this.modelo = "Ford";
        this.numero = numero;
        this.escuderia = new Escuderia(1930, "Italia", "ferrari");
        this.CargarPilotoRandom();
    }

    private void CargarPilotoRandom() {
        this.NombreRandom();
        this.ApellidoRandom();
    }

    private void NombreRandom() {
        int miRandom = (int) (Math.random() * 10);
        switch (miRandom) {
            case 0:
                this.elPiloto.SetterNombre("Rogelio");
                break;
            case 1:
                this.elPiloto.SetterNombre("Alfredo");
                break;
            case 2:
                this.elPiloto.SetterNombre("Miguel");
                break;
            case 3:
                this.elPiloto.SetterNombre("Julieta");
                break;
            case 4:
                this.elPiloto.SetterNombre("Ernestina");
                break;
            case 5:
                this.elPiloto.SetterNombre("Elthon");
                break;
            case 6:
                this.elPiloto.SetterNombre("Juan");
                break;
            case 7:
                this.elPiloto.SetterNombre("Juan");
                break;
            case 8:
                this.elPiloto.SetterNombre("Juan");
                break;
            case 9:
                this.elPiloto.SetterNombre("Juan");
                break;
            case 10:
                this.elPiloto.SetterNombre("Juan");
                break;
        }

    }

    private void ApellidoRandom() {
        int miRandom = (int) (Math.random() * 10);
        switch (miRandom) {
            case 0:
                this.elPiloto.SetterApellido("Agua");
                break;
            case 1:
                this.elPiloto.SetterApellido("Mercurio");
                break;
            case 2:
                this.elPiloto.SetterApellido("Zorro");
                break;
            case 3:
                this.elPiloto.SetterApellido("Roberto");
                break;
            case 4:
                this.elPiloto.SetterApellido("Paez");
                break;
            case 5:
                this.elPiloto.SetterApellido("Juan");
                break;
            case 6:
                this.elPiloto.SetterApellido("Juan");
                break;
            case 7:
                this.elPiloto.SetterApellido("Juan");
                break;
            case 8:
                this.elPiloto.SetterApellido("Juan");
                break;
            case 9:
                this.elPiloto.SetterApellido("Juan");
                break;
            case 10:
                this.elPiloto.SetterApellido("Juan");
                break;
        }
    }
}
