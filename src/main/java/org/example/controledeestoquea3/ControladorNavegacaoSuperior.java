package org.example.controledeestoquea3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ControladorNavegacaoSuperior {

    private ControladorCategoria controladorCategoria;

    @FXML
    private Label lblMeuEstoque;

    @FXML
    private Pane contentPane;

    @FXML
    private Label lblProdutos;

    @FXML
    private Label lblMovimentacoes;

    @FXML
    private Label lblCategorias;

    @FXML
    public void initialize() {
        lblMeuEstoque.setOnMouseClicked(event -> carregarTela("TelaEstoque.fxml"));
        lblCategorias.setOnMouseClicked(event -> carregarTela("TelaCategoria.fxml"));
        lblProdutos.setOnMouseClicked(event -> carregarTela("TelaProduto.fxml"));
        lblMovimentacoes.setOnMouseClicked(event -> carregarTela("TelaMovimentacao.fxml"));
    }

    public void carregarTela(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/controledeestoquea3/" + fxmlFile));
            Parent root = loader.load();

            // Limpa o contentPane e adiciona a nova tela
            contentPane.getChildren().clear();
            contentPane.getChildren().add(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void fecharJanela(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
    public Label getLblMeuEstoque() {
        return lblMeuEstoque;
    }


}
