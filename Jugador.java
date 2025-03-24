package Deberes;

/**
 * Clase Jugador representa a un jugador de baloncesto.
 */
public class Jugador extends EntidadNBA {

    public Jugador(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }
}

