package NivelIntermediario.Desafios;

public class Ninja {
    String nome;
    String idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostraInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Dificuldade da missão: " + nivelDificuldade);
        System.out.println("Status da missão: " + statusMissao);
    }
}
