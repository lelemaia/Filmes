package br.com.fiap;


public class Filme implements Comparable {

    private String titulo;
    private String descricao;
    private Double nota;
    private String genero;
    private String assistidos;

    public Filme(String titulo, String descricao, Double nota, String genero, String assistidos) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.nota = nota;
        this.genero = genero;
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

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAssistidos() {
        return assistidos;
    }

    public void setAssistidos(String assistidos) {
        this.assistidos = assistidos;
    }

    @Override
    public String toString() {
        return "Filme [descricao=" + descricao + ", titulo=" + titulo + ", genero=" + genero + ", nota=" + nota;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
