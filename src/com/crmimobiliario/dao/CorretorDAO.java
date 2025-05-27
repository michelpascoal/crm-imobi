package com.crmimobiliario.dao;

import com.crmimobiliario.model.Corretor;
import com.crmimobiliario.util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Classe responsável pelas operações de acesso aos dados da entidade {@link Corretor}.
 * Utiliza JDBC para comunicação com o banco de dados.
 *
 * @author Michel
 */
public class CorretorDAO {

    public boolean inserir(Corretor corretor) {
        String sql = "INSERT INTO corretor (nome, telefone) VALUES (?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, corretor.getNome());
            stmt.setString(2, corretor.getTelefone());

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Erro ao inserir corretor: " + e.getMessage());
            return false;
        }
    }
}
