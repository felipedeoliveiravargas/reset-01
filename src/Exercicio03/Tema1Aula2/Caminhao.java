package Exercicio03.Tema1Aula2;

public class Caminhao extends Veiculo {
    String combustivel;
    int lotacaoMaxima;
    int numeroDerodas;

    public Caminhao(String nome, String terreno, double velocidadeMaxima, String combustivel, int lotacaoMaxima, int numeroDerodas) {
        super(nome, terreno, velocidadeMaxima);
        this.combustivel = combustivel;
        this.lotacaoMaxima = lotacaoMaxima;
        this.numeroDerodas = numeroDerodas;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "combustivel='" + combustivel + '\'' +
                ", lotacaoMaxima=" + lotacaoMaxima +
                ", numeroDerodas=" + numeroDerodas +
                ", nome='" + nome + '\'' +
                ", terreno='" + terreno + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                '}';
    }
}
