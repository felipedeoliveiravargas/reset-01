package Exercicio03.Tema1Aula2;

public class Trem extends Veiculo {
    String combustivel;
    int lotacaoMaxima;
    int numeroDerodas;

    public Trem(String nome, String terreno, double velocidadeMaxima, String combustivel, int lotacaoMaxima, int numeroDerodas ) {
        super(nome, terreno, velocidadeMaxima);
        this.combustivel = combustivel;
        this.lotacaoMaxima = lotacaoMaxima;
        this.numeroDerodas = numeroDerodas;

    }

    @Override
    public String toString() {
        return "Trem{" +
                "combustivel='" + combustivel + '\'' +
                ", lotacaoMaxima=" + lotacaoMaxima +
                ", numeroDerodas=" + numeroDerodas +
                ", nome='" + nome + '\'' +
                ", terreno='" + terreno + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                '}';
    }
}
