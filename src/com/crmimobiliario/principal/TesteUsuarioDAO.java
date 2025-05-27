package com.crmimobiliario.principal;

import com.crmimobiliario.dao.UsuarioDAO;
import com.crmimobiliario.model.Usuario;

/**
 * Classe de teste para inserção de um usuário no banco de dados.
 */
public class TesteUsuarioDAO {

    public static void main(String[] args) {
        Usuario u = new Usuario("Michel Pascoal", "michel", "1234", "michel@email.com");
        UsuarioDAO dao = new UsuarioDAO();

        boolean sucesso = dao.inserir(u);

        if (sucesso) {
            System.out.println("✅ Usuário inserido com sucesso!");
        } else {
            System.out.println("❌ Falha ao inserir usuário.");
        }
    }
}
