import br.com.dio.desafio.dominio.*;

public class Main {
    public static void main(String[] args){
    Curso curso1 = new Curso();
        curso1. setTitulo("curso java");
        curso1. setDescricao("descrição curso");
        curso1. setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2. setTitulo("curso js");
        curso2. setDescricao("descrição curso js");
        curso2. setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria. setTitulo("mentoria");
        mentoria. setDescricao("descrição mentoria");
        mentoria. setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devNicoly = new Dev();
        devNicoly.setNome("Nicoly");
      System.out.printl("insctitos Nicoly:" + devNicoly.getConteudosInscritos());
      System.out.printl("Concluidos Nicoly:" + devNicoly.getConteudoConcluidos());

}