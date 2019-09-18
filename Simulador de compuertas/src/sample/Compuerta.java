package sample;

import java.util.ArrayList;

public class Compuerta {
    protected ArrayList<Compuerta> entrada;
    protected Compuerta salida;
    protected int y;
    protected int x;

    public Compuerta(int x, int y)
    {
        this.y = y;
        this.x = x;
    }
}
