package Desafios;

public class DesafioUm {
    public static void main(String[] args) {

        // Ninja 1
        String nomeNinja1 = "Naruto Uzumaki";
        int idade1 = 15;
        String nomeMissao1 = "Ronda do Dojo";
        String nivelDificuldadeMissao1 = "C";
        String statusConclusao1;

        System.out.println("Nome do Ninja 1: " + nomeNinja1);
        System.out.println("Idade do Ninja 1: " + idade1);
        System.out.println("Missão do Ninja 1: " + nomeMissao1);
        System.out.println("Dificuldade da missão do Ninja 1: " + nivelDificuldadeMissao1);
        if (idade1 < 15 && (nivelDificuldadeMissao1 != "C" && nivelDificuldadeMissao1 != "D")){
            statusConclusao1 = "Não concluída";
            System.out.println("Status da missão: " + statusConclusao1);
        } else {
            statusConclusao1 = "Concluída";
            System.out.println("Status da missão: " + statusConclusao1);
        }

        System.out.println();

        // Ninja 2
        String nomeNinja2 = "Sasuke Uchiha";
        int idade2 = 14;
        String nomeMissao2 = "Escolta do líder";
        String nivelDificuldadeMissao2 = "A";
        String statusConclusao2;

        System.out.println("Nome do Ninja 1: " + nomeNinja2);
        System.out.println("Idade do Ninja 1: " + idade2);
        System.out.println("Missão do Ninja 1: " + nomeMissao2);
        System.out.println("Dificuldade da missão do Ninja 2: " + nivelDificuldadeMissao2);
        if (idade2 < 15 && (nivelDificuldadeMissao2 != "C" && nivelDificuldadeMissao2 != "D")){
            statusConclusao2 = "Não concluída";
            System.out.println("Status da missão: " + statusConclusao2);
        } else {
            statusConclusao2 = "Concluída";
            System.out.println("Status da missão: " + statusConclusao2);
        }

        System.out.println();

        // Ninja 3
        String nomeNinja3 = "Sakura Haruno";
        int idade3 = 14;
        String nomeMissao3 = "Lavar a louça";
        String nivelDificuldadeMissao3 = "D";
        String statusConclusao3;

        System.out.println("Nome do Ninja 3: " + nomeNinja3);
        System.out.println("Idade do Ninja 3: " + idade3);
        System.out.println("Missão do Ninja 3: " + nomeMissao3);
        System.out.println("Dificuldade da missão do Ninja 3: " + nivelDificuldadeMissao3);
        if (idade3 < 15 && (nivelDificuldadeMissao3 != "C" && nivelDificuldadeMissao3 != "D")){
            statusConclusao3 = "Não concluída";
            System.out.println("Status da missão: " + statusConclusao3);
        } else {
            statusConclusao3 = "Concluída";
            System.out.println("Status da missão: " + statusConclusao3);
        }



    }
}
