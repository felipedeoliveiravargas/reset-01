package TEMA;

public class Magos {
    string nome;
    double vida;
    double ataque;
    double defesa;
    double mana;

    public Druidas( string nome, double vida, double ataque, double defesa, double mana) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.mana = mana;
        Magia magos;
    }
    double ataque(double ataque, Magia magos) {
        return magos.poderDeMana * ataque;
    }
}
