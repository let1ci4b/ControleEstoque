package org.example.controledeestoquea3;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ControladorProduto extends ControladorNavegacaoSuperior {

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

    @FXML
    public void abrirRelatorio() {
        try {
            // Carregar o arquivo FXML que vai sobrepor a tela atual
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/controledeestoquea3/RelatorioProduto.fxml"));
            Parent novaTela = loader.load();

            // Substituir o conteúdo da tela principal
            Stage stage = (Stage) abrirRelatorio.getScene().getWindow();
            Scene novaCena = new Scene(novaTela);
            stage.setScene(novaCena);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}