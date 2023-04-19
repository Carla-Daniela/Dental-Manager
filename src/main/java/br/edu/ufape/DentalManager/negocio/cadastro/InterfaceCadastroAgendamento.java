package br.edu.ufape.DentalManager.negocio.cadastro;

import java.util.List;

import br.edu.ufape.DentalManager.negocio.basica.Agendamento;

public interface InterfaceCadastroAgendamento {
	List<Agendamento> procurarAgendamentoPaciente(String nomePaciente);
	
	Agendamento procuraAgendamentoId(long id);

	List<Agendamento> listarAgendamento();

	void deletarAgendamentoId(long id) throws AgendamentoException;

	void salvarAgendamento(Agendamento agendamento);
	
	void deletarAgendamento(Agendamento agendamento);

	

	

	
}
