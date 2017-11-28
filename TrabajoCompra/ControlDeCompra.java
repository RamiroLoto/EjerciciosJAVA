/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controldecompra;


/**
 *
 * @author alumno
 */
public class ControlDeCompra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Articulo miarticulo;
        miarticulo = new Articulo("fanta", 666, 100, 3);
        System.out.println("Precio de venta: "+miarticulo.GetterPrecioVenta());
        
//        ArticuloComestible miarticulo2;
//        Date nueva = new Date();
//        miarticulo2 = new ArticuloComestible("alfajor", 9, 50, 2, nueva.toString());
        
        Comercio ElBolicheDeTony = new Comercio("Tony");
        
        
        Articulo miarticulo2;
        miarticulo2 = new Articulo("Sprite", 555, 80, 5);
        
        Articulo miarticulo3;
        miarticulo3 = new Articulo("fanta", 666, 80, 28);
        
        String Respuesta;
        /*
        compra
        */
        Respuesta = ElBolicheDeTony.Comprar(miarticulo, 3);
        System.out.println("respuesta: "+Respuesta);
        
        Respuesta = ElBolicheDeTony.Comprar(miarticulo2, 8);
        System.out.println("respuesta: "+Respuesta);
        
        Respuesta = ElBolicheDeTony.Comprar(miarticulo3, 8);
        System.out.println("respuesta: "+Respuesta);
        
        /*
        venta
        */
        
        Respuesta = ElBolicheDeTony.VenderArticulo(miarticulo, 10);
        System.out.println("respuesta: "+Respuesta);
    }
    
}
