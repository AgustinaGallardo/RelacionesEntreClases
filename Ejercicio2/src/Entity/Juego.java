package Entity;
import java.util.ArrayList;
import java.util.List;

public class Juego {

    private List<Jugador> jugadores = new ArrayList<>();
    private Revolver revolver;

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public Juego() {
    }

    public Juego(List<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "jugadores=" + jugadores +
                ", revolver=" + revolver +
                '}';
    }
}
