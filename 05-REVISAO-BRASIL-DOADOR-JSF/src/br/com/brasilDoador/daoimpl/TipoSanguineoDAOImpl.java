package br.com.brasilDoador.daoimpl;

import javax.persistence.EntityManager;

import br.com.brasilDoador.entity.TipoSanguineo;

public class TipoSanguineoDAOImpl extends DAOImpl<TipoSanguineo, Integer>{

	public TipoSanguineoDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
