package br.edu.ufape.DentalManager.negocio.fachada;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	
	


}
