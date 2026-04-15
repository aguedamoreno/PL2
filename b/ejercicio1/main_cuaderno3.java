package es.uah.matcomp.pl2.b.ejercicio1;


import es.uah.matcomp.pl2.b.GsonUtilEjemplo;
import es.uah.matcomp.pl2.b.ejercicio1.Animal;
import es.uah.matcomp.pl2.b.ejercicio1.Person;

public class main_cuaderno3 {

    public static void main(String[] args) {
        // Validamos que pases parámetros: init/show y el nombre del archivo
        if (args.length < 2) {
            System.out.println("Uso: init/show nombre_archivo.json");
            return;
        }

        String operacion = args[0];
        String rutaFichero = args[1];

        if (operacion.equals("init")) {

            // Creamos los objetos de los ejercicios anteriores del cuaderno 3
            Animal animal = new Animal("Perro");
            Person persona = new Person("Cris", "Madrid");

            // Guardar
            GsonUtilEjemplo.guardarObjetoEnArchivo("animal_" + rutaFichero, animal);
            GsonUtilEjemplo.guardarObjetoEnArchivo("persona_" + rutaFichero, persona);

            System.out.println("Objetos guardados en JSON");

        } else if (operacion.equals("show")) {

            // Cargamos los objetos desde el archivo
            Animal animalCargado = GsonUtilEjemplo.cargarObjetoDesdeArchivo("animal_" + rutaFichero, Animal.class);
            Person personaCargada = GsonUtilEjemplo.cargarObjetoDesdeArchivo("persona_" + rutaFichero, Person.class);

            if (animalCargado != null && personaCargada != null) {

                System.out.println("--- DATOS RECUPERADOS ---");

                // Animal no tiene getter, entonces usamos toString
                System.out.println(animalCargado.toString());

                // Person sí tiene getters
                System.out.println("Nombre: " + personaCargada.getName());
                System.out.println("Dirección: " + personaCargada.getAddress());
            }
        }
    }
}