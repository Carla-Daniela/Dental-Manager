package br.edu.ufape.DentalManager.negocio.cadastro;

import java.util.List;

import br.edu.ufape.DentalManager.negocio.basica.Agenda;

public interface InterfaceCadastroAgenda {
	List<Agenda> procurarAgendaSemana(String semana);
		
	Agenda procuraAgendaId(long id);

	List<Agenda> listarAgenda();

	void deletarAgendaId(long id);

	void salvarAgenda(Agenda agenda);

	void deletarAgenda(Agenda agenda);
}
