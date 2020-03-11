package TEMA;

public class Druidas {
    String nome;
    double vida;
    double ataque;
    double defesa;
    double fe;
    PoderDivino poderDivino;

    public Druidas(String nome, double vida, double ataque, double defesa, double fe, PoderDivino poderDivino) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.fe = fe;
        this.poderDivino = poderDivino;
    }

    public double ataque(String nomeAlvo, double defesaAlvo, PoderDivino poderDivino) {
        if (this.fe >= poderDivino.custoDeFe) {
            double ataqueFinal = this.ataque * poderDivino.intensidadeDeFe;
            double dano = ataqueFinal - defesaAlvo;
            this.fe = this.fe - poderDivino.custoDeFe;
            System.out.println(this.nome + " Atacou " + nomeAlvo + " com " + poderDivino.nome + " Causando " + dano + "de Dano");
            return dano;
        }

        System.out.println("Fé insuficiente");
        return 0;
    }
}
