package TEMA;

public class AppTema {
    public static void main(String[] args) {
     Arma arma1 =   new Arma("Espada justiceira", 1.0);
      Guerreiros guerreiro1 = new Guerreiros("Guina", 1000.00, 300.00, 800, arma1);

        Arma arma2 =   new Arma("Adaga Medieval", 1.0);
        Barbaros barbaro1 = new Barbaros("Bolívar", 1000.00, 300.00, 800, arma2);

        Magia magia1 =   new Magia("Carapuça Alada", 1.0, 1.0);
        Feiticeiros feiticeiros1 = new Feiticeiros("Saci", 1000.00, 300.00, 800,800.00, magia1);

        Magia magia2=   new Magia("La Boba", 1.0, 1.0);
        Magos magos1 = new Magos("Dale", 1000.00, 300.00, 800,800.00, magia2);

        PoderDivino poderDivino1=   new PoderDivino("Dipirona do SUS", 1.0, 1.0);
        Druidas druidas1 = new Druidas("Merlin", 1000.00, 300.00, 800,800.00, poderDivino1);

        PoderDivino poderDivino2=   new PoderDivino("Suco de Cevada", 1.0, 1.0);
        Clerigos clerigos1 = new Clerigos("Bruxo", 1000.00, 300.00, 800,800.00, poderDivino2);

       double danoAtaqueGuerrero1 = guerreiro1.ataque(barbaro1.nome, barbaro1.defesa,arma1);
       barbaro1.vida = barbaro1.vida - danoAtaqueGuerrero1;

        double danoAtaqueGuerrero2 = guerreiro1.ataque(magos1.nome,magos1.defesa,arma1);
        magos1.vida = magos1.vida - danoAtaqueGuerrero2;

        double danoAtaqueBarbaro1 = barbaro1.ataque(druidas1.nome, druidas1.defesa,arma2);
       druidas1.vida = druidas1.vida - danoAtaqueBarbaro1;

        double danoAtaqueBarbaro2 = barbaro1.ataque(guerreiro1.nome, guerreiro1.defesa,arma2);
        guerreiro1.vida = guerreiro1.vida - danoAtaqueBarbaro2;

        double danoAtaqueMago1 = magos1.ataque(barbaro1.nome,barbaro1.defesa,magia2);
        barbaro1.vida = barbaro1.vida - danoAtaqueMago1;

        double danoAtaqueMago2 = magos1.ataque(clerigos1.nome,clerigos1.defesa,magia2);
        clerigos1.vida = clerigos1.vida - danoAtaqueMago2;

        double danoAtaqueBruxo1 = clerigos1.ataque(feiticeiros1.nome,feiticeiros1.defesa,poderDivino2);
        feiticeiros1.vida = feiticeiros1.vida - danoAtaqueBruxo1;

        double danoAtaqueBruxo2 = clerigos1.ataque(magos1.nome,magos1.defesa,poderDivino2);
        magos1.vida = magos1.vida - danoAtaqueBruxo2;

        double danoAtaqueMerlin1 = druidas1.ataque(clerigos1.nome,clerigos1.defesa,poderDivino1);
        clerigos1.vida = clerigos1.vida - danoAtaqueMerlin1;

        double danoAtaqueMerlin2 = druidas1.ataque(guerreiro1.nome,guerreiro1.defesa,poderDivino1);
        guerreiro1.vida = guerreiro1.vida - danoAtaqueMerlin2;

        double danoAtaqueSaci1 = feiticeiros1.ataque(druidas1.nome,druidas1.defesa,magia1);
        druidas1.vida = druidas1.vida - danoAtaqueSaci1;

        double danoAtaqueSaci2 = feiticeiros1.ataque(feiticeiros1.nome,feiticeiros1.defesa,magia1);
        feiticeiros1.vida = feiticeiros1.vida - danoAtaqueSaci2;











    }


}
