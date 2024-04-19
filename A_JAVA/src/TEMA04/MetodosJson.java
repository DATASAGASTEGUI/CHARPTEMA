package TEMA04;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MetodosJson {
    
    public static List<Persona> obtenerListaPersonasFromArchivoJsonPorCiudad(String ciudad) {
        List<Persona> personasporciudad_al = new ArrayList<>();
        List<Persona> personas_al = obtenerListaPersonasFromArchivoJson("data/personas.json");
        for(Persona persona: personas_al) {
            if(persona.getDireccion().getCiudad().equalsIgnoreCase(ciudad)) {
               personasporciudad_al.add(persona);
            }
        }
        return personasporciudad_al;
    }
    
    public static List<Persona> obtenerListaPersonasFromArchivoJson(String rutaRelativa) {
       List<Persona> personas_al = null; 
       try {
             if(Files.exists(Paths.get(rutaRelativa))) {
                String json = new String(Files.readAllBytes(Paths.get(rutaRelativa)));
                Gson gson = new Gson();
                personas_al = gson.fromJson(json, new TypeToken<List<Persona>>(){}.getType());
                //System.out.println(json);
             }else {
                 System.out.println("ERROR: ARCHIVO JSON NO EXISTE");
             }
       }catch(Exception e) {
           System.out.println("ERROR: LECTURA JSON" + e);
       }
       return personas_al;
    }
}
