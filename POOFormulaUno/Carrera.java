/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulauno;

import java.time.Instant;

/**
 *
 * @author alumno
 */
public class Carrera {
    
    public Auto[] Participantes;
    private String fecha;
    private String pais;
    
    /**
     * 1 - no tiene valor de retorno
     * 2 - se llama igual que la clase 
     * 3 - el por defecto , puede estar o no
     * 4 - se ejecuta una unica vez
     * 
     */
    
    public Carrera()//constructor
    {
        this.fecha=Instant.now().toString();
        this.pais="Argentina";
        this.Participantes = new Auto[100];
        this.CrearAutosTest();
    }
    
    private void CrearAutosTest(){
        for (int i = 0; i < this.Participantes.length; i++) {
            
            this.Participantes[i] = new Auto(i);
        }
    }
    
    public void CorrerCarrera(int CantidadDeVueltas){
        for (int Vueltas = 0; Vueltas < CantidadDeVueltas; Vueltas++) {
            
            for (int i = 0; i < this.Participantes.length; i++) {
                int random = (int) (Math.random()*100);
                this.Participantes[i].AgregarTiempoRecorrido(random);
            }
            
        }
    }
    
    public Auto DameElGanador(){
        
        Auto retorno= new Auto(0);
        int menorRecorrido=0;
        
        for (int i = 0; i < this.Participantes.length; i++) {
            if(i==0){
                menorRecorrido = this.Participantes[i].DameElTiempoRecorrido();
                retorno = this.Participantes[i];
            } else {
                if(menorRecorrido > this.Participantes[i].DameElTiempoRecorrido()){
                    menorRecorrido = this.Participantes[i].DameElTiempoRecorrido();
                    retorno = this.Participantes[i];
                }
            }
        }
        
        return retorno;
    }
    
}
