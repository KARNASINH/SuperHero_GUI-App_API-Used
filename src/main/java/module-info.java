module com.example.assignment2gc200478377 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.net.http;


    opens com.example.assignment2gc200478377 to javafx.fxml;
    exports com.example.assignment2gc200478377;
}