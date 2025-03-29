package com.example.demo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Professor extends Pessoa{
    @NotNull (message = "Registro não pode ser nulo")
    @NotBlank (message = "Registro não pode ser vazio")
    private String registro;

    public Professor(String nome, int idade, String cpf, String registro) {
        super(nome, idade, cpf);
        this.registro = registro;
    }

    public String getRegistro(){
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public void ensinar(){
        System.out.println("Professor ensinando...");

    }
}
