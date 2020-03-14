package TEMA;

public class Guerreiros {
    String nome;
    double vida;
    double ataque;
    double defesa;
    Arma arma;

    public Guerreiros( String nome, double vida, double ataque, double defesa, Arma arma) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.arma = arma;
    }
    double ataque(String nomeAlvo, double defesaAlvo, Arma arma) {
        double poderFinal = this.ataque * arma.poderDeAtaque;
        double dano = poderFinal - defesaAlvo;
        System.out.println(this.nome + " Atacou " + nomeAlvo + " com " + arma.nome + " Causando " + dano + " de Dano");
        return dano;

    }
    public void verificarVida() {
        if (this.vida <= 0) {
            System.out.println(this.nome + "Faleceu");
        }
    }
}
