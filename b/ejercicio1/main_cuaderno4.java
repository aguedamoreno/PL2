package es.uah.matcomp.pl2.b.ejercicio1;

import es.uah.matcomp.pl2.b.GsonUtilEjemplo;
import es.uah.matcomp.pl2.b.ejercicio1.MovablePoint;
import es.uah.matcomp.pl2.b.ejercicio1.Rectanglee;


public class main_cuaderno4 {
    public static void main(String[] args) {
        // 1. Validar que tenemos los argumentos (init/show y nombre del archivo)
        if (args.length < 2) {
            System.out.println("Faltan parámetros. Uso: init/show nombre_archivo.json");
            return;
        }

        String operacion = args[0];
        String rutaFichero = args[1];

        if (operacion.equals("init")) {
            // guardamos los objetos
            MovablePoint punto = new MovablePoint(10, 20, 5, 5);
            Rectanglee rect = new Rectanglee(4.0, 8.0);


            GsonUtilEjemplo.guardarObjetoEnArchivo("punto_" + rutaFichero, punto);
            GsonUtilEjemplo.guardarObjetoEnArchivo("rect_" + rutaFichero, rect);

            System.out.println("¡Objetos MovablePoint y Rectanglee guardados!");

        } else if (operacion.equals("show")) {
            // leemos los objetos
            MovablePoint pCargado = GsonUtilEjemplo.cargarObjetoDesdeArchivo("punto_" + rutaFichero, MovablePoint.class);
            Rectanglee rCargado = GsonUtilEjemplo.cargarObjetoDesdeArchivo("rect_" + rutaFichero, Rectanglee.class);

            if (pCargado != null && rCargado != null) {
                System.out.println("--- DATOS RECUPERADOS ---");
                System.out.println("Punto: " + pCargado.toString());
                System.out.println("Rectángulo -> Área: " + rCargado.getArea());
            } else {
                System.out.println("Error al cargar los archivos.");
            }
        }
    }
}