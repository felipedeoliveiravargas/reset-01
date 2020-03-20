public class Clerigos extends HomemDePoder {


    public Clerigos(String nome, double vida, double ataque, double defesa, PoderDivino poderDivino, double fe) {
        super(nome, vida, ataque, defesa, poderDivino, fe);
    }

    public void verificarVida() {
        if (this.vida <= 0) {
            System.out.println(this.nome + "Faleceu");
        }
    }
}

