package br.edu.ufape.DentalManager.dado;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.DentalManager.negocio.basica.Secretario;


@Repository
public interface ColecaoSecretario extends JpaRepository <Secretario, Long> {

	public List<Secretario>findByNomeContaining(String Nome);
}
