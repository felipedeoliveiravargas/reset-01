package Exercicio03.Tema1Aula2;

public class Bicicleta extends Veiculo {
    int quantidadeDeRodas;
    int lotacaoMaxima;


    public Bicicleta(String nome,String terreno, double velocidadeMaxima, int quantidadeDeRodas, int lotacaoMaxima) {
        super(nome, terreno, velocidadeMaxima);
        this.quantidadeDeRodas = quantidadeDeRodas;
        this.lotacaoMaxima = lotacaoMaxima;

    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "quantidadeDeRodas=" + quantidadeDeRodas +
                ", lotacaoMaxima=" + lotacaoMaxima +
                ", nome='" + nome + '\'' +
                ", terreno='" + terreno + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                '}';
    }
}
