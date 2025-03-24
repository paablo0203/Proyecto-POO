package Deberes;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase NBA representa la liga, que contiene varias conferencias.
 */
public class NBA {
    private List<Conferencia> conferencias;

    // Constructor
    public NBA() {
        conferencias = new ArrayList<>();
    }

    // Método para agregar una conferencia
    public void agregarConferencia(Conferencia conferencia) {
        conferencias.add(conferencia);
    }

    // Método para eliminar una conferencia
    public void eliminarConferencia(Conferencia conferencia) {
        conferencias.remove(conferencia);
    }

    public List<Conferencia> getConferencias() {
        return conferencias;
    }

    // Método para mostrar todas las conferencias con sus equipos
    public void mostrarConferencias() {
        System.out.println("=== Conferencias de la NBA ===");
        for (Conferencia conferencia : conferencias) {
            System.out.println(conferencia.toString());
        }
    }
}
