package Deberes;

/**
 * Clase Equipo representa un equipo de la NBA con un nombre, una ciudad y un jugador estrella.
 */
public class Equipo extends EntidadNBA {
    private Jugador estrella;
    private String ciudad;

    public Equipo(String nombre, Jugador estrella, String ciudad) {
        super(nombre);
        this.estrella = estrella;
        this.ciudad = ciudad;
    }

    public Jugador getEstrella() {
        return estrella;
    }

    public void setEstrella(Jugador estrella) {
        this.estrella = estrella;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Equipo: " + nombre + " - Ciudad: " + ciudad + " - Jugador Estrella: " + estrella.getNombre();
    }
}
