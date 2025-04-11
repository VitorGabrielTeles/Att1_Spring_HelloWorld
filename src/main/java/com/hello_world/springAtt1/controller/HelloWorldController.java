package com.hello_world.springAtt1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/bsms")
    public String bsms() {
        return "<h1>Lista de BSMs:</h1><ul>"
                + "<li>Mentalidade de Crescimento</li>"
                + "<li>Orientação ao Futuro</li>"
                + "<li>Responsabilidade Pessoal</li>"
                + "<li>Comunicação</li>"
                + "<li>Proatividade</li>"
                + "<li>Orientação ao Detalhe</li>"
                + "<li>Trabalho em Equipe</li>"
                + "</ul>";
    }

    @GetMapping("/aprendizagemSemanal")
    public String aprendizagemSemanal() {
        return "<h1>Aprendizados da Semana:</h1><ul>"
                + "<li>Spring</li>"
                + "<li>JPA</li>"
                + "<li>Modelo de Postagem de Classe</li>"
                + "<li>Repositório de Postagem</li>"
                + "<li>Métodos de Listagem</li>"
                + "<li>Método Buscar</li>"
                + "<li>Método Cadastrar</li>"
                + "<li>Método Atualizar</li>"
                + "<li>Método Apagar</li>"
                + "</ul>";
    }
}
