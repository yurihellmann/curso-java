package NivelIntermediario.Desafios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome = "";
        String idade = "";
        String missao = "";
        String nivel= "";
        String status = "";
        String habilidade = "";

        int numeroMaximoDeNinjas = 10;
        Uchiha[] ninjas = new Uchiha[numeroMaximoDeNinjas];

        int quantidadeDeNinjas = 0;
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Atualizar habilidade");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (quantidadeDeNinjas < numeroMaximoDeNinjas) {
                        System.out.print("Digite o nome do ninja para cadastrar: ");
                        nome = scanner.nextLine();
                        Uchiha ninja = new Uchiha();
                        ninja.nome = nome;

                        System.out.print("Digite a idade do ninja para cadastrar: ");
                        idade = scanner.nextLine();
                        ninja.idade = idade;

                        System.out.print("Digite a missão do ninja para cadastrar: ");
                        missao = scanner.nextLine();
                        ninja.missao = missao;

                        System.out.print("Digite o nível da missão " + missao + " para cadastrar: ");
                        nivel = scanner.nextLine();
                        ninja.nivelDificuldade = nivel;

                        System.out.print("Digite status da missão " + missao + " para cadastrar: ");
                        status = scanner.nextLine();
                        ninja.statusMissao = status;

                        System.out.print("Digite a habilidade especial do ninja para cadastrar: ");
                        habilidade = scanner.nextLine();
                        ninja.habilidadeEspecial = habilidade;

                        ninjas[quantidadeDeNinjas] = ninja;
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
                            ninjas[i].mostraInformacoes();
                            System.out.println("=========================================");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Opção de atualizar habilidade ainda não implementada.");
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}
