package br.ifsp.bra.uteis;

import br.ifsp.bra.servidor.Aluno;
import br.ifsp.bra.servidor.Professor;
import br.ifsp.bra.servidor.Tecnico;

public class ImpressoraDadosServidor {

    // Sobrecarga para Aluno
    public void imprimirDados(Aluno aluno) {
        System.out.println("=== Dados do Aluno ===");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
    }

    // Sobrecarga para Professor
    public void imprimirDados(Professor professor) {
        System.out.println("=== Dados do Professor ===");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Disciplina: " + professor.getDisciplina());
    }

    // Sobrecarga para Tecnico
    public void imprimirDados(Tecnico tecnico) {
        System.out.println("=== Dados do Técnico ===");
        System.out.println("Nome: " + tecnico.getNome());
        System.out.println("Setor: " + tecnico.getSetor());
    }
}
