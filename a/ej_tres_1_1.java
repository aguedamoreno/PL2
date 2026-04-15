package es.uah.matcomp.pl2.a;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ej_tres_1_1 {
    public static void leerArchivo() throws FileNotFoundException {
        Scanner lector = new Scanner(new File("configuracion.xml"));
    }

    public static void main(String[] args) {
        try {
            leerArchivo();
        } catch (FileNotFoundException e) {
            System.out.println("El método leerArchivo falló porque el archivo no existe.");
        }
    }
}





