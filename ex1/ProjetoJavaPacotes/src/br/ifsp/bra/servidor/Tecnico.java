package br.ifsp.bra.servidor;

public class Tecnico {
    private String nome;
    private String setor;

    public Tecnico() {}
    public Tecnico(String nome, String setor) {
        this.nome = nome;
        this.setor = setor;
    }

    public String getNome() { return nome; }
    public String getSetor() { return setor; }
    public void setNome(String nome) { this.nome = nome; }
    public void setSetor(String setor) { this.setor = setor; }
}
