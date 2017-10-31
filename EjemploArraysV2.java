/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraysv2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploArraysV2 {
    public static int cantidad=3;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        String ArrayNombres[] = new String[cantidad];
//        int ArrayNotas[] = new int[cantidad];
//        String Aux;
//        EjemploArraysV2.CargarDatos(cantidad);
        

        String[] alumno ={"maria","manuel","diego","estela"};
        int[] notas={10,2,5,2,7};
        int aprobados;
        int promedio;
//        aprobados = RetornarCantidadAprobados(notas);
//        promedio = RetornarPromedio(notas);
//        System.out.println(promedio);
        RetornarElNombreDeLaMejorNota(notas, args);
    }
    
    public static int RetornarCantidadAprobados(int [] miparametro){
        int resultado = 0;
        for (int i = 0; i <miparametro.length; i++) {
            if(miparametro[i]>3){
                resultado++;
            }
        }
        
        return resultado;
    }
    
    public static int RetornarPromedio(int [] miparametro){
        int promedio;
        int suma=0;
        for (int i = 0; i < miparametro.length; i++) {
            suma += miparametro[i];
        }
        promedio=suma/miparametro.length;
        return promedio;
    }
    
    public static String RetornarElNombreDeLaMejorNota(int [] notas, String [] nombres){
        String retorno="";
        int Mayor=0;
        for (int i = 0; i < notas.length; i++) {
            if(i==0){
                Mayor=notas[i];
                retorno=nombres[i];
            } else if (i<notas.length){
                if (notas[i]>Mayor){
                    notas[i]=Mayor;
                    retorno=nombres[i];

                }
            }
        }
        return retorno;
    }
    
    public static void MostrarNombres(String[] ListaPalabras){
        for (int i = 0; i < ListaPalabras.length; i++) {
            System.out.println("La palabra es: "+ListaPalabras[i]);
        }
    }
    
    public static void MostrarPromedio(int[] ListaNumeros){
        int promedio;
        int suma=0;
        for (int i = 0; i < ListaNumeros.length; i++) {
            suma += ListaNumeros[i];
        }
        promedio=suma/ListaNumeros.length;
        System.out.println("Y el promedio es: " + promedio);
    }

    public static String[] CargarDatos(int cantidad) {
        String ArrayNombres[] = new String[cantidad];
        int ArrayNotas[] = new int[cantidad];
        String Aux;

        for (int i = 0; i < cantidad; i++) {
            Scanner misc = new Scanner(System.in);
            System.out.println("Ingrese nombre");
            ArrayNombres[i] = misc.next();
            System.out.println("Ingrese la nota");
            Aux = misc.next();
            ArrayNotas[i] = Integer.parseInt(Aux);}
        return ArrayNombres;
    }
    
    public static void MostrarDatos(int[] ArrayNotas, String[] ArrayNombres){
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Nombre es: "+ArrayNombres[i]);
        }
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Nota es: "+ArrayNotas[i]);
        }
    }

    public static void CargarDatos() {
        // array de nombres. 
        // array de notas.
        // pedir 3 notas y 3 nombres. 
        // mostrar los dos arrays.
        // saco el promedio.
        Scanner misc = new Scanner(System.in);
        String ArrayNombres[] = new String[3];
        int ArrayNotas[] = new int[3];
        String Aux;

        for (int i = 0; i < ArrayNombres.length; i++) {
            System.out.println("Ingrese nombre");
            ArrayNombres[i] = misc.next();
            System.out.println("Ingrese la nota");
            Aux = misc.next();
            ArrayNotas[i] = Integer.parseInt(Aux);

        }

        for (int i = 0; i < ArrayNombres.length; i++) {
            System.out.print(" " + ArrayNombres[i] + " ");
            System.out.print(" " + ArrayNotas[i] + " ");
        }

        int Suma=0;
        int Promedio;
        for (int i = 0; i < ArrayNombres.length; i++) {

            Suma += ArrayNotas[i];
        }

        Promedio = Suma / ArrayNotas.length;
        System.out.println("Y el promedio es: " + Promedio);

    }
}
