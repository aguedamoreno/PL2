package es.uah.matcomp.PL2.A;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ej_Uno_1_6 {
    public static void main(String[] args) {
        try {
            // Lógica principal
            System.out.println("Inicio de la lógica principal");
            System.out.println("Intentando abrir un archivo...");

            Scanner entrada = new Scanner(new File("entrada.txt"));

            System.out.println("Archivo encontrado, procesándolo...");
            System.out.println("Fin de la lógica principal");

        } catch (FileNotFoundException ex) {
            // Manejo del error
            System.out.println("Se ha capturado FileNotFoundException");

        } finally {
            // Este bloque se ejecuta siempre
            System.out.println("Fin del try-catch");
        }
        // El programa continúa después
        System.out.println("Después del try-catch-finally, el programa sigue.");
    }
}
