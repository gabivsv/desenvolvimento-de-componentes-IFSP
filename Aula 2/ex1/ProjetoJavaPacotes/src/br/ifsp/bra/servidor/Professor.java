package br.ifsp.bra.servidor;

public class Professor { 
    private String nome;
    private String disciplina;

    public Professor() {}
    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public String getNome() { return nome; }
    public String getDisciplina() { return disciplina; }
    public void setNome(String nome) { this.nome = nome; }
    public void setDisciplina(String disciplina) { this.disciplina = disciplina; }
}