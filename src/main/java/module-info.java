module ControleDeEstoque {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;

    exports org.example.controledeestoque;
    opens org.example.controledeestoque to javafx.fxml;
}
