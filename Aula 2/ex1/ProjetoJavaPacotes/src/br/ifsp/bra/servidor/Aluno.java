package br.ifsp.bra.servidor;


public class Aluno {
    private String nome;
    private int idade;

    // Construtor padrão
    public Aluno() {}

    // Construtor com parâmetros
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters
    public String getNome() { return nome; }
    public int getIdade() { return idade; }

    // Setters
    public void setNome(String nome) { this.nome = nome; }
    public void setIdade(int idade) { this.idade = idade; }
}
