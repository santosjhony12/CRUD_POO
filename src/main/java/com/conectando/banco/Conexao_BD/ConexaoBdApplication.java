package com.conectando.banco.Conexao_BD;

import Model.Colaborador;
import Model.ColaboradorDAO;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;
import java.util.List;


@SpringBootApplication
public class ConexaoBdApplication {

	public static void main(String[] args) {
		Colaborador colaborador = new Colaborador();
		ColaboradorDAO colaboradorDAO = new ColaboradorDAO();

		colaborador.setEmail("santosdesouza.com");
		colaborador.setNome("Jhony");
		colaborador.setSalario(1200);
		colaborador.setDataContratacao(Calendar.getInstance());

		colaboradorDAO.cadastrar(colaborador);
		System.out.println("CADASTRADO!");



		List<Colaborador> lista = colaboradorDAO.listar();
		for(Colaborador item : lista){
			System.out.println(item.getCodigo()+" "+item.getNome()+" "+item.getEmail()+" "+item.getSalario()+" "+item.getDataContratacao().getTime()+" ");

		}



	}



	}
