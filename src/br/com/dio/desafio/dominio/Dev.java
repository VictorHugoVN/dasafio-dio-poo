package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> contudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
    }

    public void progredir() {
    }

    public void calcularXp() {
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setContudosInscritos(Set<Conteudo> contudosInscritos){
        this.contudosInscritos = contudosInscritos;
    }

    public Set<Conteudo> getContudosInscritos(){
        return this.contudosInscritos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos){
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public Set<Conteudo> getConteudosConcluidos(){
        return this.conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(contudosInscritos, dev.contudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, contudosInscritos, conteudosConcluidos);
    }
}
