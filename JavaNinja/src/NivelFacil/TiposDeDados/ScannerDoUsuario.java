package NivelFacil.TiposDeDados;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
        * Scanner = É um jeito de trazer o usuário para dentro da aplicação.
        * */

        // Abre o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        // Recebe nome do ninja
        System.out.println("Escreva aqui o nome do seu ninja:");
        String nomeDoninja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoninja);

        // Recebe a idade do ninja
        System.out.println("Escreva aqui a idade do seu ninja");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja + "anos");

        // Tratamento de dados
        if (idadeDoNinja >= 18) {
            System.out.println("Esse ninja já é maior de idade e pode ir para missões fora da aldeia.");
        } else {
            System.out.println("Esse ninja é muito novo ainda, e não pode ir para missões fora da aldeia");
        }


        //Fechar sempre o Scanner
        caixaDeTexto.close();
    }
}
