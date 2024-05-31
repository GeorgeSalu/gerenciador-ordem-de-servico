package com.example.agendaapi.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.agendaapi.model.Contato;
import com.example.agendaapi.repository.ContatoRepository;

@RestController
@RequestMapping("/api/contatos")
public class ContatoController {

	private ContatoRepository repository;

	public ContatoController(ContatoRepository repository) {
		this.repository = repository;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Contato save(@RequestBody Contato contato) {
		return repository.save(contato);
	}
	
}
