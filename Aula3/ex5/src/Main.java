public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1000);
        Pagamentos.pagarConta(conta1, 200);

        ContaPoupanca conta2 = new ContaPoupanca(1000);
        // Pagamentos.pagarConta(conta2, 200); // Agora não compila, respeitando LSP

        System.out.println("Saldo da poupança: " + conta2.getSaldo());
    }
}


/*Explique por que o código ao lado
viola o Princípio da Substituição
de Liskov.
 
O Princípio da Substituição de Liskov (LSP), proposto por Barbara Liskov, afirma que objetos de uma classe base devem poder ser substituídos por objetos de suas subclasses sem alterar o funcionamento correto do programa.

-ContaBancaria permite saques.

-ContaPoupanca é uma subclasse de ContaBancaria, mas não permite saques, lançando UnsupportedOperationException.

-Assim, quando Pagamentos.pagarConta recebe uma ContaPoupanca, o código cliente falha, porque espera que toda ContaBancaria aceite saque. Isso viola o LSP, porque ContaPoupanca não pode ser usada no lugar de ContaBancaria

*/


