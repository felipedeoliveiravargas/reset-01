import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Arma arma1 =   new Arma("Espada justiceira", 1.0);
        Arma arma2 =   new Arma("Adaga Medieval", 1.0);
        Magia magia1 =   new Magia("Carapuça Alada", 2.0, 200.0);
        Magia magia2=   new Magia("La Boba", 2.0, 200.0);
        PoderDivino poderDivino1=   new PoderDivino("Dipirona do SUS", 3.0, 500.0);
        PoderDivino poderDivino2=   new PoderDivino("Suco de Cevada", 3.0, 400.0);

        ArrayList<AtributosPersonagem> listaDePersonagens = new ArrayList<AtributosPersonagem>();
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Quantos Personagens você deseja criar? ");
        int numeroDePersonagens = in.nextInt();
        int i = 0;
        while (i < numeroDePersonagens) {
            System.out.println(i);
            System.out.println("Crie Seu Herói ");
            System.out.println("Primeiro, escolha a classe do personagem:");
            System.out.println("G - Guerreiro");
            System.out.println("B - Bárbaro");
            System.out.println("C - Clérigo");
            System.out.println("D - Druida");
            System.out.println("M - Mago");
            System.out.println("F - Feiticeiro");

            System.out.print("Tipo: ");
            char tipo = in.next().charAt(0);
            System.out.print("Nome: ");
            String nome = in.next();
            System.out.print("Vida: ");
            double vida = in.nextDouble();
            System.out.print("Ataque: ");
            double ataque = in.nextDouble();
            System.out.print("Defesa: ");
            double defesa = in.nextDouble();

            int fe;
            int mana;
            
            AtributosPersonagem personagem;
            switch (tipo) {
                case 'G':
                    System.out.println("Criando guerreiro...");
                    personagem = new Guerreiros(nome, vida, ataque, defesa, arma1);
                    break;

                case 'B':
                    System.out.println("Criando bárbaro...");
                    personagem = new Barbaros(nome, vida, ataque, defesa, arma2);
                    break;

                case 'C':
                    System.out.print("Fé: ");
                    fe = in.nextInt();

                    System.out.println("Criando clérigo...");
                    personagem = new Clerigos(nome, vida, ataque, defesa, poderDivino1, fe);
                    break;

                case 'D':
                    System.out.print("Fé: ");
                    fe = in.nextInt();

                    System.out.println("Criando druida...");
                    personagem = new Druidas(nome, vida, ataque, defesa, poderDivino1, fe);
                    break;

                case 'M':
                    System.out.print("Mana: ");
                    mana = in.nextInt();

                    System.out.println("Criando mago...");
                    personagem = new Magos(nome, vida, ataque, defesa, magia1, mana);
                    break;

                case 'F':
                    System.out.print("Mana: ");
                    mana = in.nextInt();

                    System.out.println("Criando feiticeiro...");
                    personagem = new Feiticeiros(nome, vida, ataque, defesa, magia1, mana);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + tipo);
            }
            listaDePersonagens.add(personagem);
            i++;
        
        }

        for(AtributosPersonagem item : listaDePersonagens){
            System.out.println(item.nome);
        }
    }


}


