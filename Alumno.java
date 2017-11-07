/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocalseyobjetos;

/**
 *
 * @author alumno
 */
public class Alumno {
    /**nombre > 3 letras o "nn", 
      *apellido > 3 letras o "nn", 
      * correo > 8 letras o "nn", 
      * sexo f o m o "esta mal", 
      * fecha de nacimiento, 
      * localidad > 4 letras o "mal localidad", 
      * direccion > 8 letras o "mal direccion", 
      * legajo de 6 caracteres o "mal", 
      * dni = 8 caracteres.
      * 
      * para la salidad todos los textos en mayusculas.
    //crear estos atributos y generar 10 objetos ALUMNOS.*/
        public String nombre, apellido, correo, sexo, fechaNac, localidad, direccion;
        public int legajo, dni;
    
        private String _nombre;
        private String _apellido;
        private String _correo;
        private String _sexo;
        private String _fechaNac;
        private String _localidad;
        private String _direccion;
        private String _legajo;
        private String _dni;
        //setter
        public void SetNombre(String unNombre){
            if(unNombre.length()<3){
                this._nombre="nn";
            }else{
                this._nombre = unNombre;}
        }
        //getter
        public String GetNombre(){
             return this._nombre.toUpperCase();
        }

        public void SetApellido(String unApellido){
            if(unApellido.length()<3){
                this._apellido="nn";
            }else{
                this._apellido = unApellido;}
        }
        //getter
        public String GetApellido(){
             return this._apellido.toUpperCase();
        }

        public void SetCorreo(String unCorreo){
            if(unCorreo.length()<8){
                this._correo="nn";
            }else{
                this._correo = unCorreo;}
        }
        //getter
        public String GetCorreo(){
             return this._correo.toUpperCase();
        }
        
        public void SetSexo(String unSexo){
            if(!unSexo.equals("m")||unSexo.equals("f")){
                this._sexo="Esta mal";
            }else{
                this._sexo = unSexo;}
        }
        
        public String GetSexo(){
             return this._sexo.toUpperCase();
        }
        
        public void SetFechaNac(String unaFecha){
            this._fechaNac = unaFecha;
        }
        
        public String GetFechaNac(){
             return this._fechaNac.toUpperCase();
        }
        
        public void SetLocalidad(String unaLocalidad){
            if(unaLocalidad.length()<4){
                this._localidad="mal localidad";
            }else{
                this._localidad = unaLocalidad;}
        }
        //getter
        public String GetLocalidad(){
             return this._localidad.toUpperCase();
        }
        
        public void SetDireccion(String unaDireccion){
            if(unaDireccion.length()<8){
                this._direccion="mal direccion";
            }else{
                this._direccion = unaDireccion;}
        }
        //getter
        public String GetDireccion(){
             return this._direccion.toUpperCase();
        }
        
        public void SetLegajo(String unLegajo){
            if(unLegajo.equals("8")){
                this._legajo="mal";
            }else{
                this._legajo = unLegajo;}
        }
        //getter
        public String GetLegajo(){
             return this._legajo;
        }
        
        public void SetDNI(String unDni){
            if(unDni.equals("8")){
                this._dni="mal";
            }else{
                this._dni = unDni;}
        }
        //getter
        public String GetDNI(){
             return this._dni;
        }
        
        public void mostrarDatos(){
        System.out.println("El nombre es: "+this.GetNombre());
        System.out.println("El apellido es: "+this.GetApellido());
        System.out.println("El correo es: "+this.GetCorreo());
        System.out.println("El sexo es: "+this.GetSexo());
        System.out.println("La fecha de nacimiento es: "+this.GetFechaNac());
        System.out.println("La localidad es: "+this.GetLocalidad());
        System.out.println("La direccion es: "+this.GetDireccion());
        System.out.println("El legajo es: "+this.GetLegajo());
        System.out.println("El dni es: "+this.GetDNI());
    }
        
        //estos 2 proximos metodos hacen exactamente lo mismo
        public void MostrarInstanciaAlumno(){
            //1er version
            System.out.println("Nombre: "+this._nombre);
            
            //2da version, este llama al static y el static muestra los atributos
            //Alumno.MostrarDatosAlumno(this);
            
        }
        
        public static void MostrarDatosAlumno(Alumno unAlguien){
            //System.out.println("nombre: "+unAlguien.GetNombre()); MAL
            //1er version BIEN
            unAlguien.MostrarInstanciaAlumno(); 
            
            //2da version, este muestra los atributos y el instance lo llama. Tambien BIEN.
            //System.out.println("nombre: "+unAlguien.GetNombre());
        }
    
    
    
    
}
