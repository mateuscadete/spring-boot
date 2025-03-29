package com.example.demo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Aluno extends Pessoa{
    @NotBlank (message = "Matrícula não pode ser vazia")
    @NotNull(message = "Matrícula não pode ser nula")
    private String matricula;

    public Aluno(String nome, int idade, String cpf, String matricula) {
        super(nome, idade, cpf);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void estudar(){
        System.out.println("Aluno estudando...");
    }
}
