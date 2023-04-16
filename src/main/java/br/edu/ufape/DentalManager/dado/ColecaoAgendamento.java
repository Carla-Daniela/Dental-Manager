package br.edu.ufape.DentalManager.dado;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.DentalManager.negocio.basica.Agendamento;

@Repository
public interface ColecaoAgendamento extends JpaRepository < Agendamento ,Long>{
	public List <Agendamento>findByNomePaciente(String Nome);

}
