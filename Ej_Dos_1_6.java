package es.uah.matcomp.PL2.A;
public class Ej_Dos_1_6 {
    public static void main(String[] args) {
        System.out.println("Enter main()");
        metodoA();
        System.out.println("Exit main()");
    }
    public static void metodoA() {
        System.out.println("Enter metodoA()");

        try {
            System.out.println(4 / 0);

            // Esta línea no se ejecutará
            System.out.println("Fin del try");

        } finally {
            // Aunque haya excepción, esto sí se ejecuta
            System.out.println("finally en metodoA()");
        }
        // Tampoco se llega aquí porque la excepción no se captura
        // System.out.println("Exit metodoA()");
    }
}
