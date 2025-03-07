package NivelFacil.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        /*
        * SwitchCase: serve para gerar casos especificos
        * */

        // Pedir para o usuário
        Scanner scanner = new Scanner(System.in);

        // Mostrar as opções
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // Pedir oara o usuário escolher uma das opções
        int escolhaDoUsuario = scanner.nextInt();

        // Mostrar personagem
        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuário escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuário escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("O usuário escolheu a Sakura Haruno");
                break;
            default:
                System.out.println("Opção inválida");
        }
        // Fechar a caixa
        scanner.close();

    }
}
