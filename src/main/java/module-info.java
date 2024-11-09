module org.example.controledeestoquea3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.controledeestoquea3 to javafx.fxml;
    exports org.example.controledeestoquea3;
}