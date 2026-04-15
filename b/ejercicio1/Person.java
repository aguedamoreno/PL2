package es.uah.matcomp.pl2.b.ejercicio1;

public class Person {
    private String name;
    private String address;

    /** Constructor Person con nombre y direccioón dados
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /** Metodo que devuelve el nombre
     */
    public String getName() {
        return name;
    }
    /** Metodo que devuelve la dirección
     */
    public String getAddress() {
        return address;
    }
    /** Metodo que cambia la dirección
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /** Metodo que pasa a texto Person
     */
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
