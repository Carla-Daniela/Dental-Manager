package br.edu.ufape.DentalManager.negocio.cadastro;

import java.util.List;

import br.edu.ufape.DentalManager.negocio.basica.Paciente;

public interface InterfaceCadastroPaciente {

	List<Paciente> procurarPacienteNome (String nome);
	
	Paciente procurarPacienteId(long id);
	
	List<Paciente> listarPaciente();
	
	void deletarPaciente (long id);
	
	void salvarPaciente (Paciente entity) throws Exception;
	
	void deletarPaciente (Paciente paciente);
}
