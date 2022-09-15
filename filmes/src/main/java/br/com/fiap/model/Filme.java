package br.com.fiap.model;


public class Filme {

    private String titulo;
    private String descricao;
    private int nota;
    private char genero;

    public Filme(String titulo, String descricao, int nota, char genero) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.nota = nota;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(Int nota) {
        this.nota = nota;
    }

    public String getPerfil() {
        return genero;
    }

    public void setGenero(Char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Filme [descricao=" + descricao + ", titulo=" + titulo + ", genero=" + genero + ", nota=" + nota + "]";
    }
}
