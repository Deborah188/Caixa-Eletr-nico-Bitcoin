import java.util.Scanner;

public class CaixaEletronicoBitcoin {
    private static double saldo = 0.05; // Saldo inicial em Bitcoin
    private static final String USUARIO = "admin";
    private static final String SENHA = "1234";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*****************************************");
        System.out.println("*   BEM-VINDO AO CAIXA ELETRÔNICO BTC   *");
        System.out.println("*****************************************");

        // Login
        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        if (!usuario.equals(USUARIO) || !senha.equals(SENHA)) {
            System.out.println("Acesso negado! Usuário ou senha incorretos.");
            return;
        }

        int opcao;
        do {
            System.out.println("\n======== MENU ========");
            System.out.println("1 - Ver Saldo");
            System.out.println("2 - Depositar BTC");
            System.out.println("3 - Sacar BTC");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo é: %.5f BTC\n", saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor para depositar (BTC): ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito realizado com sucesso!");
                    break;
                case 3:
                    System.out.print("Digite o valor para sacar (BTC): ");
                    double saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso!");
                    }
                    break;
                case 4:
                    System.out.println("OBRIGADO POR UTILIZAR NOSSOS SERVIÇOS!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
