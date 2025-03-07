package NivelFacil.Desafios;

import java.util.Scanner;

public class DesafioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeDoNinja = "";
        int numeroMaximoDeNinjas = 6;
        String[] ninjas = new String[numeroMaximoDeNinjas];

        int quantidadeDeNinjas = 0;
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (quantidadeDeNinjas < numeroMaximoDeNinjas) {
                        System.out.println("Digite o nome do ninja para cadastrar: ");
                        nomeDoNinja = scanner.nextLine();
                        ninjas[quantidadeDeNinjas] = nomeDoNinja;
                        quantidadeDeNinjas++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("Número máximo de ninjas atingido!");
                    }
                    break;
                case 2:
                    if (quantidadeDeNinjas == 0) {
                        System.out.println("Nenhum ninja cadastrado! Tente novamente.");
                    } else {
                        System.out.println("============ Lista de ninjas ============");
                        for (int i = 0; i < quantidadeDeNinjas; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}
