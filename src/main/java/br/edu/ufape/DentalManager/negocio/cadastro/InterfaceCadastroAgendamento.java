package br.edu.ufape.DentalManager.negocio.cadastro;

import java.util.List;

import br.edu.ufape.DentalManager.negocio.basica.Agendamento;
import br.edu.ufape.DentalManager.negocio.basica.DataAgendException;

public interface InterfaceCadastroAgendamento {
	List<Agendamento> procurarAgendamentoPaciente(String nomePaciente);
	
	Agendamento procuraAgendamentoId(long id);

	List<Agendamento> listarAgendamento();

	void deletarAgendamentoId(long id) throws AgendamentoException;

	void salvarAgendamento(Agendamento agendamento) throws DataAgendException;
	
	void deletarAgendamento(Agendamento agendamento);

	

	

	
}
