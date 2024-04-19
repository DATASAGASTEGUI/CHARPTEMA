package misrc;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

public class Principal {

    // PASO 1: CONEXION AL SERVIDOR MONGODB (HOST - PUERTO)
    static MongoClient cliente = new MongoClient("localhost", 27017);
    // PASO 2: CONEXION A LA BASE DE DATOS
    static MongoDatabase conexion = cliente.getDatabase("personasDB");
    // PASO 3: CONEXION CON LA COLECCION 
    static MongoCollection<Document> coleccion = conexion.getCollection("persona");

    public static void main(String[] args) {

        System.out.println("OK");
        List<Persona> personas_al = obtenerListaPersonasFromMongodb();
        for(Persona persona: personas_al) {
            System.out.println(persona);
        }

    }

    public static List<Persona> obtenerListaPersonasFromMongodb() {
        FindIterable<Document> coleccion_personas = coleccion.find();
        List<Persona> personas_al = new ArrayList<>();

        for (Document documento : coleccion_personas) {
            String idPersona = documento.getString("idPersona");
            String nombre = documento.getString("nombre");
            int edad = documento.getInteger("edad");
            double estatura = documento.getDouble("estatura");
            boolean casado = documento.getBoolean("casado");
            String sexo = documento.getString("sexo");
            Document direccionDoc = (Document) documento.get("direccion");
            String calle = direccionDoc.getString("calle");
            int numero = direccionDoc.getInteger("numero");
            String ciudad = direccionDoc.getString("ciudad");
            Direccion direccion = new Direccion(calle, numero, ciudad);

            List<String> hobbies_al = (List<String>) documento.get("hobbies");

            String[] hobbies = hobbies_al.toArray(new String[0]);
            Persona persona = new Persona(idPersona,
                    nombre,
                    edad,
                    estatura,
                    casado,
                    sexo,
                    direccion,
                    hobbies);
            personas_al.add(persona);
        }

        return personas_al;
    }
    
    /*
    public static List<Persona> obtenerListaPersonasFromArchivoJsonPorCiudad(String ciudad) {
        List<Persona> personasporciudad_al = new ArrayList<>();
        MongoIterable<String> distintasCiudades = coleccion.distinct("direccion.ciudad", String.class);
        for (String ciudad : distintasCiudades) {
            personasporciudad_al.add(ciudad);
        }        
        
        
        List<TEMA04.Persona> personasporciudad_al = new ArrayList<>();
        List<TEMA04.Persona> personas_al = obtenerListaPersonasFromArchivoJson("data/personas.json");
        for(TEMA04.Persona persona: personas_al) {
            if(persona.getDireccion().getCiudad().equalsIgnoreCase(ciudad)) {
               personasporciudad_al.add(persona);
            }
        }
        return personasporciudad_al;
    }   
*/

}
