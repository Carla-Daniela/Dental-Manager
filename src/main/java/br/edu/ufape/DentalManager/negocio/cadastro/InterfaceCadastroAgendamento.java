package br.edu.ufape.DentalManager.negocio.cadastro;

import java.util.List;

import br.edu.ufape.DentalManager.negocio.basica.Agendamento;

public interface InterfaceCadastroAgendamento {
	List<Agendamento> procurarAgendamentoPaciente(String nomePaciente);
	
	Agendamento procuraAgendamentoId(long id);

	List<Agendamento> listarAgenda();

	void deletarAgendamentoId(long id);

	void salvarAgenda(Agendamento agendamento);

	void deletarAgenda(Agendamento agendamento);
}
