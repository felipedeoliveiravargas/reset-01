public abstract class HomemDeArma extends AtributosPersonagem {
    Arma arma;

    public HomemDeArma(String nome, double vida, double ataque, double defesa, Arma arma) {
        super(nome, vida, ataque, defesa);
        this.arma = arma;
    }

    public void trocarArma(Arma novaArma) {
        this.arma = novaArma;
    }

}
