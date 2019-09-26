package sample;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.event.MouseAdapter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller extends Application implements Initializable {


    Image imageAnd = null;
    Image imageOr = null;
    Image imageNor = null;
    Image imageNand = null;
    Image imageXnor = null;
    Image imageXor = null;
    Image imageNot = null;
        @FXML
        private Label label;

        @FXML
        private Label label1;

        @FXML
        private Label label2;

        @FXML
        private Label label3;

        @FXML
        private Label label4;

        @FXML
        private Label label5;

        @FXML
        private Label label6;
        @FXML
        private Pane panel;

    @FXML
        void moverImagen(MouseEvent event)
    {


    }

    @FXML
    public void mostrarXRaton(MouseEvent event) {

        System.out.println("x = " + event.getX());

    }

    @Override
    public void start(Stage primaryStage) throws Exception {







    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {


        // Instancia a la imagen en la Carpeta compuerta
        try {
            imageAnd = new Image(new FileInputStream("C:\\Users\\danic\\Documents\\GitHub\\LogicSimulator\\Simulador de compuertas\\src\\sample\\Compuertas\\and.png"));
            imageOr = new Image(new FileInputStream("C:\\Users\\danic\\Documents\\GitHub\\LogicSimulator\\Simulador de compuertas\\src\\sample\\Compuertas\\or.png"));
            imageNor = new Image(new FileInputStream("C:\\Users\\danic\\Documents\\GitHub\\LogicSimulator\\Simulador de compuertas\\src\\sample\\Compuertas\\nor.png"));
            imageNand = new Image(new FileInputStream("C:\\Users\\danic\\Documents\\GitHub\\LogicSimulator\\Simulador de compuertas\\src\\sample\\Compuertas\\nand.png"));
            imageXnor = new Image(new FileInputStream("C:\\Users\\danic\\Documents\\GitHub\\LogicSimulator\\Simulador de compuertas\\src\\sample\\Compuertas\\xnor.png"));
            imageXor = new Image(new FileInputStream("C:\\Users\\danic\\Documents\\GitHub\\LogicSimulator\\Simulador de compuertas\\src\\sample\\Compuertas\\xor.png"));
            imageNot = new Image(new FileInputStream("C:\\Users\\danic\\Documents\\GitHub\\LogicSimulator\\Simulador de compuertas\\src\\sample\\Compuertas\\not.png"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // Imagenenes de las compuertas Como label
        label.setGraphic(new ImageView(imageAnd));
        label1.setGraphic(new ImageView(imageOr));
        label2.setGraphic(new ImageView(imageNor));
        label3.setGraphic(new ImageView(imageNand));
        label4.setGraphic(new ImageView(imageXnor));
        label5.setGraphic(new ImageView(imageXor));
        label6.setGraphic(new ImageView(imageNot));

        // Click del Mouse And
        label.setOnMouseClicked(new EventHandler<MouseEvent>()
        {

            public void handle(MouseEvent mouse)
            {
                Label copyLabel = new Label();
                copyLabel.setGraphic(new ImageView(imageAnd));
                copyLabel.setPrefSize(label.getPrefWidth(), label.getPrefHeight());
                copyLabel.setLayoutX(0);
                copyLabel.setLayoutY(0);

                copy

                panel.getChildren().add(copyLabel);

            }

        });


    }

};





