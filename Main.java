package Deberes;

/**
 * Clase Main para ejecutar la simulación de la NBA.
 */
public class Main {
    public static void main(String[] args) {
        // Crear jugadores estrella
        Jugador lebron = new Jugador("LeBron James");
        Jugador curry = new Jugador("Stephen Curry");
        Jugador durant = new Jugador("Kevin Durant");
        Jugador giannis = new Jugador("Giannis Antetokounmpo");

        // Crear equipos con sus estrellas
        Equipo lakers = new Equipo("Los Angeles Lakers", lebron, "Los Angeles");
        Equipo warriors = new Equipo("Golden State Warriors", curry, "San Francisco");
        Equipo nets = new Equipo("Brooklyn Nets", durant, "Brooklyn");
        Equipo bucks = new Equipo("Milwaukee Bucks", giannis, "Milwaukee");

        // Crear conferencias y agregar equipos
        Conferencia oeste = new Conferencia("Conferencia Oeste");
        oeste.agregarEquipo(lakers);
        oeste.agregarEquipo(warriors);

        Conferencia este = new Conferencia("Conferencia Este");
        este.agregarEquipo(nets);
        este.agregarEquipo(bucks);

        // Crear objeto NBA y agregar conferencias
        NBA nba = new NBA();
        nba.agregarConferencia(oeste);
        nba.agregarConferencia(este);

        // Mostrar todas las conferencias con sus equipos
        nba.mostrarConferencias();
    }
}
