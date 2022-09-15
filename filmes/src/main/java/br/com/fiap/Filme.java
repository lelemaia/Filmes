package br.com.fiap;


public class Filme implements Comparable {

    private String titulo;
    private String descricao;
    private int nota;
    private char genero;
    private String categoria;
    private String assistidos;

    public Filme(String titulo, String descricao, int nota, char genero, String categoria, String assistidos) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.nota = nota;
        this.genero = genero;
        this.categoria = categoria;
        this.assistidos = assistidos;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAssistidos() {
        return assistidos;
    }

    public void setAssistidos(String assistidos) {
        this.assistidos = assistidos;
    }

    @Override
    public String toString() {
        return "Filme [descricao=" + descricao + ", titulo=" + titulo + ", genero=" + genero + ", nota=" + nota + " categoria=" + categoria;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
