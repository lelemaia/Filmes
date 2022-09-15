package br.com.fiap;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.Filme;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField textFieldTitulo;
    @FXML private TextField textFieldDescricao;
    @FXML private TextField textFieldNota;
    @FXML private TextField textFieldGenero;
   

    @FXML private ListView<Filme> listView;

    private List<Filme> lista = new ArrayList<>();

    public void salvar(){
        String titulo = textFieldTitulo.getText();
        String descricao = textFieldDescricao.getText();
        int nota = Integer.valueOf(textFieldNota.getText());
        String genero = textFieldGenero.getText();
      

        Filme filme = new Filme(titulo, descricao, nota, genero);
        lista.add(filme);

        listView.getItems().addAll(lista);
    }
}