public class Magos extends HomemDeMagia {


    public Magos(String nome, double vida, double ataque, double defesa, Magia magia, double mana) {
        super(nome, vida, ataque, defesa, magia, mana);
    }

    public void verificarVida() {
        if (this.vida <= 0) {
            System.out.println(this.nome + "Faleceu");
        }
    }
}
