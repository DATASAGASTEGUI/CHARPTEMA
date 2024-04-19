package TEMA02;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Principal1 {

    public static void main(String[] args) {
        String ruta_relativa = "data/usuario.json";
        Map<?, ?> usuarios_hm = null;
        Reader reader;
        Gson gson;
        try {
            System.out.println("MOSTRAR TODO EL TEXTO JSON");
            System.out.println("--------------------------");
            reader = Files.newBufferedReader(Paths.get(ruta_relativa));
            gson = new Gson();
            JsonElement jsonElement = JsonParser.parseReader(reader);
            String jsonString = gson.toJson(jsonElement);
            System.out.println(jsonString);
            
            reader = Files.newBufferedReader(Paths.get(ruta_relativa));
            gson = new Gson();
            usuarios_hm = gson.fromJson(reader, Map.class);

            System.out.println("RECUPERAR TODAS LAS CLAVES");
            System.out.println("--------------------------");

            Set<?> claves_set = usuarios_hm.keySet();

            for (Object clave : claves_set) {
                System.out.println(clave);
            }

            System.out.println("RECUPERAR TODOS LOS VALORES");
            System.out.println("---------------------------");

            Collection<?> valores_c = usuarios_hm.values();

            for (Object valor : valores_c) {
                System.out.println(valor.toString());
            }
            
            System.out.println("RECUPERAR UN VALOR POR LA CLAVE");
            System.out.println("-------------------------------");  
            
            String clave = "nombre";
            Object valor = usuarios_hm.get(clave);
            System.out.println("Clave: " + clave);
            System.out.println("Valor: " + valor);

            System.out.println("OK: LECTURA JSON");

        } catch (Exception e) {
            System.out.println("ERROR: LECTURA JSON");
        }

    }
}
