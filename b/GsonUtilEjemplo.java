package es.uah.matcomp.PL2.b;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GsonUtilEjemplo {
    // Metodo para guardar un objeto en un archivo JSON
    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Metodo para cargar un objeto desde un archivo JSON
    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            return gson.fromJson(reader, clase);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {

        // Crear una instancia del objeto Usuario
        Usuario usuario = new Usuario("Juan", 30, "juan@example.com");
        // Ruta del archivo donde se guardará el objeto
        String rutaArchivo = "usuario.json";
        // Guardar el objeto Usuario en un archivo JSON
        guardarObjetoEnArchivo(rutaArchivo, usuario);
        // Cargar el objeto Usuario desde el archivo JSON
        Usuario usuarioCargado = cargarObjetoDesdeArchivo(rutaArchivo, Usuario.class);
        if (usuarioCargado != null) {
            System.out.println("Usuario cargado: " + usuarioCargado.nombre);
        }
    }

    // Clase Usuario para los ejemplos
    static class Usuario {
        String nombre;
        int edad;
        String correo;

        public Usuario(String nombre, int edad, String correo) {
            this.nombre = nombre;
            this.edad = edad;
            this.correo = correo;
        }
        // Getters y setters no incluidos por brevedad
    }
}

//El static se usa:
// en los metodos para que se comporten como metodos de utilidad, es decir, no necesitamos crear un objeto para usarlos
// se usa en la clase interna "usuario" porque sino necesitaríamos una instancia de la clase "padre" para poder crear un usuario, de esta manera, permite que sea una clase independiente dentro de la otra
// y por último, en el main es obligatorio para que pueda arrancar el programa.

//El fichero de datos se guarda en la raíz de la carpeta del proyecto


