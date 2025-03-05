package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
        * Laços de repetição: vão repetir infinitamente ou até um parametro for atendido ou parar de ser atendido
        * WHILE
        * FOR
        * */

        //WHILE
        // while (condicao) {tudo aqui vai acontecer}
        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeClones <= numeroMaximoDeClones) {
            numeroDeClones ++;
            System.out.println("O Naruto fez um clone das sombras " + numeroDeClones);
        }
        
        // FOR
        for (int i = 0; i < numeroMaximoDeClones; i++) {
            System.out.println("O Naruto fez um clone das sombras");
            System.out.println("Número de clones = " + i);
        }


    }
}
