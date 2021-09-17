package scenes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class CourseController {

    @FXML
    private Button take_attendance_btn;

    @FXML
    private Button go_back;

    @FXML
    void onGoback(ActionEvent event) throws IOException {
        Object root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Scene scene = new Scene((Parent) root, 900, 600);
        HelloApplication.primaryStage.setScene(scene);

    }

    @FXML
    void onTakeAttendance(ActionEvent event) throws IOException {
        Object root = FXMLLoader.load(getClass().getResource("take-attendance.fxml"));
        Scene scene = new Scene((Parent) root, 900, 600);
        HelloApplication.primaryStage.setScene(scene);
    }
}
