package Exercicio03.Tema1Aula2;

public class App {
    public static void main(String[] args) {
        Bicicleta bicicleta1 = new Bicicleta("Magrela", "Terra", 20, 2, 2);
        System.out.println(bicicleta1); // bicicleta1.toString();
        System.out.println(bicicleta1.toString()); // bicicleta1.toString();

        Navio navio1 = new Navio("Pérola Negra", "Água", 80, "Óleo",500);
        System.out.println(navio1);

        Submarino submarino1 = new Submarino("Submarino Amarelo", "Água", 80, "óleo", 12, 100);
        System.out.println(submarino1);

        Aviao aviao1 = new Aviao("Gavião Alado", "Ar", 500, "Querosene", 100, 1000);
        System.out.println(aviao1);

        Trem trem1 = new Trem("Maria Fumaça", "Terra", 60, "Eletricidade", 100, 10);
        System.out.println(trem1);
    }


}
