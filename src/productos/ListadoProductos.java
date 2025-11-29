package productos;

import descuento.DescuentoDelPrecio;

/*
Estoy aprendiendo modulos entre paquetes en Java
esto es un ejercicio simple de una clase con sus atributos y metodos get y set
*/
public class ListadoProductos {

    public String getCodigoArticulo() {
        return CodigoArticulo;
    }
    public void setCodigoArticulo(String codigoArticulo) {
        this.CodigoArticulo = codigoArticulo;
    }
    public String getArticulo() {
        return Articulo;
    }
    public void setArticulo(String articulo) {
        this.Articulo = articulo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento(double precio){
        return DescuentoDelPrecio.calculaDescuento(this.precio);
    }
    private String CodigoArticulo;
    private String Articulo;
    private double precio;
}
