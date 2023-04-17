package br.edu.ufape.DentalManager.dado;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.DentalManager.negocio.basica.Paciente;

@Repository
public interface ColecaoPaciente extends JpaRepository<Paciente, Long>{

	public List<Paciente> findByNome(String nome);
}
