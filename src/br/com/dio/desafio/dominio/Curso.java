package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public Curso(){}

    public Curso(String titulo, String descricao, int cargaHoraria){
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setCargaHoraria(cargaHoraria);
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

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria(){return this.cargaHoraria;}

    public String toString(){
        return "Curso { " +
                "Título=" + this.getTitulo() +
                ", Descrição=" + this.getDescricao() +
                ", Carga_Horária=" + this.getCargaHoraria() +
                " }";
    }


}
