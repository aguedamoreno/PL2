package es.uah.matcomp.PL2.b.Ejercicio4;

import es.uah.matcomp.PL2.b.GsonUtilEjemplo;

public class Main_ej4 {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Uso: init/show nombre_archivo.json");
            return;
        }

        String operacion = args[0];
        String rutaFichero = args[1];

        if (operacion.equals("init")) {

            // Crear objetos
            Estudiante e1 = new Estudiante("Cris", 20);
            Estudiante e2 = new Estudiante("Águeda", 22);

            Estudiante[] lista = {e1, e2};

            Asignatura asignatura = new Asignatura("Matemáticas", lista);

            // Guardar en JSON
            GsonUtilEjemplo.guardarObjetoEnArchivo(rutaFichero, asignatura);

            System.out.println("Asignatura guardada en JSON");

        } else if (operacion.equals("show")) {

            // Leer del JSON
            Asignatura asignaturaCargada =
                    GsonUtilEjemplo.cargarObjetoDesdeArchivo(rutaFichero, Asignatura.class);

            if (asignaturaCargada != null) {
                System.out.println("--- DATOS RECUPERADOS ---");
                System.out.println("Asignatura: " + asignaturaCargada.nombre);

                for (Estudiante e : asignaturaCargada.estudiantes) {
                    System.out.println("Alumno: " + e.nombre + " - Edad: " + e.edad);
                }
            }
        }
    }
}
