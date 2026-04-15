package es.uah.matcomp.pl2.a;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ej_dos_1_1 {
    public static void main(String[] args) {
        try {
            Scanner lector = new Scanner(new File("datos_entrada.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Error: No se encuentra el archivo de datos.");
            // e.printStackTrace();
        }
    }
}




