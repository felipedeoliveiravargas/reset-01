package TEMA;

public class Feiticeiros {
    string nome;
    double vida;
    double ataque;
    double defesa;
    double mana;

    public Feiticeiros( string nome, double vida, double ataque, double defesa, double mana) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.mana = mana;
        Magia feiticeiros;
    }
    double ataque(double ataque, Magia feiticeiros) {
        return feiticeiros.poderDeMana * ataque;
    }

}
