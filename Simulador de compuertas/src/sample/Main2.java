package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main2 extends Application{

    Stage window;
    Scene scene;
    Pane canvas;

    public static void main(String[]args){
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;

        canvas = new Pane();

        setImages();
		
		/*
		ImageView imgv = new ImageView();
		Image im = new Image("url");
		*/

        scene = new Scene(canvas, 200,200);
        window.setScene(scene);
        window.show();

    }

    public void setImages() {

        for(int i = 0; i <1; i++) {

            //canvas.setOnMouseClicked(new EventHandler<MouseEvent>);
            Rectangle r1 = new Rectangle(10,10);
            r1.setX(i*15);

            r1.setOnDragDetected(new EventHandler<MouseEvent>() {

                public void handle(MouseEvent mouse) {

                    r1.setFill(Color.AQUA);

                }

            });

            canvas.setOnDragOver(new EventHandler<DragEvent>() {

                public void handle(DragEvent event) {

                    event.acceptTransferModes(TransferMode.COPY_OR_MOVE);

                }
            });

            canvas.setOnDragDropped(new EventHandler<DragEvent>() {

                public void handle(DragEvent mouse) {

                    Rectangle r2 = new Rectangle(10,10);
                    r2.setX(mouse.getSceneX());
                    r2.setY(mouse.getSceneY());

                    canvas.getChildren().add(r2);
                }

            });


            canvas.getChildren().add(r1);
        }
    }
}