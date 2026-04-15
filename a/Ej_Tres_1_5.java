package es.uah.matcomp.PL2.A;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ej_Tres_1_5 {
    public static void metodoD(int opcion) throws FileNotFoundException, IOException {
        if (opcion == 1) {
            throw new FileNotFoundException("Archivo no encontrado");
        }

        if (opcion == 2) {
            throw new IOException("Error de lectura");
        }

        System.out.println("metodoD() ejecutado correctamente");
    }
    public static void metodoC(int opcion) throws FileNotFoundException, IOException {
        // No capturamos la excepción aquí
        // La dejamos subir
        metodoD(opcion);
    }
}
