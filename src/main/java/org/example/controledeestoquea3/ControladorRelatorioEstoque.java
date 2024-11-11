package org.example.controledeestoquea3;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ControladorRelatorioEstoque {

    @FXML
    private TableView tableMovimentacoes;

    @FXML
    private TableColumn colID;

    @FXML
    private TableColumn colData;

    @FXML
    private TableColumn colTipo;

    @FXML
    private TableColumn colNome;

    @FXML
    private TableColumn colCategoria;

    @FXML
    private TableColumn colPreco;

    @FXML
    private TableColumn colQuantidade;
}
