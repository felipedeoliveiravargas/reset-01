package TEMA;

public class Druidas {
    string nome;
    double vida;
    double ataque;
    double defesa;
    double fe;


    public Druidas( string nome, double vida, double ataque, double defesa, double fe) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.fe = fe;
        PoderDivino druidas;
    }
    double ataque(double ataque, PoderDivino druidas) {
        return druidas.intensidadeDeFe * ataque;
    }
}
