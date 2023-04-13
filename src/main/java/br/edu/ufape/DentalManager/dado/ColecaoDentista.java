package br.edu.ufape.DentalManager.dado;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.DentalManager.negocio.basica.Dentista;

@Repository
public interface ColecaoDentista extends JpaRepository <Dentista, Long>{
	
	public List <Dentista>findByNomeContaining(String Nome);
}
