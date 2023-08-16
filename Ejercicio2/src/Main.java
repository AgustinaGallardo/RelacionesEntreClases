import Entity.Jugador;
import Service.JuegoService;
import Service.JugadorService;

import java.util.Scanner;

public class Main {
    /**

     * Clase Entity.Jugador: esta clase posee los siguientes atributos: id (representa el número del
     * jugador), nombre (Empezara con Entity.Jugador más su ID, “Entity.Jugador 1” por ejemplo) y mojado (indica
     * si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
     * debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
     * Métodos:
     * • disparo(Entity.Revolver r): el método, recibe el revolver de agua y llama a los métodos de
     * mojar() y siguienteChorro() de Entity.Revolver. El jugador se apunta, aprieta el gatillo y si el
     * revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
     * devuelve true, sino false.
     * Clase Entity.Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
     * Entity.Revolver
     * Métodos:
     * • llenarJuego(ArrayList<Entity.Jugador>jugadores, Entity.Revolver r): este método recibe los jugadores
     * y el revolver para guardarlos en los atributos del juego.
     * • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
     * aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
     * moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
     * mojar. Al final del juego, se debe mostrar que jugador se mojó.
     * Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Entity.Juego.
     * @param args
     */
    public static void main(String[] args) {

        JuegoService juego = new JuegoService();

        System.out.println("Bienvenido al juego del mojado!");

            juego.llenarJuego();
            juego.ronda();





    }
}