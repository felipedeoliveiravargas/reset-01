package Exercicio03.Tema1Aula2;

public class Navio extends Veiculo {
    String combustivel;
    int lotacaoMaxima;

    public Navio(String nome,String terreno, double velocidadeMaxima,String combustivel, int lotacaoMaxima){
        super(nome, terreno, velocidadeMaxima);
        this.combustivel = combustivel;
        this.lotacaoMaxima = lotacaoMaxima;
    }




}
