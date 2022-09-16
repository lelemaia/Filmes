package br.com.fiap;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable{

    @FXML private TextField textFieldTitulo;
    @FXML private TextField textFieldDescricao;
    @FXML private TextField textFieldNota;
    @FXML private TextField textFieldGenero;
    @FXML private ChoiceBox<String> choiceBox;
    @FXML private ListView<Filme> listView;
    @FXML private ListView<Filme> listViewNaoAssistidos;

    String[] listaSimNao = {"sim", "não"};

    private List<Filme> lista = new ArrayList<>();
    private List<Filme> listaNAssitidos= new ArrayList<>();


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        choiceBox.getItems().addAll(listaSimNao);
    }

    public void salvar(){
        String titulo = textFieldTitulo.getText();
        String descricao = textFieldDescricao.getText();
        Double nota = Double.valueOf(textFieldNota.getText());
        String genero = textFieldGenero.getText();
        String assistidos = choiceBox.getValue();
      

        Filme filme = new Filme(titulo, descricao, (double) nota, genero, assistidos);
        if(assistidos == "não"){
            listaNAssitidos.add(filme);
        }
        lista.add(filme);

        atualizarList();

    }

    public void ordenarNota(){
        lista.sort((o1, o2) -> Double.compare(o1.getNota(), o2.getNota()) );

        atualizarList();

    }


    public void ordenarCategoria(){
        lista.sort((o1, o2) -> o1.getGenero().compareTo(o2.getGenero()));
    }


    public void ordenarTitulo(){
        lista.sort((o1, o2) -> o1.getTitulo().compareTo(o2.getTitulo()));
    }


    public void atualizarList(){

        listView.getItems().clear();
        listView.getItems().addAll(lista);
        listViewNaoAssistidos.getItems().clear();
        listViewNaoAssistidos.getItems().addAll(listaNAssitidos);
    }}






