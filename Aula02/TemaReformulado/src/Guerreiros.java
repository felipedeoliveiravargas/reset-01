public class Guerreiros extends HomemDeArma {

    public Guerreiros(String nome, double vida, double ataque, double defesa, Arma arma) {
        super(nome, vida, ataque, defesa, arma);
    }

    public void verificarVida() {
        if (this.vida <= 0) {
            System.out.println(this.nome + "Faleceu");
        }
    }
}

