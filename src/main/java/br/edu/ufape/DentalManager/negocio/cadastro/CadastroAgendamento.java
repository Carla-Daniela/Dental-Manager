package br.edu.ufape.DentalManager.negocio.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.DentalManager.dado.ColecaoAgenda;
import br.edu.ufape.DentalManager.dado.ColecaoAgendamento;
import br.edu.ufape.DentalManager.negocio.basica.Agendamento;

@Service
public class CadastroAgendamento implements InterfaceCadastroAgendamento {
	@Autowired
	private ColecaoAgendamento colecaoagendamento;
	
	@Override
	public List<Agendamento> procurarAgendamentoPaciente(String nomePaciente) {
		return colecaoagendamento.findByNomePaciente(nomePaciente);
	}

	@Override
	public Agendamento procuraAgendamentoId(long id) {
		return colecaoagendamento.findById(id).orElse(null);
	}

	@Override
	public List<Agendamento> listarAgendamet(){
		return colecaoagendamento.findAll();
	}

	@Override
	public void deletarAgendamentoId(long id) {
		colecaoagendamento.deleteById(id);
		
	}

	@Override
	public void salvarAgenda(Agendamento agendamento) {
		colecaoagendamento.delete(agendamento);
	}

	@Override
	public void deletarAgenda(Agendamento agendamento) {
		colecaoagendamento.save(agendamento);
		
	}

}
