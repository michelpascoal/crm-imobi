package com.crmimobiliario.model;

/**
 * Classe que representa um cliente no sistema CRM Imobiliário.
 * Contém os dados básicos do cliente.
 * 
 * @author Michel
 */
public class Cliente {
    private int id_corretor;
    private String nome;

    public Cliente() {
    }

    public Cliente(int id_corretor, String nome) {
        this.id_corretor = id_corretor;
        this.nome = nome;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public int getIdCorretor() {
        return id_corretor;
    }

    public void setIdCorretor(int id) {
        this.id_corretor = id_corretor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}