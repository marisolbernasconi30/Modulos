package productos;
/*
Estoy aprendiendo modulos entre paquetes en Java
esto es un ejercicio simple de una clase con sus atributos y metodos get y set
*/
public class ListadoProductos {

    public String getCodigoArticulo() {
        return CodigoArticulo;
    }
    public void setCodigoArticulo(String codigoArticulo) {
        CodigoArticulo = codigoArticulo;
    }
    public String getArticulo() {
        return Articulo;
    }
    public void setArticulo(String articulo) {
        Articulo = articulo;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        Precio = precio;
    }
    private String CodigoArticulo;
    private String Articulo;
    private double Precio;
}
