public abstract class HomemDePoder extends AtributosPersonagem {
    PoderDivino poderDivino;
    double fe;


    public HomemDePoder(String nome, double vida, double ataque, double defesa, PoderDivino poderDivino, double fe) {
        super(nome, vida, ataque, defesa);
        this.poderDivino = poderDivino;
        this.fe = fe;
    }
}
