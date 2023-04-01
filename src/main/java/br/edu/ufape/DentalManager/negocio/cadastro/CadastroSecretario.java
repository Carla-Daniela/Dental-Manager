package br.edu.ufape.DentalManager.negocio.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.ufape.DentalManager.dado.ColecaoSecretario;
import br.edu.ufape.DentalManager.negocio.basica.Secretario;

public class CadastroSecretario implements InterfaceCadastroSecretario{
	
	@Autowired
	private ColecaoSecretario colecaosecretario;
	@Override
	public List<Secretario> procurarSecretarioNome(String nome) {
		
		return colecaosecretario.findByNomeContaining(nome);
	}

	@Override
	public Secretario procurarSecretarioId(long id) {
		
		return colecaosecretario.findById(id).orElse(null);
	}

	@Override
	public List<Secretario> listarSecretario() {
		
		return colecaosecretario.findAll();
	}

	@Override
	public void deletarSecretarioId(Long id) {
		
		colecaosecretario.deleteById(id);
	}

	@Override
	public void salvarSecretario(Secretario secretario) {
		colecaosecretario.save(secretario);
	}

	@Override
	public void deletarSecretario(Secretario secretario) {
		colecaosecretario.delete(secretario);
		
	}

}
