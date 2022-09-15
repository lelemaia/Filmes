package br.com.fiap;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.Filme;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable{

    @FXML private TextField textFieldTitulo;
    @FXML private TextField textFieldDescricao;
    @FXML private TextField textFieldNota;
    @FXML private TextField textFieldGenero;
    @FXML private TextField textFieldCategoria;
    @FXML private ChoiceBox<String> choiceBox;
    @FXML private ListView<Filme> listView;
    @FXML private ListView<Filme> listViewNaoAssistidos;

    String[] listaSimNao = {"sim", "não"};

    private List<Filme> lista = new ArrayList<>();


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        choiceBox.getItems().addAll(listaSimNao);
    }

    public void salvar(){
        String titulo = textFieldTitulo.getText();
        String descricao = textFieldDescricao.getText();
        int nota = Integer.valueOf(textFieldNota.getText());
        String genero = textFieldGenero.getText();
        String categoria = textFieldCategoria.getText();
        String assistidos = choiceBox.getvalue();
      

        Filme filme = new Filme(titulo, descricao, nota, genero, categoria, assistidos);
        lista.add(filme);

        atualizarList();

    }

    public void ordenarNota(){
        lista.sort((o1, o2) -> Integer.compare(o1.getNota(), o2.getNota()) );

        atualizarListView();

    }


    public void ordenarCategoria(){
        lista.sort((o1, o2) -> o1.getCategoria().compareTo(o2.getCategoria()));
    }


    public void ordenarTitulo(){
        lista.sort((o1, o2) -> o1.getTitulo().compareTo(o2.getTitulo()));
    }


    public void atualizarList(){

        ListView.getItems().clear();
        listView.getItems().addAll(lista);
    }

}



