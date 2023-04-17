package br.edu.ufape.DentalManager.negocio.fachada;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.DentalManager.negocio.basica.Administrador;
import br.edu.ufape.DentalManager.negocio.basica.Agenda;
import br.edu.ufape.DentalManager.negocio.basica.Agendamento;
import br.edu.ufape.DentalManager.negocio.cadastro.InterfaceCadastroAdministrador;
import br.edu.ufape.DentalManager.negocio.cadastro.InterfaceCadastroAgenda;
import br.edu.ufape.DentalManager.negocio.cadastro.InterfaceCadastroAgendamento;

@Service
public class Dentalmanager {
	
	@Autowired
	private InterfaceCadastroAdministrador cadastroAdministrador;
	
	@Autowired
	private InterfaceCadastroAgenda cadastroAgenda;
	
	@Autowired
	private InterfaceCadastroAgendamento cadastroAgendamento;

	List<Administrador> procurarAdministradorNome(String nome){
		return cadastroAdministrador.procurarAdministradorNome(nome);
				}
	Administrador procuraAdministradorId(long id){
		return cadastroAdministrador.procuraAdministradorId(id);
	}

	List<Administrador> listarAdministrador(){
		return cadastroAdministrador.listarAdministrador();
	}

	void deletarAdministradorId(long id) {
		 cadastroAdministrador.deletarAdministradorId(id);
	}

	void salvarAdministrador(Administrador administrador) {
		cadastroAdministrador.salvarAdministrador(administrador);
	}

	void deletarAdministrador(Administrador administrador) {
		 cadastroAdministrador.deletarAdministrador(administrador);
	}
	
	List<Agenda> procurarAgendaSemana(String semana){
		return cadastroAgenda.procurarAgendaSemana(semana);
	}
	Agenda procuraAgendaId(long id) {
		return cadastroAgenda.procuraAgendaId(id);
	}

	List<Agenda> listarAgenda(){
		return cadastroAgenda.listarAgenda();
	}

	void deletarAgendaId(long id) {
		cadastroAgenda.deletarAgendaId(id);
	}

	void salvarAgenda(Agenda agenda) {
		cadastroAgenda.deletarAgenda(agenda);
	}

	void deletarAgenda(Agenda agenda) {
		cadastroAgenda.deletarAgenda(agenda);
	}
	
	List<Agendamento> procurarAgendamentoPaciente(String nomePaciente){
		return cadastroAgendamento.procurarAgendamentoPaciente(nomePaciente);
	}
	
	Agendamento procuraAgendamentoId(long id) {
		return cadastroAgendamento.procuraAgendamentoId(id);
	}

	List<Agendamento> listarAgendament(){
		return cadastroAgendamento.listarAgendamet();
	}

	void deletarAgendamentoId(long id) {
		cadastroAgendamento.deletarAgendamentoId(id);
	}

	void salvarAgenda(Agendamento agendamento) {
		cadastroAgendamento.salvarAgenda(agendamento);
	}

	void deletarAgenda(Agendamento agendamento) {
		cadastroAgendamento.deletarAgenda(agendamento);
	}
}
