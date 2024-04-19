package TEMA01;

import java.util.HashMap;
import java.util.Map;

public class Principal4 {

    public static void main(String[] args) {
        //COLECCION GUARDADA EN UN VECTOR
        String[] registros = {
            "E1;Luis;21;1.71;true",
            "E2;Miguel;22;1.72;false",
            "E3;Carlos;23;1.73;true"
        };

        Map<Integer, Empleado1> empleados_hm = obtenerHashMapFromVector(registros);
   
        recorrerColeccion(empleados_hm);
        
        System.out.println("BUSCAR UN EMPLEADO(OBJETO)");
        int clave = 3;
        Empleado1 valor = empleados_hm.get(clave);
        System.out.println("Clave: " + clave);
        System.out.println("Valor: " + valor);
    }

    //DEVUELVE UNA COLECCION HASHMAP
    public static Map<Integer, Empleado1> obtenerHashMapFromVector(String[] registros) {
        Map<Integer, Empleado1> empleados_hm = new HashMap<>();
        for (int i = 0; i < registros.length; i++) {
            String[] p = registros[i].split(";");
            Empleado1 empleado = new Empleado1(p[0],
                    p[1],
                    Integer.parseInt(p[2]),
                    Double.parseDouble(p[3]),
                    Boolean.parseBoolean(p[4]));
            empleados_hm.put((i+1), empleado);
        }
        return empleados_hm;
    }
    
    public static void recorrerColeccion(Map<Integer, Empleado1> empleados_hm) {
       for(Map.Entry m : empleados_hm.entrySet()) {
           System.out.println("Clave: " + m.getKey());
           System.out.println("Valor: " + m.getValue());
       }
    }     

}

class Empleado1 {

    public String id;
    public String nombre;
    public int edad;
    public double estatura;
    public boolean casado;

    public Empleado1() {
    }

    public Empleado1(String id, String nombre, int edad, double estatura, boolean casado) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.casado = casado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + ", casado=" + casado + '}';
    }

}
