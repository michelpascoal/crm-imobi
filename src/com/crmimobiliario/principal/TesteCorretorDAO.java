package com.crmimobiliario.principal;

import com.crmimobiliario.dao.CorretorDAO;
import com.crmimobiliario.model.Corretor;

public class TesteCorretorDAO {

    public static void main(String[] args) {
        Corretor c = new Corretor("Carlos Imóveis", "48999998888");
        CorretorDAO dao = new CorretorDAO();

        boolean sucesso = dao.inserir(c);

        if (sucesso) {
            System.out.println("✔ Corretor inserido com sucesso!");
        } else {
            System.out.println("❌ Falha ao inserir corretor.");
        }
    }
}
