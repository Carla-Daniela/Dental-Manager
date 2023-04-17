package br.edu.ufape.DentalManager.negocio.fachada;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
	
	
	List<Funcionario> procurarFuncionarioNome(String nome){
		return cadastroFuncionario.procurarFuncionarioNome(nome);
	}

	Funcionario procurarFuncionarioId(long id) {
		return cadastroFuncionario.procurarFuncionarioId(id);
	}

	List<Funcionario> listarFuncionario(){
		return cadastroFuncionario.listarFuncionario();
	}

	void deletarFuncionarioId(Long id) {
		cadastroFuncionario.deletarFuncionarioId(id);
	}

	void salvarFuncionario(Funcionario funcionario) {
		cadastroFuncionario.salvarFuncionario(funcionario);
	}

	void deletarFuncionario(Funcionario funcionario) {
		cadastroFuncionario.deletarFuncionario(funcionario);
	}
	
	
	
	List<Secretario> procurarSecretarioNome(String nome){
		return cadastroSecretario.procurarSecretarioNome(nome);
	}

	Secretario procurarSecretarioId(long id) {
		return cadastroSecretario.procurarSecretarioId(id);
	}

	List<Secretario> listarSecretario(){
		return cadastroSecretario.listarSecretario();
	}

	void deletarSecretarioId(Long id) {
		cadastroSecretario.deletarSecretarioId(id);
	}

	void salvarSecretario(Secretario secretario) {
		cadastroSecretario.salvarSecretario(secretario);
	}

	void deletarSecretario(Secretario secretario) {
		cadastroSecretario.deletarSecretario(secretario);
	}
	
	
	List<Dentista> procurarDentistaNome(String nome){
		return cadastroDentista.procurarDentistaNome(nome);
	}

	Dentista procurarDentistaId(long id) {
		return cadastroDentista.procurarDentistaId(id);
	}

	List<Dentista> listarDentista(){
		return cadastroDentista.listarDentista();
	}

	void deletarDentistaId(Long id) {
		cadastroDentista.deletarDentistaId(id);
	}

	void salvarDentista(Dentista dentista) {
		cadastroDentista.salvarDentista(dentista);
	}

	void deletarDentista(Dentista dentista) {
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
	public Paciente salvarPaciente(Paciente entity) {
		return cadastroPaciente.salvarPaciente(entity);
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
	
	
	
	

	
}
