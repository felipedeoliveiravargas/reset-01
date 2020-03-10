package TEMA;

public class Clerigos {
    string nome;
    double vida;
    double ataque;
    double defesa;
    double fe;



    public Clerigos( string nome, double vida, double ataque, double defesa,  double fe) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.fe = fe;
        PoderDivino clerigos;
    }
    double ataque(double ataque, PoderDivino clerigos) {
        return clerigos.intensidadeDeFe * ataque;
    }
}
