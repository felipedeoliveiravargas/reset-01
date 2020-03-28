package br.com.tinderevolution.TinderEvolution.acervo;

import dominio.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioAcervo {
    private static int contadorId = 1;
    private static final List<Usuario> usuarios = new ArrayList<>();

    public Usuario salvar(Usuario usuario){
        usuario.setId(contadorId++);
        usuarios.add(usuario);
        return usuario;
    }

    public List<Usuario> listar(){
        return usuarios;
    }

    public Usuario procurar(int id){

        for (Usuario usuario : usuarios){
            if (usuario.getId() == id){
                return usuario;
            }
        }

        return null;
    }

    public boolean deletar(int id){

        Usuario usuarioParaDeletar = procurar(id);
        if (usuarioParaDeletar != null){
            return usuarios.remove(usuarioParaDeletar);
        }

        return false;
    }

    public Usuario editar(Usuario usuarioParaEditar, Usuario usuarioAtualizado){
        usuarioParaEditar.setNome(usuarioAtualizado.getNome());
        usuarioParaEditar.setEmail(usuarioAtualizado.getEmail());
        usuarioParaEditar.setTelefone(usuarioAtualizado.getTelefone());
        usuarioParaEditar.setData(usuarioAtualizado.getData());
        usuarioParaEditar.setBio(usuarioAtualizado.getBio());
        usuarioParaEditar.setLatitude(usuarioAtualizado.getLatitude());
        usuarioParaEditar.setLongitude(usuarioAtualizado.getLongitude());

        return usuarioParaEditar;
    }
}

