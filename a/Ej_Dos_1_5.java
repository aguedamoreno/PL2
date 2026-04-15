package es.uah.matcomp.PL2.A;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ej_Dos_1_5 {

    public static void metodoD(int opcion) throws FileNotFoundException, IOException {
        if (opcion == 1) {
            throw new FileNotFoundException("No se ha encontrado el archivo");
        }
        if (opcion == 2) {
            throw new IOException("Error de entrada/salida");
        }
        System.out.println("Todo ha ido bien en metodoD()");
    }

    public static void metodoC(int opcion) {
        try {
            // Llamamos al metodo que puede lanzar excepciones
            metodoD(opcion);

        } catch (FileNotFoundException ex) {
            System.out.println("Capturada FileNotFoundException");
            System.out.println(ex.getMessage());

        } catch (IOException ex) {
            System.out.println("Capturada IOException");
            System.out.println(ex.getMessage());

        } finally {
            System.out.println("Fin del try-catch");
        }
    }
}
