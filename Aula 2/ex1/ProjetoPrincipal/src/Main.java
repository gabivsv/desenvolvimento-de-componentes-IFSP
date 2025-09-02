import br.ifsp.bra.servidor.Aluno;
import br.ifsp.bra.servidor.Professor;
import br.ifsp.bra.servidor.Tecnico;
import br.ifsp.bra.uteis.ImpressoraDadosServidor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ImpressoraDadosServidor impressora = new ImpressoraDadosServidor();

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1 - Criar Aluno");
            System.out.println("2 - Criar Professor");
            System.out.println("3 - Criar Técnico");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            int opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome do Aluno: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade do Aluno: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    Aluno aluno = new Aluno(nome, idade);
                    impressora.imprimirDados(aluno);
                }
                case 2 -> {
                    System.out.print("Nome do Professor: ");
                    String nome = sc.nextLine();
                    System.out.print("Disciplina: ");
                    String disciplina = sc.nextLine();
                    Professor prof = new Professor(nome, disciplina);
                    impressora.imprimirDados(prof);
                }
                case 3 -> {
                    System.out.print("Nome do Técnico: ");
                    String nome = sc.nextLine();
                    System.out.print("Setor: ");
                    String setor = sc.nextLine();
                    Tecnico tecnico = new Tecnico(nome, setor);
                    impressora.imprimirDados(tecnico);
                }
                case 4 -> {
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}
