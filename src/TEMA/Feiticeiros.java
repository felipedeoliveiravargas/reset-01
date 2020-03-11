package TEMA;

public class Feiticeiros {
    String nome;
    double vida;
    double ataque;
    double defesa;
    double mana;
    Magia magia;

    public Feiticeiros( String nome, double vida, double ataque, double defesa, double mana, Magia magia) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.mana = mana;
        this.magia = magia;
    }
    public double ataque(String nomeDoAlvo, double defesaAlvo, Magia magia) {
        if (this.mana>= magia.custoDeMana){
            double poderFinal = this.ataque * magia.poderDeMana;
            double dano = poderFinal - defesaAlvo;
            this.mana = this.mana - magia.custoDeMana;
            System.out.println(this.nome + " Atacou " + nomeDoAlvo + " com " + magia.nome + " Causando " + dano + "de Dano");
            return dano;
        }
        System.out.println("Mana insuficiente");
        return 0;
    }
}