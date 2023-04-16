package br.edu.ufape.DentalManager.dado;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufape.DentalManager.negocio.basica.Paciente;

public interface ColecaoPaciente extends JpaRepository<Paciente, Long>{

	public List<Paciente> findByNome(String nome);
}
