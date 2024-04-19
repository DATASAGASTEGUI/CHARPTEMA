package TEMA04;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
       String rutaRelativa = "data/personas.json";
       List<Persona> personas_al = MetodosJson.obtenerListaPersonasFromArchivoJson(rutaRelativa);
       for(Persona persona: personas_al) {
           System.out.println(persona);
       }
    }
    
}
