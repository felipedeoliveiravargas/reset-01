package br.com.cwi.aula04.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("nome")
public class Nome {
    private String nome = "felipe";
    @GetMapping
    public String nome() {
        return nome;
    }
    @PutMapping("{nome}")
    public String nomeEdit(@PathVariable("nome")String nomeEditado) {
        if(nome == null){
            return "Usuário inexistente";
        }
        nome = nomeEditado;
        return nome;
    }
    @DeleteMapping("{nome}")
    public String  nomeDelete(@PathVariable("nome")String deletarNome) {
        if(nome.contains(deletarNome)){
            nome = null;
            return "usuário deletado";
        } else {
            System.out.println("Nome não encontrado");
            return "Usuário não encontrado";
        }
                   }

    @PostMapping("{nome}")
    public String  nomePost(@PathVariable("nome")String postNome) {
        nome = postNome;
        return "Usuário adicionado";
         }



}
