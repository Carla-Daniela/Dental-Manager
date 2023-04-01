package br.edu.ufape.DentalManager.dado;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufape.DentalManager.negocio.basica.Dentista;

public interface ColecaoDentista extends JpaRepository <Dentista, Long>{
	
	public List <Dentista>findByNomeContaining(String Nome);
}
