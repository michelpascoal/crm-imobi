package com.crmimobiliario.model;

/**
 * Representa um usuário do sistema CRM Imobiliário.
 * Contém informações básicas como nome, login e senha.
 * 
 * Esta classe é usada em conjunto com a classe UsuarioDAO
 * para manipulação de dados no banco.
 * 
 * @author Michel
 */
public class Usuario {
    private String nome;
    private String login;
    private String senha;

    /**
     * Construtor padrão.
     */
    public Usuario() {}

    /**
     * Construtor com parâmetros.
     *
     * @param nome  Nome do usuário.
     * @param login Login do usuário.
     * @param senha Senha do usuário.
     * @param email E-mail do usuário.
     */
    public Usuario(String nome, String login, String senha, String email) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
    }

    // Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    private String email;

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
