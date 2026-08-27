package Questao4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Informe o nome do titular: ");
        String titular = scanner.nextLine();

        ContaCorrente conta = new ContaCorrente(numero, titular);

        int opcao;

        do {
            System.out.println();
            System.out.println("=== Menu ===");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar saldo");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a sacar: ");
                    float valorSaque = scanner.nextFloat();
                    if (conta.sacar(valorSaque)) {
                        System.out.printf("Saque realizado com sucesso.");
                    }
                    else {
                        System.out.printf("Saque não permitido (valor inválido, saldo insuficiente ou acima de 10000).");
                    }
                    break;

                case 2:
                    System.out.printf("Informe o valor a ser depositado: ");
                    float valorDeposito = scanner.nextFloat();
                    if (conta.depositar(valorDeposito)) {
                        System.out.printf("Depósito realizado com sucesso.");
                    } else {
                        System.out.printf("Depósito não permitido (valor inválido ou acima de 10000).");
                    }
                    break;

                case 3:
                    System.out.printf("Saldo atual: R$ %.2f%n", conta.consultarSaldo());
                    break;

                case 0:
                    System.out.printf("Saindo do programa...");
                    break;

                default:
                    System.out.printf("Opção inválida.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static void ContaCorrente(int numero, String titular) {
    }
}
