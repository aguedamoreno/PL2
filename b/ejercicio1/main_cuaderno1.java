
package es.uah.matcomp.pl2.b.ejercicio1;

import es.uah.matcomp.pl2.b.GsonUtilEjemplo;
import es.uah.matcomp.pl2.b.ejercicio1.Account;
import es.uah.matcomp.pl2.b.ejercicio1.Ball;

public class main_cuaderno1 {

    public static void main(String[] args) {
        // Validamos que pases parámetros: init/show y el nombre del archivo
        if (args.length < 2) {
            System.out.println("Uso: init/show nombre_archivo.json");
            return;
        }

        String operacion = args[0];
        String rutaFichero = args[1];

        if (operacion.equals("init")) {
            // Paso guardar
            // Creamos los objetos de los ejercicios anteriores del cuaderno 1
            Account acc = new Account("777", "MiCuenta", 1000);
            Ball pelota = new Ball(10.0f, 5.0f, 2, 1.1f, 1.1f);

            // Los guardamos usando la utilidad que ya tenemos hecha
            GsonUtilEjemplo.guardarObjetoEnArchivo("cuenta_" + rutaFichero, acc);
            GsonUtilEjemplo.guardarObjetoEnArchivo("pelota_" + rutaFichero, pelota);

            System.out.println("¡Objetos guardados en archivos JSON!");

        } else if (operacion.equals("show")) {
            // Paso leer
            // Cargamos los objetos desde el archivo
            Account accCargada = GsonUtilEjemplo.cargarObjetoDesdeArchivo("cuenta_" + rutaFichero, Account.class);
            Ball pelotaCargada = GsonUtilEjemplo.cargarObjetoDesdeArchivo("pelota_" + rutaFichero, Ball.class);

            if (accCargada != null && pelotaCargada != null) {
                System.out.println("--- DATOS RECUPERADOS ---");
                System.out.println("Saldo Account: " + accCargada.getBalance());
                System.out.println("Posición Ball X: " + pelotaCargada.getX());
            }
        }
    }
}