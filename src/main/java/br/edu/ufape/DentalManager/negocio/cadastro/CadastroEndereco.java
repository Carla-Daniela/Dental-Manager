package br.edu.ufape.DentalManager.negocio.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.ufape.DentalManager.dado.ColecaoEndereco;
import br.edu.ufape.DentalManager.negocio.basica.Endereco;

public class CadastroEndereco implements InterfaceCadastroEndereco {

	@Autowired
	ColecaoEndereco colecaoEndereco;
	
	@Override
	public List<Endereco> procurarEnderecoNome(String cep) {
		return colecaoEndereco.findByCep(cep);
	}

	@Override
	public Endereco procurarEnderecoId(long id) {
		return colecaoEndereco.findById(id).orElse(null);
	}

	@Override
	public List<Endereco> listarEndereco() {
		return colecaoEndereco.findAll();
	}

	@Override
	public void deletarEnderecoId(long id) {
		colecaoEndereco.deleteById(id);
	}

	@Override
	public Endereco salvarEndereco(Endereco entity) {
		return colecaoEndereco.save(entity);
	}

	@Override
	public void deletarEndereco(Endereco endereco) {
		colecaoEndereco.delete(endereco);
		
	}

}
