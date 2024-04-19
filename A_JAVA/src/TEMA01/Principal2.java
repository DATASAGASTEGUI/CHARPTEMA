package TEMA01;

import java.util.HashMap;
import java.util.Map;

public class Principal2 {

    public static void main(String[] args) {
       Map<Integer, Empleado> empleados_hm = new HashMap<>();
       empleados_hm.put(1, new Empleado());
       empleados_hm.put(2, new Empleado("E2","Miguel",1999));
       
       int clave = 1;
       Empleado valor = empleados_hm.get(clave);
       System.out.println("Clave: " + clave);
       System.out.println("Valor: " + valor);
       
       //RECORRER LA COLECCION
       recorrerColeccion(empleados_hm);
    }
    
    public static void recorrerColeccion(Map<Integer, Empleado> empleados_hm) {
       for(Map.Entry m : empleados_hm.entrySet()) {
           System.out.println("Clave: " + m.getKey());
           System.out.println("Valor: " + m.getValue());
       }
    }    
    
}



class Empleado {
    public String id = "E1";
    public String nombre = "Luis";
    public double sueldo = 2500;

    public Empleado() {
    }
    
    public Empleado(String id, String nombre, double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
    
    
}


