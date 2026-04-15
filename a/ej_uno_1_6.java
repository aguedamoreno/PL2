package es.uah.matcomp.pl2.a;

public class ej_uno_1_6 {
    public static void main(String[] args) {
        try {
            int[] lista = {10, 20, 30};
            // Cambiamos la lógica: intentamos dividir por cero un elemento del array
            int operacion = lista[1] / 0;
            // O acceder a un índice que no existe
            // int errorIndice = lista[5];

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero en este programa.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Estás intentando acceder a una posición del array que no existe.");
        }
        System.out.println("El programa continúa después de los catch.");
    }
}
