package scenes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button create_class_btn;

    @FXML
    void onCreateClass(ActionEvent event) throws IOException {
        Object root = FXMLLoader.load(getClass().getResource("create-class.fxml"));
        Scene scene = new Scene((Parent) root, 600, 480);
        HelloApplication.primaryStage.setScene(scene);
    }
}