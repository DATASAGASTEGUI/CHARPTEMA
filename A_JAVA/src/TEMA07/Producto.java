package TEMA07;

public class Producto {

    private String idFabrica;
    private String idProducto;
    private String descripcion;
    private double precio;
    private int existencia;

    public Producto() {
        this.idFabrica = "";
        this.idProducto = "";
        this.descripcion = "";
        this.precio = 0.0;
        this.existencia = 0;
    }

    public Producto(String idFabrica, String idProducto, String descripcion, double precio, int existencia) {
        this.idFabrica = idFabrica;
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencia = existencia;
    }

    public String getIdFabrica() {
        return idFabrica;
    }

    public void setIdFabrica(String idFabrica) {
        this.idFabrica = idFabrica;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    @Override
    public String toString() {
        return "Producto{" + "idFabrica=" + idFabrica + ", idProducto=" + idProducto + ", descripcion=" + descripcion + ", precio=" + precio + ", existencia=" + existencia + '}';
    }

}
