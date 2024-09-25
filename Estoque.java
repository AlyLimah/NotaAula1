import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Produto:");
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Tamanho/Peso: ");
        String peso = scanner.nextLine();
        String cor = scanner.nextLine();
        System.out.print("Valor: R$ ");
        double valor = scanner.nextDouble();
        System.out.print("Quantidade no estoque: ");
        int quantidadeestoque = scanner.nextInt();

        SistemaProduto p = new SistemaProduto();

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Vender Produto");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe a quantidade a ser vendida: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Forma de pagamento (Pix, Espécie, Transferência, Débito, Crédito): ");
                    scanner.nextLine(); // Limpar o buffer
                    String pagamento = scanner.nextLine();
                    p.vender(quantidade, pagamento);
                    break;
                case 2:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");

            }
            } while (opcao !=2);
    }
}






