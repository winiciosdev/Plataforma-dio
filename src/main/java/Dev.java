import java.util.HashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Curso> cursosConcluidos = new HashSet<>();
    private Set<Mentoria> mentoriasConcluidas = new HashSet<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Curso> getCursosConcluidos() {
        return cursosConcluidos;
    }

    public void setCursosConcluidos(Set<Curso> cursosConcluidos) {
        this.cursosConcluidos = cursosConcluidos;
    }

    public Set<Mentoria> getMentoriasConcluidas() {
        return mentoriasConcluidas;
    }

    public void setMentoriasConcluidas(Set<Mentoria> mentoriasConcluidas) {
        this.mentoriasConcluidas = mentoriasConcluidas;
    }
}
