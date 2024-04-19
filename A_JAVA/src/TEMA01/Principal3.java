package TEMA01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> dias_hm = new HashMap<>();
        dias_hm.put("Monday", "Lunes,Lundi");
        dias_hm.put("Tusday", "Martes,Mardi");
        dias_hm.put("Wednesday", "Miercoles,Mercredi");

        //RECUPERAR UN ELMENTO PARTICULAR POR SU CLAVE
        String clave = "Wednesday";
        String valor = dias_hm.get(clave);
        String[] partes = valor.split(",");

        System.out.println("Quieres en español=0/frances=1/español-frances=2");
        int x = sc.nextInt();//x=0, x=1

        if (x == 1 || x == 0) {
            System.out.println("Clave: " + clave);
            System.out.println("Valor: " + partes[x]);
        }else if(x == 2) {
            System.out.println("Clave: " + clave);
            System.out.println("Valor: " + valor);
        }else {
            System.out.println("ENTRADA INCORRECTA");
        }
    }

}

/*
Monday    Lunes
Tusday    Martes
Wednesday Miercoles


 */
