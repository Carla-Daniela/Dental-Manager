package br.edu.ufape.DentalManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufape.DentalManager.negocio.basica.Funcionario;
import br.edu.ufape.DentalManager.negocio.basica.Secretario;
import br.edu.ufape.DentalManager.negocio.cadastro.FuncionarioInexistenteException;
import br.edu.ufape.DentalManager.negocio.fachada.Dentalmanager;

@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
public class AdministradorController {

	@Autowired
	private Dentalmanager gerenciador;
	
	@PostMapping(value="/administradorContratar")
	public ResponseEntity<String>ContratarFuncionario(@RequestBody Funcionario f ){
		gerenciador.ContratarFuncionario(f);
		if (f.getCargo().equals("secretario")) {
			try {
				gerenciador.salvarSecretario((Secretario) f);
			} catch (FuncionarioInexistenteException e) {
				
				e.printStackTrace();
			}
		}
			return ResponseEntity.ok("Admissao realizada com sucesso!");
			
	}
	
	@PostMapping(value="/administradorDemissao")
	public ResponseEntity<String>DemitirFuncionario(@RequestBody Funcionario f ){
		try {
			gerenciador.DemitirFuncionario(f);
		} catch (FuncionarioInexistenteException e) {
			
			e.printStackTrace();
		}
			return ResponseEntity.ok("Demissao realizada com sucesso!");
			
	}
}
