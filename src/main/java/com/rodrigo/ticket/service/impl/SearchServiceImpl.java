package com.rodrigo.ticket.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigo.ticket.model.Pesquisa;
import com.rodrigo.ticket.repository.RepositorySearch;
import com.rodrigo.ticket.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService {
	
	@Autowired
	private RepositorySearch repository;

	@Override
	public List<Pesquisa> findValuesByTyping(String value) {
		System.out.println("Service - findValuesByTyping()");
		return repository.getAllTicketByText(value);
	}

}
