package com.crmimobiliario.dao;

import com.crmimobiliario.model.Usuario;
import com.crmimobiliario.util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Classe responsável pelas operações de acesso a dados (DAO) 
 * relacionadas à entidade {@link Usuario}.
 * 
 * Utiliza JDBC para comunicação com o banco de dados.
 * 
 * @author Michel
 */
public class UsuarioDAO {

    /**
     * Insere um novo usuário na base de dados.
     *
     * @param usuario Objeto Usuario contendo os dados a serem inseridos
     * @return true se inserido com sucesso, false caso contrário
     */
    public boolean inserir(Usuario usuario) {
        String sql = "INSERT INTO usuario (nome, login, senha, email) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getLogin());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getEmail());

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Erro ao inserir usuário: " + e.getMessage());
            return false;
        }
    }
}
