package com.rodrigo.ticket.repository;

import org.springframework.stereotype.Repository;

import com.rodrigo.ticket.model.Pesquisa;

@Repository
public class SearchRepository extends AbstractJPADAO<Pesquisa> {
	
	 public SearchRepository(){
	      setClazz(Pesquisa.class );
	   }
	
}
