import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando cursos
        Curso curso1 = new Curso("Curso Java", "Aprenda Java do zero", 8);
        Curso curso2 = new Curso("Curso POO", "Aprenda POO com Java", 10);

        // Criando mentorias
        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Tire suas dúvidas sobre Java", LocalDate.now());

        // Criando bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição do Bootcamp Java Developer");
        bootcamp.getCursos().add(curso1);
        bootcamp.getCursos().add(curso2);
        bootcamp.getMentorias().add(mentoria1);

        // Criando dev
        Dev dev1 = new Dev("João");
        dev1.getCursosConcluidos().add(curso1);
        dev1.getMentoriasConcluidas().add(mentoria1);

        System.out.println("Bootcamp: " + bootcamp.getNome());
        System.out.println("Cursos do Bootcamp: ");
        for (Curso curso : bootcamp.getCursos()) {
            System.out.println("- " + curso.getTitulo());
        }

        System.out.println("Mentorias do Bootcamp: ");
        for (Mentoria mentoria : bootcamp.getMentorias()) {
            System.out.println("- " + mentoria.getTitulo());
        }

        System.out.println("Dev: " + dev1.getNome());
        System.out.println("Cursos Concluídos: ");
        for (Curso curso : dev1.getCursosConcluidos()) {
            System.out.println("- " + curso.getTitulo());
        }

        System.out.println("Mentorias Concluídas: ");
        for (Mentoria mentoria : dev1.getMentoriasConcluidas()) {
            System.out.println("- " + mentoria.getTitulo());
        }
    }
}
