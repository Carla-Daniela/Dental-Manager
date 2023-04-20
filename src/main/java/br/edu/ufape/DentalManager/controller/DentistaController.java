package br.edu.ufape.DentalManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufape.DentalManager.negocio.basica.Agenda;
import br.edu.ufape.DentalManager.negocio.basica.Agendamento;
import br.edu.ufape.DentalManager.negocio.fachada.Dentalmanager;

@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
public class DentistaController {
	
	@Autowired
	private Dentalmanager gerenciador;
	
	@PostMapping(value="/Dentista/Agendar")
	public ResponseEntity<String>CriarAgenda(@RequestBody Agenda agenda){
		gerenciador.CriarAgenda(agenda);
		return ResponseEntity.ok("Agenda criada");
	}
}