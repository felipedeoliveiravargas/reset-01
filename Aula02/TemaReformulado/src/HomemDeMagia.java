public abstract class HomemDeMagia extends AtributosPersonagem {
    Magia magia;
    double mana;


    public HomemDeMagia(String nome, double vida, double ataque, double defesa, Magia magia, double mana) {
        super(nome, vida, ataque, defesa);
        this.magia = magia;
        this.mana = mana;
    }
}
