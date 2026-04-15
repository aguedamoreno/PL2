package es.uah.matcomp.pl2.b.ejercicio1;

import es.uah.matcomp.pl2.b.GsonUtilEjemplo;
import es.uah.matcomp.pl2.b.ejercicio1.Author;
import es.uah.matcomp.pl2.b.ejercicio1.MyPoint;


public class main_cuaderno2 {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Uso: init/show nombre_archivo.json");
            return;
        }

        String operacion = args[0];
        String rutaFichero = args[1];

        if (operacion.equals("init")) {

            // Crear objetos
            Author autor = new Author("Cris", "cris@gmail.com");
            MyPoint punto = new MyPoint(3, 5);

            // Guardar
            GsonUtilEjemplo.guardarObjetoEnArchivo("autor_" + rutaFichero, autor);
            GsonUtilEjemplo.guardarObjetoEnArchivo("punto_" + rutaFichero, punto);

            System.out.println("Objetos guardados en JSON");

        } else if (operacion.equals("show")) {

            // Cargar
            Author autorCargado = GsonUtilEjemplo.cargarObjetoDesdeArchivo("autor_" + rutaFichero, Author.class);
            MyPoint puntoCargado = GsonUtilEjemplo.cargarObjetoDesdeArchivo("punto_" + rutaFichero, MyPoint.class);

            if (autorCargado != null && puntoCargado != null) {

                System.out.println("--- DATOS RECUPERADOS ---");

                System.out.println("Nombre Author: " + autorCargado.getName());
                System.out.println("Email Author: " + autorCargado.getEmail());

                System.out.println("Coordenada X: " + puntoCargado.getX());
                System.out.println("Coordenada Y: " + puntoCargado.getY());
            }
        }
    }
}