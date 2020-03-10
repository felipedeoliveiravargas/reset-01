package TEMA;

public class Barbaros {
    string nome;
    double vida;
    double ataque;
    double defesa;


    public Barbaros( string nome, double vida, double ataque, double defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        Arma barbaros;
    }
    double ataque(double ataque, Arma barbaros) {
        return ataque * barbaros.poderDeAtaque;
    }
}
