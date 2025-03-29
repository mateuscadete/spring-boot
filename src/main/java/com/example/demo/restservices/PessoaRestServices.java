package com.example.demo.restservices; // Pacote onde a classe PessoaRestServices está localizada

import org.springframework.web.bind.annotation.GetMapping; // Importa a anotação para mapear o método GET
import org.springframework.web.bind.annotation.PostMapping; // Importa a anotação para mapear o método POST
import org.springframework.web.bind.annotation.RequestBody; // Importa a anotação para vincular o corpo da requisição ao parâmetro do método
import org.springframework.web.bind.annotation.RequestMapping; // Importa a anotação para definir a URL base para os métodos
import org.springframework.web.bind.annotation.RestController; // Importa a anotação para definir um controlador REST

import java.util.List; // Importa a classe List do Java
import java.util.ArrayList; // Importa a classe ArrayList do Java
import com.example.demo.model.Pessoa; // Importa a classe Pessoa do pacote modelo
import com.example.demo.model.Aluno; // Importa a classe Aluno do pacote modelo
import com.example.demo.model.Professor; // Importa a classe Professor do pacote modelo

import jakarta.validation.Valid; // Importa a anotação para validar o objeto Pessoa recebido

// Anotação RestController define esta classe como um controlador REST para responder a requisições HTTP
@RestController
@RequestMapping("/api/v1") // Define a URL base para as requisições como /api/v1
public class PessoaRestServices {

    // Método para responder à requisição GET na URL /api/v1/pessoas
    @GetMapping("/pessoas")
    public List<Pessoa> getPessoas() {
        // Cria uma lista de pessoas
        List<Pessoa> pessoas = new ArrayList<>();
        
        // Adiciona algumas pessoas (Alunos e Professores) à lista
        pessoas.add(new Aluno("João", 20, "123.456.789-00", "123-n")); // Adiciona um aluno
        pessoas.add(new Professor("Carlos", 40, "987.654.321-00", "História")); // Adiciona um professor
        pessoas.add(new Aluno("Maria", 21, "987.654.321-00", "456-n")); // Adiciona outro aluno
        pessoas.add(new Professor("Fernanda", 35, "456.789.123-00", "Matemática")); // Adiciona outro professor
        
        return pessoas; // Retorna a lista de pessoas como resposta da requisição GET
    }

    // Método para responder à requisição POST na URL /api/v1/pessoas
    @PostMapping("/pessoas")
    public Pessoa inserirPessoa(@RequestBody @Valid Pessoa pessoa) {
        // Recebe um objeto Pessoa no corpo da requisição e valida se ele é válido (usando a anotação @Valid)
        System.out.println("Pessoa inserida: " + pessoa); // Exibe a pessoa inserida no console
        
        return pessoa; // Retorna a pessoa recebida como resposta da requisição POST
    }
}


