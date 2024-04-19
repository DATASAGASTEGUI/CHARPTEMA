package mysql_tiendarabanal;

import java.io.IOException;
import java.util.Scanner;

public class Util {

    public static int validarEntradaEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        String patron = "[0-9]+";
        boolean correcto;
        String n;
        do {
            System.out.print(mensaje);
            n = sc.next();
            correcto = n.matches(patron);
            if (!correcto) {
                System.out.println("Error: Entrada Incorrecta");
            }
        } while (!correcto);
        return Integer.parseInt(n);
    }

    public static void pause() {
        try {
            System.out.print("\nPresiona una tecla para continuar...");
            System.in.read();
        } catch (IOException e) {
        }
    }

    public static void cls() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
