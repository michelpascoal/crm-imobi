package com.crmimobiliario.principal;

import com.crmimobiliario.dao.ImovelDAO;
import com.crmimobiliario.model.Imovel;

/**
 * Classe de teste para inserção de um imóvel no banco de dados.
 * 
 * Este teste insere um imóvel com todos os campos obrigatórios preenchidos.
 * Certifique-se de que o id_corretor informado já exista na tabela corretor.
 * 
 * @author Michel
 */
public class TesteImovelDAO {

    public static void main(String[] args) {
        // Criação de um novo imóvel com dados fictícios
        Imovel imovel = new Imovel();
        imovel.setTitulo("Apartamento Novo");
        imovel.setDescricao("Apartamento com 3 quartos, 2 banheiros e 1 vaga de garagem.");
        imovel.setTipo("Apartamento");
        imovel.setEndereco("Rua das Flores, 123 - Centro");
        imovel.setValor(320000.00);
        imovel.setDisponivel(true);
        imovel.setId_corretor(1); // id de corretor já existente no banco

        // Criação do DAO e tentativa de inserção
        ImovelDAO dao = new ImovelDAO();
        boolean sucesso = dao.inserir(imovel);

        // Exibe o resultado
        if (sucesso) {
            System.out.println("✔ Imóvel inserido com sucesso!");
        } else {
            System.out.println("✘ Falha ao inserir imóvel.");
        }
    }
}