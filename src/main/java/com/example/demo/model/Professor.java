package com.example.demo.model; // Pacote onde a classe Professor está localizada

import jakarta.validation.constraints.NotBlank; // Importa a anotação para garantir que o campo não seja vazio
import jakarta.validation.constraints.NotNull; // Importa a anotação para garantir que o campo não seja nulo

// Classe Professor que herda de Pessoa e adiciona um atributo específico para registro
public class Professor extends Pessoa {

    // Atributo registro com validações
    @NotNull(message = "Registro não pode ser nulo") // Validação para garantir que o registro não seja nulo
    @NotBlank(message = "Registro não pode ser vazio") // Validação para garantir que o registro não seja vazio
    private String registro;

    // Construtor da classe Professor, que chama o construtor da classe Pessoa e inicializa o atributo registro
    public Professor(String nome, int idade, String cpf, String registro) {
        super(nome, idade, cpf); // Chama o construtor da classe Pessoa para inicializar nome, idade e cpf
        this.registro = registro; // Inicializa o atributo registro
    }

    // Método getter para o atributo registro
    public String getRegistro() {
        return registro; // Retorna o valor do atributo registro
    }

    // Método setter para o atributo registro
    public void setRegistro(String registro) {
        this.registro = registro; // Altera o valor do atributo registro
    }

    // Método ensinar que simula uma ação de ensino do professor
    public void ensinar() {
        System.out.println("Professor ensinando..."); // Imprime uma mensagem indicando que o professor está ensinando
    }
}

