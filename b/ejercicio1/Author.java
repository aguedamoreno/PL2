package es.uah.matcomp.pl2.b.ejercicio1;

public class Author {
    // Atributos privados del autor
    private String name;
    private String email;

    /** Constructor para crear un autor con nombre y email */
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /** Metodos que devuelven el nombre y email del autor */
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    /** Metodo que cambia el email del autor */
    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Author[name=" + name + ",email=" + email + "]";
    }
}
