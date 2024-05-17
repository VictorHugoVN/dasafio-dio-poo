package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso(){super();}

    @Override
    public double calcular_XP() {
        return XP_PADRAO * this.getCargaHoraria();
    }

    public Curso(String titulo, String descricao, int cargaHoraria){
        super(titulo, descricao);
        this.setCargaHoraria(cargaHoraria);
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
