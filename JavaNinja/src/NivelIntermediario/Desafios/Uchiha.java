package NivelIntermediario.Desafios;

public class Uchiha extends Ninja{
    String habilidadeEspecial;
    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade especial: " + habilidadeEspecial);
    }

    @Override
    public void mostraInformacoes() {
        super.mostraInformacoes();
        mostrarHabilidadeEspecial();
    }
}
