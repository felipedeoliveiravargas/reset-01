package Exercicio03.Tema1Aula2;

public class Aviao extends Veiculo {
    String combustivel;
    int lotacaoMaxima;
    int alturaMaxima;

    public Aviao(String nome, String terreno, double velocidadeMaxima, String combustivel, int lotacaoMaxima, int alturaMaxima) {
        super(nome, terreno, velocidadeMaxima);
        this.combustivel = combustivel;
        this.lotacaoMaxima = lotacaoMaxima;
        this.alturaMaxima = alturaMaxima;


    }
}
