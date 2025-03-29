package com.example.demo.restservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;
import com.example.demo.model.Pessoa;
import com.example.demo.model.Aluno;
import com.example.demo.model.Professor;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class PessoaRestServices {
    @GetMapping("/pessoas")
    public List<Pessoa> getPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Aluno("João", 20, "123.456.789-00", "123-n"));
        pessoas.add(new Professor("Carlos", 40, "987.654.321-00", "História"));
        pessoas.add(new Aluno("Maria", 21, "987.654.321-00", "456-n"));
        pessoas.add(new Professor("Fernanda", 35, "456.789.123-00", "Matemática"));
        return pessoas;
    }

    @PostMapping("/pessoas")
    public Pessoa inserirPessoa(@RequestBody @Valid Pessoa pessoa) {
        System.out.println("Pessoa inserida: " + pessoa);
        return pessoa;
    }
}

