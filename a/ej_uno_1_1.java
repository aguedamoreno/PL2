package es.uah.matcomp.pl2.a;
import java.io.File;
import java.util.Scanner;

 public class ej_uno_1_1 {

    public static void ejecutar() {

        // Intento abrir un archivo directamente
        // No controlo la excepción → este ejemplo no compila a propósito
        Scanner lector = new Scanner(new File("datos.txt"));
    }
}

