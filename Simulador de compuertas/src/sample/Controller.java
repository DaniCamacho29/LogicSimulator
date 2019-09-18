package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class Controller {
        @FXML
        private VBox VboxCompuertas;
        @FXML
        private ImageView And;
        @FXML
        private ImageView Or;
        @FXML
        private ImageView Nor;
        @FXML
        private ImageView Xnor;
        @FXML
        private ImageView Xor;
        @FXML
        private ImageView Nand;
        @FXML
        private ImageView Not;
        @FXML
        private boolean Borrador;

        private Label CopiaCompuerta;

        @Override
        public void mouseDragged(MouseEvent e) {
                if (CopiaCompuerta != null) {
                        CopiaCompuerta.setLocation(e.getX() + label.getX() - 40, e.getY() + label.getY() - 35);
                }
        }
}




