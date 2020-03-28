package br.com.tinderevolution.TinderEvolution.console;

import dominio.Usuario;
import gerenciador.UsuarioGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class UsuarioMenu {
    public UsuarioGerenciador gerenciador;

    public UsuarioMenu() {
        this.gerenciador = new UsuarioGerenciador();
    }

    public void opcoes() {
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {
            System.out.println("\n Selecione uma das opções");
            System.out.println("[ C ] Cadastrar");
            System.out.println("[L] Listar");
            System.out.println("[P] Pesquisar");
            System.out.println("[D] Deletar");
            System.out.println("[E] Editar");
            System.out.println("[X] Voltar");
            System.out.print("> ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'C':
                    cadastrar();
                    break;
                case 'L':
                    listar();
                    break;
                case 'P':
                    pesquisar();
                    break;
                case 'D':
                    deletar();
                    break;
                case 'E':
                    editar();
                    break;
                case 'X':
                    System.out.println("...");
                    break;
                default:
                    System.out.println("...Opção Inválida");
            }
        }
    }

    public Usuario cadastrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Cadastro do usuário");
        System.out.println("Nome do usuário");
        String nome = scanner.nextLine();

        System.out.println("E-mail");
        String email = scanner.nextLine();

        System.out.println("Telefone");
        String telefone = scanner.nextLine();

        System.out.println("Bio");
        String bio = scanner.nextLine();

        System.out.println("Ano de nascimento: ");
        int ano = scanner.nextInt();

        System.out.println("Mês de nascimento: ");
        int mes = scanner.nextInt();

        System.out.println("Dia de nascimento: ");
        int dia = scanner.nextInt();

        System.out.println("Digite sua Latitude");
        double latitude = scanner.nextDouble();

        System.out.println("Digite sua Longitude");
        double longitude = scanner.nextDouble();
        Usuario usuario = new Usuario(nome, email, telefone, LocalDate.of(ano, mes, dia), bio, latitude, longitude);
        return gerenciador.salvar(usuario);
    }

    private List<Usuario> listar() {

        System.out.println("\nLista de usuários...");
        List<Usuario> usuarios = gerenciador.listar();

        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
        return usuarios;
    }

    private void pesquisar() {

        Scanner scanner = new Scanner((System.in));
        System.out.println("\nPesquisa de usuário...");
        System.out.println("Qual o código do usuário?");

        System.out.println("> ");
        int id = scanner.nextInt();

        Usuario usuario = gerenciador.procurar(id);

        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
        } else {
            System.out.println(usuario);
        }
    }

    private void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de usuário...");
        System.out.println("Qual usuário deseja deletar?");

        List<Usuario> usuarios = gerenciador.listar();
        for (Usuario usuario : usuarios) {
            System.out.println("[" + usuario.getId() + "] - " + usuario.getNome());
        }

        System.out.println("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Usuário deletado.");
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }
    public Usuario editar(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEdição de Usuário...");
        System.out.println("Qual usuário deseja editar?");

        List<Usuario> usuarios = gerenciador.listar();
        for (Usuario usuario : usuarios){
            System.out.println("[" + usuario.getId() + "] - " + usuario.getNome());
        }

        System.out.println("> ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("E-mail: ");
        String email = scanner.nextLine();

        System.out.println("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.println("Bio: ");
        String bio = scanner.nextLine();

        System.out.println("Ano de nascimento: ");
        int ano = scanner.nextInt();

        System.out.println("Mês de nascimento: ");
        int mes = scanner.nextInt();

        System.out.println("Dia de nascimento: ");
        int dia = scanner.nextInt();


        System.out.println("Digite sua latitude: ");
        double latitude = scanner.nextDouble();

        System.out.println("Digite sua longitude: ");
        double longitude = scanner.nextDouble();

        Usuario atualizacao = new Usuario(nome, email, telefone, LocalDate.of(ano, mes, dia), bio, latitude, longitude);

        Usuario usuarioAtualizado = gerenciador.editar(id, atualizacao);

        if(usuarioAtualizado == null){
            System.out.println("Usuário não encontrado.");
        }
        else {
            System.out.println(usuarioAtualizado);
        }

        return usuarioAtualizado;
    }
}


