package Exercicio03.Tema1Aula2;

public class Navio extends Veiculo {
    String combustivel;
    int lotacaoMaxima;

    public Navio(String nome,String terreno, double velocidadeMaxima,String combustivel, int lotacaoMaxima){
        super(nome, terreno, velocidadeMaxima);
        this.combustivel = combustivel;
        this.lotacaoMaxima = lotacaoMaxima;
    }

    @Override
    public String toString() {
        return "Navio{" +
                "combustivel='" + combustivel + '\'' +
                ", lotacaoMaxima=" + lotacaoMaxima +
                ", nome='" + nome + '\'' +
                ", terreno='" + terreno + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                '}';
    }
}
