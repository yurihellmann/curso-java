package NivelFacil.Condicoes;

public class IfElse {
    public static void main(String[] args) {

        /*
        * IF e ELSE - Condições
        * ElSE IF
        * Objetivo: passar o ninja de nível de acordo com o número de missões
        */

        String nome = "Naruto Uzumaki";
        int idade = 15;
        boolean hokage = false;
        short numeroDeMissoes = 20;

        if (numeroDeMissoes > 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin ");
        } else {
            System.out.println("Rank: Gennin");
        }

    }
}
