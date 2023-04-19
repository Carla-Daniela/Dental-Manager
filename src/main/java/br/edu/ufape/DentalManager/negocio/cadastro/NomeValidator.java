package br.edu.ufape.DentalManager.negocio.cadastro;

import java.util.List;
import br.edu.ufape.DentalManager.negocio.cadastro.NomeInexistenteException;
import br.edu.ufape.DentalManager.negocio.basica.Paciente;

public class NomeValidator {
	public boolean encontrarNome(List<Paciente> listaDePacientes, String nome) throws Exception {
		boolean nomeEncontrado = false;
		for(int i = 0; i < listaDePacientes.size(); i++) {
			if(listaDePacientes.get(i).getNome() == nome) {
				nomeEncontrado = true;
			}
		}
		if(!nomeEncontrado)
			throw new NomeInexistenteException();
		return nomeEncontrado;
	}
}
