package br.edu.ufape.DentalManager.negocio.cadastro;

import java.util.List;

import br.edu.ufape.DentalManager.negocio.basica.Endereco;

public interface InterfaceCadastroEndereco {

	List<Endereco> procurarEnderecoNome(String nome);
	
	Endereco procurarEnderecoId(long id);
	
	List<Endereco> listarEndereco();
	
	void deletarEnderecoId(long id);
	
	Endereco salvarEndereco (Endereco entity);
	
	void deletarEndereco (Endereco endereco);
}
