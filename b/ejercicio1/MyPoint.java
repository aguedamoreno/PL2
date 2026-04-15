package es.uah.matcomp.pl2.b.ejercicio1;

public class MyPoint {
    private int x;
    private int y;

    /** Constructor por defecto (0,0) */
    public MyPoint() {
        x = 0;
        y = 0;
    }

    /** Constructor con coordenadas dadas */
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /** Getters y Setters de x e y */
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }


    /** Metodo que devuelve x e y en un array de dos enteros */
    public int[] getXY() {
        int[] result = new int[2];
        result[0] = x;
        result[1] = y;
        return result;
    }

    /** Metodo que cambia ambas coordenadas a la vez */
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /** Representación del punto como (x, y) */
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    /** Metodo que calcula la distancia a unas coordenadas x, y dadas */
    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    /** Metodo que calcula la distancia a otro objeto MyPoint */
    public double distance(MyPoint another) {
        return distance(another.x, another.y);
    }
    /** Metodo que calcula la distancia al origen (0,0) */
    public double distance() {
        return distance(0, 0);
    }
}
