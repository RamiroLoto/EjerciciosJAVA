/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofacturacion;

import java.util.Objects;

/**
 *
 * @author alumno
 */
public class Venta {

    public Persona elCliente;
    public Persona elEmpleado;
    public Producto productoVendido;
    public Producto[] ListadoProducto;

    public Venta() {
        this.ListadoProducto = new Producto[3];

    }

    private int RetornarPrimerLugarLibre() {
        int retorno = -1;

        for (int i = 0; i < this.ListadoProducto.length; i++) {
            if (Objects.isNull(this.ListadoProducto[i]) == true) {
                retorno = i;
                return retorno;
            }
        }

        return retorno;
    }

    public void CargarProductos(Producto unProductoAgregar) {
        int indice;
        indice = this.RetornarPrimerLugarLibre();

        if (indice > -1) {
            this.ListadoProducto[indice] = unProductoAgregar;
        } else {
            System.out.println("No hay lugar");
        }

        /* Innecesario
        if (Objects.isNull(this.ListadoProducto[0]) == true) {
            this.ListadoProducto[0] = unProductoAgregar;
        } else {
            if (Objects.isNull(this.ListadoProducto[1]) == true) {
                this.ListadoProducto[1] = unProductoAgregar;
            } else {
                if (Objects.isNull(this.ListadoProducto[2]) == true) {
                    this.ListadoProducto[2] = unProductoAgregar;
                } else {
                    System.out.println("No hay mas lugar");
                }
            }
        }*/
    }

    public void MostrarVenta() {
        System.out.println("El empleado es: ");
        elEmpleado.MostrarPersona();
        System.out.println("El cliente es: ");
        elCliente.MostrarPersona();
        System.out.println("El producto es: ");
        //productoVendido.MostrarProducto();
        for (int i = 0; i < this.ListadoProducto.length; i++) {
            if (Objects.isNull(this.ListadoProducto[i]) == false) {
                this.ListadoProducto[i].MostrarProducto();
            }

        }

        float aux = 0;
        //aux= productoVendido.DamePrecioFinal();
        //(MAL:)aux= this.ListadoProducto[0].DamePrecioFinal()+this.ListadoProducto[1].DamePrecioFinal()+this.ListadoProducto[2].DamePrecioFinal();

        for (int i = 0; i < this.ListadoProducto.length; i++) {
            if (Objects.isNull(this.ListadoProducto[i]) == false) {
                aux += this.ListadoProducto[i].DamePrecioFinal();
            }
        }

        System.out.println("El importe a pagar es: " + aux);
    }
}
