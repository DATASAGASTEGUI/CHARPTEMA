package TEMA01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal1 {

    public static void main(String[] args) {
       //DECLARAR UNA COLECCION HASHMAP
       Map<Integer, String>     frutas_hm  = new HashMap<Integer,String>();
       //LLENAR LA COLECCION
       frutas_hm.put(1,"Mango");
       frutas_hm.put(2,"Manzana");
       frutas_hm.put(3,"Uva");
       frutas_hm.put(1,"Fresa");//La clave no se puede repetir
       System.out.println("RECORRER LA COLECCION");
       recorrerColeccion(frutas_hm);
       System.out.println("MODIFICAR UN ELEMENTO DE LA COLECCION");
       frutas_hm.put(3,"Naranja");
       System.out.println("RECORRER LA COLECCION");
       recorrerColeccion(frutas_hm);
       System.out.println("RECUPERAR EL VALOR DE UNA CLAVE");
       int clave = 5;
       String valor = frutas_hm.get(clave);
       if(valor != null) {
          System.out.println("Clave: " + clave);
          System.out.println("Valor: " + valor);
       }else {
           System.out.println("La clave no existe");
       }
 
    }
    
    public static void recorrerColeccion(Map<Integer, String> frutas_hm) {
       for(Map.Entry m : frutas_hm.entrySet()) {
           System.out.println("Clave: " + m.getKey());
           System.out.println("Valor: " + m.getValue());
       }
    }    
    
}
