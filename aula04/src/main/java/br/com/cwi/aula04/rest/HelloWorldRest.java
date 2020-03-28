package br.com.cwi.aula04.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("helloworld")
public class HelloWorldRest {
    @GetMapping
    public String helloWorld (){
        return "Hello World";
    }
    @GetMapping("{nome}")
    public String helloWorldparametros (@PathVariable("nome") String nomeDoUsuario){
        return "Hello World, " + nomeDoUsuario;
    }
}
