module com.example.igofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.igofx to javafx.fxml;
    exports com.example.igofx;
}