public class AtributosPersonagem {
    public AtributosPersonagem(String nome, double vida, double ataque, double defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    String nome;
    double vida;
    double ataque;
    double defesa;

    public void verificarVida() {
        if (this.vida <= 0) {
            System.out.println(this.nome + "Faleceu");
        }
    }
}
