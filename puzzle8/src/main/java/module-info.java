module com.puzzle8 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens com.puzzle8 to javafx.fxml;
    exports com.puzzle8;
}