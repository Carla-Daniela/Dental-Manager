package br.edu.ufape.DentalManager.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufape.DentalManager.negocio.basica.Funcionario;
import br.edu.ufape.DentalManager.negocio.cadastro.FuncionarioInexistenteException;
import br.edu.ufape.DentalManager.negocio.fachada.Dentalmanager;


@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
public class FuncionarioController {
	
	@Autowired
	Dentalmanager gerenciador;
	
	@PostMapping(value="/FuncionarioConsulta")
	public ResponseEntity<String> ConsultarFuncionario(@RequestBody Funcionario f){
		List<Funcionario>fun=new ArrayList<Funcionario>();
		try {
			fun=gerenciador.procurarFuncionarioNome(f.getNome());	
			return ResponseEntity.ok("Funcionario "+f.getNome()+" encontrado!");
		} catch (FuncionarioInexistenteException e) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}
	
	
}
