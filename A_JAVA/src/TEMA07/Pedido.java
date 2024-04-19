package TEMA07;

public class Pedido {

    private int idPedido;
    private int idVendedor;
    private int idCliente;
    private String idFabrica;
    private String idProducto;
    private String fechaPedido;
    private int cantidad;
    private double importe;

    public Pedido() {
    }

    public Pedido(int idPedido, int idVendedor, int idCliente, String idFabrica, String idProducto, String fechaPedido, int cantidad, double importe) {
        this.idPedido = idPedido;
        this.idVendedor = idVendedor;
        this.idCliente = idCliente;
        this.idFabrica = idFabrica;
        this.idProducto = idProducto;
        this.fechaPedido = fechaPedido;
        this.cantidad = cantidad;
        this.importe = importe;
    }

    public Pedido(int idPedido, int idVendedor, int idCliente, String idFabrica, String idProducto, int cantidad, double importe) {
        this.idPedido = idPedido;
        this.idVendedor = idVendedor;
        this.idCliente = idCliente;
        this.idFabrica = idFabrica;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.importe = importe;
    }
    
    

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", idVendedor=" + idVendedor + ", idCliente=" + idCliente + ", idFabricar=" + idFabrica + ", idProducto=" + idProducto + ", fechaPedido=" + fechaPedido + ", cantidad=" + cantidad + ", importe=" + importe + '}';
    }

}
