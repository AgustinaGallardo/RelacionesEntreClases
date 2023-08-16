package Service;
import Entity.Jugador;
import java.util.Random;

public class JugadorService {
    public Jugador crearJugador(String nombre){
        Jugador jugador = new Jugador();
        Random random = new Random();
        int id = random.nextInt(6) + 1;
        jugador.setId(id);
        jugador.setNombre(nombre + " " + jugador.getId());
        return jugador;
    }
    public boolean disparo(Jugador j,RevolverService revolver){
        revolver.llenarRevolver();
        if(revolver.mojar()){
            System.out.println("Te mojaste!!!");
            j.setMojado(true);
            return true;
        }else{
            System.out.println("NO te mojaste!!!");
            j.setMojado(false);
            return false;
        }
    }
}
