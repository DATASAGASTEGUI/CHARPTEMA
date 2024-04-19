package TEMA06;


public class Cliente {
   
    private int idCliente;
    private String empresa;
    private int idVendedor;
    private double limite_credito;

    public Cliente() {
        this.idCliente = 0;
        this.empresa = "";
        this.idVendedor = 0;
        this.limite_credito = 0.0;
    }

    public Cliente(int idCliente, String empresa, int idVendedor, double limite_credito) {
        this.idCliente = idCliente;
        this.empresa = empresa;
        this.idVendedor = idVendedor;
        this.limite_credito = limite_credito;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public double getLimite_credito() {
        return limite_credito;
    }

    public void setLimite_credito(double limite_credito) {
        this.limite_credito = limite_credito;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", empresa=" + empresa + ", idVendedor=" + idVendedor + ", limite_credito=" + limite_credito + '}';
    }

    
    
    
    
}
