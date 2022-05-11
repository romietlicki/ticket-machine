package com.rodrigo.ticket.service;

import java.util.List;

import com.rodrigo.ticket.model.Pesquisa;

public interface SearchService {

	public List<Pesquisa> findValuesByTyping(String value);
	
}
