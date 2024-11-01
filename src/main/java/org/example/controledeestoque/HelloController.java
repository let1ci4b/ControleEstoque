package org.example.controledeestoque;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private void btnfecharJanela (ActionEvent event){
        // Obtém o stage da janela atual e a fecha
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
        }
}