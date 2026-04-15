package es.uah.matcomp.pl2.a;

public class ej_uno_1_5 {
    public static void validar(int nota) throws Exception {
        if (nota < 0) {
            throw new Exception("La nota no puede ser negativa");
        }
    }
    public static void main(String[] args) {
        try {
            validar(-5);
        } catch (Exception e) {
            System.out.println("Capturado: " + e.getMessage());
        }
    }
}
