package Aula01;

public class App {

    public static void main(String []args){
        int valorUm = 33;
        int valorDois = 45;
        System.out.println("Hello World");

        Calculadora calculadoraDeIdades = new Calculadora();
        int somaDasIdades = calculadoraDeIdades.somar(valorUm, valorDois);
        System.out.println("Soma das Idades: " + somaDasIdades);

        int subtracaoDasIdades = calculadoraDeIdades.subtrai(valorUm, valorDois);
        System.out.println("Subtração das Idades: " + subtracaoDasIdades);

        int multiplicacaoDasIdades = calculadoraDeIdades.multiplica(valorUm, valorDois);
        System.out.println("Multiplicação das Idades: " + multiplicacaoDasIdades);

        double num1 = new Double(valorUm);
        double num2 = new Double(valorDois);
        double divisaoDasIdades = calculadoraDeIdades.divide(num1, num2);
        System.out.println("Divisão das Idades: " + divisaoDasIdades);

        Comparador comparadorDeIdades = new Comparador();
         boolean comparacaoDeIdades = comparadorDeIdades.menorQue (valorUm,valorDois);
        System.out.println("Comparação de Idades: " + comparacaoDeIdades);



                    }

        };
