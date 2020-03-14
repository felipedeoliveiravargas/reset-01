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

    @Override
    public String toString() {
        return "Aviao{" +
                "combustivel='" + combustivel + '\'' +
                ", lotacaoMaxima=" + lotacaoMaxima +
                ", alturaMaxima=" + alturaMaxima +
                ", nome='" + nome + '\'' +
                ", terreno='" + terreno + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                '}';
    }
}
