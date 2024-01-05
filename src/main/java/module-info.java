module com.example.almostthere {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.almostthere to javafx.fxml;
    exports com.example.almostthere;
}