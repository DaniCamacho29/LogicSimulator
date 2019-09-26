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
    public Compuerta(int value, int tipo)
        //calcular id
        {
        if(tipo == 7){
            this.id = "<i"+cantEntradas+">";
            cantEntradas+=1;
        }else
            {
                this.id ="<o"+cantSalidas+">";
                cantSalidas+=1;
            }

        this.label = new Label(this.id);
        label.setPrefSize(50,20);




    }
    //Constructor de compuerta principal
    public Compuerta(int tipo)
    {

        this.tipo = tipo;
        this.entrada1 = new Compuerta(1, 7);
        if(tipo != 6)
        {
            this.entrada2 = new Compuerta(1, 7);
        }
        this.salida = new Compuerta(1, 8);




    }

    public Compuerta getEntrada1() {
        return entrada1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public static int getCantEntradas() {
        return cantEntradas;
    }

    public static void setCantEntradas(int cantEntradas) {
        Compuerta.cantEntradas = cantEntradas;
    }

    public static int getCantSalidas() {
        return cantSalidas;
    }

    public static void setCantSalidas(int cantSalidas) {
        Compuerta.cantSalidas = cantSalidas;
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
