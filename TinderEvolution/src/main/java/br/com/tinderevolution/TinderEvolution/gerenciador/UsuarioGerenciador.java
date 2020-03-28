package br.com.tinderevolution.TinderEvolution.gerenciador;

import acervo.UsuarioAcervo;
import dominio.Usuario;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class UsuarioGerenciador {
    private UsuarioAcervo acervo = new UsuarioAcervo();

    public Usuario salvar (Usuario usuario){
        List<Usuario> usuarios = acervo.listar();

        for (Usuario usuarioExistente : usuarios){
            if(usuario.getEmail().equals(usuarioExistente.getEmail())){
                System.out.println("Email existente");
                return usuarioExistente;
            }
        }
        if (usuario.getNome().isEmpty() || usuario.getEmail().isEmpty() || usuario.getTelefone().isEmpty() || usuario.getData() == null || usuario.getBio().isEmpty()) {
                System.out.println("Campos obrigatórios não informado!");
            return null;
    }
        if (calcularIdade(usuario.getData()) < 18) {
            System.out.println("Usuário deve ter idade igual ou maior a 18 anos!");
            return null;
        }

        return acervo.salvar(usuario);
    }
    public Usuario editar(int id, Usuario usuarioAtualizado) {
        Usuario usuarioParaEditar = procurar(id);

        if (usuarioParaEditar == null) {
            return null;
        }
        if(usuarioAtualizado.getNome().isEmpty() || usuarioAtualizado.getEmail().isEmpty() || usuarioAtualizado.getTelefone().isEmpty()|| usuarioAtualizado.getData()== null || usuarioAtualizado.getBio().isEmpty() ){
            System.out.println("Campos obrigatórios não informado");
            return null;
        }
        if (calcularIdade(usuarioAtualizado.getData()) < 18) {
            System.out.println("Usuário deve ter idade igual ou maior a 18 anos!");
            return null;
        }
         else {
            return acervo.editar(usuarioParaEditar, usuarioAtualizado);
        }
        }

    public List<Usuario> listar() {
        return acervo.listar();
    }

    public Usuario procurar(int id) {

        if (id > 0) {
            return acervo.procurar(id);
        }

        return null;
    }

    public boolean deletar(int id) {

        if (id > 0) {
            return acervo.deletar(id);
        }

        return false;
    }

    private double calcularIdade(LocalDate nascimento) {
        Period anos = Period.between(nascimento, LocalDate.now());
        double idade = anos.getYears();
        return idade;
    }
   // private List<Musica> musicasCurtidas = new ArrayList<>();
   // public void curtir(Musica musica){
     //   musicasCurtidas.add(musica);
   // }
    ///public void compara(Usuario usuario) {
       //int contador = 0;
      // for (Musica musicaMinha : this.musicasCurtidas){
       // for (Musica musicaDele : usuario.m)
        //}
    //}

}
