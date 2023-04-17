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

@Service
public class Dentalmanager {

	@Autowired
	private InterfaceCadastroEndereco cadastroEndereco;
	
	@Autowired
	private InterfaceCadastroPaciente cadastroPaciente;
	

	@Autowired
	private InterfaceCadastroClinica cadastroClinica;
	
		
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
