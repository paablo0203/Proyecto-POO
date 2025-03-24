package Deberes;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Conferencia representa una conferencia de la NBA con varios equipos.
 */
public class Conferencia {
    private String nombre;
    private List<Equipo> equipos;

    // Constructor
    public Conferencia(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
    }

    // Getter y Setter para el nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para agregar un equipo a la conferencia
    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    // Método para eliminar un equipo de la conferencia
    public void eliminarEquipo(Equipo equipo) {
        equipos.remove(equipo);
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Conferencia: " + nombre + "\n");
        for (Equipo equipo : equipos) {
            sb.append("  " + equipo.toString() + "\n");
        }
        return sb.toString();
    }
}
