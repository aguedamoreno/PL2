package es.uah.matcomp.pl2.a;

public class ej_1_8 {

    // Clase de excepción propia
    public static class MiExcepcionEspecial extends Exception {
        public MiExcepcionEspecial(String mensaje) {
            super(mensaje);
        }
    }

    // metodo que puede lanzar la excepción
    public static void comprobarNumero(int numero) throws MiExcepcionEspecial {
        if (numero == 7) {
            throw new MiExcepcionEspecial("Has introducido el número especial");
        }

        System.out.println("Número correcto: " + numero);
    }

    public static void main(String[] args) {
        try {
            comprobarNumero(3); // no lanza excepción
            comprobarNumero(7); // sí lanza excepción
        } catch (MiExcepcionEspecial ex) {
            System.out.println("Se ha producido una excepción:");
            ex.printStackTrace();
        }
    }
}
