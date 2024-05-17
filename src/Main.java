import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso");
        curso1.setCargaHoraria(83);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição do curso");
        curso2.setCargaHoraria(30);

        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Mentoria();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria de Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria Javascript");
        mentoria2.setDescricao("Descricao mentoria de Javascript");
        mentoria2.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Dev Camila conteúdos inscritos -> " + devCamila.getContudosInscritos());
        devCamila.progredir();
        System.out.println("Dev Camila conteúdos inscritos -> " + devCamila.getContudosInscritos());
        System.out.println("Conteúdos Concluídos de Camila -> " + devCamila.getConteudosConcluidos());
        System.out.println("XP -> " + devCamila.calcularXp());

        System.out.println("----------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Dev João conteúdos inscritos -> " + devJoao.getContudosInscritos());
        devJoao.progredir();
        System.out.println("Dev João conteúdos inscritos -> " + devJoao.getContudosInscritos());
        System.out.println("Conteúdos Concluídos de João -> " + devJoao.getConteudosConcluidos());
        System.out.println("XP -> " + devJoao.calcularXp());





    }

}
