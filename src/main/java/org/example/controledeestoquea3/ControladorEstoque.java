package org.example.controledeestoquea3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ControladorEstoque{

    @FXML
    private ImageView abrirRelatorio;

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
        abrirRelatorio.setOnMouseClicked(event -> abrirRelatorio());
        lblMeuEstoque.setOnMouseClicked(event -> carregarTela("TelaEstoque.fxml"));
        lblCategorias.setOnMouseClicked(event -> carregarTela("TelaCategoria.fxml"));
        lblProdutos.setOnMouseClicked(event -> carregarTela("TelaProduto.fxml"));
        lblMovimentacoes.setOnMouseClicked(event -> carregarTela("TelaMovimentacao.fxml"));
    }
    public void abrirRelatorio() {
        try {
            // Carregar o arquivo FXML que vai sobrepor a tela atual
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/controledeestoquea3/RelatorioEstoque.fxml"));
            Parent novaTela = loader.load();

            // Substituir o conteúdo da tela principal
            Stage stage = (Stage) abrirRelatorio.getScene().getWindow();
            Scene novaCena = new Scene(novaTela);
            stage.setScene(novaCena);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
}