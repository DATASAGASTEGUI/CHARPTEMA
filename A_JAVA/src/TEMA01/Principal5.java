    package TEMA01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Principal5 {

    public static void main(String[] args) {        
        Map<Object, Object> empleado_hm = new HashMap<>();
        
        empleado_hm.put("idEmpleado", "E1");
        empleado_hm.put("nombre", "Luis");
        empleado_hm.put("edad", 21);
        empleado_hm.put("estatura", 1.72);
        empleado_hm.put("casado", true);
        
        System.out.println("RECUPERAR TODAS LAS CLAVES");
        System.out.println("--------------------------");
        
        Set<?> claves_set = empleado_hm.keySet();

        for (Object clave : claves_set) {
            System.out.println(clave);
        }
        
        System.out.println("RECUPERAR TODOS LOS VALORES");
        System.out.println("---------------------------");
        
        Collection<?> valores_set = empleado_hm.values();

        for (Object valor : valores_set) {
            System.out.println(valor);
        }
    }

}
