package es.uah.matcomp.pl2.a;

public class ej_1_2 {
    public static void metodoC() {
        int divisor = 0;
        int resultado = 100 / divisor; // Explota aquí
    }
    public static void metodoB() { metodoC(); }
    public static void metodoA() { metodoB(); }

    public static void main(String[] args) {
        try {
            metodoA();
        } catch (ArithmeticException e) {
            System.out.println("Se ha producido un error matemático.");
            e.printStackTrace(); // Esto muestra la pila como en el dibujo del PDF
        }
    }
}
