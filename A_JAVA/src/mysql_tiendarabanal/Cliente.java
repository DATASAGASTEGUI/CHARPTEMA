package mysql_tiendarabanal;

public class Cliente {

    private int codigo;
    private String nombre;
    private String domicilio;

    public Cliente() {
    }

    public Cliente(int codigo, String nombre, String domicilio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.domicilio = domicilio;
    }

    public Cliente(int codigo) {
        this.codigo = codigo;
    }

    public Cliente(String nombre, String domicilio) {
        this.nombre = nombre;
        this.domicilio = domicilio;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nombre=" + nombre + ", domicilio=" + domicilio + '}';
    }
    
    public static void cabecera() {
        System.out.printf("%6s  %-13s  %-15s\n","CODIGO","NOMBRE","DOMICILIO");
        System.out.printf("%6s  %-13s  %-15s\n","------","------","---------");
    }
    
    public void cuerpo() {
        System.out.printf("%6d  %-13s  %-15s\n",codigo,nombre,domicilio);
    }

}
