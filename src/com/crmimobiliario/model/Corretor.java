package com.crmimobiliario.model;

public class Corretor {
    private int id;
    private String nome;
    private String telefone;

    public Corretor() {}

    public Corretor(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}