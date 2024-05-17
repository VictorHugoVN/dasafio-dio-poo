package br.com.dio.desafio.dominio;

import java.time.LocalDate;
public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria(){}

    public Mentoria(String titulo, String descricao, LocalDate data){
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setData(data);
    }

    @Override
    public double calcular_XP() {
        return XP_PADRAO + 20d;
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
