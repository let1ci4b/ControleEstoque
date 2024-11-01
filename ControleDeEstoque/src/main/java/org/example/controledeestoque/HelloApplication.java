package org.example.controledeestoque;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader telaEstoque = new FXMLLoader(HelloApplication.class.getResource("TelaEstoque.fxml"));
        Scene scene = new Scene((Parent) telaEstoque.load(), 1024, 700);
        stage.setTitle("Tela Incial");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}