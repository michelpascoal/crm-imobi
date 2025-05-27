package com.crmimobiliario.dao;

import com.crmimobiliario.model.Cliente;
import com.crmimobiliario.util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Classe responsável pelas operações de acesso a dados (DAO) relacionadas à entidade {@link Cliente}.
 * Utiliza JDBC para comunicação com o banco de dados.
 * 
 * @author Michel
 */
public class ClienteDAO {

    /**
     * Insere um novo cliente na base de dados.
     *
     * @param cliente Objeto Cliente contendo os dados a serem inseridos
     * @return true se inserido com sucesso, false caso contrário
     */
    public boolean inserir(Cliente cliente) {
        String sql = "INSERT INTO cliente (nome, id_corretor) VALUES (?, ?)";

        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, cliente.getNome());
            stmt.setInt(2, cliente.getIdCorretor());

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Erro ao inserir cliente: " + e.getMessage());
            return false;
        }
    }
}