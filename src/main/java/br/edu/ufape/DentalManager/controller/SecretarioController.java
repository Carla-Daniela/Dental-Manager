package br.edu.ufape.DentalManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.edu.ufape.DentalManager.negocio.basica.Agendamento;
import br.edu.ufape.DentalManager.negocio.basica.DataAgendException;
import br.edu.ufape.DentalManager.negocio.cadastro.FuncionarioInexistenteException;
import br.edu.ufape.DentalManager.negocio.fachada.AgendamentoInvalidoException;
import br.edu.ufape.DentalManager.negocio.fachada.Dentalmanager;

@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
public class SecretarioController {

	@Autowired
	private Dentalmanager gerenciador;
	
	@PostMapping(value="/secretario/Agendar")
	public ResponseEntity<String>Agendar(@RequestBody Agendamento agendamento){
		try {
		gerenciador.Agendamento(agendamento);
		return ResponseEntity.ok("Agendamento realizado com sucesso!");
		}catch (DataAgendException e) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
			}
		
		}
	@PostMapping(value="/secretario/ConfirmarAgendamento")
	public ResponseEntity<String>ConfirmarAgendamento(@RequestBody Agendamento agendamento){
		try {
			String resposta = " ";
			boolean v=gerenciador.ConfirmarAgendamento(agendamento);
			if(v==true) {
				resposta="Agendamento Confirmado!";
			}
				return ResponseEntity.ok(resposta);
			}catch (AgendamentoInvalidoException e) {
				return new ResponseEntity(HttpStatus.BAD_REQUEST);
				}
			
	}
	
}
