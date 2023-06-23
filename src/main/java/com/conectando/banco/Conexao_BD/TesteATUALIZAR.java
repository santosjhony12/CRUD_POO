package com.conectando.banco.Conexao_BD;
import Model.ConexaoBD;
import Model.ColaboradorDAO;
import Model.Colaborador;
public class TesteATUALIZAR {

    public static void main(String[] args) {

        ColaboradorDAO dao = new ColaboradorDAO();
        //Recupera o colaborador com código 1
        Colaborador colaborador = dao.buscarPorId(10);
        //Imprime os valores do colaborador
        System.out.println(colaborador.getCodigo() + " "
                + colaborador.getNome() + " " + colaborador.getEmail() + " "
                + colaborador.getSalario() + " "
                + colaborador.getDataContratacao().getTime());
        //Altera os valores de alguns atributos do colaborador
        colaborador.setSalario(1500);
        colaborador.setEmail("testando@fiap.com.br");
        //Atualiza no banco de dados
        dao.atualizar(colaborador);
        System.out.println(colaborador.getCodigo() + " "
                + colaborador.getNome() + " " + colaborador.getEmail() + " "
                + colaborador.getSalario() + " "
                + colaborador.getDataContratacao().getTime());
    }

}