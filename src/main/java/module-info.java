module scenes {
    requires javafx.controls;
    requires javafx.fxml;
    requires  java.sql;


    opens scenes to javafx.fxml;
    exports scenes;
}