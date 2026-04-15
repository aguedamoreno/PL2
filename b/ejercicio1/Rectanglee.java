package es.uah.matcomp.pl2.b.ejercicio1;

public class Rectanglee implements GeometricObject {
    // Anchura y longitud del rectángulo
    private double width;
    private double length;

    /** Constructor del rectángulo con el largo y el ancho dados
     */
    public Rectanglee(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /** Metodo que calcula el área del rectángulo
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /** Metodo que calcula el perímetro del rectángulo
     */
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    /** Devuelve el rectángulo en formato texto
     */
    @Override
    public String toString() {
        return "Rectangle[width=" + width + ",length=" + length + "]";
    }
}
