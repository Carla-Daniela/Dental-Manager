package br.edu.ufape.DentalManager.dado;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufape.DentalManager.negocio.basica.Clinica;

public interface ColecaoClinica extends JpaRepository<Clinica, Long>{
	
	public List<Clinica> findByCnpj(String nome);
}
