package etapa4;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("Menu:");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Digite a opção desejada: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Quebra de linha após a leitura do número

            switch (opcao) {
                case 1:
                    criarLoja(scanner);
                    break;
                case 2:
                    criarProduto(scanner);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        scanner.close();
    }

    private static void criarLoja(Scanner scanner) {
        System.out.print("Digite o nome da loja: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o número de funcionários: ");
        int quantidadeFuncionarios = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome da rua: ");
        String nomeDaRua = scanner.nextLine();
        System.out.print("Digite o nome da cidade: ");
        String cidade = scanner.nextLine();
        System.out.print("Digite o nome do Estado: ");
        String estado = scanner.nextLine();
        System.out.print("Digite o nome do Pais: ");
        String pais = scanner.nextLine();
        System.out.print("Digite o CEP: ");
        String cep = scanner.nextLine();
        System.out.print("Digite o número: ");
        String numero = scanner.nextLine();
        System.out.print("Digite um complemento: ");
        String complemento = scanner.nextLine();
    }

    private static void criarProduto(Scanner scanner) {
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        // Criar o produto com o nome informado
        System.out.println("Produto criado: " + nomeProduto);
        System.out.println();
    }
}