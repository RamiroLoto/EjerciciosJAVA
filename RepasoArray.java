/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoarray;

/**
 *
 * @author alumno
 */
public class RepasoArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //RepasoArray.CrearArray();
        int[] ListadoNumerosMain;
        //ListadoNumerosMain = RepasoArray.RetornarArray();
        int retornorandom = RepasoArray.RetornarRandom();
        ListadoNumerosMain = RepasoArray.RetornarArrayDeRandomConCantidad(4);
        RepasoArray.MostrarArray(ListadoNumerosMain);
        int cantidadA = RepasoArray.RetornarCantidadDeAprobados(ListadoNumerosMain);
        int cantidadB = RepasoArray.RetornarCantidadDeDesaprobados(ListadoNumerosMain);
        float promedio = RepasoArray.RetornarPromedio(ListadoNumerosMain);

        int[] notasUBA = RepasoArray.RetornarArrayDeRandomConCantidad(3);
        int[] notasUTN = RepasoArray.RetornarArrayDeRandomConCantidad(3);
//        String resultado = RepasoArray.RetornarQuienTieneMejorPromedio(notasUBA, notasUTN);
//        System.out.println(resultado);

//        int[] MejoresNotas = RepasoArray.retornarMejoresNotasArray(notasUTN, notasUBA);
//        for (int i = 0; i < MejoresNotas.length; i++) {
//            System.out.print(" " + MejoresNotas[i] + " ");
//        }
        
        int MejorNota = RepasoArray.RetornarMejorNota(notasUTN);
        System.out.println("La mejor es: "+MejorNota);
        
        int PeorNota = RepasoArray.RetornarPeorNota(notasUTN);
        System.out.println("La peor es: "+PeorNota);
        
        String[] Nombres = RepasoArray.RetornarNombresRandom();
        for (int i = 0; i < Nombres.length; i++) {
            System.out.println(Nombres[i]);
        }
    }

    public static String[] RetornarNombresRandom(){
        String[]datos= new String [10];
        String[]nombres={"rogelio","alfredo","julieta","miguel","jose","maria","tina","cristina","elton","jorge"};
        String[]apellidos={"agua","mercurio","roberto","zorro","perez","sosa","giratoria","aguilera","jon","miguel"};
        for (int i = 0; i < datos.length; i++) {
            datos[i]=nombres[i]+" "+apellidos[i];
        }
        return datos;
    }
    
    public static int RetornarPeorNota(int[] uno) {
        int peor = 0;
        for (int i = 0; i < uno.length; i++) {
            if (i == 0) {
                peor = uno[i];
            } else {
                if (uno[i] < peor) {
                    uno[i] = peor;
                }
            }
        }
        return peor;
    }

    public static int RetornarMejorNota(int[] uno) {
        int mejor = 0;
        for (int i = 0; i < uno.length; i++) {
            if (i == 0) {
                mejor = uno[i];
            } else  {
                if (uno[i] > mejor) {
                    uno[i] = mejor;
                }
            }
        }
        return mejor;
    }

    public static int[] retornarMejoresNotasArray(int[] uno, int[] dos) {
        int[] retorno = new int[uno.length];
        for (int i = 0; i < uno.length; i++) {
            if (uno[i] > dos[i]) {
                retorno[i] = uno[i];
            } else {
                retorno[i] = dos[i];
            }
        }
        return retorno;
    }

    /**
     * Los parametros son dos arrays de enteros.
     *
     * @return retorna "El primero tiene mejor promedio" o "El segundo tiene el
     * mejor promedio", segun quien tenga el mejor promedio de los dos arrays de
     * notas.
     */
    public static String RetornarQuienTieneMejorPromedio(int[] PrimerArray, int[] SegundoArray) {
        String retorno = "El primero tiene mejor promedio";
        float PrimerPromedio;
        float SegundoPromedio;
        PrimerPromedio = RepasoArray.RetornarPromedio(PrimerArray);
        SegundoPromedio = RepasoArray.RetornarPromedio(SegundoArray);
        if (PrimerPromedio < SegundoPromedio) {
            retorno = "El segundo tiene mejor promedio";
        }
        return retorno;
    }

    public static float RetornarPromedio(int[] notas) {
        float promedio = 0;
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        promedio = (float) suma / (float) notas.length;
        return promedio;
    }

    public static int RetornarCantidadDeDesaprobados(int[] listadoDeNotas) {
        int retorno = 0;
        for (int i = 0; i < listadoDeNotas.length; i++) {
            if (listadoDeNotas[i] < 4) {
                retorno++;
            }
        }
        return retorno;
    }

    public static int RetornarCantidadDeAprobados(int[] listadoDeNotas) {
        int retorno = 0;
        for (int i = 0; i < listadoDeNotas.length; i++) {
            if (listadoDeNotas[i] > 3) {
                retorno++;
            }
        }
        return retorno;
    }

    public static int[] RetornarArrayDeRandomConCantidad(int cantidad) {
        int[] arrayRetorno = new int[cantidad];
        for (int i = 0; i < arrayRetorno.length; i++) {
            arrayRetorno[i] = RepasoArray.RetornarRandom();
        }
        return arrayRetorno;
    }

    public static void MostrarArray(int[] parametroArray) {
        for (int i = 0; i < parametroArray.length; i++) {
            System.out.println("Numero " + i + ": " + parametroArray[i]);
        }
    }

    public static int[] RetornarArrayDeRandom() {
        int[] retorno = new int[10];
        for (int i = 0; i < retorno.length; i++) {
            retorno[i] = RepasoArray.RetornarRandom();
        }
        return retorno;
    }

    public static int RetornarRandom() {
        int NumeroRandom = 0;
        double randomAux = Math.random();
        randomAux *= 10;
        NumeroRandom = (int) randomAux;
        return NumeroRandom;
    }

    public static int[] RetornarArray() {
        int[] arraynuevo = {2, 3, 5};
        return arraynuevo;
    }

    public static void CrearArray() {
        int[] arrayDeNumeros;
        arrayDeNumeros = new int[3];
        arrayDeNumeros[0] = 55;
        arrayDeNumeros[2] = 33;
        arrayDeNumeros[1] = -22;
        //arrayDeNumeros[3]=99;
        //Da error out of bounds, sobrepasa el limite del array.
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3.

        int[] arraynuevo = {2, 3, 5};
    }

}
