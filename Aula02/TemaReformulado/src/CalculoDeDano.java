import java.util.ArrayList;

public class CalculoDeDano {
   

    public void AtacarGrupo(AtributosPersonagem atacante, ArrayList<AtributosPersonagem>  alvos) {
        for(AtributosPersonagem alvo : alvos){
            Atacar(atacante, alvo);
            }

    }
    public void Atacar(AtributosPersonagem atacante, AtributosPersonagem alvo) {
        if (atacante instanceof HomemDeMagia) {
            if (((HomemDeMagia) atacante).mana < ((HomemDeMagia) atacante).magia.custoDeMana){
                System.out.println("Mana Insuficiente");
            }else {
            double poderFinal = atacante.ataque * ((HomemDeMagia) atacante).magia.poderDeMana;
            ((HomemDeMagia) atacante).mana = ((HomemDeMagia) atacante).mana - ((HomemDeMagia) atacante).magia.custoDeMana;
            double dano = poderFinal - alvo.defesa;
            alvo.vida = alvo.vida - dano;
        } } else if (atacante instanceof HomemDeArma) {
            double poderFinal = atacante.ataque * ((HomemDeArma) atacante).arma.poderDeAtaque;
                double dano = poderFinal - alvo.defesa;
                alvo.vida = alvo.vida - dano;
                 } else if (atacante instanceof HomemDePoder) {
                if (((HomemDePoder) atacante).fe< ((HomemDePoder) atacante).poderDivino.custoDeFe ){
                    System.out.println("Fé Insuficiente");} else {
                    double poderFinal = atacante.ataque * ((HomemDePoder) atacante).poderDivino.intensidadeDeFe;
                    ((HomemDePoder) atacante).fe = ((HomemDePoder) atacante).fe - ((HomemDePoder) atacante).poderDivino.custoDeFe;
                    double dano = poderFinal - alvo.defesa;
                    alvo.vida = alvo.vida - dano;
                }
            }



    }
}
