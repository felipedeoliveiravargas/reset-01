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









    }


}
