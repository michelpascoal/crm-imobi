package com.crmimobiliario.principal;

import com.crmimobiliario.dao.ClienteDAO;
import com.crmimobiliario.model.Cliente;

/**
 * Classe de teste para inserção de um cliente no banco de dados.
 * 
 * @author Michel
 */
public class TesteClienteDAO {
    public static void main(String[] args) {
        Cliente c = new Cliente(1, "Cliente Teste"); // 1 é o id do corretor que já existe no banco
        ClienteDAO dao = new ClienteDAO();

        boolean sucesso = dao.inserir(c);

        if (sucesso) {
            System.out.println("✅ Cliente inserido com sucesso!");
        } else {
            System.out.println("❌ Falha ao inserir cliente.");
        }
    }
}
