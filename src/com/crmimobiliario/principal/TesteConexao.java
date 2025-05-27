package com.crmimobiliario.principal;

import com.crmimobiliario.util.Conexao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Classe responsável por testar a conexão com o banco de dados MySQL.
 * Utiliza o método conectar() da classe {@link Conexao} para verificar
 * se a conexão está sendo estabelecida corretamente.
 * 
 * @author Michel
 */
public class TesteConexao {

    /**
     * Método principal para executar o teste de conexão com o banco de dados.
     * Exibe no console se a conexão foi bem-sucedida ou se ocorreu algum erro.
     *
     * @param args argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        try {
            Connection conn = Conexao.conectar();
            System.out.println("\n✅ Conexão com o banco de dados realizada com sucesso!");
            conn.close(); // sempre fechar a conexão após o uso
        } catch (SQLException e) {
            System.out.println("❌ Erro ao conectar ao banco de dados:");
            e.printStackTrace();
        }
    }
}
