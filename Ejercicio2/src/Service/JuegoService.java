package Service;
import Entity.Jugador;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JuegoService {
    /**
     * Clase Entity.Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
     *      * Entity.Revolver
     *      * Métodos:
     *      * • llenarJuego(ArrayList<Entity.Jugador>jugadores, Entity.Revolver r): este método recibe los jugadores
     *      * y el revolver para guardarlos en los atributos del juego.
     *      * • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
     *      * aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
     *      * moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
     *      * mojar. Al final del juego, se debe mostrar que jugador se mojó.
     */
    private List<Jugador> lstJugadores = new ArrayList<>();
    private RevolverService revolver = new RevolverService();
    Scanner sc = new Scanner(System.in);
    public void llenarJuego(){
        JugadorService j = new JugadorService();
        int jugadores;
        System.out.println("Con cuantos jugadores quiere jugar? Puede elegir del 1 al 6");
        jugadores = Integer.parseInt(sc.nextLine());

        if(jugadores < 1 || jugadores > 6)
        {
            System.out.println("Número de jugadores fuera de rango. Se utilizarán 6 jugadores por defecto.");
            jugadores = 6;
        }
        JugadorService jugadorService = new JugadorService();
            for (int i = 0; i < jugadores; i++) {
            System.out.println("Ingrese el nombre del jugador " + (i + 1));
            String nombre = sc.nextLine();
            Jugador jugador = jugadorService.crearJugador(nombre);
            lstJugadores.add(jugador);
        }
    }

    public void ronda() {
        int indiceJugador = 0;
        while (true) {
            Jugador jugadorActual = lstJugadores.get(indiceJugador);
            JugadorService sj = new JugadorService();
            
            boolean mojado = sj.disparo(jugadorActual,revolver);

            if (mojado) {
                System.out.println("El jugador " + jugadorActual.getNombre() + " se mojó. ¡Fin del juego!");
                break;
            }

            indiceJugador = (indiceJugador + 1) % lstJugadores.size();
        }
    }





}
