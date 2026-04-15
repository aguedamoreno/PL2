package es.uah.matcomp.pl2.a;

import java.io.File;
import java.util.Scanner;

public class ej_dos_1_6 {
    public static void main(String[] args) {
        Scanner lector = null;
        try {
            System.out.println("Intentando leer el archivo de configuración...");
            lector = new Scanner(new File("ajustes.txt"));
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Aviso: El archivo no se encontró, se usarán valores por defecto.");
        } finally {
            System.out.println("Bloque finally: Cerrando recursos de lectura...");
            if (lector != null) {
                lector.close();
            }
        }
    }
}
