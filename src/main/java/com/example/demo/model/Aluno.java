package com.example.demo.model;

// Importações para validação de campos
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

// Classe Aluno que herda da classe Pessoa
public class Aluno extends Pessoa {
    // Campo matrícula com validações para garantir que não seja vazio ou nulo
    @NotBlank(message = "Matrícula não pode ser vazia") // Validação para não permitir strings vazias
    @NotNull(message = "Matrícula não pode ser nula")  // Validação para não permitir valores nulos
    private String matricula;

    // Construtor da classe Aluno que chama o construtor da classe base (Pessoa)
    public Aluno(String nome, int idade, String cpf, String matricula) {
        super(nome, idade, cpf); // Chamada ao construtor da classe Pessoa
    }

    // Getter para o campo matrícula
    public String getMatricula() {
        return matricula;
    }

    // Setter para o campo matrícula
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Método específico da classe Aluno
    public void estudar() {
        System.out.println("Aluno estudando..."); // Mensagem indicando que o aluno está estudando
    }
}
