package br.com.dio.desafio.dominio;

import java.time.LocalDate;
public class Mentoria {

    private String titulo;
    private String descricao;
    private LocalDate data;

    public Mentoria(){}

    public Mentoria(String titulo, String descricao, LocalDate data){
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setData(data);
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setData(LocalDate data){
        this.data = data;
    }

    public LocalDate getData(){
        return this.data;
    }

    public String toString(){
        return "Curso { " +
                "Título=" + this.getTitulo() +
                ", Descrição=" + this.getDescricao() +
                ", Data=" + this.getData() +
                " }";
    }
}
