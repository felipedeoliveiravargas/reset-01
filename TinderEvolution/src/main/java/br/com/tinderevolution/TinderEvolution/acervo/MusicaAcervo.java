package br.com.tinderevolution.TinderEvolution.acervo;

import dominio.Musica;

import java.util.ArrayList;
import java.util.List;

public class MusicaAcervo {
    private static int contador = 0;
    private static final List<Musica> musicas = new ArrayList<>();


    public Musica salvar(Musica musica){
        musica.setId(contador++);
        musicas.add(musica);
        return musica;
    }
    public List<Musica> listar() {
        return musicas;
    }
    public Musica procurar(int id) {
        for (Musica musica : musicas) {
            if (musica.getId() == id) {
                return musica;
            }
        }
        return null;
    }
    public boolean deletar(int id) {

        Musica musicaParaDeletar = procurar(id);
        if (musicaParaDeletar != null) {
            return musicas.remove(musicaParaDeletar);
        }

        return false;

    }
    public Musica editar(Musica musicaParaEditar, Musica musicaAtualizada) {

        musicaParaEditar.setNome(musicaAtualizada.getNome());
        musicaParaEditar.setArtista(musicaAtualizada.getArtista());
        musicaParaEditar.setLancamento(musicaAtualizada.getLancamento());
        musicaParaEditar.setEstiloMusical(musicaAtualizada.getEstiloMusical());

        return musicaParaEditar;

    }

}
