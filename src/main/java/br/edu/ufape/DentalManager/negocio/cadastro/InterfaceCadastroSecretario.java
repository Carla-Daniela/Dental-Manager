package br.edu.ufape.DentalManager.negocio.cadastro;

import java.util.List;

import br.edu.ufape.DentalManager.negocio.basica.Secretario;

public interface InterfaceCadastroSecretario {
	
	
	List<Secretario> procurarSecretarioNome(String nome);

	Secretario procurarSecretarioId(long id);

	List<Secretario> listarSecretario();

	void deletarSecretarioId(Long id);

	void salvarSecretario(Secretario secretario);

	void deletarSecretario(Secretario secretario);



}
