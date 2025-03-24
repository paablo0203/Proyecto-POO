package Deberes;

/**
 * Clase base para representar una entidad con nombre dentro de la NBA.
 */
public class EntidadNBA {
    protected String nombre;

    public EntidadNBA(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}