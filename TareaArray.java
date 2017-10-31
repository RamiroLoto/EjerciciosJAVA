/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaarray;

import java.util.Random;

/**
 *
 * @author Rama
 */
public class TareaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SumaEntreDosArrays();
    }

    public static void GuardarPares() {
        int cantidadNum = 100;
        int contador = 1;
        int indice = 0;
        int[] Array = new int[cantidadNum / 6];
        for (; contador < cantidadNum; contador++) {
            if (contador % 2 == 0) {
                Array[indice] = contador;
                indice++;
            }
        }
        for (indice = 0; indice < Array.length; indice++) {
            System.out.println(Array[indice]);
        }
    }

    public static void MultiplosDeSeis() {
        int cantidadNum = 101;
        int contador = 1;
        int indice = 0;
        int[] Array = new int[cantidadNum / 6];
        for (; contador < cantidadNum; contador++) {
            if (contador % 6 == 0) {
                Array[indice] = contador;
                indice++;
            }
        }
        for (indice = 0; indice < Array.length; indice++) {
            System.out.println(Array[indice]);
        }

    }

    public static void NumerosRandom() {
        Random rnd = new Random();
        int[] Array = new int[10];

        for (int contador = 0; contador < Array.length; contador++) {
            int NumeroRandom = rnd.nextInt(100) + 1;
            Array[contador] = NumeroRandom;
            System.out.print(" " + Array[contador] + " ");
        }

    }

    public static void NumerosRandomInverso() {
        Random rnd = new Random();
        int[] Array = new int[10];
        int[] ArrayInv = new int[Array.length];
        int indice = 0;

        for (int contador = 0; contador < Array.length; contador++) {
            int NumeroRandom = rnd.nextInt(100) + 1;
            Array[contador] = NumeroRandom;
            System.out.print(" " + Array[contador] + " ");
        }

        for (int contadorDos = Array.length - 1; contadorDos > -1; contadorDos--) {
            ArrayInv[indice] = Array[contadorDos];
            indice++;
        }
        System.out.println("");

        for (int contador = 0; contador < Array.length; contador++) {
            System.out.print(" " + ArrayInv[contador] + " ");
        }

    }

    public static void NumeroMasAltoEntreDosArrays() {
        Random rnd = new Random();
        int ArrayUno[] = new int[10];
        int ArrayDos[] = new int[10];
        int MaximoDeUno = 0;
        int MaximoDeDos = 0;

        for (int i = 0; i < ArrayUno.length; i++) {
            int PrimerRandom = rnd.nextInt(100) + 1;
            ArrayUno[i] = PrimerRandom;
            if (i == 0) {
                MaximoDeUno = ArrayUno[i];
            } else if (i < ArrayUno.length) {
                MaximoDeUno = ArrayUno[i];
            }
            int SegundoRandom = rnd.nextInt(100) + 1;
            ArrayDos[i] = SegundoRandom;
            if (i == 0) {
                MaximoDeDos = ArrayDos[i];
            } else if (i < ArrayDos.length) {
                MaximoDeDos = ArrayDos[i];
            }

            for (int k = 0; k < ArrayUno.length; k++) {
                if (MaximoDeUno > MaximoDeDos) {
                    System.out.print(" "+MaximoDeUno+" ");
                    break;
                } else {
                    System.out.print(" "+MaximoDeDos+" ");
                    break;
                }
            }
        }
    }
    
    public static void ValorMaximoDeArray(){
        Random rnd = new Random();
        int Array [] = new int [10];
        int Maximo=0;
        
        for (int i = 0; i < Array.length; i++) {
            int Random = rnd.nextInt(100) + 1;
            Array[i]=Random;
            if (i==0){
                Maximo=Array[i];
            } else if (i<Array.length){
                if (Maximo<Array[i]){
                    Maximo=Array[i];
                }
            }
            System.out.print(" "+ Array[i]+" ");
        }
        System.out.println("");
        System.out.println("El maximo es: "+Maximo);
    }
    
    public static void ValorMaximoYMinimoDeArray(){
        Random rnd = new Random();
        int Array [] = new int [10];
        int Maximo=0;
        int Minimo=0;
        
        for (int i = 0; i < Array.length; i++) {
            int Random = rnd.nextInt(100) + 1;
            Array[i]=Random;
            if (i==0){
                Maximo=Array[i];
                Minimo=Array[i];
            } else if (i<Array.length){
                if (Maximo<Array[i]){
                    Maximo=Array[i];
                } else if (Minimo>Array[i]){
                    Minimo=Array[i];
                }
            }
            System.out.print(" "+ Array[i]+" ");
        }
        System.out.println("");
        System.out.println("El Maximo es: "+Maximo);
        System.out.println("El Minimo es: "+Minimo);
    }
    
     public static void NotMasAltaYMasBaja(){
        Random rnd = new Random();
        int Array [] = new int [10];
        int Maximo=0;
        int Minimo=0;
        
        for (int i = 0; i < Array.length; i++) {
            int Random = rnd.nextInt(10) + 1;
            Array[i]=Random;
            if (i==0){
                Maximo=Array[i];
                Minimo=Array[i];
            } else if (i<Array.length){
                if (Maximo<Array[i]){
                    Maximo=Array[i];
                } else if (Minimo>Array[i]){
                    Minimo=Array[i];
                }
            }
            System.out.print(" "+ Array[i]+" ");
        }
        System.out.println("");
        System.out.println("La nota mas alta es: "+Maximo);
        System.out.println("La nota mas baja es: "+Minimo);
    }
    
     public static void PromedioDeNotas(){
         Random rnd = new Random();
         int Array [] = new int [10];
         int suma=0;
         for (int i = 0; i < Array.length; i++) {
             Array[i] = rnd.nextInt(10)+1;
             suma += Array[i];
         }
         int promedio= suma/Array.length;
         System.out.println("El promedio es: "+promedio);
     }
     
     public static void CantidadDeAprobados(){
         Random rnd = new Random();
         int Array [] = new int [10];
         int CantAprobados=0;
         int CantDesaprobados=0;
         for (int i = 0; i < Array.length; i++) {
             Array[i] = rnd.nextInt(10)+1;
             if (Array[i]>=4){
                 CantAprobados++;
             } else {
                 CantDesaprobados++;
             }
         }
         
         System.out.println("La cantidad de aprobados es: "+CantAprobados);
         System.out.println("La cantidad de desaprobados es: "+CantDesaprobados);
     }
     
     public static void PorcentajeDeAprobadosYDesaprobados(){
         Random rnd = new Random();
         int Array [] = new int [10];
         int CantAprobados=0;
         int CantDesaprobados=0;
         for (int i = 0; i < Array.length; i++) {
             Array[i] = rnd.nextInt(10)+1;
             if (Array[i]>=4){
                 CantAprobados++;
             } else {
                 CantDesaprobados++;
             }
         }
         
         System.out.println("El porcentaje de aprobados es: "+CantAprobados*10+"%");
         System.out.println("El porcentaje de desaprobados es: "+CantDesaprobados*10+"%");
     }
     
     public static void SumaEntreDosArrays(){
     int ArrayUno [] = new int [20];
     int ArrayDos [] = new int [20];
     int ArrayResultado [] = new int [20];
     Random rnd = new Random();
     
         for (int i = 0; i < ArrayUno.length; i++) {
             ArrayUno[i]=rnd.nextInt(41)-20;
             ArrayDos[i]=rnd.nextInt(41)-20;
             ArrayResultado[i]=ArrayUno[i]+ArrayDos[i];
             System.out.println(ArrayUno[i]);
             System.out.println(ArrayDos[i]);
             System.out.println("La suma es: "+ArrayResultado[i]);
         }
     }
     
     public static void NumeroMasCercanoACero(){
     
         
     }
}
