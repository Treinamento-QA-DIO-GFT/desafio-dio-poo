import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso javaScript");
        curso2.setCargaHoraria(10);

//        System.out.println(curso1);
//        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria descrição java");
        mentoria.setData(LocalDate.now());

//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Dev");
        bootcamp.setDescricao("Descrição Bootcamp Dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

        Dev devDiego = new Dev();
        devDiego.setNome("Diego");
        devDiego.inscreverBootcamp(bootcamp);
        devDiego.progredir();
        System.out.println("Conteudos inscritos" + devDiego.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devDiego.getOnteudosFinalizados());
        System.out.println("XP: " + devDiego.calcularTotalXp());

        System.out.println("-----------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        System.out.println("Conteudos inscritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devJoao.getOnteudosFinalizados());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}
