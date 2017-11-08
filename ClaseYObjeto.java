/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseyobjeto;

import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class ClaseYObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1era parte
//        int edad;
//        
//        //esto es estatico
//        edad = 33;
//        Calculadora.mostrarEstatico(edad);
//        
//        //esto es de instancia 
//        Calculadora miCal = new Calculadora();
//        miCal.mostrarInstancia();
        int numero;
        String dato;
        Alumno nuevoAlumno;
        nuevoAlumno = new Alumno();

        Alumno[] arrayAlumnos;
        arrayAlumnos = new Alumno[10];

        Alumno aux1 = new Alumno();
        aux1.SetNombre("nombre 1");

        Alumno aux2 = new Alumno();
        aux1.SetNombre("nombre 2");

        Alumno aux3 = new Alumno();
        aux1.SetNombre("noombre 3");

        arrayAlumnos[0] = aux1;
        arrayAlumnos[1] = aux2;
        arrayAlumnos[2] = aux3;

//        for (int i = 0; i < 10; i++) {
//            arrayAlumnos[i] = new Alumno();
//            //String Dato = "nombre 1";
//            String nombre = GenerarRandom.DameUnNombre();
//            int edad = GenerarRandom.DameUnaEdad();
//            arrayAlumnos[i].SetNombre(nombre);
//        }
//
//        for (int i = 0; i < arrayAlumnos.length; i++) {
//            arrayAlumnos[i].MostrarInstanciaAlumno();
//        }

//        Usuario unUsuario;
//        unUsuario = new Usuario();
//        
//        unUsuario.DameNombre("Natalia Natalia");
//        unUsuario.DameClave("666");
//        System.out.println("el nombre es: "+unUsuario.GetNombre());
//        
//        unUsuario.mostrarDatos();
        
        Scanner misc = new Scanner(System.in);
        Alumno NuevoAlumno;
        NuevoAlumno = new Alumno();
        String Aux;

        System.out.println("Ingrese nombre");
        NuevoAlumno.SetNombre(misc.next());
        
        System.out.println("Ingrese apellido");
        NuevoAlumno.SetApellido(misc.next());
        
        System.out.println("Ingrese correo");
        NuevoAlumno.SetCorreo(misc.next());
        
        System.out.println("Ingrese sexo");
        NuevoAlumno.SetSexo(misc.next());
        
        System.out.println("Ingrese fecha de nacimiento");
        NuevoAlumno.SetFechaNac(misc.next());
        
        System.out.println("Ingrese localidad");
        NuevoAlumno.SetLocalidad(misc.next());
        
        System.out.println("Ingrese direccion");
        NuevoAlumno.SetDireccion(misc.next());
        
        System.out.println("Ingrese legajo");
        Aux = misc.next();
        
        NuevoAlumno.SetLegajo(Aux);
        System.out.println("Ingrese dni");
        
        Aux = misc.next();
        NuevoAlumno.SetDNI(Aux);

        NuevoAlumno.mostrarDatos();
    }
}
