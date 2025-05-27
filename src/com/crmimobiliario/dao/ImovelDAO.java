package com.crmimobiliario.dao;

import com.crmimobiliario.model.Imovel;
import com.crmimobiliario.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Classe responsável por manipular os dados da tabela 'imovel' no banco de dados.
 * Fornece métodos para inserir imóveis no sistema.
 * 
 * @author Michel
 */
public class ImovelDAO {

    /**
     * Insere um novo imóvel no banco de dados.
     *
     * @param imovel objeto Imovel com os dados a serem inseridos
     * @return true se a inserção for bem-sucedida, false caso contrário
     */
    public boolean inserir(Imovel imovel) {
        try {
            Connection conn = Conexao.getConexao();

            String sql = "INSERT INTO imovel (titulo, descricao, tipo, endereco, valor, disponivel, id_corretor) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, imovel.getTitulo());
            stmt.setString(2, imovel.getDescricao());
            stmt.setString(3, imovel.getTipo());
            stmt.setString(4, imovel.getEndereco());
            stmt.setDouble(5, imovel.getValor());
            stmt.setBoolean(6, imovel.isDisponivel());
            stmt.setInt(7, imovel.getId_corretor());

            stmt.execute();
            stmt.close();
            conn.close();

            return true;
        } catch (Exception e) {
            System.out.println("Erro ao inserir imóvel: " + e.getMessage());
            return false;
        }
    }
}