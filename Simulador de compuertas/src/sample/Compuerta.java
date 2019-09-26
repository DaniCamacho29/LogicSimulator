package sample;

import javafx.scene.control.Label;

import java.util.ArrayList;

public class Compuerta {
    private String id;
    private Compuerta entrada1;
    private Compuerta entrada2;
    private Compuerta salida;
    private int tipo;
    private Label label;
    private static int cantEntradas = 0;
    private static int cantSalidas = 0;

    //Constructor de entradas y salidas
    public Compuerta(int value, int tipo){

        //calcular id

        this.label = new Label(this.id);


    }
    //Constructor de compuerta principal
    public Compuerta(int tipo)
    {

        this.tipo = tipo;
        this.entrada1 = new Compuerta(1, 6);
        this.entrada2 = new Compuerta(1, 6);
        this.salida = new Compuerta(1, 7);



    }

    public Compuerta getEntrada1() {
        return entrada1;
    }

    public void setEntrada1(Compuerta entrada1) {
        this.entrada1 = entrada1;
    }

    public Compuerta getEntrada2() {
        return entrada2;
    }

    public void setEntrada2(Compuerta entrada2) {
        this.entrada2 = entrada2;
    }

    public Compuerta getSalida() {
        return salida;
    }

    public void setSalida(Compuerta salida) {
        this.salida = salida;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }
}
