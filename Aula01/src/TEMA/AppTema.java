package TEMA;

public class AppTema {
    public static void main(String[] args) {
     Arma arma1 =   new Arma("Espada justiceira", 1.0);
      Guerreiros guerreiro1 = new Guerreiros("Guina", 2000.00, 500.00, 300.00, arma1);

        Arma arma2 =   new Arma("Adaga Medieval", 1.0);
        Barbaros barbaro1 = new Barbaros("Bolívar", 2000.00, 500.00, 300.00, arma2);

        Magia magia1 =   new Magia("Carapuça Alada", 2.0, 200.0);
        Feiticeiros feiticeiros1 = new Feiticeiros("Saci", 4000.00, 700.00, 200.00,800.00, magia1);

        Magia magia2=   new Magia("La Boba", 2.0, 200.0);
        Magos magos1 = new Magos("Dale", 4000.00, 700.00, 200.00,800.00, magia2);

        PoderDivino poderDivino1=   new PoderDivino("Dipirona do SUS", 3.0, 500.0);
        Druidas druidas1 = new Druidas("Merlin", 3000.00, 600.00, 200,800.00, poderDivino1);

        PoderDivino poderDivino2=   new PoderDivino("Suco de Cevada", 3.0, 400.0);
        Clerigos clerigos1 = new Clerigos("Bruxo", 3000.00, 600.00, 200.00,800.00, poderDivino2);

       double danoAtaqueGuerrero1 = guerreiro1.ataque(barbaro1.nome, barbaro1.defesa,arma1);
       barbaro1.vida = barbaro1.vida - danoAtaqueGuerrero1;
       barbaro1.verificarVida();

        double danoAtaqueGuerrero2 = guerreiro1.ataque(magos1.nome,magos1.defesa,arma1);
        magos1.vida = magos1.vida - danoAtaqueGuerrero2;
        magos1.verificarVida();

        double danoAtaqueBarbaro1 = barbaro1.ataque(druidas1.nome, druidas1.defesa,arma2);
       druidas1.vida = druidas1.vida - danoAtaqueBarbaro1;
       druidas1.verificarVida();

        double danoAtaqueBarbaro2 = barbaro1.ataque(guerreiro1.nome, guerreiro1.defesa,arma2);
        guerreiro1.vida = guerreiro1.vida - danoAtaqueBarbaro2;
        guerreiro1.verificarVida();

        double danoAtaqueMago1 = magos1.ataque(barbaro1.nome,barbaro1.defesa,magia2);
        barbaro1.vida = barbaro1.vida - danoAtaqueMago1;
        barbaro1.verificarVida();

        double danoAtaqueMago2 = magos1.ataque(clerigos1.nome,clerigos1.defesa,magia2);
        clerigos1.vida = clerigos1.vida - danoAtaqueMago2;
        clerigos1.verificarVida();

        double danoAtaqueBruxo1 = clerigos1.ataque(feiticeiros1.nome,feiticeiros1.defesa,poderDivino2);
        feiticeiros1.vida = feiticeiros1.vida - danoAtaqueBruxo1;
        feiticeiros1.verificarVida();

        double danoAtaqueBruxo2 = clerigos1.ataque(magos1.nome,magos1.defesa,poderDivino2);
        magos1.vida = magos1.vida - danoAtaqueBruxo2;
        magos1.verificarVida();

        double danoAtaqueMerlin1 = druidas1.ataque(clerigos1.nome,clerigos1.defesa,poderDivino1);
        clerigos1.vida = clerigos1.vida - danoAtaqueMerlin1;
        clerigos1.verificarVida();

        double danoAtaqueMerlin2 = druidas1.ataque(guerreiro1.nome,guerreiro1.defesa,poderDivino1);
        guerreiro1.vida = guerreiro1.vida - danoAtaqueMerlin2;
        guerreiro1.verificarVida();

        double danoAtaqueSaci1 = feiticeiros1.ataque(druidas1.nome,druidas1.defesa,magia1);
        druidas1.vida = druidas1.vida - danoAtaqueSaci1;
        druidas1.verificarVida();

        double danoAtaqueSaci2 = feiticeiros1.ataque(feiticeiros1.nome,feiticeiros1.defesa,magia1);
        feiticeiros1.vida = feiticeiros1.vida - danoAtaqueSaci2;
        feiticeiros1.verificarVida();

        double danoAtaqueSaci3 = feiticeiros1.ataque(clerigos1.nome,clerigos1.defesa,magia1);
        clerigos1.vida = clerigos1.vida - danoAtaqueSaci3;
        clerigos1.verificarVida();


        System.out.println (clerigos1.nome + " ficou com " + clerigos1.vida + " De Vida. " + "e com " + clerigos1.fe + " de Fé");
        System.out.println (druidas1.nome + " ficou com " + druidas1.vida + " De Vida. " + "e com " + druidas1.fe + " de Fé");

        System.out.println (feiticeiros1.nome + " ficou com " + feiticeiros1.vida + " De Vida. " + "e com " + feiticeiros1.mana + " de Mana");
        System.out.println (magos1.nome + " ficou com " + magos1.vida + " De Vida. " + "e com " + magos1.mana + " de Mana");

        System.out.println (barbaro1.nome + " ficou com " + barbaro1.vida + " De Vida. ");
        System.out.println (guerreiro1.nome + " ficou com " + guerreiro1.vida + " De Vida. ");




    }


}
