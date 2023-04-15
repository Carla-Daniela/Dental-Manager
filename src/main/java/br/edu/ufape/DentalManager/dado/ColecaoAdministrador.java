package br.edu.ufape.DentalManager.dado;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.DentalManager.negocio.basica.Administrador;

@Repository
public interface ColecaoAdministrador extends JpaRepository<Administrador ,Long>  {
	public List <Administrador>findByNomeContaining(String Nome);
}
