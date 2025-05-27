package com.crmimobiliario.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe responsável por estabelecer conexão com o banco de dados MySQL.
 * Utiliza JDBC (Java Database Connectivity).
 * 
 * É necessário que o driver mysql-connector-j esteja adicionado ao projeto.
 */
public class Conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/crm_imobiliario";
    private static final String USUARIO = "root";
    private static final String SENHA = "Prozin123!";

    /**
     * Método principal para obter conexão com o banco.
     * 
     * @return Connection objeto de conexão com o banco
     * @throws SQLException caso ocorra erro ao conectar
     */
    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }

    /**
     * Método alternativo para compatibilidade com outras chamadas no projeto.
     * 
     * @return Connection objeto de conexão com o banco
     * @throws SQLException caso ocorra erro ao conectar
     */
    public static Connection getConexao() throws SQLException {
        return conectar();
    }
}