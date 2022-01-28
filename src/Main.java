import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descri��o curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descri��o curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descri��o mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devUllian = new Dev();
        devUllian.setNome("Ullian");
        devUllian.inscreverBootcamp(bootcamp);
        System.out.println("Conte�dos Inscritos Ullian:" + devUllian.getConteudosInscritos());
        devUllian.progredir();
        devUllian.progredir();
        System.out.println("-");
        System.out.println("Conte�dos Inscritos Ullian:" + devUllian.getConteudosInscritos());
        System.out.println("Conte�dos Conclu�dos Ullian:" + devUllian.getConteudosConcluidos());
        System.out.println("XP:" + devUllian.calcularTotalXp());

        System.out.println("-------");

        Dev devLarissa = new Dev();
        devLarissa.setNome("Larissa");
        devLarissa.inscreverBootcamp(bootcamp);
        System.out.println("Conte�dos Inscritos Larissa:" + devLarissa.getConteudosInscritos());
        devLarissa.progredir();
        devLarissa.progredir();
        devLarissa.progredir();
        System.out.println("-");
        System.out.println("Conte�dos Inscritos Larissa:" + devLarissa.getConteudosInscritos());
        System.out.println("Conte�dos Concluidos Larissa:" + devLarissa.getConteudosConcluidos());
        System.out.println("XP:" + devLarissa.calcularTotalXp());

    }

}