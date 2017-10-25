/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosarray;

/**
 *
 * @author alumno
 */
public class EjemplosArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InvertirOrden();
    }

    public static void PrimerEjemplo() {
        int[] numeros;
        int MasNumeros[] = {33, 77, 55, 11};
        int[] otrosNumeros;

        numeros = new int[4];
        numeros[0] = 99;
        numeros[1] = 22;
        numeros[2] = 11;
        numeros[3] = 0;
        //numeros[4]=10; da error, una excepcion. 

        otrosNumeros = new int[10];
        int largo = otrosNumeros.length;
        System.out.println("largo es " + largo);
        for (int i = 0; i < otrosNumeros.length; i++) {
            otrosNumeros[i] = i * 3;
        }
    }

    public static void SegundoEjemplo() {
        int[] numerosPares = new int[20];
        int indice = 0;
        for (int contador = 0; contador < numerosPares.length; contador++) {
            if (contador % 2 == 0) {
                numerosPares[indice] = contador;
                indice++;
            }
        }

        for (int i = 1; i < 10; i++) {
            System.out.println("El par numero " + i + " es: " + numerosPares[i]);
        }
    }

    public static void TercerEjemplo() {
        int PrimerArray[] = {3, 5, 7};
        int SegundoArray[] = {8, 6, 2};
        int TercerArray[] = new int[3];

        for (int i = 0; i < 3; i++) {
            if (PrimerArray[i] > SegundoArray[i]) {
                TercerArray[i] = PrimerArray[i];
            } else {
                TercerArray[i] = SegundoArray[i];
            }
        }
        System.out.println(TercerArray[0] + TercerArray[1] + TercerArray[2]);
    }

    public static void InvertirOrden() {
//        int arrayInicial[] = {33, 77, 55, 11};
//        int ResultadoArray[] = new int[arrayInicial.length];
//        int indice = 0;
//        for (int i = arrayInicial.length-1; i > -1; i--) {
//            ResultadoArray[indice] = arrayInicial[i];
//            indice++;
//        }
//        for (int i = 0; i < ResultadoArray.length; i++) {
//            System.out.print(" "+ResultadoArray[i]);
//        }
        
        int arrayInicial[] = {33, 77, 55, 11};
        int resultadoArray[];
        int largo=arrayInicial.length;
        resultadoArray=new int[largo];
        for (int i = 0; i < largo; i++) {
            resultadoArray[largo-1-i]=arrayInicial[i];
        }
        for (int i = 0; i < resultadoArray.length; i++) {
            System.out.print(" "+resultadoArray[i]);
        }

        
    }

    public static void sacarElMayor() {
        int arrayInicial[] = {33, 77, 55, 11};
        int maximo = 0;
        for (int i = 0; i < arrayInicial.length; i++) {
            if (i == 0) {
                maximo = arrayInicial[i];
            }
            if (maximo < arrayInicial[i]) {
                maximo = arrayInicial[i];
            }

        }
        System.out.println("Mayor es " + maximo);
    }
    
    public static void SacarMenor(){
        int arrayInicial[] = {33, 77, 55, 11};
        int menor = 0;
        for (int i = 0; i < arrayInicial.length; i++) {
            if (i == 0) {
                menor = arrayInicial[i];
            }
            if (menor > arrayInicial[i]) {
                menor = arrayInicial[i];
            }

        }
        System.out.println("Menor es " + menor);
    
    }
    
    public static void SacarSuma(){
        int arrayInicial[] = {33, 77, 55, 11};
        int suma=0;
        for (int i = 0; i < arrayInicial.length; i++) {
            suma+=arrayInicial[i];
        }
        System.out.println("La suma es: "+suma);
    }
    
    public static void SacarPromedio(){
        int arrayInicial[] = {33, 77, 55, 11};
        int suma=0;
        int promedio;
        for (int i = 0; i < arrayInicial.length; i++) {
            suma+=arrayInicial[i];
        }
        promedio=suma/arrayInicial.length;
        System.out.println("El promedio es: "+promedio);
    }
}
