package es.uah.matcomp.pl2.b.ejercicio1;

public class Animal {
    private String name;

    /** Constructor de un animal con el nombre dado
     */
    public Animal(String name) {
        this.name = name;
    }

    /** Metodo que pasa Animal a texto
     */
    public String toString() {
        return "Animal[name=" + name + "]";
    }
}
