package es.uah.matcomp.pl2.b.ejercicio1;

public class MovablePoint implements Movable {
    //atributos con package access
    // coordenadas del punto
    int x;
    int y;
    // velocidad en cada eje
    int xSpeed;
    int ySpeed;

    /** Constructor del punto movido
     * */
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // representación en texto
    @Override
    public String toString() {
        return "(" + x + ", " + y + ") speed=(" + xSpeed + ", " + ySpeed + ")";
    }

    // mueve hacia arriba (resta en Y)
    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    // mueve hacia abajo (suma en Y)
    @Override
    public void moveDown() {
        y += ySpeed;
    }

    // mueve hacia la izquierda (resta en X)
    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    // mueve hacia la derecha (suma en X)
    @Override
    public void moveRight() {
        x += xSpeed;
    }
}
