module com.example.esameispw {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.esameispw to javafx.fxml;
    opens com.example.esameispw.controller to javafx.fxml;
    exports com.example.esameispw.controller;
}