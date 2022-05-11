package com.rodrigo.ticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigo.ticket.model.Pesquisa;
import com.rodrigo.ticket.service.SearchService;

@RestController
@RequestMapping(path = {"/api/ticket-machine" })
public class SearchController {
	
	@Autowired
	private SearchService searchService;
	
	@RequestMapping(value = "/{value}", method = RequestMethod.GET)
	ResponseEntity<?> getByValuesByTyping(@PathVariable("value") String value) {
		
		System.out.println("Controller - getByType()");
		
		List<Pesquisa> retorno = searchService.findValuesByTyping(value);
		
		return null != retorno ? ResponseEntity.ok(retorno) : ResponseEntity.notFound().build();
	}

}
