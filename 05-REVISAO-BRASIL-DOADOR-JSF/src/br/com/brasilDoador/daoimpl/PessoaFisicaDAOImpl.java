package br.com.brasilDoador.daoimpl;

import javax.persistence.EntityManager;

import br.com.brasilDoador.entity.PessoaFisica;

public class PessoaFisicaDAOImpl extends DAOImpl<PessoaFisica, Integer>{

	public PessoaFisicaDAOImpl(EntityManager em) {
		super(em);
		
	}

}
