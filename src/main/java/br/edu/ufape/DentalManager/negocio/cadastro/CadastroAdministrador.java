package br.edu.ufape.DentalManager.negocio.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.DentalManager.dado.ColecaoAdministrador;
import br.edu.ufape.DentalManager.negocio.basica.Administrador;

@Service
public class CadastroAdministrador implements InterfaceCadastroAdministrador {

	@Autowired
	private ColecaoAdministrador colecaoadministrador;
	
	@Override
	public List<Administrador> procurarAdministradorNome(String nome) {
		return colecaoadministrador.findByNomeContaining(nome);
	}

	@Override
	public Administrador procuraAdministradorId(long id) {
		return colecaoadministrador.findById(id).orElse(null);
	}

	@Override
	public List<Administrador> listarAdministrador() {
		return colecaoadministrador.findAll();
	}

	@Override
	public void deletarAdministradorId(long id) {
		colecaoadministrador.deleteById(id);
		
	}

	@Override
	public void salvarAdministrador(Administrador administrador) {
		colecaoadministrador.delete(administrador);
		
	}

	@Override
	public void deletarAdministrador(Administrador administrador) {
		colecaoadministrador.save(administrador);
		
	}
	
}
