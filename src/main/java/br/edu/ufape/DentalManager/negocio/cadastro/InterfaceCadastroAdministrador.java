package br.edu.ufape.DentalManager.negocio.cadastro;

import java.util.List;

import br.edu.ufape.DentalManager.negocio.basica.Administrador;


public interface InterfaceCadastroAdministrador {
	List<Administrador> procurarAdministradorNome(String nome);

	Administrador procuraAdministradorId(long id);

	List<Administrador> listarAdministrador();

	void deletarAdministradorId(long id);

	void salvarAdministrador(Administrador administrador);

	void deletarAdministrador(Administrador administrador);
}
