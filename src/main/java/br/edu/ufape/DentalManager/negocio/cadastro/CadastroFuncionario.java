package br.edu.ufape.DentalManager.negocio.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.DentalManager.dado.ColecaoFuncionario;
import br.edu.ufape.DentalManager.negocio.basica.Funcionario;


@Service
public class CadastroFuncionario implements InterfaceCadastroFuncionario{
	
	
	@Autowired
	private ColecaoFuncionario colecaofuncionario;
	
	
	@Override
	public List<Funcionario> procurarFuncionarioNome(String nome) {
		
		return colecaofuncionario.findByNomeContaining(nome);
	}

	@Override
	public Funcionario procurarFuncionarioId(long id) {
		
		return colecaofuncionario.findById(id).orElse(null);
	}

	@Override
	public List<Funcionario> listarFuncionario() {
		
		return colecaofuncionario.findAll();
	}

	@Override
	public void deletarFuncionarioId(Long id) {
		colecaofuncionario.deleteById(id);
		
	}

	
	@Override
	public void deletarFuncionario(Funcionario funcionario) {
		colecaofuncionario.delete(funcionario);
		
	}

	@Override
	public void salvarFuncionario(Funcionario funcionario) {
		colecaofuncionario.save(funcionario);
		
	}

}
