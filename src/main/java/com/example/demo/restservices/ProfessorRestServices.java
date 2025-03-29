package com.example.demo.restservices; // Pacote onde a classe ProfessorRestServices está localizada

import org.springframework.web.bind.annotation.GetMapping; // Importa a anotação para mapear o método GET
import org.springframework.web.bind.annotation.PostMapping; // Importa a anotação para mapear o método POST
import org.springframework.web.bind.annotation.RequestBody; // Importa a anotação para vincular o corpo da requisição ao parâmetro do método
import org.springframework.web.bind.annotation.RequestMapping; // Importa a anotação para definir a URL base para os métodos
import org.springframework.web.bind.annotation.RestController; // Importa a anotação para definir um controlador REST

import java.util.List; // Importa a classe List do Java
import java.util.ArrayList; // Importa a classe ArrayList do Java
import com.example.demo.model.Professor; // Importa a classe Professor do pacote modelo

import jakarta.validation.Valid; // Importa a anotação para validar o objeto Professor recebido

// Anotação RestController define esta classe como um controlador REST para responder a requisições HTTP
@RestController
@RequestMapping("/api/v1") // Define a URL base para as requisições como /api/v1
public class ProfessorRestServices {

    // Método para responder à requisição GET na URL /api/v1/professores
    @GetMapping("/professores")
    public List<Professor> getProfessores() {
        // Cria uma lista de professores
        List<Professor> professores = new ArrayList<>();
        
        // Adiciona alguns professores à lista
        professores.add(new Professor("João", 20, "123.456.789-00", "123")); // Adiciona um professor
        professores.add(new Professor("Maria", 21, "987.654.321-00", "456")); // Adiciona outro professor
        professores.add(new Professor("José", 22, "456.789.123-00", "789")); // Adiciona mais um professor
        
        return professores; // Retorna a lista de professores como resposta da requisição GET
    }

    // Método para responder à requisição POST na URL /api/v1/professores
    @PostMapping("/professores")
    public Professor inserirProfessor(@RequestBody @Valid Professor professor) {
        // Recebe um objeto Professor no corpo da requisição e valida se ele é válido (usando a anotação @Valid)
        System.out.println("Professor inserido: " + professor); // Exibe o professor inserido no console
        
        return professor; // Retorna o professor recebido como resposta da requisição POST
    }

}

