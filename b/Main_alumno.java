package es.uah.matcomp.PL2.b;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;

public class Main_alumno {

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<args.length;i++)
            sb.append("Argumento " + i + ": " + args[i] + "\n");
        System.out.println("Argumentos: \n" + sb);

        String operacion = args[0];
        String fichero = args[1];

        Gson gson = new Gson();

        if (operacion.equals("init")) {

            Alumno a = new Alumno("Cris", 18, 8.5);

            FileWriter writer = new FileWriter(fichero);
            gson.toJson(a, writer);
            writer.close();

            System.out.println("Fichero creado");

        } else if (operacion.equals("show")) {

            FileReader reader = new FileReader(fichero);
            Alumno a = gson.fromJson(reader, Alumno.class);
            reader.close();

            System.out.println(a.nombre);
            System.out.println(a.edad);
            System.out.println(a.nota);
        }
    }
}
//Al ejecutar el programa, se muestran por pantalla los argumentos que se pasan al main, indicando su posición en el array args.

//Al poner java -jar TuFichero.jar Hola Mundo Cruel nos sale Usuario: Juan, y al cambiarlo y poner en la terminal "Hola Mundo Cruel" nos sale lo mismo, por lo tanto, no hay ninguna diferencia.





