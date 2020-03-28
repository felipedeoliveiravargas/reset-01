package br.com.cwi.aula04.rest;

import br.com.cwi.aula04.dominio.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRest {
    private List<Posts>listaDePosts = new ArrayList<>();

    public List<Post> all(){
        return listaDePosts;
    }
}
