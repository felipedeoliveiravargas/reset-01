package Exercicio03;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("aluno1");
        aluno1.nota1 = 8;
        aluno1.nota2 = 8;
        aluno1.notaFinal = (aluno1.nota1 + aluno1.nota2)/2;
        System.out.println("Média Final: " + aluno1.notaFinal);

        aluno1.menorOuIgual(aluno1.notaFinal);
        System.out.println(aluno1.nome);
        System.out.println(aluno1.notaFinal);
        System.out.println(aluno1.menorOuIgual(aluno1.notaFinal));


    }
}
