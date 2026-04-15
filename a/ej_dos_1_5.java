package es.uah.matcomp.pl2.a;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ej_dos_1_5 {

    public static void ejecutar() {

        try {
            // código principal
            System.out.println("Inicio del proceso");

            Scanner lector = new Scanner(new File("datos.txt"));
            System.out.println("Archivo leído");

        } catch (FileNotFoundException e) {
            // si ocurre un error al abrir el archivo
            System.out.println("Error al abrir archivo");

        } finally {
            // esto se ejecuta siempre, haya error o no
            System.out.println("Fin del proceso");
        }
    }
}