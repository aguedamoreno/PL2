package es.uah.matcomp.pl2.a;

public class MainGeneral {

    public static void main(String[] args) {

        System.out.println("=== EJ 1.2 ===");
        try {
            ej_1_2.metodoA();
        } catch (Exception e) {
            System.out.println("Error en ej_1_2");
        }

        System.out.println("\n=== EJ 1.5 ===");
        try {
            ej_uno_1_5.validar(-5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== EJ 1.6 ===");
        Ej_Uno_1_6.main(null);

        System.out.println("\n=== EJ 1.8 ===");
        try {
            Ej_1_8.comprobarNumero(3);
            Ej_1_8.comprobarNumero(7);
        } catch (Exception e) {
            System.out.println("Excepción en Ej_1_8");
        }

        System.out.println("\n=== EJ 2.1 ===");
        ej_dos_1_1.main(null);

        System.out.println("\n=== EJ 2.5 ===");
        Ej_Dos_1_5.metodoC(1);
        Ej_Dos_1_5.metodoC(2);
        Ej_Dos_1_5.metodoC(0);

        System.out.println("\n=== EJ 2.6 ===");
        try {
            Ej_Dos_1_6.main(null);
        } catch (Exception e) {
            System.out.println("Excepción no controlada en Ej_Dos_1_6");
        }

        System.out.println("\n=== EJ 3.1 ===");
        try {
            ej_tres_1_1.leerArchivo();
        } catch (Exception e) {
            System.out.println("Error en ej_tres_1_1");
        }

        System.out.println("\n=== EJ 3.5 ===");
        try {
            Ej_Tres_1_5.metodoC(1);
        } catch (Exception e) {
            System.out.println("Capturada en main: " + e.getMessage());
        }

        System.out.println("\n=== FIN ===");
    }
}