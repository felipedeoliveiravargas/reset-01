package Exercicio03.Tema1Aula2;

public class Submarino extends Veiculo {
    String combustivel;
    int lotacaoMaxima;
    int profundidadeMaxima;

    public Submarino(String nome, String terreno, double velocidadeMaxima, String combustivel, int lotacaoMaxima, int profundidadeMaxima) {
        super(nome, terreno, velocidadeMaxima);
        this.combustivel = combustivel;
        this.lotacaoMaxima = lotacaoMaxima;
        this.profundidadeMaxima = profundidadeMaxima;


    }
}
