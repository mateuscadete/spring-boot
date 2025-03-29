package com.example.demo.model; // Pacote onde a classe Pessoa está localizada

import org.hibernate.validator.constraints.br.CPF; // Importa a anotação para validação de CPF
import jakarta.validation.constraints.NotBlank; // Importa a anotação para garantir que o campo não seja vazio
import jakarta.validation.constraints.NotNull; // Importa a anotação para garantir que o campo não seja nulo

// Classe Pessoa, que representa uma pessoa com atributos como nome, idade e CPF
public class Pessoa {

    // Atributo nome com validações
    @NotNull(message = "Nome não pode ser nulo") // Validação para garantir que o nome não seja nulo
    @NotBlank(message = "Nome não pode ser vazio") // Validação para garantir que o nome não seja uma string vazia
    private String nome;

    // Atributo idade com validação
    @NotNull(message = "Idade não pode ser nula") // Validação para garantir que a idade não seja nula
    private int idade;

    // Atributo CPF com validações
    @NotNull(message = "CPF não pode ser nulo") // Validação para garantir que o CPF não seja nulo
    @NotBlank(message = "CPF não pode ser vazio") // Validação para garantir que o CPF não seja vazio
    @CPF(message = "CPF inválido") // Validação para garantir que o CPF tenha o formato válido
    private String cpf;

    // Construtor da classe Pessoa, que inicializa os atributos com os valores fornecidos
    public Pessoa(String nome, int idade, String cpf) { 
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    // Método getter para o atributo nome
    public String getNome() {
        return nome;
    }

    // Método setter para o atributo nome, com restrição para alteração apenas se a idade for >= 18
    public void setNome(String nome) {
        if (this.idade >= 18) {
            this.nome = nome; // Altera o nome apenas se a idade for 18 ou maior
        }
    }

    // Método getter para o atributo idade
    public int getIdade() {
        return idade;
    }

    // Método setter para o atributo idade
    public void setIdade(int idade) {
        this.idade = idade; // Altera o valor de idade
    }

    // Método getter para o atributo cpf
    public String getCpf() {
        return cpf;
    }

    // Método setter para o atributo cpf
    public void setCpf(String cpf) {
        this.cpf = cpf; // Altera o valor de cpf
    }
}



