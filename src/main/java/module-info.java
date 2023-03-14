module com.example.igo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.igo to javafx.fxml;
    exports com.example.igo;
}