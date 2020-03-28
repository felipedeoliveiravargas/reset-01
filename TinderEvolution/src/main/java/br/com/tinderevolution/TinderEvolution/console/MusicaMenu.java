package br.com.tinderevolution.TinderEvolution.console;

import dominio.EstiloMusical;
import dominio.Musica;
import gerenciador.MusicaGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MusicaMenu {
    private MusicaGerenciador gerenciador;

    public MusicaMenu() {
        this.gerenciador = new MusicaGerenciador();
    }
    public void opcoes() {
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X'){
            System.out.println("\n Selecione uma das Opções");
            System.out.println("[C] Criar");
            System.out.println("[E] Editar");
            System.out.println("[L] Listar");
            System.out.println("[P] Procurar");
            System.out.println("[D] Deletar");
            System.out.println("[X] Voltar");
            System.out.print("> ");
            opcao = scanner.next().charAt(0);


            switch (opcao){
                case 'C':
                    criar();
                    break;
                case 'E':
                    editar();
                    break;
                case 'L':
                    listar();
                    break;
                case 'P':
                    procurar();
                    break;
                case 'D':
                    deletar();
                    break;
                case 'X':
                    System.out.println("...");
                    break;
                default:
                    System.out.println("...Opção Inválida");
            }

        }
    }
    public Musica criar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Criação de Música");
        System.out.println("Nome");
        String nome = scanner.nextLine();

        System.out.println("Artista");
        String artista = scanner.nextLine();

        System.out.println("Ano de Lançamento");
        int ano = scanner.nextInt();

        System.out.println("Mês de Lançamento");
        int mes = scanner.nextInt();

        System.out.println("Dia de Lançamento");
        int dia = scanner.nextInt();

        System.out.println("Estilo");
        System.out.println("[ F ] FUNK");
        System.out.println("[ P ] PAGODE");
        System.out.println("[ R ] ROCK");
        System.out.println("[ I ] INDIE");
        System.out.println("[ S ] SERTANEJO");
        System.out.println("[ RA ] RAP");
        System.out.println("[ M ] METAL");
        System.out.print("> ");

        String estilo = scanner.next();

        EstiloMusical estiloMusical;
        switch (estilo){
            case "F":
                estiloMusical = EstiloMusical.FUNK;
            break;
            case "P":
                estiloMusical = EstiloMusical.PAGODE;
                break;
            case "R":
                estiloMusical = EstiloMusical.ROCK;
                break;
            case "I":
                estiloMusical = EstiloMusical.INDIE;
                break;
            case "S":
                estiloMusical = EstiloMusical.SERTANEJO;
                break;
            case "RA":
                estiloMusical = EstiloMusical.RAP;
                break;
            case "M":
                estiloMusical = EstiloMusical.METAL;
                break;
            default:
                estiloMusical = EstiloMusical.FUNK;
                break;
        }

        Musica musica = new Musica(nome, artista, estiloMusical, LocalDate.of(ano, mes, dia));
        return gerenciador.salvar(musica);
        }
        public Musica editar(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("\n Edição de Música");
            System.out.println("Qual música deseja editar?");
            List<Musica> musicas = gerenciador.listar();
            for (Musica musica: musicas){
                System.out.println("[" + musica.getId() + " ] - "+ musica.getNome());
            }
            int id = scanner.nextInt();

            System.out.print("Nome:");
            String nome = scanner.nextLine();

            System.out.print("Artista");
            String artista = scanner.nextLine();

            System.out.print("Ano de Lançamento");
            int ano = scanner.nextInt();

            System.out.print("Mês de Lançamento: ");
            int mes = scanner.nextInt();

            System.out.print("Dia de Lançamento: ");
            int dia = scanner.nextInt();

            System.out.println("Estilo: ");
            System.out.println("[ F ] FUNK");
            System.out.println("[ P ] PAGODE");
            System.out.println("[ R ] ROCK");
            System.out.println("[ I ] INDIE");
            System.out.println("[ S ] SERTANEJO");
            System.out.println("[ RA ] RAP");
            System.out.println("[ M ] METAL");
            System.out.print("> ");

            String estilo = scanner.next();

            EstiloMusical estiloMusical;
            switch (estilo){
                case "F":
                    estiloMusical = EstiloMusical.FUNK;
                    break;
                case "P":
                    estiloMusical = EstiloMusical.PAGODE;
                    break;
                case "R":
                    estiloMusical = EstiloMusical.ROCK;
                    break;
                case "I":
                    estiloMusical = EstiloMusical.INDIE;
                    break;
                case "S":
                    estiloMusical = EstiloMusical.SERTANEJO;
                    break;
                case "RA":
                    estiloMusical = EstiloMusical.RAP;
                    break;
                case "M":
                    estiloMusical = EstiloMusical.METAL;
                    break;
                default:
                    estiloMusical = EstiloMusical.FUNK;
                    break;
            }

            Musica Atualizacao = new Musica(nome, artista, estiloMusical, LocalDate.of(ano,mes,dia));

            Musica musicaAtualizada = gerenciador.editar(id, Atualizacao);

            if (musicaAtualizada == null){
                System.out.println("Música não encontrada.");
            } else {
                System.out.println(musicaAtualizada);
            }

            return musicaAtualizada;
        }
        private List<Musica> listar(){
            System.out.println("\n Listagem de Música...");
            List<Musica> musicas = gerenciador.listar();

            for (Musica musica : musicas) {
                System.out.println(musica);
            }
            return musicas;
        }
        private void procurar(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("\n Pesquisa de Música...");
            System.out.println("Qual o código da Música?");
            System.out.print("> ");

            int id = scanner.nextInt();

            Musica musica = gerenciador.procurar(id);

            if (musica==null) {
                System.out.println("Música não encontrada");
                } else {
                System.out.println(musica);
            }
        }
        private void deletar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de Música...");
        System.out.println("Qual música deseja deletar?");

        List<Musica> musicas = gerenciador.listar();
        for (Musica musica : musicas){
            System.out.println("[" + musica.getId() + " ] - " + musica.getNome());
        }
            System.out.print(">");

            int id = scanner.nextInt();

            if (gerenciador.deletar(id)){
                System.out.println("Música deletada");
            } else {
                System.out.println("Música não encontrada.");
            }

        }
}
