package Entity;

public class Revolver {
    private Integer posicionAgua;
    private Integer posicionActual;
    public Revolver(Integer posicionAgua, Integer posicionActual) {
        this.posicionAgua = posicionAgua;
        this.posicionActual = posicionActual;
    }
    public Revolver() {
    }
    public Integer getPosicionAgua() {
        return posicionAgua;
    }
    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    public Integer getPosicionActual() {
        return posicionActual;
    }
    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }
    @Override
    public String toString() {
        return "Revolver{" +
                "posicionAgua=" + posicionAgua +
                ", posicionActualAgua=" + posicionActual +
                '}';
    }
}
