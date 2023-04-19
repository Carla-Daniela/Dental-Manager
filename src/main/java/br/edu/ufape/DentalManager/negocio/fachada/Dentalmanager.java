package br.edu.ufape.DentalManager.negocio.fachada;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.edu.ufape.DentalManager.negocio.basica.Administrador;
import br.edu.ufape.DentalManager.negocio.basica.Agenda;
import br.edu.ufape.DentalManager.negocio.basica.Agendamento;
import br.edu.ufape.DentalManager.negocio.cadastro.FuncionarioInexistenteException;
import br.edu.ufape.DentalManager.negocio.cadastro.InterfaceCadastroAdministrador;
import br.edu.ufape.DentalManager.negocio.cadastro.InterfaceCadastroAgenda;
import br.edu.ufape.DentalManager.negocio.cadastro.InterfaceCadastroAgendamento;
import br.edu.ufape.DentalManager.negocio.basica.Clinica;
import br.edu.ufape.DentalManager.negocio.basica.Endereco;
import br.edu.ufape.DentalManager.negocio.basica.Paciente;
import br.edu.ufape.DentalManager.negocio.cadastro.InterfaceCadastroClinica;
import br.edu.ufape.DentalManager.negocio.cadastro.InterfaceCadastroEndereco;
import br.edu.ufape.DentalManager.negocio.cadastro.InterfaceCadastroPaciente;
import br.edu.ufape.DentalManager.negocio.basica.Dentista;
import br.edu.ufape.DentalManager.negocio.basica.Funcionario;
import br.edu.ufape.DentalManager.negocio.basica.Secretario;
import br.edu.ufape.DentalManager.negocio.cadastro.InterfaceCadastroDentista;
import br.edu.ufape.DentalManager.negocio.cadastro.InterfaceCadastroFuncionario;
import br.edu.ufape.DentalManager.negocio.cadastro.InterfaceCadastroSecretario;


@Service
public class Dentalmanager {
	
	@Autowired
	private InterfaceCadastroAdministrador cadastroAdministrador;
	@Autowired
	private InterfaceCadastroAgenda cadastroAgenda;
	@Autowired
	private InterfaceCadastroAgendamento cadastroAgendamento;
	@Autowired
	private InterfaceCadastroFuncionario cadastroFuncionario;
	@Autowired
	private InterfaceCadastroSecretario cadastroSecretario;
	@Autowired
	private InterfaceCadastroDentista  cadastroDentista;
	@Autowired
	private InterfaceCadastroEndereco cadastroEndereco;
	@Autowired
	private InterfaceCadastroPaciente cadastroPaciente;
	@Autowired
	private InterfaceCadastroClinica cadastroClinica;

	public List<Administrador> procurarAdministradorNome(String nome){
		return cadastroAdministrador.procurarAdministradorNome(nome);
				}
	public Administrador procuraAdministradorId(long id){
		return cadastroAdministrador.procuraAdministradorId(id);
	}

	public List<Administrador> listarAdministrador(){
		return cadastroAdministrador.listarAdministrador();
	}

	public void deletarAdministradorId(long id) {
		 cadastroAdministrador.deletarAdministradorId(id);
	}

	public void salvarAdministrador(Administrador administrador) {
		cadastroAdministrador.salvarAdministrador(administrador);
	}

	public void deletarAdministrador(Administrador administrador) {
		 cadastroAdministrador.deletarAdministrador(administrador);
	}
	
	public List<Agenda> procurarAgendaSemana(String semana){
		return cadastroAgenda.procurarAgendaSemana(semana);
	}
	public Agenda procuraAgendaId(long id) {
		return cadastroAgenda.procuraAgendaId(id);
	}

	public List<Agenda> listarAgenda(){
		return cadastroAgenda.listarAgenda();
	}

	public void deletarAgendaId(long id) {
		cadastroAgenda.deletarAgendaId(id);
	}

	public void salvarAgenda(Agenda agenda) {
		cadastroAgenda.deletarAgenda(agenda);
	}

	public void deletarAgenda(Agenda agenda) {
		cadastroAgenda.deletarAgenda(agenda);
	}
	
	public List<Agendamento> procurarAgendamentoPaciente(String nomePaciente){
		return cadastroAgendamento.procurarAgendamentoPaciente(nomePaciente);
	}
	
	public Agendamento procuraAgendamentoId(long id) {
		return cadastroAgendamento.procuraAgendamentoId(id);
	}

	public List<Agendamento> listarAgendament(){
		return cadastroAgendamento.listarAgendamento();
	}

	public void deletarAgendamentoId(long id) {
		cadastroAgendamento.deletarAgendamentoId(id);
	}

	public void salvarAgenda(Agendamento agendamento) {
		cadastroAgendamento.salvarAgendamento(agendamento);
	}

	public void deletarAgenda(Agendamento agendamento) {
		cadastroAgendamento.deletarAgendamento(agendamento);
	}
	
	public List<Funcionario> procurarFuncionarioNome(String nome) throws FuncionarioInexistenteException{
		return cadastroFuncionario.procurarFuncionarioNome(nome);
	}

	public Funcionario procurarFuncionarioId(long id) {
		return cadastroFuncionario.procurarFuncionarioId(id);
	}

	public List<Funcionario> listarFuncionario(){
		return cadastroFuncionario.listarFuncionario();
	}

	public void deletarFuncionarioId(Long id) {
		cadastroFuncionario.deletarFuncionarioId(id);
	}

	public void salvarFuncionario(Funcionario funcionario) {
		cadastroFuncionario.salvarFuncionario(funcionario);
	}

	public void deletarFuncionario(Funcionario funcionario) {
		cadastroFuncionario.deletarFuncionario(funcionario);
	}
	
	public List<Secretario> procurarSecretarioNome(String nome){
		return cadastroSecretario.procurarSecretarioNome(nome);
	}

	public Secretario procurarSecretarioId(long id) {
		return cadastroSecretario.procurarSecretarioId(id);
	}

	public List<Secretario> listarSecretario(){
		return cadastroSecretario.listarSecretario();
	}

	public void deletarSecretarioId(Long id) {
		cadastroSecretario.deletarSecretarioId(id);
	}

	public void salvarSecretario(Secretario secretario) throws FuncionarioInexistenteException {
		
			if(cadastroFuncionario.ProcurarFuncionarioCPF(secretario.getCpf())!=null)
				cadastroSecretario.salvarSecretario(secretario);
		
	}

	public void deletarSecretario(Secretario secretario) {
		cadastroSecretario.deletarSecretario(secretario);
	}
	
	
	public List<Dentista> procurarDentistaNome(String nome){
		return cadastroDentista.procurarDentistaNome(nome);
	}

	public Dentista procurarDentistaId(long id) {
		return cadastroDentista.procurarDentistaId(id);
	}

	public List<Dentista> listarDentista(){
		return cadastroDentista.listarDentista();
	}

	public void deletarDentistaId(Long id) {
		cadastroDentista.deletarDentistaId(id);
	}

	public void salvarDentista(Dentista dentista) {
		cadastroDentista.salvarDentista(dentista);
	}

	public void deletarDentista(Dentista dentista) {
		cadastroDentista.deletarDentista(dentista);
	}

		
	public List<Endereco> procurarEnderecoNome(String nome) {
		return cadastroEndereco.procurarEnderecoNome(nome);
	}
	public Endereco procurarEnderecoId(long id) {
		return cadastroEndereco.procurarEnderecoId(id);
	}
	public List<Endereco> listarEndereco() {
		return cadastroEndereco.listarEndereco();
	}
	public void deletarEnderecoId(Long id) {
		cadastroEndereco.deletarEnderecoId(id);
	}
	public Endereco salvarEndereco(Endereco entity) {
		return cadastroEndereco.salvarEndereco(entity);
	}
	public void deletarEndereco(Endereco endereco) {
		cadastroEndereco.deletarEndereco(endereco);
	}
	
	
	
	public List<Paciente> procurarPacienteNome(String nome) {
		return cadastroPaciente.procurarPacienteNome(nome);
	}

	public Paciente procurarPacienteId(long id) {
		return cadastroPaciente.procurarPacienteId(id);
	}

	public List<Paciente> listarPaciente() {
		return cadastroPaciente.listarPaciente();
	}

	public void deletarPacienteId(Long id) {
		cadastroPaciente.deletarPaciente(id);
		
		
	}
	public void salvarPaciente(Paciente entity) throws Exception {
			 cadastroPaciente.salvarPaciente(entity);
	}
	
	
	public void deletarPaciente(Paciente paciente) {
		cadastroPaciente.deletarPaciente(paciente);
	}

	public List<Clinica> procurarClinicaNome(String nome) {
		return cadastroClinica.procurarClinicaNome(nome);
	}
	public Clinica procurarClinicaId(long id) {
		return cadastroClinica.procurarClinicaId(id);
	}
	public List<Clinica> listarClinica() {
		return cadastroClinica.listarClinica();
	}
	public void deletarClinicaId(Long id) {
		cadastroClinica.deletarClinicaId(id);
	}
	public Clinica salvarClinica(Clinica entity) {
		return cadastroClinica.salvarClinica(entity);
	}
	public void deletarClinica(Clinica clinica) {
		cadastroClinica.deletarClinica(clinica);
	}
	//dentista
	public void CriarAgenda(Agenda agenda) {
		cadastroAgenda.salvarAgenda(agenda);
	}
	//secretario
	public void Agendar(Agendamento agendamento) {
		cadastroAgendamento.salvarAgendamento(agendamento);
	}
	public void ConfirmarAgendamento(Agendamento agendamento) throws AgendamentoInvalidoException {
		List<Agendamento>agendamentos=cadastroAgendamento.procurarAgendamentoPaciente(agendamento.getNomePaciente());
		for(Agendamento a : agendamentos) {
			if(a.getData()==agendamento.getData()) {
				cadastroAgendamento.salvarAgendamento(agendamento);
			}throw new AgendamentoInvalidoException();
		}
		
	}
	
	public void ContratarFuncionario(Funcionario funcionario) {
		cadastroFuncionario.salvarFuncionario(funcionario);
	}
	
	public void DemitirFuncionario(Funcionario funcionario) throws FuncionarioInexistenteException {
		if(!cadastroFuncionario.ProcurarFuncionarioCPF(funcionario.getCpf()).equals(null)){
			cadastroFuncionario.deletarFuncionarioId(funcionario.getId());
		}
	}
}
