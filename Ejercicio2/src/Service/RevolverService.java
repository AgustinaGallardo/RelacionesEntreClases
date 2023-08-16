package Service;
import Entity.Revolver;
import java.util.Random;
/*** Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
 * un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
 * se dispara y se moja. Las clases por hacer del juego son las siguientes:
 * Clase Entity.Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
 * del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
 * tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
 * Métodos:
 * • llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
 * deben ser aleatorios.
 * • mojar(): devuelve true si la posición del agua coincide con la posición actual
 * • siguienteChorro(): cambia a la siguiente posición del tambor
 * • toString(): muestra información del revolver (posición actual y donde está el agua)
 * **/
public class RevolverService {
    Revolver r = new Revolver();
    public void llenarRevolver(){
        Random random = new Random();
        Integer posicionActual = random.nextInt(6) + 1;
        Integer posicionAgua = random.nextInt(6) + 1;
        r.setPosicionActual(posicionActual);
        r.setPosicionAgua(posicionAgua);
    }
    public boolean mojar(){
        if(r.getPosicionActual().equals(r.getPosicionAgua())){
            return true;
        }else {
            return false;
        }
    }
    public void siguienteChorro(){
        Integer ran = r.getPosicionAgua();
        r.setPosicionActual(ran+1);
    }
}
