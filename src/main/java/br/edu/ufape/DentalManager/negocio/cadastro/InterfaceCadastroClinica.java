package br.edu.ufape.DentalManager.negocio.cadastro;

import java.util.List;

import br.edu.ufape.DentalManager.negocio.basica.Clinica;

public interface InterfaceCadastroClinica {

	List<Clinica> procurarClinicaNome(String nome);
	
	Clinica procurarClinicaId(long id);
	
	List<Clinica> listarClinica();
	
	void deletarClinicaId (long id);
	
	Clinica salvarClinica(Clinica entity);
	
	void deletarClinica (Clinica clinica);
}
