package com.example.demo.restservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;
import com.example.demo.model.Professor;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class ProfessorRestServices {
    @GetMapping("/professores")
    public List<Professor> getProfessores() {
        List<Professor> professores = new ArrayList<>();
        professores.add(new Professor ("João", 20, "123.456.789-00","123"));
        professores.add(new Professor ("Maria", 21, "987.654.321-00","456"));
        professores.add(new Professor ("José", 22, "456.789.123-00","789"));
        return professores;
    }

    @PostMapping("/professores")
    public Professor inserirProfessor(@RequestBody @Valid Professor professor) {
        System.out.println("Professor inserido: " + professor);
        return professor;
    }

}
