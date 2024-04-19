package TEMA03;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        String rutaRelativa = "data/usuarios.json";

        try {
            String json = new String(Files.readAllBytes(Paths.get(rutaRelativa)));
             Gson gson = new Gson();
            List<Empleado> empleados_al = gson.fromJson(json, new TypeToken<List<Empleado>>() {
            }.getType());
            
            System.out.println("IMPRESION DEL JSON COMO TEXTO");
            System.out.println("-----------------------------");
            System.out.println(json); 
            
            System.out.println("IMPRIMIR LOS ATRIBUTOS DE CADA OBJETO");
            System.out.println("-------------------------------------");            
            for(Empleado empleado: empleados_al) {
                System.out.println(empleado);
            }
            
            System.out.println("COMO SE LLAMA EL EMPLEADO CUYO ID ES 'E2'");
            System.out.println("-----------------------------------------");
            for(Empleado empleado: empleados_al) {
                if(empleado.getIdEmpleado().equalsIgnoreCase("E2")) {
                   System.out.println("Nombre: " + empleado.getNombre());
                }
            }            

        } catch (Exception e) {
            System.out.println("ERROR: LECTURA JSON");
        }

    }

}
