package com.example.demo.restservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;
import com.example.demo.model.Aluno;

import jakarta.validation.Valid;

/**
 * Classe responsável por fornecer serviços REST relacionados à entidade Aluno.
 * Esta classe expõe endpoints para obter a lista de alunos e inserir um novo aluno.
 * 
 * Endpoints disponíveis:
 * - GET /api/v1/alunos: Retorna uma lista de alunos.
 * - POST /api/v1/alunos: Insere um novo aluno e retorna os dados do aluno inserido.
 * 
 * Anotações:
 * - @RestController: Indica que esta classe é um controlador REST.
 * - @RequestMapping("/api/v1"): Define o prefixo de URL para os endpoints desta classe.
 */
@RestController
@RequestMapping("/api/v1")
public class AlunoRestServices {
    @GetMapping("/alunos")
    public List<Aluno> getAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno ("João", 20, "123.456.789-00", "123-n"));
        alunos.add(new Aluno ("Maria", 21, "987.654.321-00", "456-n"));
        alunos.add(new Aluno ("José", 22, "456.789.123-00",     "789"));
        return alunos;
    }

    @PostMapping("/alunos")
    public Aluno inserirAluno(@RequestBody @Valid Aluno aluno) {
        System.out.println("Aluno inserido: " + aluno);
        return aluno;
    }
}
